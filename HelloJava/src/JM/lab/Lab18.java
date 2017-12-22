package JM.lab;

public class Lab18 {

	public static void main(String[] args) {
		// 연습문제 7-7 7-8 7-9 7-10 7-15 7-17
		//8-2 8-8 
		
		//7-7
		//7-8
		
		//private - 같은 클래스 내에서만 접근이 가능하다. 
		//default - 같은 패키지 내에서만 접근이 가능하다. 
		//protected 같은 패키지 내에서 그리고 다른 패키지의 자손클래스에서 - , 접근이 가능하다. 
		//public 접근 제한이 전혀 없다 
		
		
		//7-10 
		MyTv2 t = new MyTv2(); 
		t.setChannel(10); 
		System.out.println("CH:"+t.getChannel()); 
		t.setVolume(20); 
		System.out.println("VOL:"+t.getVolume());
		
		//7-15
//		class Unit {} 
//		class AirUnit extends Unit {} 
//		class GroundUnit extends Unit {} 
//		
//		class Tank extends GroundUnit {} 
//		class AirCraft extends AirUnit {} 
//		
//		Unit u = new GroundUnit(); 
//		Tank t = new Tank(); 
//		AirCraft ac = new AirCraft();

		//a. u = (Unit)ac; 
		//b. u = ac; 
		//c. GroundUnit gu = (GroundUnit)u; 
		//d. AirUnit au = ac;
		//e. t = (Tank)u; 
		//f. GroundUnit gu = t;
		
		

		
		
		
		
		
		
		
		
		

	}

}

//7-10

class MyTv2 
{ 
private boolean isPowerOn; 
private int channel; 
private int volume; 

final int MAX_VOLUME = 100; 
final int MIN_VOLUME = 0;
final int MAX_CHANNEL = 100; 
final int MIN_CHANNEL = 1; 

public MyTv2() {
	// TODO Auto-generated constructor stub
}

public MyTv2(boolean isPowerOn, int channel, int volume) {
	super();
	this.isPowerOn = isPowerOn;
	this.channel = channel;
	this.volume = volume;
}

public boolean isPowerOn() {
	return isPowerOn;
}

public void setPowerOn(boolean isPowerOn) {
	this.isPowerOn = isPowerOn;
}

public int getChannel() {
	return channel;
}

public void setChannel(int channel) {
	this.channel = channel;
}

public int getVolume() {
	return volume;
}

public void setVolume(int volume) {
	this.volume = volume;
}

public int getMAX_VOLUME() {
	return MAX_VOLUME;
}

public int getMIN_VOLUME() {
	return MIN_VOLUME;
}

public int getMAX_CHANNEL() {
	return MAX_CHANNEL;
}

public int getMIN_CHANNEL() {
	return MIN_CHANNEL;
}







}




