package JM.lab;

public class SungJukService { //서비스 클래스의 메소드는 private 선언,,,?
	private int tot;
	private double avg;
	private String grd= "F";

	
		// Member V0
		//MemberService
	
	//getTotal
	
	public int getTotal(int kor, int eng, int mat)
	{
		//return(kor+eng+mat);
		tot = kor+eng+mat;
		return tot;
	}
	
	//객체지향 특성 중 다형성
	public int getTotal(SungJukV0 sj)
	{
		tot = sj.getKor()+sj.getEng()+sj.getMat();
		return 0;
	}
	
	
	//또다른 유형의 getTotal
	public void getTotal()
	{
		
	}
	
	//getAverage
	
	//public double getAverage(int kor, int eng, int mat)
	public double getAverage()
	{	
		avg = (double)tot/3;
		//return (tot/3);
		return avg;
	}
	
	//getGrade
	public String getGrade()
	{
		switch((int)avg/10)
		{
		case 10 : grd="A"; break;
		case 9 :  grd="B"; break;
		case 8 :  grd="C"; break;
		case 7 :  grd="D"; break;
		}
		return grd;
	}
	
	
	

	

}
