package JM.lab;

import java.util.Scanner;

public class Lab04 {
	public static void main(String[] args) {
		// 프린트 16~20

		// #16
		// a
		int n = 1;
		int k = 2;
		int r = n;
		// if (k < n)
		// System.out.println(r = k);
		if (k < n)
			r = k;
		System.out.printf("%d %d %d \n", n, k, r);

		// b
		int n1 = 1;
		int k1 = 2;
		int r1 = n1;
		if (k1 < n1)
			System.out.println(r1 = k1);
		else
			System.out.println(r1 = k1 + n1);
		// c
		int n2 = 1;
		int k2 = 2;
		int r2 = k2;
		if (r2 < k2)
			System.out.println(n2 = r2);
		else
			System.out.println(k2 = n2);
		// d
		int n3 = 1;
		int k3 = 2;
		int r3 = 3;
		if (r3 < n3 + k3)
			System.out.println(r3 = 2);
		else
			System.out.println(k3 = 2 * r3);

		// #17

		//
		// if(x && y ==0)
		// {x=1; y=1;} // x&&y ==true o

		// if (1 <= x <= 10) //부등호식 x x>=1 && x<=10
		// System.out.println(x);

		// #18

		// int number = 30;
		int number = 35;

		if (number % 2 == 0)
			System.out.println(number + "is even");
		else
			System.out.println(number + "is odd");

		number = 30;
		if (number % 2 == 0)
			System.out.println(number + "is even");
		else
			System.out.println(number + "is odd");

		// #19

		int x = 3;
		int y = 2;
		// int z =
		// int x = 3; int y = 4;
		// int x = 2; int y = 2;

		if (x > 2) {
			if (y > 2) {
				// z = x + y;
				int z = x + y;
				System.out.println("z is" + z);
			}
		} else
			System.out.println("x is " + x);

		// #20
		int a = 3;
		if (a++ == 3)
			System.out.println("three");
		else
			System.out.println("Four");

		if (++a == 3)
			System.out.println("three");
		else
			System.out.println("Four");

		a = a++;
		if (a == 3)
			System.out.println("three");
		else
			System.out.println("Four");

		a++;
		if (a == 3)
			System.out.println("three");
		else
			System.out.println("Four");

		// #21
		// isMarried = 'Y' 'N'
		// isMarried = true false
		// isMarried = 0 1

		Scanner sc = new Scanner(System.in);
		System.out.println("결혼여부를 입혁하세요(미혼:0, 기혼:1)");
		int isMarried = sc.nextInt();
		System.out.println("연봉 입력");
		int salary = sc.nextInt();
		int tax = 0;

		if (isMarried == 0) {
			if (salary < 3000)
				tax = (int) (salary * 0.1);
			else
				tax = (int) (salary * 0.25);
		} else if (isMarried == 1) {
			if (salary < 6000)
				tax = (int) (salary * 0.1);
			else
				tax = (int) (salary * 0.25);
		}
		System.out.println(isMarried);
		System.out.println(salary);
		System.out.println(tax);

	}

}
