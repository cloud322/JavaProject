package JM.adv;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaders {

	public static void main(String[] args) {
		//파일 입출력 - 문자기반 스트림
		//파일 읽기 테스트 - 파일에 저장된  내용을 알아서 화면에 출력
		
		String fpath = "c:/Java/data.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		try 
		{
			fr = new FileReader(fpath);
			//지정한 경로상의 파일을 읽기 위해 읽기 스트림 생성
			
			br = new BufferedReader(fr);
			//버퍼기능이 있는 reader class선언
			
			while(br.ready())
			{
			//System.out.print((char)fr.read());
			//파일에서 한문자씩 읽어서 화면애ㅔ 출력
			System.out.print(br.readLine());
			//파일에서 한행씩 읽어서 화면에 출력
			}
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}finally
			{
			try{br.close();}catch (Exception e) {}
			
			try{fr.close();}catch(Exception e) {}
			}
	}

}
