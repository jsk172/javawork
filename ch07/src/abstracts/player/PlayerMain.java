package abstracts.player;

public class PlayerMain {
	public static void main(String[] args) {
		//플레이어 인스턴스 생성
		Player player = new Player();
		player.play(1);;
		
		//중급자 레벨
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		//상급자 레벨
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
