package domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.common.JdbcUtil;

//Account를 생성, 조회, 수정, 삭제 하는 클래스
//DAO - Data Access Object
public class AccountDAO {
	Connection conn; //DB연결 객체 선언
	PreparedStatement pstmt; //SQL처리 객체
	ResultSet rs; //결과값 저장
	Scanner scanner = new Scanner(System.in);

	//계좌생성
	public void createAccount() {
		System.out.println("----------------------------------");
		System.out.println("계좌 생성");
		System.out.println("----------------------------------");

		//		accounts[0] = new Account(ano, owner, balance); //연습 데이터 1개 생성
		while(true) {
			System.out.print("계좌번호(xx-xx-xxx) 입력 : ");
			String regExp = "\\d{2}-\\d{2}-\\d{3}";
			String ano = scanner.nextLine();
			boolean result = Pattern.matches(regExp, ano);

			if(result) {
				//중복 계좌가 있는지 확인
				if(findAccount(ano) != null) {//중복계좌가 있는경우
					System.out.println("중복 계좌입니다. 다시 입력해 주세요: ");
				}else { //중복계좌가 없으면
					while(true){
						System.out.print("계좌주(한글, 영어) : ");
						String owner = scanner.nextLine();

						regExp = "[a-zA-Z가-힣]+"; //영어와 한글만 입력가능 +는 여러글자 쓸수있게 해줌 +가 없으면 한글자만 입력
						result = Pattern.matches(regExp, owner);
						if(result) {
							System.out.print("초기 입금액 : ");
							int balance = Integer.parseInt(scanner.nextLine());

							//DB 작업
							try {
								conn = JdbcUtil.getConnection();
								String sql = "INSERT INTO account(ano, owner, balance) "
										+ "VALUES (?, ?, ?)";
								pstmt = conn.prepareStatement(sql);
								//값 설정
								pstmt.setString(1, ano);
								pstmt.setString(2, owner);
								pstmt.setInt(3, balance);
								//SQL 실행
								pstmt.executeUpdate();
								System.out.println("계좌가 생성되었습니다.");
							} catch (SQLException e) {
								e.printStackTrace();
							} finally {
								JdbcUtil.close(conn, pstmt);
							}
							break;
						}else {
							System.out.println("계좌주는 한글과 영문만 입력 가능합니다.");
						}
					}//내부 while
					break;
				}
			}else {
				System.out.println("잘못된 계좌입니다");
			}
		}//while
	}//createAccount
	//계좌목록조회
	public void getAccountList() {
		System.out.println("-------------------------------------------------------");
		System.out.println("  *****************    계좌 목록    *****************");
		System.out.println("-------------------------------------------------------");

		//계좌를 저장할 ArrayList 생성
		List<Account> accountList = new ArrayList<>();
		//DB 작업
		try {
			conn = JdbcUtil.getConnection(); //db연결
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			//검색 처리
			rs = pstmt.executeQuery();
			while(rs.next()) { //다음 데이터가 있는 동안 반복
				//account 객체
				String ano = rs.getString("ano"); //db에서 가져온 ano 칼럼
				String owner = rs.getString("owner"); //db에서 가져온 owner 칼럼
				int balance = rs.getInt("balance"); //db에서 가져온 balance 칼럼
				Account account = new Account(ano, owner, balance);

				accountList.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}


		//계좌 목록 조회
		for(int i=0; i<accountList.size(); i++) {
			Account account = accountList.get(i);
			System.out.print("계좌번호 : " + account.getAno() + "\t");
			System.out.print("계좌주 : " + account.getOwner() + "\t");
			System.out.println("잔고 : " + account.getBalance());
		}
	}//getAccount
	//입금
	public void deposit() {
		System.out.println("-------------------------------------------------------");
		System.out.println("    *****************    입금    *****************");
		System.out.println("-------------------------------------------------------");

		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = scanner.nextLine();

			if(findAccount(ano) != null) { //찾는계좌가 있으면
				Account account = findAccount(ano);
				System.out.print("입금액 : ");
				int money = Integer.parseInt(scanner.nextLine());
				//DB작업
				try {
					conn = JdbcUtil.getConnection();
					String sql = "UPDATE account SET balance = (?+?) WHERE ano = ?";
					pstmt = conn.prepareStatement(sql);

					pstmt.setInt(1, account.getBalance());
					pstmt.setInt(2, money);
					pstmt.setString(3, ano);
					//SQL 실행
					pstmt.executeUpdate();
					account.setBalance(account.getBalance() + money);
					System.out.println("정상 처리 되었습니다.");
					break; //while탈출
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JdbcUtil.close(conn, pstmt);
				}

			}else {
				System.out.println("찾는 계좌가 없습니다. 다시입력해 주세요.");
			}
		} //while
	} //deposit
	//출금
	public void withdraw() {
		System.out.println("-------------------------------------------------------");
		System.out.println("    *****************    출금    *****************");
		System.out.println("-------------------------------------------------------");

		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = scanner.nextLine();

			if (findAccount(ano) != null) {
				while (true) {
					Account account = findAccount(ano);
					System.out.print("출금액 : ");
					int money = Integer.parseInt(scanner.nextLine());

					if (money > account.getBalance()) {
						System.out.print("잔액이 부족합니다. 다시 입력해주세요 : ");
					} else if (account.getBalance() == 0) {
						System.out.println("잔고가 0원입니다.");
					} else {
						try {
							conn = JdbcUtil.getConnection();
							String sql = "UPDATE account SET balance = (balance - ?) WHERE ano = ?";
							pstmt = conn.prepareStatement(sql);

							pstmt.setInt(1, money);
							pstmt.setString(2, ano);
							// SQL 실행
							pstmt.executeUpdate();

							account.setBalance(account.getBalance() - money);
							System.out.println("정상 처리 되었습니다.");
							break; // while 탈출
						} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							JdbcUtil.close(conn, pstmt);
						}
					}
				} // 내부 while 끝
				break;
			} else {
				System.out.print("찾는 계좌가 없습니다. 다시 입력해 주세요 : ");
			}
		} // while 끝
	}//withdraw
	//계좌삭제
	public void removeAccount() {
		System.out.println("-------------------------------------------------------");
		System.out.println("   *****************    계좌 삭제    *****************");
		System.out.println("-------------------------------------------------------");

		while(true) {
			System.out.print("삭제할 계좌번호 입력 : ");
			String ano = scanner.nextLine();

			if(findAccount(ano) != null) {
				System.out.println("삭제하려면 yes, 메뉴로 가려면 다른키를 눌러주세요.");
//				int selNum = Integer.parseInt(scanner.nextLine());
				String str = scanner.nextLine();
//				if(selNum == 1) {
				if(str.toUpperCase().equals("YES")) {
					try {
						conn = JdbcUtil.getConnection();
						String sql = "DELETE FROM account WHERE ano = ?";
						pstmt = conn.prepareStatement(sql);

						pstmt.setString(1, ano);
						//SQL 실행
						pstmt.executeUpdate();
						//DB 처리
						System.out.println("계좌가 삭제되었습니다.");
						break;

					}catch (SQLException e) {
						e.printStackTrace();
					} finally {
						JdbcUtil.close(conn, pstmt);
					} 
				}else {
					System.out.println("메뉴로 돌아갑니다.");
					return;
				}
			}else {
				System.out.println(ano + "은 없는계좌 입니다 다시 입력해주세요.");
			}

		}//while
	}//removeAccount
	//계좌 검색
	public void selectAccount() {
		System.out.println("-------------------------------------------------------");
		System.out.println("   *****************    계좌 검색    *****************");
		System.out.println("-------------------------------------------------------");

		while(true) {
			System.out.print("계좌번호 입력 : ");
			String ano = scanner.nextLine();

			if(findAccount(ano) != null) {
				try {
					conn = JdbcUtil.getConnection();
					String sql = "SELECT * FROM account where ano = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, ano);
					//SQL 실행
					pstmt.executeUpdate();
					System.out.println("   *******    " +findAccount(ano).getOwner() + "님의 계좌 정보    *******");
					System.out.print("계좌번호 : " + findAccount(ano).getAno() + "\t");
					System.out.print("계좌주 : " + findAccount(ano).getOwner() + "\t");
					System.out.println("잔고 : " + findAccount(ano).getBalance());
					break;
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JdbcUtil.close(conn, pstmt);
				}
				break;
			}else {
				System.out.println("없는 계좌입니다.");
			}
		}
	}


	public Account findAccount(String ano) {
		Account account = null;
		//DB처리
		try {
			conn = JdbcUtil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			//1개 검색 처리
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner"); //db에서 가져온 owner 칼럼
				int balance = rs.getInt("balance"); //db에서 가져온 balance 칼럼
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}

		return account;
	}
}
