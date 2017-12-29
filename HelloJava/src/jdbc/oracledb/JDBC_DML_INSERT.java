package jdbc.oracledb;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_DML_INSERT {
	private static String DRV ="oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.27.128:1521:xe";
	private static String USR = "cloud";
	private static String PW = "123456";

	public static void main(String[] args) throws Exception {
		oracle.jdbc.driver.OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();
		
		DriverManager.registerDriver(oracleDriver);
		
		Connection conn = DriverManager.getConnection(URL,USR,PW);
		
		
		
		
		

	}

}
