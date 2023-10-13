package banking.arraylist.bank_db;

import java.util.Scanner;

import domain.AccountDAO;

public class Main {
	public static void main(String[] args) {
		//AccountDAO의 객체 생성 - 매서드 사용 가능
		AccountDAO dao = new AccountDAO();
		Scanner scanner = new Scanner(System.in);
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
					dao.createAccount(); //계좌 생성
				}else if(selectNum == 2) {
					dao.getAccountList(); //계좌 목록
				}else if(selectNum == 3) {
					dao.deposit(); //입금
				}else if(selectNum == 4) {
					dao.withdraw(); //출금
				}else if(selectNum == 5) {
					dao.removeAccount(); //계좌삭제
				}else if(selectNum == 6) {
					dao.selectAccount();
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
}
