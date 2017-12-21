package project.v1b;

public class CustomerMain {
	public static void main(String[] args)
	{
		//프로그램 관력 객체 생성
		CustomerService csrv = new CustomerServiceImpl();
		CustomerV0 cs = new CustomerV0(1,"박지성","810101-1xxxxxx","영국런던","000-5000-0001");
		
		//추가
		csrv.addCustomer(cs);
		System.out.println(cs);
		
		//수정
		cs= new CustomerV0(1,"박지성","810101-1xxxxxx","영국런던","000-5000-0001");
		csrv.modifyCustomer(cs);
		
		//삭제
		csrv.removeCustomer("박지성");
		
		}

}
