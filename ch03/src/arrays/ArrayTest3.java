package arrays;

public class ArrayTest3 {
	public static void main(String[] args) {
		//크기가 4인 정수형 배열 선언
		//int형은 값이 비어있으면 0을 출력함
		
		int[] nums = new int[4];
		int sum = 0;
		double avg;
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		//직접 초기화
		int[] number = {10, 20, 30, 40};
		
		
		System.out.println(number[3]);
		System.out.println(nums[2]);
		System.out.println("===============");
		
		
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
			System.out.println(nums[i]);
		}
		
		avg = sum/nums.length;
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ avg);
	}
}
