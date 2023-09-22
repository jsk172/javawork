package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
	public static void main(String[] args) {
		//Map 자료구조 생성
		Map<String, String> dic = new HashMap<>();

		//단어와 정보 만들기
		dic.put("이진수", "컴퓨터가 사용하는 0과 1로 이루어진 수");
		dic.put("알고리즘", "어떤 문제를 해결하기 위해 정해진 절차");
		dic.put("버그", "프로그램이 적절하게 동작하는데 실패하거나 오류가 발생하는 코드");
		dic.put("깃허브", "분산 버전 관리 틀인 깃 저장소 호스팅을 지원하는 웹 서비스");


		System.out.println("=====================================================");
		System.out.println("*** 프로그램을 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요 ***");
		System.out.println("=====================================================");
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("검색할 단어를 입력하세요 : ");
			String word = sc.nextLine(); //입력 대기중
			
			//종료하기 - q나 Q를 입력
			//대문자, 소문자 반환하는 문자열 함수 - toLowerCase() <-> toUpperCase()
			if(word.toLowerCase().equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break; //while을 빠져나옴
			}

			//단어의 정보 가져오기
			String definition = dic.get(word);
			if(definition != null) {
				System.out.println(definition);
			}else {
				System.out.println(word + "는 없는 단어입니다.");
			}
			
		}//while
		
		
		
		sc.close();
	}//main
}
