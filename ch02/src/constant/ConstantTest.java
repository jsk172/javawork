package constant;

public class ConstantTest {
	public static void main(String[] args) {
		// 상수 선언 및 사용
		int maxNum = 100; //변수
		maxNum = 1000; // 수정가능
		
		final int MAX_NUM = 100;
		//MAX_NUM = 1000; 수정불가능
		
		System.out.println(maxNum);
		System.out.println(MAX_NUM);
		System.out.println("================");
		
		/*
		 * 원의 넓이 = 반지름 * 반지름 * PI
		 * 변수 - radius, circleArea
		 * 상수 - PI
		 */
		final double PI = 3.14;
		int r = 5;
		double circleArea;
		
		circleArea = r*r*PI;
		System.out.println("원의 넓이 : " + circleArea);
		
	}
}
