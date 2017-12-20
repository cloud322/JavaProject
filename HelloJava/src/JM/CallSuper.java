package JM;

public class CallSuper {

	public static void main(String[] args) {
		//부모 클래스 생성자 호출하기 - super()
		//부모클래스의 매서드 호츌하기 - super.매서드이름
		//자식클래스의 생성자 호출하면 먼저 부모클래스의 생성하고 그다음 자식클래스의 그것을 호출한다
		Child c = new Child();						//parent 실행후 child 실행함
		Child2 c2 = new Child2();						
		
		//상속관계에서 형변환
		Child c3 = new Child();
		Parent p3 = new Parent();
		
		p3=c3; //upcasting
		p3 = new Child();
		
		c3 = (Child)p3;  //downcasting 명시적 형변환 필요
		
		//상속관계에서 부모 자식 class 여부 확인
		System.out.println(c instanceof Parent);
		
		Son son = new Son();
		System.out.println(son instanceof Parent);
			
		
		

	}

}


class Parent
{
	protected String name;
	public Parent() 
	{
		System.out.println("parend의 생성자");
	}
	public String sayName()
	{
		return name;
	}
	public void sayLove(Daughter d)
	{
		System.out.println("LOVE");
	}
	public void sayLove(Son s)
	{
		System.out.println("LOVE");
	}
	
	public void sayLove(Parent p)
	{
		System.out.println("LOVE");
	}
}

class Child extends Parent
{
	protected String name;
	public Child()
	{	//super(); // 컴파일러가 자동적으로 추가해줌
		super();  //c첫번쨰줄에잇어야함
		super.name = "1";	//parent name
		this.name = "2";	//child	name
		super.sayName();
		
		System.out.println("chold의 생성자");
	}
	@Override
	public String toString() 
	{
		return super.toString();
	}

}

class Parent2
{
	public Parent2() 
	{}
	protected String name;
	public Parent2(String name) 
	{
		System.out.println("parent()/"+name);
	}
}
class Child2 extends Parent2
{
	public Child2()
	{
		//super();
		super("지현");
	}
}

class Daughter extends Parent
{
	
}


final class Son extends Parent
{
	
}//final - 상속되지 않는 클래스 선언

//class GrandSon extends Son
//{
//	
//}//상속불가


