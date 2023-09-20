package abstracts.player;

public class Player {
	//PlayerLevel 참조
	private PlayerLevel level;
	
	//생성자
	public Player() {
		level = new Beginner(); //초보자 생성
		level.showLevelMessage();
	}
	//레벨 업그레이드하는 매서드
	public void upgradeLevel(PlayerLevel level) { 
		this.level = level; //중,상급자를 위한 설정
		level.showLevelMessage();
	}
	//Player가 게임하는 매서드
	public void play(int count) {
		level.go(count);
	}
}
