package polymorphism.fruits;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.포도 | 2.바나나 | 3.복숭아");
		System.out.print("선택 > ");
		
		//문자를 숫자형으로 변환
		int selectNum = Integer.parseInt(sc.nextLine());
		
		//객체 생성시 다형성 이용
		Fruit fruit = null;
		if(selectNum == 1) {
			fruit = new Grape();
		}else if(selectNum == 2) {
			fruit = new Banana();
		}else if(selectNum == 3) {
			fruit = new Peach();
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		fruit.showFruitInfo();
		
		sc.close();
	}
}
