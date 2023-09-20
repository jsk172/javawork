package inheritance.transport;

public class Vehicle {
	//필드
	String vehicleName; //차량이름
	int money; //수입
	int passengerCount; //승객수
	
	//생성자
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	//매서드
	public void carry(int fare) { //요금
		this.money += fare;
		passengerCount++;
	}
	//차량정보
	public void showInfo() {
		System.out.printf("%s의 수입은 %,d원이고, 승객수는 %d명 입니다.\n",vehicleName, money, passengerCount);
	}
}
