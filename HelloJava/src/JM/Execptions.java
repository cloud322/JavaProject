package JM;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Execptions {

	public static void main(String[] args) throws SQLException {
		// 예외처리
		
		int[] intArray = {1,2,3,4,5};
		System.out.println(intArray[2]);
		
		try 
		{
		System.out.println(intArray[5]);
		}
		catch(Exception ex)
		{
			System.out.println("ERROR");
//			System.out.println(ex.getMessage());
//			ex.printStackTrace();
			
		}
		
		try {
			//unchecked 에외  - 개발자가 직접 인지하고 예외처리
		int x = 1000/0;
		}catch(Exception ex)
		{System.out.println("0 ㄴㄴ ");
		System.out.println(ex.getMessage());}
		
		// checked 예외 - 컴파일러가 미리 예외처리에 대한 정보 알림
		
		String fpath = "c/Java/abc.dat";
		try {
		FileReader fr = new FileReader(fpath);
		}catch(Exception e){
			System.out.println("file 관련 예외 발생");
		}
		
		//예외처리 좋은예
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("number only!");
			try {
			int key = sc.nextInt();
			if (key==0)break;
			}catch(Exception exx) {System.out.println("num only");
			//무한반복 방지용 Scanner 초기화
			sc = new Scanner(System.in);
			}
			
			
		}
		sc.close();
		
		//데이터베이스 자바접속코드 --checked 예외~
		//throws 구문으로 이메서드를 호출한 상위 메서드로 
		//예외처리를 던짐( 자리를 대신해달라고 떠넘김)
		DriverManager.getConnection(".");
			
		
		
		System.out.println("can u see");
		
		

	}

}
