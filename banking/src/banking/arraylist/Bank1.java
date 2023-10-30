package banking.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import domain.Account;


public class Bank1 {
	//통장 계좌를 저장할 자료 구조의 객체 생성
	static List<Account> accountList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sw = true;
		while(sw) {
			try {
				System.out.println("=======================================================================");
				System.out.println("1.계좌 생성 | 2.계좌 목록 | 3. 입금 | 4. 출금 | 5.계좌 삭제 | 6.계좌 검색 | 7.종료");
				System.out.println("=======================================================================");
				System.out.print("선택 : ");

				//메뉴 선택
				int selectNum = Integer.parseInt(scanner.nextLine());

				if(selectNum == 1) {
					createAccount(); //계좌 생성
				}else if(selectNum == 2) {
					getAccountList(); //계좌 목록
				}else if(selectNum == 3) {
					deposit(); //입금
				}else if(selectNum == 4) {
					withdraw(); //출금
				}else if(selectNum == 5) {
					removeAccount(); //계좌삭제
				}else if(selectNum == 6) {
					selectAccount();
				}else if(selectNum == 7) {
					sw = false; //종료
				}else {
					System.out.println("지원되지 않는 기능입니다. 다시 입력해 주세요.");
				}
			}catch(NumberFormatException e) {
				//				e.printStackTrace();
				System.out.println("올바른 숫자를 입력해주세요.");
			}
		}//while
		System.out.println("프로그램을 종료합니다.");

		scanner.close();
	}//main

	//계좌생성
	private static void createAccount() {
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
						if (result) {
	                        while (true) {
	                            System.out.print("초기 입금액 : ");
	                            String initialBalanceInput = scanner.nextLine();
	                            try {
	                                int balance = Integer.parseInt(initialBalanceInput);
	                                // 입력받은 내용을 매개변수로 계좌 생성함
	                                Account newAccount = new Account(ano, owner, balance);
	                                accountList.add(newAccount); // ArrayList에 저장
	                                System.out.println("계좌가 생성되었습니다.");
	                                return;
	                            } catch (NumberFormatException e) {
	                                System.out.println("초기 입금액은 숫자로 입력해주세요.");
	                            }
	                        }
						}else {
							System.out.println("계좌주는 한글과 영문만 입력 가능합니다.");
						}
					}//내부 while
				}
			} else {
				System.out.println("잘못된 계좌입니다");
			}
		}//while
	}//createAccount
	//계좌목록조회
	private static void getAccountList() {
		System.out.println("-------------------------------------------------------");
		System.out.println("  *****************    계좌 목록    *****************");
		System.out.println("-------------------------------------------------------");

		//계좌 목록 조회
		for(int i=0; i<accountList.size(); i++) {
			Account account = accountList.get(i);
			System.out.print("계좌번호 : " + account.getAno() + "\t");
			System.out.print("계좌주 : " + account.getOwner() + "\t");
			System.out.println("잔고 : " + account.getBalance());
		}
	}//getAccount
	//입금
	private static void deposit() {
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
	private static void withdraw() {
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
	private static void removeAccount() {
		System.out.println("-------------------------------------------------------");
		System.out.println("   *****************    계좌 삭제    *****************");
		System.out.println("-------------------------------------------------------");

		while(true) {
			System.out.print("삭제할 계좌번호 입력 : ");
			String ano = scanner.nextLine();

			if(findAccount(ano) != null) {
				accountList.remove(findAccount(ano));
				System.out.println(ano + " 계좌가 삭제되었습니다.");
				break;
			}else {
				System.out.println(ano + "은 없는계좌 입니다 다시 입력해주세요.");
			}
		}

	}//removeAccount
	//계좌 검색
	private static void selectAccount() {
		System.out.println("-------------------------------------------------------");
		System.out.println("   *****************    계좌 검색    *****************");
		System.out.println("-------------------------------------------------------");

		while(true) {
			System.out.print("계좌번호 입력 : ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				System.out.println("   *******    " +findAccount(ano).getOwner() + "의 계좌 정보    *******");
				System.out.print("계좌번호 : " + findAccount(ano).getAno() + "\t");
				System.out.print("계좌주 : " + findAccount(ano).getOwner() + "\t");
				System.out.println("잔고 : " + findAccount(ano).getBalance());
				break;
			}else {
				System.out.println("없는 계좌입니다.");
			}
		}
	}
	
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountList.size(); i++) {
			//이미 등록된 계좌를 가져와서 외부에서 입력한 계좌와 일치하는지 확인
			String dbAno =accountList.get(i).getAno();
			if(dbAno.equals(ano)) {
				account = accountList.get(i);
				break;
			}
		}
		return account;
	}


}
