package JM.lab;

public class Lab13 {

	public static void main(String[] args) {
		// #37   38   39
		
		Person p = new Person();
		p = new Person("지현","", "");
		
		System.out.println(p);
		
		Person 제니 =  new Person();
		System.out.println(제니);
		
//		//엣날
//		String name = "";
//		String addr = "";
//		String phone ="";
//		System.out.print("%s %s %s",name,addr,phone);
		
		Person 지현 = new Person("지현","","");
		System.out.println(지현);
		
	

	}

}

// #37

// person 이름 주소 전화번호 v0



class Person
{//맴버변수
	private String name;
	private String addr;
	private String phone;
	public Person() {
		this("제니","서울","123-123");
	}
	public Person(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	//set get
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
	//to string
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", phone=" + phone + "]";
	}
	
	
	
	
}


class Customer1//상속안배움
{
	int cusnum;
	String name;
	String addr;
	String phone;
	int mileage;
	
	public Customer1() {
		this(1,"","","",100);
	
	}

	public Customer1(int cusnum, String name, String addr, String phone, int mileage) {
		super();
		this.cusnum = cusnum;
		this.name = name;
		this.addr = addr;
		this.phone = phone;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Customer1 [cusnum=" + cusnum + ", name=" + name + ", addr=" + addr + ", phone=" + phone + ", mileage="
				+ mileage + "]";
	}
	
	
	
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
	String saledate;
	
}

// #39

class Phone
{
	String maker;
	int price;
	String type;
	
	public Phone() {
		this("LG",5000000,"4G");
	}

	public Phone(String maker, int price, String type) {
		super();
		this.maker = maker;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Phone [maker=" + maker + ", price=" + price + ", type=" + type + "]";
	}
	
	
	
}

class SmartPhone
{
	String maker;
	int price;
	String type;
	String osver;
	String memory;
	boolean isCamera;
	boolean isBltooth;
	
	public SmartPhone() {
		this("LG",5000000,"4G","IOS","4",true,true);
	}

	public SmartPhone(String maker, int price, String type, String osver, String memory, boolean isCamera,
			boolean isBltooth) {
		super();
		this.maker = maker;
		this.price = price;
		this.type = type;
		this.osver = osver;
		this.memory = memory;
		this.isCamera = isCamera;
		this.isBltooth = isBltooth;
	}

	@Override
	public String toString() {
		return "SmartPhone [maker=" + maker + ", price=" + price + ", type=" + type + ", osver=" + osver + ", memory="
				+ memory + ", isCamera=" + isCamera + ", isBltooth=" + isBltooth + "]";
	}
	
	
	
}
