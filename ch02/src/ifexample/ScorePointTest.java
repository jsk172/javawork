package ifexample;

import java.util.Scanner;

public class ScorePointTest {
	public static void main(String[] args) {
		/*
		 점수에 따른 학점 출력 프로그램
		 변수 - score, grade
		 A학점 - 90~100점
		 B학점 - 80~90점
		 C학점 - 70~80점
		 D학점 - 60~70점
		 F학점 - 60점 미만
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();		
		
		
		if(score <= 100 && score >= 90) {
			System.out.println("A학점 입니다.");
		}else if(score < 90 && score >= 80){
			System.out.println("B학점 입니다.");
		}else if(score < 80 && score >= 70){
			System.out.println("C학점 입니다.");
		}else if(score < 70 && score >= 60){
			System.out.println("D학점 입니다.");
		}else{
			System.out.println("F학점 입니다.");
		}
	
	
	
	sc.close();
	}

}
