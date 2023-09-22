package funcinterface;

public class MyInterfaceMain {
	public static void main(String[] args) {
		
		MyFunction1 func;
		
		//람다식 표현으로 추상 매서드를 실체로 구현
		//매개변수가 없음
		
		/*코드가 1줄인 경우 {} 생략 가능
		func = () -> {
			System.out.println("안녕");
		};
		*/
		
		//코드가 1줄이라 {} 생략
		func = () -> System.out.println("안녕");
		
	
		//실행함수 호출
		func.method();
		
		
	}
}
