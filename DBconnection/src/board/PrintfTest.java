package board;

public class PrintfTest {
	public static void main(String[] args) {
		//정수
		System.out.printf("%d\n", 85); //85
		System.out.printf("%7d\n", 85); //85(7자리, 빈자리는 공백)
		System.out.printf("%-7d\n", 85); //85(7자리, 빈자리는 공백, 왼쪽정렬)
		
		//문자열
		System.out.printf("%s\n", "hello");
		System.out.printf("%7s\n", "hello");
		System.out.printf("%-7s\n", "hello");
	}
}
