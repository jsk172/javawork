package constant;

public class PrintFormat {
	public static void main(String[] args) {
		/*
		 * printf("문자열 포맷", 객체)
		 * 대응 서식 : 정수 - %d, 실수 - %f, 문자 - %s
		 * decimal(10진)
		 * 줄바꿈 문자 : \n
		 * tab 키 : \t
		 */
		
		int year = 2023;
		float weight = 63.7f;
		
		
		System.out.printf("올해는 %d년입니다.\n",year);
		System.out.printf("무게는 %.2fkg입니다.\n",weight);
		
		String nick = "얼음공주";
		System.out.printf("별명은 %s입니다.\n",nick);
		
		// \t 사용
		String table = ""; // 문자열 초기화
		table += "===================\n";
		table += "이름\t나이\t나라\n";
		table += "===================\n";
		table += "강감찬\t82\t고려\n";
		table += "이순신\t53\t조선\n";
		table += "===================\n";
		
		System.out.println(table);
		
	}
}
