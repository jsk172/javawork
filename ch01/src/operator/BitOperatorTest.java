package operator;

public class BitOperatorTest {
	public static void main(String[] args) {
		//비트 논리 연산자
		int num1 = 5; // 00000101 (2진수)
		int num2 = 10;// 00001010(2진수)
		int result;
		int result1;
		
		result = num1 & num2; //모두 1일때 1이고 나머지일때 0
		System.out.println(result); //00000000 = 0
		
		result1 = num1 | num2 ; //둘중에 하나만 1 이여도 1
		System.out.println(result1); //00001111 = 15
		
		
		//비트 이동 연산자
		int a = 10; //00001010
		System.out.println(a << 2); // 00101000 = 40
		System.out.println(a >> 2); // 00000010 = 2
	}
}
