package forexample;

public class GugudanFull {
	public static void main(String[] args) {
		//구구단 전체 출력
		for(int i=2; i<10; i++) { //2~9단 출력
			System.out.println(i + "단");
			for(int j = 1; j<10; j++) { //1~9 곱하는수 출력
				System.out.println(i +" x "+ j +" = "+ (i*j));
			}
		}
		System.out.println("====================");
		
		
		//단보다 곱하는 수가 작거나 같은경우만 출력
		for(int i=2; i<10; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.println(i +" x "+ j +" = "+ (i*j));
			}
			System.out.println("====================");
		}
	}
}
