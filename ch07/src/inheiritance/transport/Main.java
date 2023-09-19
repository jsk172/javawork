package inheiritance.transport;

public class Main {
	public static void main(String[] args) {
		//Person객체 생성
		Person sohee = new Person("박소희", 10000);
		Person daeho = new Person("이대호", 20000);
		//Bus객체 생성
		Bus bus100 = new Bus("100번 버스");
		Taxi kakaoT = new Taxi("카카오 택시");
		//버스타기
		sohee.take(bus100, 1500);
		daeho.take(bus100, 1500);
		//택시타기
		daeho.take(kakaoT, 10000);
		
		//정보출력
		sohee.showPersonInfo();
		daeho.showPersonInfo();
		bus100.showInfo();
		kakaoT.showInfo();
	}
}
