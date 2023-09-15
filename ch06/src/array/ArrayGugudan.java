package array;

public class ArrayGugudan {
	public static void main(String[] args) {
		int dan = 3;
		
		for(int i=1; i<10; i++) {
			System.out.println(dan + "x" + i +"=" +(dan*i));
		}
		
		System.out.println("========================================");
		
		//배열을 이용하여 구구단 저장 및 출력
		int[] gugudan = new int[9];
		
		for(int i = 0; i<gugudan.length; i++) {
			//배열 요소를 저장
			gugudan[i] = dan*(i+1);
		}
		
		for(int i = 0; i<gugudan.length; i++) {
			//배열 요소 출력
			System.out.println(dan+"x"+(i+1)+"="+gugudan[i]);
		}
		System.out.println("================================");
		
		
		//배열 복사
		int[] gugudan2 = new int[9];
		//1.일반 복사
		for(int i=0; i<gugudan2.length; i++) {
			gugudan2[i] = gugudan[i];
		}
		for(int i=0; i<gugudan2.length; i++) {
			System.out.println(gugudan2[i]);
		}
		System.out.println("================================");
		
		//Object 클래스의 clone()
		int[] gugudan3 = gugudan2.clone();
		
		for(int i=0; i<gugudan3.length; i++) {
			System.out.println(gugudan3[i]);
		}
		
	}
}
