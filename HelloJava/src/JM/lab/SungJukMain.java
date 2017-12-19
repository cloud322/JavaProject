package JM.lab;

public class SungJukMain {

	public static void main(String[] args) {
		// 학생데이터,
		SungJukV0 지현 = new SungJukV0("지현",98,97,96);
		
		
		//성적처리
		SungJukService sjsrv = new SungJukService();
		
		//데이터수 만큼 인수를 전달한느 것은 왠지 비효율적
		//int tot = sjsrv.getTotal(지현.getKor(), 지현.getEng(), 지현.getMat());
		
		//메서드 다중정의를 통해 새로운 유형의 getTotal 메서드 작성
		int tot = sjsrv.getTotal(지현);
		
		double avg = sjsrv.getAverage();
		String grd = sjsrv.getGrade();
		
		
		
		
		지현.setTot(tot);
		지현.setAvg(avg);
		지현.setGrd(grd);
		
		
		
		//결과출력
		System.out.println(지현);
	}

}
