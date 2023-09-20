package abstracts.template;

public class CarTest {
	public static void main(String[] args) {
//		Car manCar = new Car(); 추상클래스는 객체생성이 안됨
		//추상클래스 타입으로 객체 생성
		Car manualCar = new ManualCar();
		manualCar.run();
		
		System.out.println("========================");
		Car myCar = new AICar();
		myCar.run();
		
		/*
		//final 클래스 테스트
		String msg = "좋은 하루 되세요.";
		System.out.println(msg);
		
		Integer num = 100;
		System.out.println(num);
		*/
	}
}
