package transport;

public class Main {
	public static void main(String[] args) {
		//사람 객체 생성
		Person p1 = new Person("이강인", 10000);
		Person p2 = new Person("우영우", 20000);
		Person p3 = new Person("김지성", 30000);
		
		//버스 객채 생성
		Bus bus100 = new Bus(100);
		Bus bus601 = new Bus(601);
		
		//지하철 객체 생성
		Subway green = new Subway("2호선");
		
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p3.takeBus(bus601);
		p3.takeSubway(green);
		
		p1.showPersonInfo();
		p2.showPersonInfo();
		p3.showPersonInfo();
		System.out.println("====================================================");
		
		
		bus100.showBusInfo();
		bus601.showBusInfo();
		System.out.println("====================================================");
		green.showSubwayInfo();
	}
}
