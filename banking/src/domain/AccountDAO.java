package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

//Account를 생성, 조회, 수정, 삭제 하는 클래스
//DAO - Data Access Object
public class AccountDAO {
	
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
							System.out.print("계좌주 : ");
							String owner = scanner.nextLine();
							
							regExp = "[a-zA-Z가-힣]+"; //영어와 한글만 입력가능 +는 여러글자 쓸수있게 해줌 +가 없으면 한글자만 입력
							result = Pattern.matches(regExp, owner);
							if(result) {
								System.out.print("초기 입금액 : ");
								int balance = Integer.parseInt(scanner.nextLine());
								
								//DB 작업
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
			
			List<Account> accountList = new ArrayList<>();
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

					account.setBalance(account.getBalance() + money);
					System.out.println("정상 처리 되었습니다.");
					break; //while탈출
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

				if(findAccount(ano) != null) {
					while(true) {//출금액 재입력
						Account account = findAccount(ano);
						System.out.print("출금액 : ");
						int money = Integer.parseInt(scanner.nextLine());

						if(money > account.getBalance()) {
							System.out.print("잔액이 부족합니다. 다시 입력해주세요 : ");
						}else if(account.getBalance() == 0){
							System.out.println("잔액이 0원입니다.");
							break;
						}else {
							account.setBalance(account.getBalance() - money);
							System.out.println("정상 처리 되었습니다.");
							break;
						}
					}//while끝
					break;
				}else {
					System.out.print("찾는 계좌가 없습니다. 다시 입력해 주세요 : ");
				}
			}//while끝
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
					
					//DB 처리
					break;
				}else {
					System.out.println(ano + "은 없는계좌 입니다 다시 입력해주세요.");
				}
			}

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
					
					//DB처리
					break;
				}else {
					System.out.println("없는 계좌입니다.");
				}
			}
		}
		
		
		public Account findAccount(String ano) {
			Account account = null;
				if(ano.equals(ano)) {
					
					//DB처리
				}
			return account;
		}
}
