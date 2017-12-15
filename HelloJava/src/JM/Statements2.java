package JM;

public class Statements2 {

	public static void main(String[] args) {
		// 반복문
		// for - 지정한 횟수만큼 어떤작업을 반복
		for (int i = 1; i <= 5; i = i + 1) // i+=1 ++i
			System.out.println("춥 다 너 무");
		// 단순 무식 복붙 코드 반복작업 수행 하는 것은
		// 유지보수 측면으로 좋은 방법이 아님

		System.out.println(" 추.워. ");
		System.out.println(" 추.워. ");
		System.out.println(" 추.워. ");
		System.out.println(" 추.워. ");
		System.out.println(" 추.워. ");

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");

		for (int i = 1; i <= 5; i = i + 1)
			System.out.println(i);
		// 1~100
		for (int i = 1; i <= 100; i = i + 1)
			System.out.println(i);
		// 1~100 홀수
		for (int i = 1; i <= 100; i = i + 2)
			System.out.println(i);

		String fmt = "%d*%d = %d \n";
		for (int i = 1; i <= 9; ++i)
			for (int j = 1; j <= 9; ++j)
				System.out.printf(fmt, i, j, j * i);

		// 4-15

		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("----------------------------------------------");

		for (int i = 1; i < 10; i++)
			System.out.printf("i \t %d \t %d \t %d \t %d \t %d \t %d \n", i, 2 * i, 2 * i - 1, i * i, 11 - i, i % 3,
					i / 3);

		// 중첩for 문
		// **********
		// **********
		// **********
		// **********
		// **********
		for (int i = 1; i <= 5; i++)
			System.out.println("**********");

		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= 10; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 직각삼각형
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 1; i <= 5; ++i) {
			for (int j = 5; j >= i; j -= 1) {
				// for (int j = 1; j <= (6 - i); ++j) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
