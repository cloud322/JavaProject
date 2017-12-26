package project.v2a;

import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukV0;

public class SungJukServiceImpl implements SungJukService{

	//성적 데이터를 저장하기위해 array list객체사용
	private List<SungJukV0> sjdb = null;
			
	public SungJukServiceImpl() {
		sjdb = new ArrayList<>();
	}
	
	@Override
	public void addSungJuk(SungJukV0 sj) {
		processSungJuk(sj); // 성적처리  /총점 /평균  /학점		//create method
		sjdb.add(sj);
		
		
	}

	
	@Override
	public String getSungJuk() {
		StringBuffer sb = new StringBuffer();
		String fmt = "%s %d %d %d \n";
		for(SungJukV0 sj : sjdb )
		{
			sb.append(String.format(fmt,sj.getName(),sj.getKor(),sj.getEng(),sj.getMat()));
		}
		return sb.toString();
		
	}

	@Override
	public String getSungJuk(int no) {
		
		return "";
	}

	@Override
	public void modifySungJuk(SungJukV0 sj, int no) {
		
		System.out.println("data modifiied");
		
	}

	@Override
	public void removeSungJuk(int no) {
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
