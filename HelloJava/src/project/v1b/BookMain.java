package project.v1b;



public class BookMain {
	public static void main(String[] args)
{
	// 프로그램 관력 객체 생성
	BookService bsrv = new BookServiceImpl();
	
	//객체 생성
	BookV0 bs = new BookV0("1","축구의역사","굿스포츠",7000);
	
	//추가
	bsrv.addBook(bs);
	System.out.println(bs);
	
	//수정
	bs= new BookV0("1","축구의역사","굿스포츠",8000);
	bsrv.modifyBook(bs);
	
	//삭제
	bsrv.removeBook("1");
	
	}
}
