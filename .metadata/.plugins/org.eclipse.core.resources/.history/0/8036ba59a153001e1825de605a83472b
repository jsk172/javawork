package typinggame;

import java.util.Scanner;

public class TypingGame {
	public static void main(String[] args) {
		/*
		 * 영어 단어가 랜덤하게 화면에 출제되면 타이핑하기
		 * 오타가 없으면 "통과", 오타가 있으면 "다시 도전"
		 * 10문제 수행
		 * 시간 측정
		 */
		
		String[] words = {"ant", "bear", "chicken", "cat", "dog", "elephant", "frog", "horse", "monkey", "tiger"};
		Scanner sc = new Scanner(System.in);
		int n = 1; //문제 번호
		System.out.println("영어타자게임, 준비되면 엔터키를 누르세요.");
		sc.nextLine(); //엔터
		double start, end;
		start = System.currentTimeMillis(); //게임 시작전 시간
		
		while(n < 11) {
			int rand = (int)(Math.random()*words.length);
			
			System.out.print("문제" + n + " :");
			String question = words[rand];
			System.out.println(words[rand]); //출제된 단어

			//단어 입력
			String answer = sc.nextLine(); //사용자 입력

			if(question.equals(answer)) {
				System.out.println("통과!");
				n++;
			}else{
				System.out.println("오타! 다시 도전!");
			}
		}
		
		
		end = System.currentTimeMillis(); //게임 종료 시간.
		System.out.printf("게임 시간은 %.2f초 입니다.", (end-start)/1000);
		
		
		
		sc.close();
	}
}
