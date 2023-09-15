package switchexample;

public class SwitchCaseTest {
	public static void main(String[] args) {
		/*
		 * 랭킹에 따른 메달 출력
		 * 1-금, 2-은, 3-동
		 * 변수 - rank
		 */
		int rank = 4;
		switch(rank){//switch(변수)
		case 1:
			System.out.println("금메달 입니다.");
			break;
		case 2:
			System.out.println("은메달 입니다.");
			break;
		case 3:
			System.out.println("동메달 입니다.");
			break;
			default://case에 없는 경우 처리
				System.out.println("메달이 없습니다.");
				break;
		}
	}
}
