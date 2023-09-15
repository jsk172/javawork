package inheritance.person;

public class Main {
	public static void main(String[] args) {
		//lee가 Person필드를 사용 할 수 있음.
		Engineer lee = new Engineer("봉구", 31, 111);
		
		System.out.println("이름 : " + lee.getName());
		System.out.println("나이 : " + lee.getAge());
		System.out.println("사번 : " + lee.getCompanyId());
		
	}
}
