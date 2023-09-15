package arrays;

public class ArrayTest2 {
	public static void main(String[] args) {
		//배열의 선언 및 사용
		//String형 비어있으면 null을 출력함.
		
		String[] cars = new String[4]; //크기가 4인 cars 배열 선언
		//입력(저장)
		cars[0] = "Sonata1";
		cars[1] = "Sonata2";
		cars[2] = "Sonata3";
		cars[3] = "Sonata4";
		
		System.out.println(cars[1]); // Sonata2
		System.out.println("============");
		
		//전체 출력
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		
	}//main

}
