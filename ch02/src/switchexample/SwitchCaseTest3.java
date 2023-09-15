package switchexample;

public class SwitchCaseTest3 {
	public static void main(String[] args) {
		/*
		 * 사칙연산 - 산술 기호
		 * 변수 - n1, n2, operator(+,-,*,/), result
		 * ex) 2*3 = 6 , operator = *
		 */
		int n1 = 10;
		int n2 = 2;
		int result = 0;
		char operator = '+'; //값을 초기화
		
		
		//switch case문		
		switch(operator) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
			default:
				System.out.println("지원하지 않는 기능입니다.");
				return; //즉시종료 밑으로 내려가지않음.
		}
		System.out.println("결과값은 : "+result+ "입니다.");
		
		
		//if else문
		if(operator == '+') {
			result = n1 + n2;
		}else if(operator == '-') {
			result = n1 - n2;
		}else if(operator == '*') {
			result = n1 * n2;
		}else if(operator == '/') {
			result = n1 / n2;
		}else {
			System.out.println("지원하지 않는 기능입니다.");
		}
		System.out.println("결과값은 : "+result+ "입니다.");
				
	}
}
