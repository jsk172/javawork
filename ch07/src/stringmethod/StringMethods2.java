package stringmethod;

public class StringMethods2 {
	public static void main(String[] args) {
		//indexOf() : 검색에 도움
		//문자열이 시작되는 인덱스를 리턴합니다.
		String str = "Hello World Hello";
		int val = str.indexOf("Hello"); //앞에서부터 찾음. val = 0
		System.out.println(val);
		
		int val2 = str.lastIndexOf("Hello"); //뒤에서부터 찾음. val2 = 12
		System.out.println(val2);
		
		int val3 = str.indexOf("okok"); //찾는문자가 없으면 -1을 리턴함.
		System.out.println(val3);
		
		//조건문 만들기
		String subject = "자바 프로그래밍";
		if(subject.indexOf("자바") != -1) { //자바가 검색이 되면
			System.out.println("자바와 관련된 책입니다.");
		}else { //index == -1 이면
			System.out.println("자바와 관련된 책이 아닙니다.");
		}
	}
}
