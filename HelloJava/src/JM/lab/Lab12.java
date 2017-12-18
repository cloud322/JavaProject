package JM.lab;

public class Lab12 {

	public static void main(String[] args) {
		// ㄷ고객 도서 주문 학생 학과 과목 교수
		Customer c = new Customer();
		c.cusnum = 1;
		c.name = "박지성";
		c.socsec = "810101-1xxxxxx";
		c.addr = "영국 런던";
		c.cell = "000-5000-0001";
		
		c = new Customer(2, "김연아","900101-2xxxxxx", "영국런던", "000-6000-0001");
		c = new Customer(3, "장미란","830101-3xxxxxx", "한국 강원도", "000-7000-0001");
		c = new Customer(4, "추신수","720101-4xxxxxx", "미국뉴욕", "000-8000-0001");
		
		Book b = new Book();
		b.booknum = 1;
		b.bname = "축구의 역사";
		b.publisher = "굿스포츠";
		b.price= 7000;
		
		b = new Book(2,"축구아는 여자","나무수",13000);
		
		Order o = new Order();
		o.cusnum = 1;
		o.booknum = 1;
		o.price = 7000;
		o.orderdate = "2014-07-01";
		
		o = new Order(1,2,13000,"2014-07-03");
		
		Student s = new Student();
		
		s.stunum = "201350050";
		s.name = "김태희";
		s.addr = "경기도고양시";
		s.age = "25";
		s.birthday = "1985.3.22";
		s.major = "컴퓨터공학";
		s.prof = "504";
		s.time = "목 2교시";
		
		s = new Student("201250006","송혜교","서울영등포구", "22","1988.9.17","컴퓨터공학","301","월 3교시");
		
		Major m = new Major();
		
		m.major = "컴퓨터공학";
		m.phone = "123-4567-8901";
		m.officeloc = "E동 2층";
		m.dephead = "504";
		m.date = "2007년";
		
		m = new Major("의상디자인","234-5678-9012","A동 1층", "301","2009년");
		
		Subject sub = new Subject();
		
		sub.subnum = "0205";
		sub.subjectname= "프로그래밍";
		sub.subjectsummery = "자바프로그래밍";
		sub.prof = "301";
		
		sub = new Subject("0211","드레스코드","옷입기의기초","445");
		
		Professor p = new Professor();
		
		p.profnum = "301";
		p.profname = "이순신";
		p.profmajor = "programing";
		
		p = new Professor("445","정약용","의상디자인");
		
		

	}

}

class Customer
{
	int cusnum;
	String name;
	String socsec;
	String addr;
	String cell;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cusnum, String name, String socsec, String addr, String cell) {
		super();
		this.cusnum = cusnum;
		this.name = name;
		this.socsec = socsec;
		this.addr = addr;
		this.cell = cell;
	}
	
}
class Book
{
	int booknum;
	String bname;
	String publisher;
	int price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int booknum, String bname, String publisher, int price) {
		super();
		this.booknum = booknum;
		this.bname = bname;
		this.publisher = publisher;
		this.price = price;
	}
	
	
	
}

class Order
{
	int cusnum;
	int booknum;
	int price;
	String orderdate;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int cusnum, int booknum, int price, String orderdate) {
		super();
		this.cusnum = cusnum;
		this.booknum = booknum;
		this.price = price;
		this.orderdate = orderdate;
	}
	
	
}

class Student
{
	String stunum;
	String name;
	String addr;
	String age;
	String birthday;
	String major;
	String prof;
	String time;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String stunum, String name, String addr, String age, String birthday, String major, String prof,
			String time) {
		super();
		this.stunum = stunum;
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.birthday = birthday;
		this.major = major;
		this.prof = prof;
		this.time = time;
	}
	
	
	
}

class Major
{
	String major;
	String phone;
	String officeloc;
	String dephead;
	String date;
	
	public Major() {
		// TODO Auto-generated constructor stub
	}

	public Major(String major, String phone, String officeloc, String dephead, String date) {
		super();
		this.major = major;
		this.phone = phone;
		this.officeloc = officeloc;
		this.dephead = dephead;
		this.date = date;
	}
	
	
}

class Subject
{
	String subnum;
	String subjectname;
	String subjectsummery;
	String prof;
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}

	public Subject(String subnum, String subjectname, String subjectsummery, String prof) {
		super();
		this.subnum = subnum;
		this.subjectname = subjectname;
		this.subjectsummery = subjectsummery;
		this.prof = prof;
	}
	
	
	
}

class Professor
{
	String profnum;
	String profname;
	String profmajor;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(String profnum, String profname, String profmajor) {
		super();
		this.profnum = profnum;
		this.profname = profname;
		this.profmajor = profmajor;
	}
	
	
	
}