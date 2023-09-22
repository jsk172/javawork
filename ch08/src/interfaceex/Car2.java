package interfaceex;

public class Car2 {
	//필드 - 배열의 선언
	Tire[] tires = {
			new HanTire(),
			new HanTire(),
			new KumTire(),
			new KumTire()
	};
	
	//매서드
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
