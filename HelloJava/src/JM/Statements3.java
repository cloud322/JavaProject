package JM;

import java.util.Scanner;

public class Statements3 {

	public static void main(String[] args) {
		// 반복문 while

		int i = 1;
		while (i <= 5) {
			System.out.println(" too COLD ");
			++i;// 증감식
		}
		// 무한루프

		// while (true) {
		// System.out.println(" too COLD ");
		// }

		// 구구단
		String fmt = "%d x %d =%d \n";
		int mul = 5;
		i = 1;
		while (i <= 9) {
			System.out.printf(fmt, mul, i, mul * i);
			++i;
		}

		// 한번도 실행 안된다고?
		i = 9;
		while (i > 10) {
			System.out.println("1can u see?");
		}

		// 이젠달라요~
		i = 9;
		do {
			System.out.println("2can u see?");
		} while (i > 10);

		
		// *****
		// ****
		// ***
		// **
		// *
		i = 1;
		int j = 5;

		while (i <= 5) {
			while (j >= i) {
				System.out.print("*");
				--j;
			}
			++i;
			j = 5;
			System.out.println();
		}
		// i = 1;
		// while (i <= 5)
		// {
		// int j = 1;
		// while (j <= 5)
		// {
		// System.out.println("*");
		// ++i;
		// }
		// ++i;
		// }
		//
		// System.out.println();

		
		// 직각삼각형
		// *
		// **
		// ***
		// ****
		// *****
		i = 1;
		j = 1;

		while (i <= 5) 
		{
			while (j <= i) 
			{
				System.out.print("*");
				++j;
			}
			++i;
			j = 1;
			System.out.println();
		}
		
		// *****
		// *****
		// *****
		// *****
		// *****
		
		i = 1;
		j = 1;

		while (i++ <= 5) 
		{
			while (j++ <= 5) 
			{
				System.out.print("*");
			}
			j = 1;
			System.out.println();
		}
		
		//반복문의중단은 = break
		
		i = 1;
		int sum = 0;
		fmt = "i : %d, sum : %d \n";
		while(true)
		{
			if(sum>100)
			{
				System.out.printf(fmt, i, sum);
				break;
			}
			sum +=i;
			++i;
		}
		
		//반복의 재시작 -continue
		i=1; 
		while (i<=100)
		{
			if(i%2!=0) continue;
			System.out.println(i);
		}
		
		
		// while 문의 조금다른 용도
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("잡업할 코드를 입력하세요");
			System.out.println("c)reate : 회원 생성");
			System.out.println("r)ead : 회원 조회");
			System.out.println("u)pdate : 회원 수정");
			System.out.println("d)elete : 회원 삭제");
			System.out.println("q)uit : 프로그램 종료");
			System.out.print(">>>>>>");
			
			String job =sc.nextLine();
			//q 입력되면 while 에서 나감
//			if (job.equals("q"))   //  job == "q" ㄴㄴ해
//				break;
			
			switch(job)
			{
			case "c": 
				System.out.println("<회원등록 매뉴를 선택>"); break;
			case "r": 
				System.out.println("<회원등록 매뉴를 선택>"); break;
			case "u": 
				System.out.println("<회원등록 매뉴를 선택>"); break;
			case "d": 
				System.out.println("<회원등록 매뉴를 선택>"); break;
			case "q": 
				System.exit(0); break;
				//case "q": break; exit from switch
			}
		}
		
		
	}

}

