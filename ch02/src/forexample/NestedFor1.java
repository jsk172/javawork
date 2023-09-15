package forexample;

public class NestedFor1 {
	public static void main(String[] args) {
		/*
		 * 중첩 for문
		 * 5행 5열에 '*'출력
		 */
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("\n=================");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================");
	}
}
