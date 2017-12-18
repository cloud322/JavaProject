package JM;

import JM.lab.SungJukV0;

public class Classes {

	public static void main(String[] args) {
		// 클래스 객체를 만들기위한 틀  설계도
		Animal tiger = new Animal();
		tiger.name = "hodol e ";
		tiger.weight =100;
		tiger.type = "tiger";
		tiger.gender= "male";
		
		tiger.move();
		tiger.eat();
		
		System.out.println(tiger.gender);
		System.out.println(tiger.name);
		System.out.println(tiger.type);
		System.out.println(tiger.weight);
		
		Animal shark = new Animal();
		shark.name = "sharky ";
		shark.weight =200;
		shark.type = "shark";
		shark.gender= "male";
		
		shark.move();
		shark.eat();
		
		System.out.println(shark.gender);
		System.out.println(shark.name);
		System.out.println(shark.type);
		System.out.println(shark.weight);

		Animal tiger2 = new Animal();
		System.out.println(tiger2.name);
		System.out.println(tiger2.gender);
		System.out.println(tiger2.weight);
		System.out.println(tiger2.type);
		
		Animal cat = new Animal();
		System.out.println(cat.name);
		System.out.println(cat.type);
		
		cat = new Animal("go sun e",25,"Fe","cat");
		
		
		//회원가입
		Member m = new Member();
		m.userid = "";
		m.passwd= "";
		m.name = "";
		m.email= "";
		m.regdate= "";
		
		m = new Member("zzy","98765","제니","abc@abc.com","20171218");
		
		//SungJukV0
		SungJukV0 sj = new SungJukV0("지현",99,99,90);
		System.out.printf(" %s %d %d %d",sj.getName(), sj.getKor(),sj.getEng(), sj.getMat());
		
		System.out.println(sj);
		
		
	}

}

class Animal 
{	//field (맴버변수)
	//동물 class
	String name;
	int weight;
	String gender;
	String type;

	//기본생성자
	public Animal()
	{
		
	}
	
	
	//매개변수 있는 생성자
	public Animal(String name, int weight, String gender, String type) 
	{
		super();
		this.name = name;
		this.weight = weight;
		this.gender = gender;
		this.type = type;
	}
	
	void move()
	{
		System.out.println(name + "has moved");
	}
	
	void eat()
	{
		System.out.println(name + "has ate");
	}


	//getter setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
}

class Shark 
{	//field (맴버변수)
	//동물 class
	String name; 
	int weight;
	String gender;
	String type;
	
	
	  
	//메서드
	void move()
	{
		System.out.println(name + "has moved");
	}
	void eat()
	{
		System.out.println(name + "has ate");
	}
	
	
	
	
	
}

class Car
{
	String name;
	int size;
	
	//class 는 class 의 맴버 변수로 선언간으
	Engin engin;
	Door door;
	Wheel wheel;
}
class Engin{}
class Door{}
class Wheel{}


class Member
{
	String userid;
	String passwd;
	String name;
	String email;
	String regdate;
	
	//기본생성자
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//매개변수가 있는 생성자
	public Member(String userid, String passwd, String name, String email, String regdate) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.regdate = regdate;
	}
	
	
}	
	




