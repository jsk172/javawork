package ifexample;

import java.util.Scanner;

public class Seats {
	public static void main(String[] args) {
		/*
		 * 입장객 수에 따른 좌석의 줄(행)수 계산
		 * 변수 - customer(고객수), colum(열 수), row(줄 수)
		 */
		Scanner sc = new Scanner(System.in); //입력 객체 sc 생성
		
		System.out.println("입장객 수 입력 : ");
		int customer = sc.nextInt();
		
		System.out.println("좌석 열 수 입력 : ");
		int colum = sc.nextInt();
		
		int row = 0;
		
		//연산 처리(if - else문)
		if(customer % colum == 0) {
			row = customer / colum;
		}else {
			row = (customer / colum) + 1;
		}
		
		System.out.println(row + "줄이 필요합니다.");
		
		
		sc.close();
	
	}
}
