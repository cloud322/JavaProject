package JM.lab;

public class Lab13 {

	public static void main(String[] args) {
		// #37   38   39
		
		Person p = new Person();
		p = new Person("지현","", "");
		
		System.out.println(p);
		
		
	

	}

}

// #37
class Person
{
	String name;
	String addr;
	String phone;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", phone=" + phone + "]";
	}
	
	
	
	
}


class Customer1//상속안배움
{
	String name;
	String addr;
	String phone;
	String cusnum;
	String mileage;
	
}


//38

class Book1
{
	String title;
	String page;
	String author;
	
}

class Magazine
{
	String title;
	String page;
	String author;
	String slaedate;
	
}

// #39

class Phone
{
	String maker;
	String price;
	String type;
	
}

class SmartPhone
{
	String maker;
	String price;
	String type;
	String osver;
	String memory;
	String camera;
	String bltooth;
	
	
}
