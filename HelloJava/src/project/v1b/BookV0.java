package project.v1b;

public class BookV0 {
	String bookNum;
	String bookName;
	String publisher;
	int price;
	
	public BookV0() {}

	public BookV0(String isbn, String bookName, String publisher, int price) {
		super();
		this.bookNum = isbn;
		this.bookName = bookName;
		this.publisher = publisher;
		this.price = price;
	}

	public String getIsbn() {
		return bookNum;
	}

	public void setIsbn(String isbn) {
		this.bookNum = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookV0 [isbn=" + bookNum + ", bookName=" + bookName + ", publisher=" + publisher + ", price=" + price
				+ "]";
	}
	
	
	

}
