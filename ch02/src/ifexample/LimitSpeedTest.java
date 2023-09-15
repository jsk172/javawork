package ifexample;

public class LimitSpeedTest {
	public static void main(String[] args) {
		/*
		 * if문
		 * 제한속도(limit speed) 50이면 "제한 속도 위반"
		 */
		int limitSpeed = 55;
		/*단독if
		 * if(limitSpeed > 50) {
			System.out.println("제한 속도 위반");
		}
		*/
		
		
		//if-else 구문
		if(limitSpeed > 50) {
			System.out.println("제한속도위반");
		}else{
			System.out.println("안전속도준수");
		}
		
		
		System.out.println("시속 " +limitSpeed+ "km 입니다.");
	}
}
