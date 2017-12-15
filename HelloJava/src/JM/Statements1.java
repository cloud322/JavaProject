package JM;

public class Statements1 {

	public static void main(String[] args) {
		// 문장 - 무엇인가를 하라는 지시를 의미
		// 문장이 모여 프로그램을 구성

		;// 빈문장도 적법

		// 조건문 if
		// if (조건식){참일때 실행할 문장}
		// if (조건식){참일때} else {false}
		// if (조건식1){참일때}
		// else if(조건식2) {true}
		// else if(조건식3) {true}
		// else {false}
		if (3 < 5) {
			System.out.println("3 is larger than 5??");
		}
		int tot = 99 + 98 + 99;
		if (tot > 269)
			System.out.println('수'); // {} 권장

		// 어떤수가 2의 배수인지 알아보자
		int x = 13;
		if (x % 2 == 0) {
			System.out.println("2의배수");
		} else {
			System.out.println("not");
		}

		// 범위 검사
		x = 95;
		if (x <= 100 && x >= 90)
			System.out.println('수');

		// 값 비교
		String userid = new String("gdgd");
		String pwd = new String("12345");

		if (userid.equals("gdgd") && pwd.equals("12345")) // = 대입 == 같다 .equals
			System.out.println("logged in");
		else
			System.out.println("log in failier");

		if (userid.equals("gdgd"))
			if (pwd.equals("12345"))
				System.out.println("logged in");
			else
				System.out.println("wrong Pwd");

		else
			System.out.println("wrong ID");

		// 문자입력확인
		char ch = 'q';
		if (ch == 'q' || ch == 'Q')
			System.out.println("end program");

		// 입력문자가 alphabet?? lower case
		// if(ch =='a' ||ch =='b' || ...||);
		ch = '1';
		if (!(ch >= 'a' && ch <= 'z'))
			;
		System.out.println("alphabet only");

		ch = 'x';
		if (!(ch >= 'A' && ch <= 'Z'))
			;
		System.out.println("upper case only");

		if (!(ch >= '0' && ch <= '9'))
			;
		System.out.println("number ONLY");

		// 다중 if
		double avg = (double) tot / 3;
		char grd;

		if (avg <= 100 && avg >= 90)
			grd = 'A';
		else if (avg < 90 && avg >= 80)
			grd = 'B';
		else if (avg < 80 && avg >= 70)
			grd = 'C';
		else if (avg < 70 && avg >= 60)
			grd = 'D';
		else
			grd = 'F';

		System.out.println(grd);

		// 애매모호 if 문
		String grds = "";
		if (avg >= 90) {
			if (avg >= 96)
				grds = "A+";
		} else
			grds = "A- or A0";
		System.out.println(grds);

		// switch : 연산식의 결과값에 따라 분기
		// 연산식 결과값 유형은
		// 정수 문자열 열거형 중 하나여야만 함
		// switch(연산식)
		// {
		// case값1: 실행할코드; break;
		// case값2: 실행할코드; break;
		// case값3: 실행할코드; break;
		// default: 실행할코드; break;
		// }

		int userLevel = 1;
		switch (userLevel) {
		case 1:
			System.out.println("관리자");
			break;
		case 2:
			System.out.println("사용자");
			break;
		case 3:
			System.out.println("매니저");
			break;
		default:
			System.out.println("비회원");
			break;
		}

		//
		String key = "c";
		switch (key) {
		case "C":
		case "c":
			System.out.println("데이터 생성");
			break;
		case "r":
			System.out.println("데이터 조회");
			break;
		case "u":
			System.out.println("데이터 수정");
			break;
		case "d":
			System.out.println("데이터 삭제");
			break;
		}

		// 학점계산
		// switch((int)avg)
		// {
		// case 100: case 99: case 98: case 97: case 96:
		// case 95: case 94: case 93: case 92: case 91: case 90:
		// grd ='수';
		// break;

		// }
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = 'A';
			break;
		case 8:
			grd = 'B';
			break;
		case 7:
			grd = 'C';
			break;
		case 6:
			grd = 'D';
			break;
		default:
			grd = 'F';
		}

		// 난수 생성
		double luck = Math.random();
		System.out.println(luck);
		System.out.println(luck * 10);
		System.out.println(luck * 100);
		System.out.println((int) (luck * 100));
		System.out.println(((int) (luck * 100)) + 1);

	}

}
