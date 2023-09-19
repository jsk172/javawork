package abstracts.template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("차가 스스로 멈춥니다.");
	}

}
