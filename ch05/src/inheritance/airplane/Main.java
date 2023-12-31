package inheritance.airplane;

public class Main {
	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.이륙하다();
		sa.비행하다();
		
		//모드변경 - 클래스 이름으로 직접 접근
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.비행하다();
		
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.비행하다();
		
		sa.착륙하다();
	}
}
