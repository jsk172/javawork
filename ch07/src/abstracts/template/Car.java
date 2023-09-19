package abstracts.template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnoff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿 매서드 정의 : 상속받는 클래스에서 수정 할 수 없음
	public final void run() {
		startCar();
		drive();
		turnoff();
		stop();
	}
	
	
	
}
