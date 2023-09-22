package funcinterface;

public class MyClass implements MyFunction1{
	//Myfunction1을 구현해서 "hello"를 프린트하기

	@Override
	public void method() {
		System.out.println("hello");
	}

}
