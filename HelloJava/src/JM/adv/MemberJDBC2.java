package JM.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberJDBC2 {
	
	private static String DRV ="oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.27.128:1521:xe";
	private static String USR = "cloud";
	private static String PW = "123456";

	public static void main(String[] args) {
		//JDBC 를 이용한 CRUD 예제
		Connection conn = null;	//db 연결
		PreparedStatement pstmt = null;	//db sql 문//////////////////////////////////////////////////
		ResultSet rs = null;	//select 결과처리
		
		//데이터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("이름/주민번호/주소/전화번호 순으로 입력");
		String name =sc.nextLine();
		String sosec =sc.nextLine();
		String addr =sc.nextLine();
		String hp =sc.nextLine();
		
		try 
		{
			//1.데이터베이스 드라이버 메모리에 올림
			Class.forName(DRV);
			//2.저장한 URL로 데이터베이스 서버에 접속
			conn = DriverManager.getConnection(URL,USR,PW);
			//3.실행할 sql 문을 생성
			String sql = "insert into CUSTOMER values (cno.nextval, ?, ?, ?, ?)"; //placeholder///////
			pstmt = conn.prepareStatement(sql);///////////////////////////////////////////////////////
			//placeholder 에 실제값 지정
			pstmt.setString(1,name);
			pstmt.setString(2,sosec);
			pstmt.setString(3,addr);
			pstmt.setString(4,hp);
			
			//4. 작성된 sql문 실행
			int cnt  = pstmt.executeUpdate();////////////////////////////////////////////////
			System.out.println(cnt + "건의 데이터가 추가됨!!");
			
			//3b 실행할 sql문을 생성 -select
			sql = "select *from customer order by cno desc";
			pstmt = conn.prepareStatement(sql);
			
			//4b sql 문을 실행하고 결과 집합 저장
			rs = pstmt.executeQuery(sql);
			
			//4c 결과집합처리
			StringBuffer sb = new StringBuffer();
			while(rs.next())
			{
				sb.append(rs.getString(1)).append(" ")
				  .append(rs.getString(2)).append(" ")
				  .append(rs.getString(3)).append(" ")
				  .append(rs.getString(4)).append(" ")
				  .append(rs.getString(5)).append("\n");
					
			}
			System.out.println(sb.toString());
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}finally {//5. 사용한 객체들을 모두 정리 
			try{rs.close();} catch(Exception ex) {}////////////////////////////////////
			try{pstmt.close();} catch(Exception ex) {}
			try{conn.close();} catch(Exception ex) {}
		}
	
	}

}
