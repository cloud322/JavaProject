package JM;

public class DefaultInterface {

	public static void main(String[] args) {
		// interface up cating
		SportsCar sc = new SportsCar();
		sc.move();
		sc.openRoof();
		
		//Movable isc = new Movable();	//불가
		Movable isc = new SportsCar();	
		isc.move();
		//isc.openRoof();	//SportsCar 에만존재
		
		// down casting
		SportsCar spc = (SportsCar) isc;
		spc.openRoof();

	}

}

interface A
{
	void sayHello();
	//void sayHello(String msg);
	default void sayHello(String msg) {}
	//default method - JDK8부터지원 
	
	
}

class X implements A
{
	@Override
	public void sayHello() 
	{
		
	}
}
class Y implements A
{
	@Override
	public void sayHello() 
	{
		
	}
	@Override
	public void sayHello(String msg)
	{
	
	}
}

// upcasing test example

interface Movable
{
	void move();
}

class SportsCar implements Movable
{
	@Override
	public void move() 
	{
		
	}
	public void openRoof() {}
}