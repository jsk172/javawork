package singleton;

public class Company {
	/*
	 * 싱글은 코딩 디자인 패턴 사용
	 * 맴버 변수가 객체 인스턴스
	 * static을 활용함 - new로 생성하지 않음
	 * 클래스 이름으로 직접 접근
	 */
	private static Company instance; //맴버 변수(필드)
	
	private Company() {} //생성자도 private 사용
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
