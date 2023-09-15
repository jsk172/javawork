package kr.or.iei.model;

//회원 클래스(자료형) 정의
public class User {
	//필드(속성)
	private String id;
	private String pwd;
	private String name;
	
	public User() {//기본생성자 없어도 상관없음(get/set 사용할때). 기본 생성자를 매개변수로 사용하면 있어야 함.
	}
	
	//기본 생성자 매개변수 사용.
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	/*
	 * 입력 : set() - set+필드이름()
	 * 출력 : get() - get+필드이름()
	 */
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd() {
		return pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
