package JM.adv;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource {

	public static void main(String[] args) {
		//try - with - resource 구문
		//파일 입출력 관련 코드 작성시
		//예외처리코드를 다루기 불편한 상황 발생 - 특히 finally 블럭
		//이런경우 try - with - resource 구문을 사용하면 예외처리를 간편하게 할 수 있고  finally 블럭 문제도 쉽게 해결 
		//close method 가 AutoClosable 인터페이스를 구현 했기 때무 가능
		String fpath = "c:/Java/data.txt";
		
		try 
		(
			FileReader fr = new FileReader(fpath);
			BufferedReader br = new BufferedReader(fr);
	  ){
			while(br.ready())
			{
			//System.out.print((char)fr.read());
			//파일에서 한문자씩 읽어서 화면애ㅔ 출력
			System.out.print(br.readLine());
			//파일에서 한행씩 읽어서 화면에 출력
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
