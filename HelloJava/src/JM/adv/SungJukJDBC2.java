package JM.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import project.v1.SungJukV0;

public class SungJukJDBC2 {

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
		String insertsql = null;
		String updatesql = null;
		String deletesql = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 학생번호를 입력하세요");
		int no = sc.nextInt();
		
		try 
		{
		//1.
		Class.forName(DRV);
		//2.
		conn = DriverManager.getConnection(URL,USR,PW);
		//3.
		pstmt = conn.prepareStatement(selectOneSQL);
		pstmt.setInt(1, no); // 첫번째? 자리에 실제로 적용할 값 저장
		//4.
		rs = pstmt.executeQuery();	//select
		//5.
		SungJukV0 sj =new SungJukV0();
		if(rs.next())
		{
			//조건에 일치하는 데이터가   결과집합에 존재한다면
			sj.setName(rs.getString("name"));
			sj.setKor(rs.getInt("kor"));
			sj.setEng(rs.getInt("eng"));
			sj.setMat(rs.getInt("mat"));
			sj.setTot(rs.getInt("tot"));
			sj.setAvg(rs.getInt("avrg"));
			sj.setGrd(rs.getString("grd"));
		}
			System.out.println(sj);
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			try{rs.close();} catch(Exception ex) {}
			try{pstmt.close();} catch(Exception ex) {}
			try{conn.close();} catch(Exception ex) {}
		}
		
	
		
	}

}


		
		
		
		
		
	
