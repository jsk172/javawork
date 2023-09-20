package abstracts.player;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("매우 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("매우 높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴을 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 상급자 입니다. ***");
	}

}
