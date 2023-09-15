package ifexample;

import java.util.Scanner;

public class AdmissionFee {
	public static void main(String[] args) {
		/*
		 * 놀이공원 입장료 계산
		 * 취학전 아동 : 1000, 초등 : 2000, 중,고등 : 2500, 일반 : 3000
		 * 변수 - age, fee
		 */
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("나이를 입력하세요 : ");
		
		int age = scan.nextInt();
		int fee = 0;
		
		if(age<8) {
			fee = 1000;
			System.out.println("미취학 아동 입니다.");		
		}else if(age >= 8 && age < 14) {
			fee = 2000;
			System.out.println("초등학생 입니다.");
		}else if(age >= 14 && age < 20) {
			fee = 2500;
			System.out.println("중,고등학생 입니다.");
		}else {
			fee = 3000;
			System.out.println("일반인 입니다.");
		}
		
		System.out.println("입장료는 "+fee+"원 입니다.");
		scan.close();
	}
}
