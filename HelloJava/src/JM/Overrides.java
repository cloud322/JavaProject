package JM;

public class Overrides {

	public static void main(String[] args) {
		//메서드 오버라이드

	}

}

class SungJuk2
{
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;
	
	
	
	public int getTotal()
	{
		int tot = kor+eng+mat;
		return tot;
	}
	
	public double getAverage()
	{
		double avg = (double)(kor+eng+mat)/3;
		return avg;
		//return (double)getTotal()/3;
	}
	
	public char getGrade()
	{
		double avg = (double)(kor+eng+mat)/3;
		char grd = 'F';
		switch((int)getAverage()/10)
		{
			case 10:
			case 9:
				grd ='A';
				break;
		}
		return grd;
	}
	
	
}

class MidSungJuk extends SungJuk2
{
	protected int sci;
	protected int art;
	
	@Override
	public int getTotal()
	{
		//return kor+eng+mat+sci+art;	
		int tot = super.getTotal()+sci+art;					//getTotlal int JM.SungJuk2.getTotal()
		return tot;
	}
	
	@Override
	public double getAverage() 
	{
		//double avg = (double)(kor+eng+mat+sci+art)/5; 	//getTotlal
		double avg = (double)(getTotal())/5;
		return avg;
	}
	
	@Override
	public char getGrade() 
	{
		//double avg = (double)(kor+eng+mat+sci+art)/5;
		int avg = (int)getAverage()/10;
		char grd = 'F';
		switch(avg)
		{
		case 10 :
			break;
		}
		return grd;
	}
	
	
}