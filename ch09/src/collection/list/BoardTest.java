package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BoardTest {
	public static void main(String[] args) {
		//ArrayList 또는 Vector를 선택 사용
		
//		List<Board> list = new ArrayList<>();
		List<Board> list = new Vector<>();
		
		//Board 객체(게시글)
		Board board1 = new Board("제목1", "내용1", "글쓴이1");
		Board board2 = new Board("제목2", "내용2", "글쓴이2");
		Board board3 = new Board("제목3", "내용3", "글쓴이3");
		
		//Board 객체를 vector 리스토어 저장
		list.add(board1); //0번 인덱스
		list.add(board2); //1번 인덱스
		list.add(board3); //2번 인덱스
		
		//게시글 1개 삭제(1번 인덱스)
		if(list.contains(board2)) { 
			list.remove(board2);
//			list.remove(0); //인덱스 번호로도 삭제 가능.
		}
		
		//맨 앞에 객체 가져오기(0번 인덱스)
		System.out.println("title : " + list.get(0).getTitle());
		System.out.println("content : " + list.get(0).getContent());
		System.out.println("writer : " + list.get(0).getWriter());
		
		//전체목록
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getTitle() + ", " + 
			board.getContent() + ", " + board.getWriter());
		}
		
	}
}
