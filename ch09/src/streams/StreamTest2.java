package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main(String[] args) {
		//문자형 배열
		String[] 과일 = {"사과", "배", "수박", "참외"};
		
		//for문을 사용하지 않고 forEach()문 사용
		Stream<String> strStream = Arrays.stream(과일);
		strStream.forEach(str -> System.out.println(str));
		
		//정수형 배열
		int[] num = {1, 2, 3, 4};
		/*
		Stream<Integer> numStream = Arrays.stream(num);
		numStream.forEach(n -> System.out.print(n + " "));
		*/
		
		//위에 주석 한줄로 줄이기
		Arrays.stream(num).forEach(n -> System.out.println(n));
		
		//합계
		int sumVal = Arrays.stream(num).sum();
		//count함수의 반환형이 long이므로 int로 다운캐스팅 함.
		int count = (int)Arrays.stream(num).count();
		double avg = (double)sumVal / count;
		
		System.out.println("합계 : " + sumVal);
		System.out.println("개수 : " + count);
		System.out.println("평균 : " + avg);
	}
}
