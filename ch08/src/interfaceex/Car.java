package interfaceex;

public class Car {
	//필드를 인터페이스형 타입 선언
	/*
	Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire backLeftTire = new KumTire();
	Tire backRightTire = new KumTire();
	*/
	Tire frontLeftTire;
	Tire frontRightTire;
	Tire backLeftTire;
	Tire backRightTire;
	
	public Car() {
		frontLeftTire = new HanTire();
		frontRightTire = new HanTire();
		backLeftTire = new KumTire();
		backRightTire = new KumTire();
	}
	
	//매서드
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
