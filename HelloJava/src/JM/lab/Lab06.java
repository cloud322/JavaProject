package JM.lab;

public class Lab06 {

	public static void main(String[] args) {
		// 3-1 3-2 3-3 4-1

		// 3-1
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x += 2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C' - c);
		System.out.println('5' - '0');
		System.out.println(c + 1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		// true 13 5 false 2 5 66 B B C

		// 3-2
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = numOfApples / 10 + (numOfApples % 10 > 0 ? 1 : 0); // 모든 사과를 담는데 필요한 바구니의
		// numOfApples / 10 + numOfApples % 10 > 0 ? 1 : 0 = 1 ?????
		System.out.println("필요한 바구니의 수 :" + numOfBucket);

		// 3-3

		int num = 10;
		System.out.println(num > 0 ? "양수" : num < 0 ? "음수" : "0");

		// 4-1
		char ch = 'x';
		int year = 200;
		// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		System.out.println(x >= 10 && x <= 20);
		// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		System.out.println(ch == ' ' || ch == '	');
		// 3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		System.out.println(ch == 'x' || ch == 'X');
		// 4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		System.out.println(ch >= 0 && ch <= 9);
		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		System.out.println(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z'));
		// 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
		// 않을 때 true인 조건식
		System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
		// 7. boolean형 변수 powerOn가 false일 때 true인 조건식
		boolean powerOn = true;
		System.out.println(!powerOn);

		// 8. 문자열 참조변수 str이 “yes”일 때 true인 조건식\

		//
	}

}
