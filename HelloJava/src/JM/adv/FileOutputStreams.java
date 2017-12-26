package JM.adv;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileOutputStreams 
{
	

	public static void main(String[] args) 
	{
		////바이트 기반 스트림 - 파일쓰기
		//객체를 바이트 기반 스트림으로파일에 저장
		//즉 클래스에 대한 객체를 직렬화해서 파일에 저장함
		
		String name = "찌현";
		Users u =new Users("zzzy","1234","지현",29);
		int age = 21;
		
		
		String fpath = "c:/Java/data01.dat";
		try(FileOutputStream fos = new FileOutputStream(fpath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);)
		{
			oos.writeUTF(name); // 직렬화로 문자형으 ㄹ파일에 저장
			oos.writeObject(u);//직렬화로 객체를 파일에 저장
			oos.writeInt(age);//직렬화로 숫자를 파일에 저장
		} catch (Exception ex) {
			
			ex.printStackTrace();

		}

	}
}
	
	//클래스를 직렬화해서 파일에 저장하려면
	//해당 클래스는 Serializable 인터페이스를 구현해야함

class Users implements Serializable
{
		/**
		 * 
		 */
		private static final long serialVersionUID = -5561635491071227307L;
	String userid;
	String passwd;
	String name;
	int age;
	
	public Users() {}

	public Users(String userid, String passwd, String name, int age)
	{
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
	}
	
	
}