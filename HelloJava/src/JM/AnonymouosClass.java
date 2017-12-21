package JM;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymouosClass {

	public static void main(String[] args) {
		// 익명클래스 - 이름이 없는 클래스 , 일회용 클래스
		// java스크립트 : fuction sayHello() {}
		//		      function (){}
		
		//익명 클래스
		Object o = new Object();
		o = new Object() {};
		
		Button btn = new Button("OK");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼 이 클릭됨 ");
				
			}
		});
		

	}

}

