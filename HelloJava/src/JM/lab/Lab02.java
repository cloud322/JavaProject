package JM.lab;

public class Lab02 {

	// #3~15

	// #3
	public static void main(String[] args)

	{
		// System.out.println("3x");
		// System.out.println("3x+y");
		// System.out.println("(x+y)/7");
		// System.out.println("(3x+y)/(z+2)");

		int x = 10;
		int y = 20;
		int z = 30;
		int result = 0;

		result = 3 * x;
		result = 3 * x + y;
		result = (x + y) / 7;
		result = (3 * x + y) / (z + 2);

		// #4
		// double number = (1 / 3) * 3;
		// System.out.printf("(1/3) * 3= %f \n", number);

		// 정수끼리 연산은 언제나 정수

		System.out.printf("(1/3) * 3= %d \n", (1 / 3) * 3);
		System.out.printf("(1/3) * 3= %f \n", (1 / 3D) * 3);// or 3.0 or ((double)1/3)

		// #5
		int quotient, remainder;
		quotient = 7 / 3;
		remainder = 7 % 3;
		System.out.printf("7 / 3 = %d \n", quotient);
		System.out.printf("7 %% 3 = %d \n", remainder);

		// #6
		int result1 = 11;
		result1 /= 2; // r = r/2

		// System.out.printf("result /= 2 = %d \n", result);

		// #7
		// double x = 2.5;
		// double y = -1.5;
		// int m = 18;
		// int n = 4;
		// double o = x + n * y - (x + n) * y;
		// int p = m / n + m % n;

		// System.out.printf("x+n*y-(x+n)*y = %f \n", o);
		// System.out.printf("m/n+m%%n = %d \n", p);

		// 연산자우선순위
		double x1 = 2.5;
		double y1 = -1.5;
		int m = 18;
		int n = 4;
		System.out.println(x1 + n * y1 - (x1 + n) * y1);
		System.out.println(m / n + m % n);
		System.out.println(5 * x1 - n / 5);
		System.out.println(1 - (1 - (1 - (1 - (1 - n)))));

		// #8
		// 논리연산자의 단축ㄱ평가
		System.out.println(3 + 4.5 * 2 + 27 / 8);
		System.out.println(true || false && 3 > 4 || !(5 == 7));
		System.out.println(true || (3 < 5 && 6 >= 2));
		// System.out.println(!true>'A');//안됨
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z'); // 아스키코드로 변환되어
		System.out.println('D' + 1 + 'M' % 2 / 3);
		System.out.println(5.0 / 3 + 3 / 3);
		System.out.println(53 % 21 < 45 / 18);
		System.out.println((4 < 6) || true && false || false && (2 > 3));

		// #9
		System.out.print("May 13, 1988 fell on day number  \n");
		System.out.println(
				((13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400 - 2 * (1988 / 100)) % 7 + 7) % 7);
		// 특정일의 요일을 알아내는 수식
		// (Year+(Year/4)-(Year/100)+(Year/400)+(13*Month+8)/5+Day)%7);
		System.out.print((1988 + (1988 / 4) - (1988 / 100) + (1988 / 400) + (13 * 5 + 8) / 5 + 13) % 7);
		System.out.println("Check out this line  ");
		System.out.println("//hello there" + '9' + 7);
		System.out.println('H' + 'I' + "is" + 1 + "more example");
		System.out.println('H' + 6.5 + 'I' + "is" + 1 + "more example");
		// System.out.println("Print both of us", "Me too"); // , 안됨
		System.out.println("Reverse" + 'I' + 'T');
		System.out.println("No! here is" + 1 + "more example");
		// System.out.println("here is "+10*10))//that's 100;
		System.out.println("Not x is" + true);// that's true. //bolean type 문자랑 사용되면 문자
		// System.out.print();
		// System.out.prinln;
		// System.out.print("How about this one"++'?'+'huh?' ); // 증가연산자 ++

		// #10

		System.out.println(3 + 4.5 * 2 + 27 / 8);
		System.out.println(true || false && 3 < 4 || !(5 == 7)); // false && 3<4 deadcode 앞 참이면 뒤에거볼필요없다
		System.out.println(true || (3 < 5 && 6 >= 2)); // (3<5 && 6>=2) deadcode

		// #11
		// 1 2 3 중요

		System.out.println(27 / 13 + 4);
		System.out.println(27 / 13.0 + 4);
		System.out.println(27 / 13 + 4.0);
		System.out.println(42.7 % 3 + 18);
		// System.out.println((3<4)&&5/8);
		System.out.println('a' + 'b');
		System.out.println('a' / 'b');
		// System.out.println('a' &&!'b');
		System.out.println((double) 'a' / 'b');

		// #12 형변환 축소
		int n1 = (int) 3.9;
		System.out.println("n== " + n1);

		// #13
		int n2 = 3;
		n2++;
		System.out.println("n== " + n2);
		n2--;
		System.out.println("n== " + n2);

		n2 = 3;
		System.out.println("n== " + n2++);
		System.out.println("n== " + n2);

		// #14
		System.out.println("2+2=" + (2 + 2));
		System.out.println("2+2=" + 2 + 2);

		// #15

		char a, b;
		a = 'b';
		System.out.println(a);
		System.out.println((int) a);
		b = 'c';
		System.out.println(b);
		a = b;
		System.out.println(a);

	}

}
