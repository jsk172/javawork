package continueexam;

public class ContinueTest {
	public static void main(String[] args) {
		//1.break문 - 1~10까지 자연수를 1부터 5까지 출력
		for(int i=1; i<=10; i++) {
			if(i>5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("=======================");
		
		//2.continue문 - 1~10 자연수 중 5와 8을 제외한 수 출력
		for(int i=1; i<=10; i++) {
			if(i==5 || i==8) {
				continue;
			}
			System.out.println(i);
		}
		
	}//main
}
