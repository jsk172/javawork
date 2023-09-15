package objectarray.books;

public class Book {
	private String bookname;
	private String author;
	
	public Book(String bookname, String author) {
		this.bookname = bookname;
		this.author = author;
	}

	
	//책의 정보 출력
	public String showBookInfo() {
		return bookname + ", " + author;
		//System.out.println(bookname + ", " + author);
	}
}
