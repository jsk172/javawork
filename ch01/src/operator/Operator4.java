package operator;

public class Operator4 {
	public static void main(String[] args) {
		//논리 연산자
		// && - 엠퍼샌드 : 두 항이 모두 참인 경우에만 true
		// || : 두 항 중 하나만 참이여도 (true)
		// ! - 논리부정
		
		System.out.println((6 > 5) && (10 == 11));
		System.out.println((6 > 5) || (10 == 11));
		System.out.println(!(10==11)); //논리부정
	}
}
