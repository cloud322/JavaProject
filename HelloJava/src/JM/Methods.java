package JM;

public class Methods {

	public static void main(String[] args) {
		//빈문장도적법
		
		{//블럭시작
		 //블럭내 선언한 변수는 지역변수
		 //지역변수는 블럭 안에서만 유효
			//해당블럭을 벗어나면 사용불가!!
			//변수의 유효범위 (scope) 주의할것
			String name = "지현";
			int kor= 89;
	
		}//블럭끝
		//name = "제니"   //오류발생!!
		
		
//		{	
//			String name = "ㅎ";
//			{
//				String name = "ㅎ";   // 오류오류^^ 바깥 블럭 선언 네임이 안쪽 블록까지 영향미침
//				
//			}
//		}
		//윗쪽 블럭에 선언한 name변수의 유효범위는  해당 블럭 내 이므로 
		String name = "ㅎ";
		
		//메서드
		//어떤 기능을 하는 문장 들을 블러ㅏㄱ으로 정의하고 그것에 이름을 붙인것
		//가독성과 코드 재사용성을 높이기 위해 사용
		//접근수정자 반환값 매서드 이름(매개변수목록) {매서드 구성하는 문장}
		
		
		int a =3; int b= 4; 
		int c= a+b;
		
		a =10;  b= 15; 
		c= a+b;
		
		a =45;  b= 15; 
		//c = a + b
		c= add(a,b);
	
		//클래스 /인스턴스변수
		System.out.println(Cars.count);
		Cars sportscar = new Cars();
		sportscar.name = "Ferarri";
		sportscar.type = "super";
		//++sportscar.count;
		System.out.println(++sportscar.count);
		System.out.println(++Cars.count);
		sportscar.printCarinfo();   					//	System.out.println(Cars.count);있어야 작성가능	
		
		System.out.println();
		
		
		Cars truck = new Cars();
		++truck.count;
		System.out.println(++truck.count);
		System.out.println(++Cars.count);
		truck.printCarinfo();
		
		
		
		
	
		
		
		
//		for(;;);
//		{
//		System.out.println("gazaaaaa!");
//		System.out.println("gazaaaaa!");
//		System.out.println("gazaaaaa!");
//		System.out.println("gazaaaaa!");
//		System.out.println("gazaaaaa!");
//		}
//		
		
	}//main
		public static int add(int a, int b)
			{
				return a+b;
			}

}

class Cars
{
	String name;		// 인스턴스 변수
	String type;
	static int count;	//클래스 변수
	
	public void printCarinfo()
	{
		System.out.println(name+"/"+count);
	}
	
	public static void showCount()
	{
		System.out.println(count);
	}
	
//	public static void showName()
//	{	// 맴버변수 name 출혁하기위해  showName 매서드작성
//		//하지만 showName 메서드는 static 이므로 맴버변수는 사용불가
//		System.out.println(name);
//	}
//	
}


