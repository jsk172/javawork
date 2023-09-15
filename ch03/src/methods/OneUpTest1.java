package methods;

public class OneUpTest1 {
	/*
	 * 1증가하는 함수 정의
	 * 지역변수의 생명주기(scope) - 함수나 제어문의 블럭안에서 생성되고, 호출된 뒤에 소멸함.
	 */
	
	public static int oneUp() {
		int x=1; //지역 변수
		x++;
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(oneUp()); //2
		System.out.println(oneUp()); //2
		
		//System.out.println(x);   -> oneUp()의 x는 소멸된 변수.
	}
}
