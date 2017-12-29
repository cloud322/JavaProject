package zipcode.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ZipcodeJDBC {

	public static void main(String[] args) {
		String rbPath = "zipcode.v1.oracle";
		
		String DRV =null;
		String URL =null;
		String USR =null;
		String PW =null;
		
		Connection conn = null;	
		PreparedStatement pstmt = null;	
		ResultSet rs = null;
		
		String selectSQL = "select * from zipcode_seoul where 도로명 like ?";
		String insertsql = null;
		String updatesql = null;
		String deletesql = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 도로명 입력하세요");
		String sn = sc.nextLine();
		
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
		pstmt = conn.prepareStatement(selectSQL);
		pstmt.setString(1, sn + "%");
		//4.
		rs = pstmt.executeQuery();
		//5.
		List<ZipcodeV0> sjlist = new ArrayList<>();
		while(rs.next())
		{
			ZipcodeV0 sj = new ZipcodeV0();
			sj.set우편번호(rs.getString("우편번호"));
			sj.set시도(rs.getString("시도"));
			sj.set시군구(rs.getString("시군구"));
			sj.set읍면(rs.getString("읍면"));
			sj.set도로명(rs.getString("도로명"));
			sj.set건물번호본번(rs.getString("건물번호본번"));
			sj.set건물번호부번(rs.getString("건물번호부번"));
			sj.set시군구용건물명(rs.getString("시군구용건물명"));
			sj.set법정동명(rs.getString("법정동명"));
			sj.set리명(rs.getString("리명"));
			sj.set지번본번(rs.getString("지번본번"));
			sjlist.add(sj);
		}
		for(ZipcodeV0 sj :sjlist)
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
