package JM.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukV0;

public class SungJukJDBC {

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
		String selectsql = "select sjno,name,kor,eng,mat,regdate from sungjuk order by sjno desc";
		String insertsql = null;
		String updatesql = null;
		String deletesql = null;
		
		try 
		{
		//1.
		Class.forName(DRV);
		//2.
		conn = DriverManager.getConnection(URL,USR,PW);
		//3.
		pstmt = conn.prepareStatement(selectsql);
		//4.
		rs = pstmt.executeQuery(selectsql);
		//5.
//		StringBuffer sb = new StringBuffer();
//		while(rs.next())
//		{
//			sb.append(rs.getString("sjno")).append("\t")
//			  .append(rs.getString("name")).append("\t")
//			  .append(rs.getString("kor")).append("\t")
//			  .append(rs.getString("eng")).append("\t")
//			  .append(rs.getString("mat")).append("\t")
//			  .append(rs.getString("regdate")).append("\n");
//			
//		}
//		System.out.println(sb.toString());
		List<SungJukV0> sjlist = new ArrayList<>();
		while(rs.next())
		{
			SungJukV0 sj = new SungJukV0();
			sj.setName(rs.getString("name"));
			sj.setKor(rs.getInt("Kor"));
			sj.setEng(rs.getInt("Eng"));
			sj.setMat(rs.getInt("Mat"));
			sjlist.add(sj);
		}
		for(SungJukV0 sj :sjlist)
		{
			System.out.println(sj);
		}
		
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			try{rs.close();} catch(Exception ex) {}
			try{pstmt.close();} catch(Exception ex) {}
			try{conn.close();} catch(Exception ex) {}
		}
		
	
		
	}

}


		
		
		
		
		
	
