package transport;

public class Bus {
	//필드
	int busNumber; //버스번호
	int passenger; //승객
	int money; //수입
	
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//승객을 태우다
	public void take(int fee) {//요금을 받음
		this.money += fee; //수입 += 요금
		passenger++; // 승객+1
	}
	
	//버스의 정보
	public void showBusInfo() {
		System.out.printf("%,d번 버스의 수입은 %,d원 이고, 승객 수는 %,d명 입니다.\n",busNumber, money, passenger);
	}
}
