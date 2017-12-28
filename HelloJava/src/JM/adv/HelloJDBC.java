package JM.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJDBC {

	public static void main(String[] args) {
		// JDBC접속테스트 - 오라클 데이터베이스 이용
		Connection conn = null;
		String URL = "jdbc:oracle:thin:@192.168.27.128:1521:xe";
		String USR = "cloud";
		String PW = "123456";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL,USR,PW);
			
			if(!conn.isClosed())
				System.out.println("Oracle 접속 성공!");
			
			Statement stmt = conn.createStatement();
			String sql = "insert into CUSTOMER values (1,'박지성', '810101-1xxxxxx', '영국런던','000-5000-0001')";
			stmt.executeUpdate(sql);	//실행                                  앞에 번호 똑같은거 두번되면 오류
			// insert update delete
			
			sql = "insert into book (bno, bkname, publisher, bkprice)" + 
					"values (bno.nextval, '축구의역사', '굿스포츠',7000)";
			stmt.executeQuery(sql);
			//select
			
			try {stmt.close();} catch (SQLException ex) {}
			}
			
			catch(Exception ex) {ex.printStackTrace();}
		finally 
		{
			try 
			{
			conn.close();
			} 
			catch (SQLException ex) {}
			
		
		} 

	}

}
