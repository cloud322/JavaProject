package JM.lab;

import java.util.Scanner;

/*
 * 성적처리프로그램 VA
 * 진단한성적처리를 수행하는 프로그램
 * 입력: 이름 국어 영어 수학
 * 처리: 총점 평균 학점
 * 결과: 이름 국어 영어 수학 총점 평균 학점
 * 
 * 
 */

public class SungJukV1 {
	public static void main(String[] args) {
		// String name;
		// int kor;
		// int eng;
		// int math;
		// 계산
		// int a = kor + eng + math; //
		// float avg = (kor + eng + math) / 3; //

		// 입력
		// Scanner sc = new Scanner(System.in);
		// System.out.print("이름 입력 ");
		// name = sc.nextLine();
		// System.out.print("국어 ");
		// kor = Integer.parseInt(sc.nextLine());
		// System.out.print("영어 ");
		// eng = Integer.parseInt(sc.nextLine());
		// System.out.print("수학 ");
		// math = Integer.parseInt(sc.nextLine());

		// 출력
		// String fmt = (" 이름: %s\n 국어: %s \n 영어: %s \n 수학: %s \n 총점: %s \n 평균: %d \n
		// 학점: %d \n");
		// System.out.printf(fmt, name, kor, eng, math, (float) (kor + eng + math),
		// (float) (kor + eng + math) / 3);

		// 변수선언
		String name;
		int kor;
		int eng;
		int math;
		int tot;
		double avg;
		char grd;

		// 성적처리
		// 데이터입력 -Scanner 사용
		Scanner sc = new Scanner(System.in);

		System.out.println("성적 처리프로그램 V1");
		System.out.println("--------------");

		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();

		// Scanner 객체닫기
		sc.close(); // sc에 노란줄

		// 데이터입력 -입력자료 하드코딩
		// name = "gd";
		// kor = 21;
		// eng = 20;
		// math = 20;
		// 총점평균 학점계산
		tot = (kor + eng + math);
		// avg=(kor + eng + math) / 3;
		avg = (double) tot / 3;
		grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';

		// 결과출력
		String fmt = (" 이름: %s\n 국어: %s \n 영어: %s \n 수학: %s \n 총점: %s \n 평균: %.1f \n 학점: %s \n");
		// fmt+="총점:%d, 평균:%f, 학점:%s";
		System.out.printf(fmt, name, kor, eng, math, tot, avg, grd);

	}

}
