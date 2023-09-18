package objectequals.member;

public class MemberTest {
	public static void main(String[] args) {
		Member member1 = new Member("m1001", "우영우");
		Member member2 = new Member("m1001", "우영우");
		
		//논리적으로 공동객체를 확인할 hashcode() 재정의
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		
		//논리적으로 문자열 일치하도록 equals() 재정의
		System.out.println(member1.equals(member2)); //true
		
		//객체 정보 출력(toString() 재정의)
		System.out.println(member1);
		System.out.println(member2);
	}
}
