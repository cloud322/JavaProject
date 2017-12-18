package JM;

public class AccessControl {

	public static void main(String[] args) {
		// default 접근제한자 테스트
		//Animal class default접근제어 중 같은 패키지에 존재하는  access control class 접근가능
		//class 에는 default , public 접근 제어만 부여가능
		
		Animal lion;
		lion = new Animal();
		lion.name = "사자";
		
		//맴버변수 접근제어 테스트
		defaultClass dc =  new defaultClass();
		dc.name ="";
		dc.age = 1;
		dc.email = "abc@abc.com";
		//dc.regdate = "2017"  //private
		dc.setRegdate("2017");
		//System.out.println(dc.regdate);		//x
		System.out.println(dc.getRegdate());	//o
		
		
		//객체의 생성값확인 - 참조주소
		defaultClass dc1 = new defaultClass();
		System.out.println(dc1);
		
		dc1=new defaultClass();
		System.out.println(dc1);
		
		dc1=new defaultClass();
		System.out.println(dc1);
		
	}

}

class defaultClass 
	//맴버변수에 적용된 
{
	String name; 				//default
	protected int age;			//protected
	public String email;		//public
	private String regdate;		//private
	
	//private 으로 선언된 맴버변수를 외부 클래스에서 접근하게 할려면 setter /getter method 사용
	public void setRegdate(String regdate)
	{
		this.regdate = regdate;
	}
	
	public String getRegdate()
	{
		return regdate;
	}
	
	
}
