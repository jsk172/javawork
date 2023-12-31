package basicclass;

//Object = 모든클래스의 부모클래스
public class Book{
	int bookNumber; //책 번호
	String bookTitle; //책 제목
	
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	//매서드 재정의
	@Override
	public String toString() {
		return bookNumber + ", " +bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}
