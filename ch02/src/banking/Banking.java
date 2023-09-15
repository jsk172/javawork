package banking;

import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		/*
		 * 은행 업무
		 * 1.예금 2.출금 3.잔액조회 4.종료
		 */
		
		Scanner sc = new Scanner(System.in);
		int balance = 0; // 잔액
		boolean sw = true; // 상태변수
		int money = 0;
		
		
		
		while(sw) {
			System.out.println("===============================");
			System.out.println("1.예금 | 2.출금 | 3.잔액조회 | 4.종료");
			System.out.println("===============================");
			
			
			int selNum = sc.nextInt(); //메뉴 번호 입력
			
			switch(selNum) {
			case 1:
				System.out.print("예금액 : ");
				money = sc.nextInt();//입금액
				balance += money;
				break;
			case 2:
				System.out.print("출금액 : ");
				money = sc.nextInt();//출금액
				if(money > balance) {
					System.out.println("잔액이 부족합니다.");
					}else {
						balance -= money;//출금
					}
				break;
			case 3:
				System.out.println("잔액 : " + balance); //잔액조회
				break;
			case 4:
				sw = false; //종료
				break;
				default:
					System.out.println("지원되지 않는 기능입니다.");
					break;
			}//switch
			
		}//while
		System.out.println("프로그램 종료.");
		
		
		
		
		sc.close();
	}//main
}//class
