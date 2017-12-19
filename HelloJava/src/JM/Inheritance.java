package JM;

public class Inheritance {

	public static void main(String[] args) {
		// 클래스간 상속관계가 형성되면 각 클래스는 is-a 관계가 만들어진다
		//자식클래스의 객체는 부모클래스 타입으로 처리가능 !!***
		Tiger t = new Tiger();
		
		Animals t2 = new Tiger();
		Eagle e = new Eagle();
		Animals e2 = new Eagle();
		Animals g = new Goldfish();

	}

}

class Animals extends Object
{
	protected String eye;
	protected String mouth;
	private String hp;  //상속관계에서는 protected 사용
	
	public void eat() {}
	public void sleep() {}
	
}
//상속 위에 눈 입 잇 슬립 복붙 귀차늠
class Tiger extends Animals
{
	protected String leg;
	
	
	
	public void run() {}
}

class Eagle extends Animals
{
	protected String wing;
	
	public void fly() {}
}

class Goldfish extends Animals
{
	protected String gil;
	
	public void swim() {}
}

