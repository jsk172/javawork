package operator;

public class Operator5 {
	public static void main(String[] args) {
		/*
		 * 증가, 감소 연산자(++,--)
		 */
		int num = 10;
		num++;
		System.out.println(num);
		
		int num2 = 20;
		num2--;
		System.out.println(num2);
		
		//복합 대입 연산자 연습
		int val = 100;
		System.out.println(val += 1);
		System.out.println(val -= 1);
		System.out.println(val *= 10);
		System.out.println(val /= 10);
	}
}
