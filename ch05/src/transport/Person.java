package transport;

//사람 클래스(자료형)
public class Person {
	//필드
	String name; // 이름
	int money; // 가진 돈
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//버스를 탄다
	public void takeBus(Bus bus) {
		bus.take(1500); //요금 지불
		this.money -= 1500; //요금만큼 가진 돈 차감
	}
	//지하철을 탄다
	public void takeSubway(Subway subway) {
		subway.take(1250);
		this.money -= 1250;
	}
	
	//사람의 정보
	public void showPersonInfo() {
		System.out.println(name + "님의 남은 돈은 "+ money + "원 입니다.");
	}
}
