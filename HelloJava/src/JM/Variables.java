package JM;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		/*
		 * 자바 기본 자료형 int :정수 (byte, short, long) double : 실수(float) char : letter String
		 * : 문자열
		 */

		// 변수 : 자료형 변수이름
		int a; // 정수형 변수
		double b; // 실수형 변수
		char c; // 문자변수 (1자)
		String d; // 문자열 변수

		// 상수 final 자료형 변수이름;
		// 변경불가 자료를 저장할 목적으로 사용
		// 변수 이름은 대문자로 작성!
		final int E;
		final double F;
		final char G;
		final String H;

		// 자바 예약어를 변수 이름으로 사용불가
		// int if;
		// double import;
		// char System; //비추
		// String String; //비추

		// 회원정보 (ID, password, name, 나이)

		String id;
		String pwd;
		String name;
		// string name, pwd ,name;
		// 동일한 자료형 변수들은 , 둘로 구분해서
		// 한번에 선언가능 비추 = 가독성 문제

		// string name="x", pwd="y" ,name="z";

		int age;

		// literal : compiler 가 이해할수 있는 형식으로 작성된 데이터 값

		long socsecur = 1234561234567L;

		// 변수 초기화 : 변수에 값을 대입
		// 변수명 = 값;
		id = "zzyzzy";
		pwd = "987654";
		name = "suji";
		age = 23;

		b = 123.456;

		float pii = 3.141592F;

		c = '수';
		G = 'a'; // G = 'su' 안됨

		// 변수 vs 상수
		c = '우';
		// G = 'x'; //초기화 두번할수 없다 상수이므로 변경불가

		// 선언과 초기화
		int i = 132;
		double j = 987.123;
		boolean k = true; // 논리형변수
		k = false;
		// k = 123; 안됨
		// k = '가'; 안됨

		// 변수/상수 이름
		// 변수는 일반적으로 소문자
		// 만일 이름을 두단어로 구성하는 경우
		// camel 표기법 사용
		int socSecurity;
		String sayHello;

		// 상수는 모두 대문자로 작성
		// 두단어 이상인 경우 _ 를 사용
		final double PI = 3.14;
		final int THIS_YEAR = 2017;
		final String USER_ID = "zzyzzy";

		// JDK 7 부터 도입된 자릿수 표시; _
		socsecur = 1234561234567L;
		socsecur = 123456_1234567L;

		// 문자와 숫자간 변환
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = 'a';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = '가';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = '1';
		System.out.println(ch);
		System.out.println((int) ch);

		String chars = "abc";
		System.out.println(chars.charAt(0));
		System.out.println((int) chars.charAt(0));

		System.out.println(chars.charAt(1));
		System.out.println((int) chars.charAt(1));

		System.out.println(chars.charAt(2));
		System.out.println((int) chars.charAt(2));

		// 특수문자표현 - escape sequence
		System.out.println("가      나");
		System.out.println("가\t나"); // 탭
		System.out.println("가\n나"); // 줄바꿈
		System.out.println("가\"나"); // 큰따음표
		System.out.println("가\'나"); // 작은따음표

		// 변수 출력하는 방법

		System.out.println(socsecur);
		System.out.println(pwd);
		System.out.println(name);
		System.out.println(age);

		System.out.println("주민등록번호:" + socsecur);
		System.out.println("비밀번호:" + pwd);
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);

		System.out.println("주민등록번호:" + socsecur + "비밀번호:" + pwd + "이름:" + name + "나이:" + age);
		// 성능저하

		// 서식화된 출력 - printf
		System.out.printf("주민등록번호: %s, 비밀번호: %s , 이름: %s , 나이: %s", socsecur, pwd, name, age);

		System.out.printf("\n주민등록번호: %s\n 비밀번호: %s\n  이름: %s\n  나이: %s\n", socsecur, pwd, name, age);

		String fmt = (" 주민등록번호: %s\n 비밀번호: %s \n 이름: %s \n 나이: %s \n");
		System.out.printf(fmt, socsecur, pwd, name, age);

		// double vs float :오차범위
		float avg1 = 296 / 3.0f;
		double avg2 = 296 / 3.0;

		System.out.println(avg1);
		System.out.println(avg2);

		// 문자 입력받기 ctrl+space
		Scanner sc = new Scanner(System.in);
		// without ln
		System.out.print("주민번호를 입력하세요 ");
		socsecur = Long.parseLong(sc.nextLine());
		System.out.print("비밀번호를 입력하세요 ");
		pwd = sc.nextLine();
		System.out.print("이름를 입력하세요 ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 ");
		age = Integer.parseInt(sc.nextLine());

		System.out.printf(fmt, socsecur, pwd, name, age);

	}

}
