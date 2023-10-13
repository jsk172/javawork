package banking.array;

import java.util.Scanner;

import domain.Account;

public class BankMain {
	//계좌를 저장할 배열의 크기 100개로 설정
	static Account[] accounts = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		boolean sw = true;
		while(sw) {
			try {
				System.out.println("===============================================");
				System.out.println("1.계좌 생성 | 2.계좌 목록 | 3. 입금 | 4. 출금 | 5.종료");
				System.out.println("===============================================");
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
					sw = false;
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
	
	//계좌 생성
	private static void createAccount() {
		System.out.println("----------------------------------");
		System.out.println("계좌 생성");
		System.out.println("----------------------------------");

		//		accounts[0] = new Account(ano, owner, balance); //연습 데이터 1개 생성
		while(true) {
			System.out.print("계좌번호 입력 : ");
			String ano = scanner.nextLine();
			//중복 계좌가 있는지 확인
			if(findAccount(ano) != null) {//중복계좌가 있는경우
				System.out.println("중복 계좌입니다. 다시 입력해 주세요: ");
			}else { //중복계좌가 없으면
				System.out.print("계좌주 : ");
				String owner = scanner.nextLine();

				System.out.print("초기 입금액 : ");
				int balance = Integer.parseInt(scanner.nextLine());

				for(int i=0; i<accounts.length; i++) {
					if(accounts[i] == null) {
						accounts[i] = new Account(ano, owner, balance);
						System.out.println("계좌가 생성되었습니다.");
						break; //for 빠져나옴
					}
				}
				break; //while 빠져나옴
			}

		}//while
	}

		
	
		
	//계좌 목록
	private static void getAccountList() {
		System.out.println("-------------------------------------------------------");
		System.out.println("*****************    계좌 목록    *****************");
		System.out.println("-------------------------------------------------------");
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {	//계좌가 있는 배열의 요소 출력
				System.out.print("계좌번호 : " + accounts[i].getAno() + "\t");
				System.out.print("계좌주 : " + accounts[i].getOwner() + "\t");
				System.out.println("잔고 : " + accounts[i].getBalance());
			}
		}
		
	}
	
	//입금
	private static void deposit() {
		System.out.println("-------------------------------------------------------");
		System.out.println("*****************    입금    *****************");
		System.out.println("-------------------------------------------------------");

		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = scanner.nextLine();

			if(findAccount(ano) != null) {
				System.out.print("입금액 : ");
				int money = Integer.parseInt(scanner.nextLine());
				
				Account account = findAccount(ano);
				account.setBalance(account.getBalance() + money);
				System.out.println("정상 처리 되었습니다.");
				break;
			}else {
				System.out.println("찾는 계좌가 없습니다. 다시입력해 주세요.");
			}
		}
	}
	
	
	//출금
	private static void withdraw() {
		System.out.println("-------------------------------------------------------");
		System.out.println("*****************    출금    *****************");
		System.out.println("-------------------------------------------------------");
		
		
		
		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = scanner.nextLine();

			if(findAccount(ano) != null) {
				while(true) {//출금액 재입력
					System.out.print("출금액 : ");
					int money = Integer.parseInt(scanner.nextLine());
					Account account = findAccount(ano);
					
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
	}
	
	//계좌검색
	private static Account findAccount(String ano) {
		Account account = null; //찾을 계좌를 저장할 객체 변수 선언
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				String dbAno = accounts[i].getAno(); //이미 생성된 계좌번호 가져옴.
				if(dbAno.equals(ano)) { //입력한계좌와 일치하는지 확인. 
					account = accounts[i]; //일치하는 계좌를 저장함
					break;
				}
			}
		}
		
		return account;
	}
}
