package arraycopy;

public class BookTest {
	public static void main(String[] args) {
		
		//객체를 저장할 크기가 3인 배열
		Book[] books = new Book[3];
		
		//객체 3개 생성
		Book book1 = new Book("개미", "베르나르");
		Book book2 = new Book("태백산맥", "조정래");
		Book book3 = new Book("미생", "윤태호");
		
		//인덱스 순서에 따라 지정
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		
		//1개 출력
		System.out.println(books[2]);
		
		//전체 출력
		for(int i = 0;i<books.length; i++) {
			System.out.println(books[i].toString());
		}
		
//		System.out.println(book1);
//		System.out.println(book1.toString());
		
	}
}
