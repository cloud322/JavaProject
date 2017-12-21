package project.v1;



public class SungJukMain {
	public static void main(String[] args)
	{
	//성적 프로그램 관력 객체 생성
	SungJukService sjsrv = new SungJukServiceImpl();
	
	//성적객체 생성
	SungJukV0 sj = new SungJukV0("지현",99,98,99);
	
	//성적추가
	sjsrv.addSungJuk(sj);
	System.out.println(sj);
	
	//성적수정
	sj= new SungJukV0("지현",55,87,12);
	sjsrv.modifySungJuk(sj);
	
	//성적 삭제
	sjsrv.removeSungJuk("지현");
	
	}
}
