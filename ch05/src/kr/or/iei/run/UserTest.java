package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest {
	public static void main(String[] args) {
		User user1 = new User();
		user1.setId("abc123");
		user1.setPwd("12345");
		user1.setName("김지성");
		
		System.out.println("아이디 : " + user1.getId());
		System.out.println("비밀번호 : " + user1.getPwd());
		System.out.println("이름 : " + user1.getName());
		
		System.out.println(user1);
	}
}
