package whileexample;

public class WhileIfBreak {
	public static void main(String[] args) {
		/*
		 * 반복 조건문
		 * 1부터 10까지 출력
		 */
		int i = 0;
		
		while(true) {
			i++;
			System.out.println(i);
			if(i == 10)//중괄호 블럭은 실행문이 한 줄일 때 생략 가능. {
				break;
			}
		
		
	}
}

