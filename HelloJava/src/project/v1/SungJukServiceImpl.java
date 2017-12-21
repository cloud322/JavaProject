package project.v1;

public class SungJukServiceImpl implements SungJukService{

	@Override
	public void addSungJuk(SungJukV0 sj) {
		processSungJuk(sj); // 성적처리  /총점 /평균  /학점		//create method
		System.out.println("new data added");
		
	}

	
	@Override
	public String getSungJuk() {
		String out = "data out";
		return out;
	}

	@Override
	public String getSungJuk(String name) {
		System.out.println("data viewed");
		return name;
	}

	@Override
	public void modifySungJuk(SungJukV0 sj) {
		
		System.out.println("data modifiied");
		
	}

	@Override
	public void removeSungJuk(String name) {
		System.out.println("data removed");
		
	}
	
	private void processSungJuk(SungJukV0 sj) {
		int tot = sj.getKor()+sj.getEng()+sj.getMat();
		double avg = (double)tot/3;
		String grd = "A";
		switch((int)avg/10)
		{
		case 10 :
		case 9 :  grd="A"; break;
		case 8 :  grd="B"; break;
		case 7 :  grd="C"; break;
		case 6 :  grd="D"; break;
		 
		}
		
		sj.setTot(tot);
		sj.setAvg(avg);
		sj.setGrd(grd);
		
	}


	

}
