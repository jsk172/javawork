package input;

import java.util.Scanner;

public class BonusPointTest {
	public static void main(String[] args) {
		// 고객의 이름, 구매 금액을 입력
		// 이름과 구매포인트 출력
		// 구매포인트(bonusPint) = 상품가격(price) * 보너스적립율(bonusRatio)
		double bonusRatio = 0.02;
		int bonusPoint = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("고객의 이름을 입력하세요 : ");
		String customer = sc.nextLine(); //사용자 - 이름입력
		System.out.print("구매금액을 입력하세요 : ");
		int price = sc.nextInt(); //사용자 - 금액입력
		
		
		//계산 처리
		bonusPoint = (int)(price*bonusRatio); // 실수형을 정수형으로 형변환함.
		
		
		//출력
		System.out.println(customer + "님의 보너스 포인트는 " + bonusPoint + "점 입니다.");
		
		
		
		sc.close();
	}

}
