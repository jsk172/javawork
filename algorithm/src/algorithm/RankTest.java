package algorithm;

public class RankTest {
	public static void main(String[] args) {
		/*
		 * 순위 정하기
		 * rank를 모두 1로 초기화
		 * 순위 비교하면서 점수가 낮으면 +1
		 */
		int[] score = {70, 90, 60, 50, 80};
		int[] rank = new int[5];
		
		//중첩 for(행, 렬)
		for(int i = 0; i<score.length; i++) {
			int count = 1;
			for(int j = 0; j<score.length; j++) {
				if(score[i] < score[j]) {
					count++;
				}
			}
			rank[i] = count; //순위에 따른 저장
		}
		
		/*
		 * i=0, j=0 (70, 70) = count = 1
		 * i=0, j=1 (70, 90) = count++ => count = 2
		 * i=0, j=2 (70, 60) = count = 2
		 * i=0, j=3 (70, 50) = count = 2
		 * i=0, j=4 (70, 80) = count++ => count = 3
		 * i가 4까지 반복. 
		 */
		
		
		
		//순위 출력
		for(int i = 0; i<rank.length; i++) {
			System.out.print(rank[i] + " ");
		}
		
	}//main
}
