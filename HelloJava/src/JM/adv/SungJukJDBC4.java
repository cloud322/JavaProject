package JM.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import project.v1.SungJukV0;

public class SungJukJDBC4 {

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
		String updatesql = "update sungjuk set name = ?, kor=?, eng=?, mat=? where sjno = ?";
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
		List<SungJukV02> sjlist = new ArrayList<>();
		while(rs.next())
		{
			SungJukV02 sj = new SungJukV02();
			sj.setSjno(rs.getString("sjno"));
			sj.setName(rs.getString("name"));
			sj.setKor(rs.getInt("Kor"));
			sj.setEng(rs.getInt("Eng"));
			sj.setMat(rs.getInt("Mat"));
			sj.setRegdate(rs.getString("regdate").substring(0,10));
			sjlist.add(sj);
		}
		for(SungJukV02 sj :sjlist)
		{
			System.out.println(sj);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 학생 번호를 입력하세요");
		int no =sc.nextInt();
		System.out.println("(이름/국어/영어/수학)");
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		
		pstmt = conn.prepareStatement(updatesql);
		pstmt.setString(1, name);
		pstmt.setInt(2, kor);
		pstmt.setInt(3, eng);
		pstmt.setInt(4, mat);
		pstmt.setInt(5, no);
		
		int cnt =pstmt.executeUpdate();
		System.out.println(cnt + "건의 데이터 수정 완료!");
		
	
		
		
		
	//성적 게산????????????	
		
		
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			try{rs.close();} catch(Exception ex) {}
			try{pstmt.close();} catch(Exception ex) {}
			try{conn.close();} catch(Exception ex) {}
		}
		
	
		
	}

}


class SungJukV02 extends SungJukV0
{
	private String sjno;
	private String regdate;
	public String getSjno() {
		return sjno;
	}
	public void setSjno(String sjno) {
		this.sjno = sjno;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		String fmt = "SungJukV0 [sjno=%s, name=%s, kor=%d, eng=%d, mat=%d, tot=%d, avg=%.1f, grd=%s regdate=%s]";
		return String.format(fmt, sjno, getName(), getKor(),getEng(),getMat(),getTot(),getAvg(),getGrd(), regdate);
	}
	
}
		
		
		
	
