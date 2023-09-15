package constant;

import java.util.Scanner;

public class KmToMile {
	public static void main(String[] args) {
		/*
		 * km를 입력받아 mile을 출력하는 프로그램
		 * 변환상수 : 1mile = 1.609344km
		 * 변수 : kph, mph
		 */
		Scanner sc = new Scanner(System.in);
		
		final double RATE_KPH_MPH = 1.609344;
		double mph = 0.0;
		
		System.out.print("구속을 입력하세요(km/h) : ");
		double kph = sc.nextDouble();
		
		//연산
		mph = kph / RATE_KPH_MPH;
		
		//출력
		System.out.printf("공의 속도는 %.2f[MPH] 입니다.",mph);
		
		
		sc.close();
	}
}
