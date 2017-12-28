package jdbc.oracledb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_DML_SELECT {

	private static String DRV ="oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.27.128:1521:xe";
	private static String USR = "cloud";
	private static String PW = "123456";
	
	
	public static void main(String[] args) throws Exception {
		
		oracle.jdbc.driver.OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(oracleDriver);
		Connection conn = DriverManager.getConnection(URL,USR,PW);
		Statement stmt = conn.createStatement();
		
		String sql = "select pno,pname,team,region,position,backno,birth,height,weight from soccer";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next())
		{
			
			String out = rs.getInt("pno")+","+
			rs.getString("pname")+","+
			rs.getString("team")+","+
			rs.getString("region")+","+
			rs.getString("position")+","+
			rs.getString("backno")+","+
			rs.getString("birth")+","+
			rs.getString("height")+","+
			rs.getString("weight");
			System.out.println(out);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
		
		
	

	}

}
