package JM.lab;

public class Lab09 {

	public static void main(String[] args) {
		// TODO 교재 5-6 10 11 20 21
		
		
		//5-6
		
		int[] score = {79,88,91,33,100,55,95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i =1; i<score.length;i++)
		{
			
			if (score[i] >max)
			{
				max=score[i];
			}
			else if (score[i] <min)
			{
				min=score[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
		//5-10
		
		
		
		
		
	}

}
