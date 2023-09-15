package arrays;

public class ArrayTest1 {
	public static void main(String[] args) {
		/*
		 * 변수
		 */
		String car1 = "Sonata1";
		String car2 = "Sonata2";
		String car3 = "Sonata3";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println("=============");
		
		
		//배열 - 순서가 있음(0 ~ n), 중복사용 가능 
		//직접 저장 - 중괄호{} 사용
		String[] car = {"Sonata10","Sonata9","Sonata8","Sonata8"};
		//String[] car = new String{"Sonata10","Sonata9","Sonata8","Sonata8"}; << 위에 문장과 같음.
		System.out.println(car[0]);
		System.out.println(car[1]);
		System.out.println(car[2]);
		System.out.println(car[3]);
		
		
		//배열의 크기(개수) - 배열이름.length
		System.out.println("배열의 크기 : "+ car.length);
		
		
		
		//for문 - 전체조회
		for(int i=0; i<car.length; i++) {
			System.out.println(car[i]);
		}
		
		
	}//main
}//clas
