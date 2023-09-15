package whileexample;

import java.util.Scanner;

public class KeyRepeat {
	public static void main(String[] args) {
		/*
		 * 'y'키를 입력하면 -> '계속 반복합니다.'
		 * 'n'키를 입력하면 -> '반복을 중단합니다.'
		 *  그 이외의 키   -> '키를 잘몰눌렀습니다.'
		 *  문자열 동등 비교함수는 equals()
		 */
		
		Scanner sc = new Scanner(System.in);
				
		
		while(true) {
			System.out.println("계속 반복할까요?(y/n)");
			String key = sc.nextLine();
			
			if(key.equals("y") || key.equals("Y")) {
				System.out.println("계속 반복합니다.");
				}
			else if(key.equals("n") || key.equals("N")){
					System.out.println("반복을 중단합니다.");
					break;
				}
			else {
					System.out.println("키를 잘못눌렀습니다.");
				}
		}
		
		
		sc.close();
	}
}






