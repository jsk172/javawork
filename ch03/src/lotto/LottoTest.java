package lotto;

public class LottoTest {
	public static void main(String[] args) {
		/*
		 * 로또 번호 생성기
		 * 1~45 -> 6개 생성
		 * 배열의 크기가 6인 lotto 선언
		 */
		int[] lotto = new int[6];
		
		//0번 인덱스에 랜덤번호 하나 출력.
		lotto[0] = (int)(Math.random()*45 +1);
		System.out.println(lotto[0]);
		
		
		//6개를 동시에 생성
		for(int i=0; i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45 +1);
			//중복 문제 해결 - 중첩 for
			for(int j = 0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--; //이전 인덱스로 이동
				}
			}
		}
		//6개 동시 출력
		for(int i=0; i<lotto.length;i++) {
			System.out.print(lotto[i] + " ");
		}
		
		//파일 이름 출력
		LottoTest lottoTest = new LottoTest();
		System.out.println(lottoTest);
	}
}
