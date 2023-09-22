package funcinterface;

//함수형 인터페이스를 사용하려는 이유 - 익명함수를 사용하기 위해
//함수형 인터페이스에서는 추상매서드를 1개만 사용 가능
@FunctionalInterface
public interface MyFunction1 {

	public void method();

//	public void method2(); //2개가 되면 오류가 남
	
}
