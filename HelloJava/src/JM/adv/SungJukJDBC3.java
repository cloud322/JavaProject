package JM.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SungJukJDBC3 {

	public static void main(String[] args) {
		// 성적처리 JDBC
		
		//오라클 접성 정보 설정
		String DRV ="oracle.jdbc.driver.OracleDriver";
		String URL = "jdbc:oracle:thin:@192.168.27.128:1521:xe";
		String USR = "cloud";
		String PW = "123456";
		

		//JDBC관련 객체선언
		Connection conn = null;	
		PreparedStatement pstmt = null;	
		ResultSet rs = null;
				
		//SQL관련 변수선언
		String selectOneSQL = "select * from sungjuk where sjno =?";
		String insertsql = "insert into sungjuk (sjno,name,kor,eng,mat,tot,avrg,grd) values (sjno.nextval,?,?,?,?,?,?,?)";
		String updatesql = null;
		String deletesql = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 학생 성적을 입력하세요(이름/국어/영어/수학)");
		String name =sc.nextLine();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		//총점 평균 학점처리
		int tot = kor + eng + mat;
		double avrg = tot/3.0;
		String grd = "F";
			switch((int)avrg/10)
			{
			case 10 :
			case 9 :  grd="A"; break;
			case 8 :  grd="B"; break;
			case 7 :  grd="C"; break;
			case 6 :  grd="D"; break;
			}
		try 
		{
		//1.
		Class.forName(DRV);
		//2.
		conn = DriverManager.getConnection(URL,USR,PW);
		//3.
		pstmt = conn.prepareStatement(insertsql);
		pstmt.setString(1, name); 
		pstmt.setInt(2, kor); 
		pstmt.setInt(3, eng); 
		pstmt.setInt(4, mat); 
		pstmt.setInt(5, tot); 
		pstmt.setDouble(6, avrg); 
		pstmt.setString(7, grd); 
		//4.
		int cnt = pstmt.executeUpdate();
		//5.
		System.out.println(cnt+"건의 데이터 추가완료!");
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			try{rs.close();} catch(Exception ex) {}
			try{pstmt.close();} catch(Exception ex) {}
			try{conn.close();} catch(Exception ex) {}
		}
		
	
		
	}

}


		
		
		
		
		
	
