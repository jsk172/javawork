package algorithm;

public class SortTest {
	public static void main(String[] args) {
		/*
		 * 오름차순 정렬 - 버블 정렬
		 * 자리바꾸기(위치) a, b, temp
		 * 2,3,4,5,6,9
		 */
		
		int[] arr = {3,6,9,2,5,4};
		int temp; //임시 변수
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {//자리바꿈
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		/*
		 * 1행 3 6 2 5 4 9
		 * 2행 3 2 5 4 6 9
		 * 3행 2 3 4 5 6 9
		 */
		
		
		
		//arr 출력
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}//main
}
