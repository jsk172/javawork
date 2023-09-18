package objectequals.member;

public class Member {
	private String memberId; //사번
	private String name; //이름
	
	public Member(String memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}

	@Override
	public int hashCode() { //맴버이름.hashcode()를 반환
		return memberId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj; //member형으로 다운캐스팅
			if(this.memberId.equals(member.memberId)) {
				return true;//외부 입력된 회원아이디와 이미 생성된 회원아이디가 일치하면 true
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return memberId + "," + name;
	}
	
	
	
	
}
