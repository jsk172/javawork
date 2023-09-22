package funcinterface.lambdaint;

public class MyNumberTest {
	public static void main(String[] args) {
		//인터페이스에 변수 선언
		MyNumber1 number;
		//변수에 람다식을 저장
		//calculate()를 구현함
		
		/*
		number = (x) -> {
			x += 10; //더하기 계산
			System.out.println(x);
		};*/
		
		
		number = (x)-> System.out.println(x+10);
		
		number.calculate(7);
		
		//어떤 수를 제곱하는 함수 구현
		number = (n) -> System.out.println(n*n);
		number.calculate(2);
		
	}
}
