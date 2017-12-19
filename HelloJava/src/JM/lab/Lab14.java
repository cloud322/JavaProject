package JM.lab;

public class Lab14 {


		// 6-1 6-2 6-3 6-4 6-5 6-8 6-9
		
	public static void main(String[] args) 
	{ 
		//6-1 6-2
		SutdaCard card1 = new SutdaCard(3, false); 
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info()); // 3  .이 출력된다
		System.out.println(card2.info()); // 1K . 가 출력된다 
	
		
		// 6-3 6-4 //6-5class 생성자 info 추가 
		Student1 s =new Student1();
		System.out.println(s.name);
		System.out.println(s.getTotal(s.kor,s.eng,s.math));
		System.out.println(s.getAverage());
		
		System.out.println(s.toString());
		
	}
}

//6-1  6-2
class SutdaCard
{
	int num; 
	boolean isKwang;
	
	public SutdaCard() 
	{
		this(1,true);
	}

	public SutdaCard(int num, boolean isKwang)
	{
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info()
	{
	return num + ( isKwang? "K" : "");
	}


}



// 6-3 6-4 //6-5class 생성자 info 추가 

class Student1
{
	String name = "학생이름";
	int ban= 1;
	int no= 1;
	int kor= 2;
	int eng= 3;
	int math = 4;
	
	public Student1() {
		// TODO Auto-generated constructor stub
	}
	
	public Student1(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	public int getTotal(int kor, int eng, int math)
	{
		return(kor+eng+math);
	}
	
	public double getAverage()
	{
		return ((kor+eng+math)/3); 
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
	
}

//6-8
class PlayingCard { 
	int kind; int num; 
	
	static int width; static int height; 
	
	PlayingCard(int k, int n) 
	{ kind = k; num = n; } 
	
	public static void main(String args[]) 
	{ PlayingCard card = new PlayingCard(1,1); }

}
			//- (static ) : width, height 
			// 인스턴스변수  kind num
			//지역변수 - : k, n, card, args

//6-9
//x




