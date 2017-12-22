package JM;

public class Strings {

	public static void main(String[] args) {
		// String class 주요 메서드
		String s = "hello";
		String n = "12345678890";
		char c1 = s.charAt(1);		//지정한 이치 문자 추출
		char c2 = n.charAt(6);
		
		
		String s1 = new String("hello");
		
		char[] c3 = {'h','e', 'l'};
		String s3 = new String(c3);
		
		StringBuffer sb = new StringBuffer("helloo");
		String s2 = new String(sb);
		
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "aaa".compareTo("ccc");
		
		boolean b = s.contains("he");
	
		boolean b1 = s.equals("hello");
		boolean b2 = s.equals("Hello");

		boolean b3 = s.equalsIgnoreCase("HELLO");
		int idx1 = s.indexOf('o');
		int idx2 = s.indexOf('k');
		int idx3 = s.indexOf('e',0);
		int idx4 = s.indexOf('e',2);
		
		
		
		
		
		

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(c3);
		System.out.println(sb);
		System.out.println(s2);
		System.out.println();
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		System.out.println(idx4);
	}

}
