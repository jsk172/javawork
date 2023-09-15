package input;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		// 입력 처리 - Scanner 클래스 사용
		// 문자열 - nextLine()
		// 숫자 - nextInt()
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = scanner.nextLine();
		
		System.out.println("나이 입력 : ");
		int age = scanner.nextInt();
	
		System.out.println("이름은 "+ name + " 나이는 " + age + "살 입니다.");
		
		scanner.close(); // 닫기
	}
}
