package JM;

import JM.lab.SungJukMain;					//ctrl + shift + o
import JM.lab.SungJukService;

//import JM.lab.*;			//  아래 모든 class lab01~~~~17


public class OtherClass {

	public static void main(String[] args) {
		// 다른 클래스 사용하기
		//같은 패키지 내 다른 클래스는 별다른 과정없이 바로 사용가능
		Overloads o = new Overloads();
		Overrides r =  new Overrides();
		
		//다른 package 클래스 사용하기
		
		JM.lab.SungJukV1 sj = new JM.lab.SungJukV1();
		
		
		//다른package class 사용하기
		//import 문을 사용하면 편리하게 다른 package 상위 class 사용할수잇음
		SungJukService sjsrv = new SungJukService();
		SungJukMain sjmain = new SungJukMain();
		
		
		

	}

}
