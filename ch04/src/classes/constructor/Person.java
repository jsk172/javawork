package classes.constructor;

//참조 자료형 - Person 클래스 정의
//생성자 오버로딩 - 
public class Person {
	String name; //이름
	float height; //키
	float weight; //몸무게
	
	//기본 생성자
	public Person() {
	}
	
	//매개변수가 있는 생성자
	public Person(String n) {//이름 매개변수
		name = n;
	}
	
	//매개변수가 있는 생성자(모든 필드)
	public Person(String n, float h, float w) {
		name = n; //외부에서 입력된 이름을 저장
		height = h; //외부에서 입력한 키
		weight = w; //외부에서 입력한 몸무게
	}
	
	//매서드
	public void showPerosonInfo() {
		System.out.printf("이름 : %s, 키 :%.1f, 몸무게 :  %.1f\n" , name, height, weight);
	}

}
