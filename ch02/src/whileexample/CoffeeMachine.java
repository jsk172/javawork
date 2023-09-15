package whileexample;

import java.util.Scanner;

public class CoffeeMachine {
	public static void main(String[] args) {
		/*
		 * 커피 자동판매기 구현 프로그램
		 * 커피 총 개수 = 5
		 * 커피값은 500원 투입하면 커피나옴
		 * 500원을 초과하면 거스름돈과 커피가 나옴
		 * 500원이 부족하면 커피가 안나옴
		 * 커피가 소진되면 판매중단.
		 */
		
		Scanner sc = new Scanner(System.in);
		int Coffee = 5;
		
		while(true) {
			System.out.println("돈을 넣어주세요 : ");
			int money = sc.nextInt();
			
			if(money == 500) {
				System.out.println("커피가 나옵니다.");
				Coffee -= 1;
			}else if(money > 500) {
				System.out.println((money-500) + "원을 돌려주고 커피가 나옵니다.");
				Coffee -= 1;
			}else{
				System.out.println("커피가 나오지 않습니다.");
			}
			System.out.println("남은 커피의 양은" + Coffee + "개 입니다.");
			
			if(Coffee ==0) {
				System.out.println("커피가 모두 소진되었습니다. 판매를 중지합니다");
				break;
			}
			
		}
		
		
		
		sc.close();
	}
}
