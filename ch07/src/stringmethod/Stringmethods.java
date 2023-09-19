package stringmethod;

public class Stringmethods {
	public static void main(String[] args) {
		//문자열 다루기
		//문자열은 1차원 배열이라고 추정.
		//charAt() : 해당 인덱스의 문자를 리턴함.
		String subject = "자바 프로그램";
		char ch0 = subject.charAt(0);
		char ch1 = subject.charAt(1);

		System.out.println(ch0);
		System.out.println(ch1);

		//주민등록번호로 성별 구분
		String 주민등록번호 = "001112-4234567";
		char 성별 = 주민등록번호.charAt(7);
		switch(성별) {
		case '1': case '3':
			System.out.println("남자입니다.");
			break;
		case '2': case '4':
			System.out.println("여자입니다.");
			break;
		}
		
//		substring(첫문자, 끝문자) - 문자열을 추출하는 매서드, (마지막인덱스-1)임
		String 생년월일 = 주민등록번호.substring(0, 6);
		System.out.println(생년월일);
		
		String 주민등록번호뒷자리 = 주민등록번호.substring(7); //7번인덱스부터 마지막까지
		System.out.println(주민등록번호뒷자리);
		
		
	}//main
}
