package inheritance.Q4;

public class Engineer1 extends Employee{
	/*
	 * 오류원인 = Employee의 생성자를 상속받지 않음
	 * 결함 조치 = super()를 사용하여 생성자를 상속받음.
	 * public Engineer1(String name) {
		super(name);
	}
	 */
	
	public Engineer1(String name) {
		super(name);
	}
	
	private String skillset;
	
	public String getSkillSet() {
		return skillset;
	}
	public void setSkillSet(String skillset) {
		this.skillset = skillset;
	}

}
