package classes.methods;

public class Hello {
	/*
	 * 기본 생성자 public Hello(){} 이게 생성되어있음. 보이진 않음
	 */
	
	//sayHello() 매서드 정의
	//매서드 오버로딩(함수 이름은 같고 매개변수가 다름)
	public void sayHello() {
		System.out.println("안녕");
	}
	public void sayHello(String name) {
		System.out.println("안녕? " + name);
	}
}
