package project.v2;

import java.util.Scanner;

import project.v1.SungJukV0;

public class SungJukMain {
	private static SungJukServiceImpl sjsrv;	//성적main 에서만볼수잇게

	public static void main(String[] args) {
		sjsrv = new SungJukServiceImpl();		//sjsrv static 변수 
		while(true)
		{
		displayMenu();
		selectMenu();
		}
		
		

		
		
		
	}

	private static void selectMenu() {
		Scanner sc = new Scanner(System.in);
		//입력한 문자를 ASCII 로변환해서 정수로 지정
		int smenu = sc.next().charAt(0);
		
		switch(smenu-48)
		{
		case 1 : newSungJuk(); break;
		case 2 : showSungJuk(); break;
		case 3 : showOneSungJuk();break;
		case 4 : updateSungJuk();break;
		case 5 : deleteSungJuk();break;
		case 0 : exitSungJuk();break;
		}
	}

	private static void displayMenu() {
		// 메뉴출력
				StringBuffer menu = new StringBuffer();
				menu.append("-= 성적처리프로그램 V4 =-\n")
				    .append("------------------\n")
				    .append("1 : 새로운 성적데이터 추가 \n")
				    .append("2 : 전체 성적데이터 조회 \n")
				    .append("3 : 성적데이터 상쇄 조회  \n")
				    .append("4 : 성적데이터 수정 \n")
				    .append("5 : 성적데이터 삭제 \n")
				    .append("0 : 종료 \n")
				    .append("------------------\n")
				    .append("실행할 작업을 선택 하세요 >>\n");
				
				System.out.println(menu.toString());
		
	}

	private static void exitSungJuk() {
		System.exit(0);
		
	}

	private static void deleteSungJuk() {
		sjsrv.removeSungJuk(0);
		
	}

	private static void updateSungJuk() {
		sjsrv.modifySungJuk(null, 0);		
	}

	private static void showSungJuk() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n\n-=전체데이터 출력=-\n")
		  .append(sjsrv.getSungJuk())
		  .append("\n\n");
		System.out.println(sb.toString());
	
		
		
	}
	
	private static void showOneSungJuk() {
		sjsrv.getSungJuk();
		
	}


	private static void newSungJuk() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n\n 추가할 성적데이터를 입력하시요")
		  .append("\n 데이터 입력 순서는 이름/국어/영어/수학 입니다")
		  .append("\n 예 지현/76/65/21")
		  .append("\n >>>");
		  System.out.print(sb.toString());
		
		  Scanner sc =new Scanner(System.in);
		  SungJukV0 sj = new SungJukV0(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		  
		  
		  sjsrv.addSungJuk(sj);
		  
	}

}
