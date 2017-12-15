package JM.lab;

import java.io.IOException;
import java.util.Scanner;

public class Lab07 {

	public static void main(String[] args) throws IOException {
		// #22 - 윤년 여부확인
		// 현재 연도가 400으로 나누어떨어지거나
		// 현재 년도가 4로나누어 떨어지지만 100 안나누어떨어짐

//		GregorianCalendar gc = new GregorianCalendar();
//		System.out.println(gc.isLeapYear(2000));
//
//		String welcome = "확인할 윤년 년도를 입력하세요"; // 더깔끔
//
//		// int year = 4404;
//		System.out.println(welcome); // 더깔끔
//		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt();
//
//		if (gc.isLeapYear(year))
//			System.out.printf("%d는 윤년입니다 \n", year);
//		else
//			System.out.printf("%d는 윤년 아니다 \n", year);
//
//		// System.out.println((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ?
//		// "윤" : "not윤");
//
//		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
//			System.out.println("윤");
//		else
//			System.out.println("not");

		// #24

		// String num1 = "insert first Number";
		// String num2 = "insert second Number";
		// String fmt = "%d*%d = %d \n";
		//
		// Scanner sca = new Scanner(System.in);
		// System.out.println(num1);
		// int n1 = sc.nextInt();
		// if (n1 > 10)
		// System.out.println("wrong Number");
		// else
		// System.out.println(num2);
		// int n2 = sc.nextInt();
		// if (n1 > 10)
		// System.out.println("wrong Number");
		// else
		// System.out.printf(fmt, n1, n2, n1 * n2);

//		String fmt = "%d * %d = %d \n";
//		// String fmt = "%2d x %2d = %3d \n";
//		String welcome1 = "출력할 구구단의 단 입력하세요";
//
//		Scanner sca = new Scanner(System.in);
//		System.out.println(welcome1);
//		int mul = sc.nextInt();
//		sc.close();
//
//		fmt = "%d x %d = %d \t";
//		for (int i = 1, j = mul; i <= 9; ++i)
//			System.out.printf(fmt, i, j, i * j);

		//
		// # , 25, 27,28, 30    (23) (26) (29)
		
		
		// # 25 
//		char ch = 'a';
//		System.out.println(ch);
//		System.out.println((int) ch);	//97
//		ch = 'x';
//		System.out.println(ch);
//		System.out.println((int) ch);	//120
//		ch = 'A';
//		System.out.println(ch);
//		System.out.println((int) ch);	//65
//		ch = 'Z';
//		System.out.println(ch);
//		System.out.println((int) ch);	//90
		
		
//		String lower = "소문자를 입력";				//내가한거
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println(lower);
//		while(true)
//		{
//			String lowCase =scan.nextLine();
//
//		
//			switch(lowCase)
//			{
//			case "a": System.out.println("A"); break;
//			case "b": System.out.println("B"); break;
//			case "c": System.out.println("C"); break;
//			case "d": System.out.println("D"); break;
//			case "e": System.out.println("E"); break;
//			case "f": System.out.println("F"); break;
//			case "g": System.out.println("G"); break;
//			case "h": System.out.println("H"); break;
//			case "i": System.out.println("I"); break;
//			case "j": System.out.println("J"); break;
//			case "k": System.out.println("K"); break;
//			case "l": System.out.println("L"); break;
//			case "m": System.out.println("M"); break;
//			case "n": System.out.println("N"); break;
//			case "o": System.out.println("O"); break;
//			case "p": System.out.println("P"); break;
//			case "q": System.out.println("Q"); break;
//			case "r": System.out.println("R"); break;
//			case "s": System.out.println("S"); break;
//			case "t": System.out.println("T"); break;
//			case "u": System.out.println("U"); break;
//			case "v": System.out.println("V"); break;
//			case "w": System.out.println("W"); break;
//			case "x": System.out.println("X"); break;
//			case "y": System.out.println("Y"); break;
//			case "z": System.out.println("Z"); break;
//			}
//		
//		
//		}
//		System.out.println("wrong");

//		System.out.println("lowercase to UPPER CASE");
//		int ch = System.in.read();
//		int a = ch-32;
//		if (!(ch >= 'a' && ch <= 'z'))
//			System.out.println("alphabet only");
//		else
//			System.out.println((char)a);
		
		
		// # 27
		
//		int sum =  0;
//		int number = 0;
//		
//		while(number<20) 
//		{
//		number++; sum+=number; if(sum>=100) break;	
//		}
//		System.out.println(sum);
//		System.out.println(number);
//		String fmt = "number : %d, sum = : %d \n";
//		System.out.printf(fmt, sum, number);
//	
//		// #28
//		sum =  0;
//		number = 0;
//		
//		while(number<20) 
//		{
//		number++; if(number==10||number==11) continue; sum+=number; //10 11 안더해놈
//		}
//		System.out.println(sum);
//		System.out.println(number);	
		
		
		
		// #30
//		System.out.println("            			Multiplication Table \n");
//		System.out.println("  		 1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9 ");
//		System.out.println("----------------------------------------------------------------------------------");
//		
//		for (int i = 1; i < 10; i++)
//			System.out.printf("%d | \t %d \t %d \t %d \t %d \t %d \t %d \t %d \t %d \t %d \n"
//					, i, 1*i, 2*i, 3*i,4*i,5*i,6*i,7*i,8*i,9*i);
		
		
		String fmt = "       Multiplication Table \n";
		fmt += "     1   2   3   4   5   6   7   8   9 \n";
		fmt += "---------------------------------------\n";
		
		System.out.println(fmt);
		
		for(int i =1; i<=9;++i)
		{
			fmt = "%d | %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d \n";
			System.out.printf(fmt, i, 1*i, 2*i, 3*i,4*i,5*i,6*i,7*i,8*i,9*i);
		}
		System.out.println();
		
		
		for(int i =1; i<=9;++i)
		{
			System.out.printf("%d | %2d", i,i);
			for (int j =2; j<=9;++j)
			{
				System.out.printf("  %2d",i*j);
			}
			System.out.println();
		}
		
		// #23
		//난수생성 특정범위를 포함하는 난수생성
		//정수난수값 % ((마지막값 - 시작값) +1) +시작값
		//복권 범위 100~999
		//lotto :657, lucky : 452 = 1개일치
		//lotto :657, lucky : 524 = 1개일치
		//lotto :657, lucky : 123 = 0개일치
		//lotto :657, lucky : 725 = 2개일치
		//657    665   2개 ? 1개?
		
		int ran= (int)(Math.random()*1000);
		int lotto = ran%((999-100)+1)+100;
		System.out.println(lotto);
		
		
		Scanner sc =new Scanner(System.in);
		String lucky = sc.nextLine();
		
		
//		char lucky1 = lucky.charAt(0);
//		char lucky2 = lucky.charAt(1);
//		char lucky3 = lucky.charAt(2);
//		
//		char lotto1 = ("" + lotto).charAt(0);
//		char lotto2 = ("" + lotto).charAt(1);
//		char lotto3 = ("" + lotto).charAt(2);
		
		//비교 
		int match = 0;
//		if(lotto1 == lucky1 || lotto1 == lucky2 || lotto1 == lucky3)
//			++match;
//		if(lotto2 == lucky1 || lotto2 == lucky2 || lotto2 == lucky3)
//			++match;
//		if(lotto3 == lucky1 || lotto3 == lucky2 || lotto3 == lucky3)
//			++match;
		
		String lotto4 = ""+lotto;
		int size = lotto4.length();
		
		for(int i =0; i<size; ++i)
			for(int j =0; j<size; ++j)
			if (lucky.charAt(i) == lotto4.charAt(j))
				++match;
		String msg = "꽝 !!!!";
		switch(match)
		{
		case 3: msg = "1등"; break; 
		case 2: msg = "2등"; break;
		case 1: msg = "3등"; break;
		}
		System.out.println(msg);
		

//		System.out.printl3n("lotto:" + ran +" Lucky:"); //내가한거
//		String chars = ran;
//		System.out.println(chars.charAt(0));
//		System.out.println(chars.charAt(1));
//		System.out.println(chars.charAt(2));
		
		
		
		
		
		
		
		
		// #26
		
		int num2= (int)(Math.random()*100)+1;
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
		int num1 = sca.nextInt(); //정수 입력
		
		if (num1>num2)
			System.out.println("too large");
		else if (num1<num2)
			System.out.println("small");
		else if (num1 == num2)
			System.out.println("correct");
			break;
		}
		
		
		
		
		
		
		// #29
		
		
		
		
		
			
		
		
		
		
		
		

	}

}
