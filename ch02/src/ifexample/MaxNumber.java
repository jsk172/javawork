package ifexample;

public class MaxNumber {
	public static void main(String[] args) {
		/*
		 * 두 수중 큰 값을 찾는 프로그램
		 * 변수 = n1, n2, max
		 */
		int n1 = 10;
		int n2 = 20;
		int max;
		
		//연산1. if - else 구문
		if(n1 > n2) {
			max = n1;
		}else {//n1 <= n2
			max = n2;
		}
		
		//연산2. 조건 연산자
		int 최대값 = (n1 > n2) ? n1 : n2;
		
		
		
		System.out.println("두 수중 큰 값은 : " +max);
		System.out.println("====================");
		System.out.println("두 수중 큰 값은 : " +최대값);
	}
}
