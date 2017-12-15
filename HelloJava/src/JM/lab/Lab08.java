package JM.lab;

import java.util.Scanner;

public class Lab08 {

	public static void main(String[] args) {
		// TODO  교재소스 4-26 4-27 
		//연습문제 4-4 8 13 14 15
		
		
	//4-26
		
		int sum =0;
		int i=0;
		while((sum = sum + (++i))<=100)
		{
		System.out.printf("%d - %d \n", i, sum);
		}

		
	//4-27
		
		int num;
		sum =0;
		boolean flag =true;
		
		System.out.println("합계를 구할 숫자를 입력하세요 (끝내려면 0 입력)");
		while(flag)
		{
			System.out.println(">>");
			Scanner sc = new Scanner(System.in);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if (num!=0)
				{
				sum+=num;
				}
			else
				{
				flag=false;
				}
		}
		System.out.printf("합 : %d ", sum);
		
		
		
		
	//연습문제 4-4
		
		int j=0;
		int k=1;
		int l=0; 
		
		
		for(j=1,true;i++,s=-s)
		//System.out.println(j+(-k));
		//		i=i+l
		
		if (l>=100)
			break;
	}

}
