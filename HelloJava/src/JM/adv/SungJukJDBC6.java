package JM.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import project.v1.SungJukV0;

public class SungJukJDBC6 {

	public static void main(String[] args) {
		// 성적처리 JDBC
		//ResourceBundle 을 이용해서 JDBC관련정보를 
		//특정파일에서 키 =값 형태로 읽어서 처리
		String rbPath = "JM.adv.oracle";//.properties 안써도됨
		//리소스 번들 파일경로 지정 : 패키지 파일명
		//(properties 제외!!)
		//오라클 접성 정보 설정
		String DRV =null;
		String URL =null;
		String USR =null;
		String PW =null;

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
		// 0.접속정보를 리소스 번들로부터 읽어오
		ResourceBundle rb = ResourceBundle.getBundle(rbPath);
		DRV = rb.getString("DRV");
		URL = rb.getString("URL");
		USR= rb.getString("USR");
		PW= rb.getString("PW");
			
		//1.
		Class.forName(DRV);
		//2.
		conn = DriverManager.getConnection(URL,USR,PW);
		//3.
		pstmt = conn.prepareStatement(selectsql);
		//4.
		rs = pstmt.executeQuery(selectsql);
		//5.
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


		
		
		
		
		
	
