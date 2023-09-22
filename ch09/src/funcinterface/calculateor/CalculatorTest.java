package funcinterface.calculateor;

public class CalculatorTest {
	public static void main(String[] args) {
		//Calculator 변수 선언 - add
		Calculator add, sub, mul, div;
		int num1 = 10, num2 = 5;

		//calculate()를 구현 - 람다식
		//(+,-,*,/)

		//덧셈
		add = (n1, n2) -> n1 + n2;
		//뺄셈
		sub = (n1, n2) -> n1 - n2;
		//곱셈
		mul = (n1, n2) -> n1 * n2;
		//나눗셈
		div = (n1, n2) -> n1 / n2;
		
		//calculate()호출
		System.out.println("두 수의 합 : " + add.calculate(num1, num2));
		System.out.println("두 수의 차 : " + sub.calculate(num1, num2));
		System.out.println("두 수의 곱 : " + mul.calculate(num1, num2));
		System.out.println("두 수의 몫 : " + div.calculate(num1, num2));
	}
}
