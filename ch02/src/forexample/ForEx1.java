package forexample;

public class ForEx1 {
	public static void main(String[] args) {
		/*
		 * for(초기값; 종료값; 증감값)
		 * 실행문
		 * 1~10 출력
		 */
		for(int i=1; i<11; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n======================================================");
		
		//아스키 코드값 알파벳 출력
		//'A' = 65, "a" = 97, 0 = 48
		for(int num = 65; num < 91; num++) {
			System.out.print((char)num + " ");
		}
		System.out.println("\n======================================================");
		//영어 아스키 코드값 (65부터 122까지 출력)
		for(char ch=65; ch<123; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println("\n======================================================");
		
		//한글 유니코드 값(12593 ~ 12684)
		for(char ch=12593; ch<12685; ch++) {
			System.out.print(ch + " ");
		}
	}
}
