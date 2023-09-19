package interfaceex.calculator;

//구성요소 - 상수, 매서드
//필드나 생성자가 없음.
//인터페이스는 모든 매서드가 추상매서드이다.
public interface Calculator {
	
	//변수를 선언해도 오류가 나지 않는 이유는 상수로 반환됨
	int ERROR = -99999; //인터페이스 상수(final을 생략해도 됨)
	
	//추상 매서드 - 선언부만 있고, 구현은 안함.
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);
}
