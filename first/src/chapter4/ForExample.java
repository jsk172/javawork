package chapter4;

public class ForExample {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		
		for(num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println(sum);
		System.out.println(num);
	}
}
