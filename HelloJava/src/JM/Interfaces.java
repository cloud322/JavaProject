package JM;

public class Interfaces {

	public static void main(String[] args) {
		
		//인터페이스 - 객체화 불가 class
		// 인터페이스를 구현한 클래스를 통해객체화 가능
		//ISungJukService isjsrv = new ISungJukService();
		SungJukServiceImpl sjsrv = new SungJukServiceImpl();
		sjsrv.getTotal();
		sjsrv.getAverage();
		sjsrv.getGrd();
		
		//interface type변환	(upcasting/ downcasting)
		//interface 의 참조변수로 구현한 class의 객체를 할당할수 잇음
		
		ISungJukService isjsrv = new SungJukServiceImpl();
		
		
		//추상클래스 객체생성 가능???
		//추상 method 포함한 class 를 의미 -객체화 불가불가!!!
		//AbstractClass ac = new AbstractClass();
		
		//추상class 의 객체화ㅣ는 상속을통해 가능가능^^77
		CompleteClass cc = new CompleteClass();
	
	}

}

interface ISungJukService
{
	int TOT = 0;			//상수 초기화 필요필요!!!!!!!
	double AVG = 0;
	
	
	abstract void getTotal();	 	//추상메서드
	void getAverage(); 		//추상메서드
	void getGrd(); 			//추상메서드
	
}

class SungJukServiceImpl implements ISungJukService
{

	@Override
	public void getTotal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAverage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getGrd() {
		// TODO Auto-generated method stub
		
	}
	
	
}


abstract class AbstractClass
{
	
}

class CompleteClass extends AbstractClass
{
	public CompleteClass() {
		// TODO Auto-generated constructor stub
	}
	
}


class Unit
{}

interface Fightable
{
	void move(int x,int y);
	void attack(Unit u);
}//미완성 메서드 포함   

class Firebat implements Fightable			// mouse over Firebat  + add unimplements
{

	@Override
	public void move(int x, int y) {	
	}

	@Override
	public void attack(Unit u) {
	}
	
}//완전한메스드포합

//인터페이스를 구현하는중
//인터페이스의 모든 추상 메서드를 구현할 필요가 없으면
//추상클래스로 만들면 됨
abstract class Medic implements Fightable
{
	@Override
	public void move(int x, int y) {	
	}
}//일부완전한메서드 포함