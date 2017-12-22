package JM;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions2 {

	public static void main(String[] args) 
	{
		//예외처리 2 - multi catch block
		// 각각의 코드에 try- catch 를사용하는 것보다 하나의 try- catch 블럭을 사용하고
		//여러개의 catch 문으로 예외를 처리하는것이 효율적
		try {
		int[] intArray = {1,2,3,4,5};
		System.out.println(intArray[5]);
		
		
		int x = 1000/0;
		
		FileReader fr = new FileReader("");
		
		DriverManager.getConnection("");
		}
		catch(ArrayIndexOutOfBoundsException aiob) 
		{
			System.out.println("Array ERROR");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("수식 ERROR");
		}
		catch(FileNotFoundException fnfe) 
		{
			System.out.println("파일경로  ERROR");
		}
		catch(SQLException se) 
		{
			System.out.println("database server 주소 설정");
		}
		catch(Exception ex) 
		{
			System.out.println("예상치못한 예외 발생");
		}
		
		//예외 던지가 -throws
		MakeException me = new MakeException();
		try {
		me.exception1();
		me.exception2();									//exception 2 3 안넘어감
		me.exception3();
		}
		catch (ArrayIndexOutOfBoundsException aioe)
		{System.out.println("잘못된배열");}
		catch (ArithmeticException ae)
		{System.out.println("잘못된 수식");}
		catch (InputMismatchException ime)
		{System.out.println("잘못된 Input");}
	
	
	try {
		me.exception1();
		}catch (ArrayIndexOutOfBoundsException aioe)		//이래야 다됨
		{System.out.println("잘못된배열");}
		try {
		me.exception2();
		}catch (ArithmeticException ae)
		{System.out.println("잘못된 수식");}
		try {
		me.exception3();
		}catch (InputMismatchException ime)
		{System.out.println("잘못된 Input");}
	
	
	//finally 블럭
	try {
		//데이터베이스 서버 연결
		//SQL 처리 및 기타작업
		//데이터베이스 서버 끊음
		//이런 코드들 중 반드시 실행해야 할 경우 finally 블럭에 작성해야됨
		} catch (Exception ex)
		{System.out.println("예외처리함");}
		finally 
		{
		//데이터베이스 서버 연결 끊음
		}
	

	}


class MakeException
	{
	public void exception1() throws ArrayIndexOutOfBoundsException
		{
		int[] intArray = {1,2,3,4,5};
		System.out.println(intArray[5]);
		
		}
	public void exception2() throws ArithmeticException
		{
		int x = 1000/0;
		}
	public void exception3() throws InputMismatchException
		{
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		}
	}


}

