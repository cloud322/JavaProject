package JM.lab;

import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
		// TODO 프린트 31 32 35
		
		// #31
		
		String msg = "type in 6 digit";
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println(msg);
		String card = sc.nextLine();
		
		//카드정보 판별
		char ctype = card.charAt(0);
		String ctmsg = "no card info";
		
		if (ctype == '3' && card.charAt(1) == '5')
			ctmsg="JCB";
		else if (ctype == '4')
			ctmsg="VISA";
		else if (ctype == '5')
			ctmsg="MASTER";
		
		//은행정보판별
		String bank = "no bank info";
		switch(card)
		{
		case "356317" : bank = "NH"; break;
		case "356901" : bank = "SinHan"; break;
		}
		
		System.out.printf("%s %s \n",ctmsg,bank);						
		
		
		
//		String msg = "type in 6 digit";					//내가한거
//		
//		
//		Scanner sc =new Scanner(System.in);
//		System.out.println(msg);
//		String card = sc.nextLine();
		//msg = "no INFO"
//		
//		switch(card.charAt(0))
//		{
//		case '3': if (card.charAt(1) == '5' && 
//					  card.charAt(2) == '6' &&
//					  card.charAt(3) == '3' &&
//					  card.charAt(4) == '1' &&
//					  card.charAt(5) == '7')
//			{
//			 msg = "(JCB)NH농협카드";
//			}
//			 if (card.charAt(1) == '5' && 
//				 card.charAt(2) == '6' &&
//				 card.charAt(3) == '9' &&
//				 card.charAt(4) == '0' &&
//				 card.charAt(5) == '1')
//			{
//			  msg = "(JCB)신한카드";
//		  	}
//			if (card.charAt(1) == '5' && 
//				card.charAt(2) == '6' &&
//				card.charAt(3) == '9' &&
//				card.charAt(4) == '1' &&
//				card.charAt(5) == '2')
//			{
//			  msg = "(JCB)국민카드";
//			}
//		break;
//			 
//		case '4': if (card.charAt(1) == '0' && 
//					card.charAt(2) == '4' &&
//					card.charAt(3) == '8' &&
//					card.charAt(4) == '2' &&
//					card.charAt(5) == '5')
//			{
//			msg = "(VISA)비씨카드";
//			}
//			if (card.charAt(1) == '3' && 
//				card.charAt(2) == '8' &&
//				card.charAt(3) == '6' &&
//				card.charAt(4) == '7' &&
//				card.charAt(5) == '6')
//			{
//				msg = "(VISA)신한카드";
//			}
//		if (card.charAt(1) == '5' && 
//			card.charAt(2) == '7' &&
//			card.charAt(3) == '9' &&
//			card.charAt(4) == '7' &&
//			card.charAt(5) == '3')
//			{
//			msg = "(VISA)국민은행";
//			}
//		break;
//				
//		case '5': msg = "MASTER CARD"; break;
//		
//		}
//		System.out.println(msg);
		
		
		// #32
		//abcdef-abcdefg
		
		String SocSec= "1111111111118";
				
		//가중치적용 및 합산
		int sum = 0;
//		sum+= (SocSec.charAt(0)-48) *2;      //sum+=SocSec.charAt(0) *2;
//		sum+= (SocSec.charAt(1)-48) *3;      
//		sum+= (SocSec.charAt(2)-48) *4;      
//		sum+= (SocSec.charAt(3)-48) *5;      
//		sum+= (SocSec.charAt(4)-48) *6;      
//		sum+= (SocSec.charAt(5)-48) *7;      
//		sum+= (SocSec.charAt(6)-48) *8;      
//		sum+= (SocSec.charAt(7)-48) *9;      
//		sum+= (SocSec.charAt(8)-48) *2;      
//		sum+= (SocSec.charAt(9)-48) *3;      
//		sum+= (SocSec.charAt(10)-48) *4;      
//		sum+= (SocSec.charAt(11)-48) *5;  

		int jcode =0;
		for(int i=0, j=2; i<=11; ++i, ++j)						//jcode 
		{
			if (i==8) j=2;
			jcode = SocSec.charAt(i)-48;
			sum+= jcode *j;
		}
//
//		System.out.println(sum);
//		//나머지계산
//		int check = sum%11;
		
		
	
		
		//마지막 자릿구의 비교
		String msg1 = "Fail";
		
//		if (check>9)
//		{
//			if(check%10 == SocSec.charAt(12)-48)
//			msg1 ="Sucess";
//		}
//		else if ((11-check) == SocSec.charAt(12)-48)
//			msg1 = "Sucess";
		
		//한번에 11나눈 나머지 구한후  11									//위에 대신
		int check = (11-(sum%11))%10;
		if(check%10 == SocSec.charAt(12)-48)
			msg1 ="Sucess";
	
		
		//결과출력
		System.out.println(msg1);
		
		
	
		
//		String msg1 = "type in SocSecurity abcdef-abcdefg digit";			//내가한거
//		
//		Scanner sc1 =new Scanner(System.in);
//		System.out.println(msg1);
//		String SocSec = sc1.nextLine();
//		
//		
//		int a =(SocSec.charAt(0));
//		int b =(SocSec.charAt(1));
//		int c =(SocSec.charAt(2));
//		int d =(SocSec.charAt(3));
//		int e =(SocSec.charAt(4));
//		int f =(SocSec.charAt(5));
//		
//		int g =(SocSec.charAt(5));
//		int h =(SocSec.charAt(5));
//		int i =(SocSec.charAt(5));
//		int j =(SocSec.charAt(5));
//		int k =(SocSec.charAt(5));
//		int l =(SocSec.charAt(5));
//		int m =(SocSec.charAt(5));
//		
//		int n = (a-48)*2;
//		int o = (b-48)*3;
//		int p = (c-48)*4;
//		int q = (d-48)*5;
//		int r = (e-48)*6;
//		int s = (f-48)*7;
//		
//		int t = (g-48)*8;
//		int u = (h-48)*9;
//		int v = (i-48)*2;
//		int w = (j-48)*3;
//		int x = (k-48)*4;
//		int y = (l-48)*5;
//		int z = (m-48)*6;
//		
//		int sum = 11-((n+o+p+q+r+s+t+u+v+w+x+y+z)%11);
//		
//		System.out.println(sum);
//		if (sum==(g-48))
//			System.out.println("맞음");
//		
//		System.out.println(a);

		
		// # 35
		
		
		
		
		
		
		
		
	

	}

}
