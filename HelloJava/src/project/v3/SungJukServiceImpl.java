package project.v3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SungJukServiceImpl implements SungJukService {
	
	private String fpath1 = "c:/Java/data.txt";
	private String fpath2 = "c:/Java/data.dat";

	private final String FILENOTFOUND = "\n파일이 존재하지 않습니다!\n";
	private final String FILEIOERROR = "\n기타 파일 입출력 오류입니다!\n";
	private final String ANYWAYERROR = "\n암튼 오류임!\n";
	// 각종 오류 메세지를 상수로 정의해 둠
	private final String WRONGINPUT = "\n잘못입력하셨습니다!!\n\n\n";

	// 성적데이터를 저장하기 위해 ArrayList 객체 사용
	private List<SungJukV0> sjdb = null;

	public SungJukServiceImpl() {
		//sjdb = new ArrayList<>();
		sjdb = initSungJukFromSerialized();
	}

	@Override
	public void addSungJuk(SungJukV0 sj) {
		processSungJuk(sj);
		sjdb.add(sj);
	}

	@Override
	public String getSungJuk() {
		StringBuffer sb = new StringBuffer();
		String fmt = "%s %d %d %d \n";

		for (SungJukV0 sj : sjdb) {
			sb.append(String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat()));
		}

		return sb.toString();
	}

	@Override
	public String getSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size()))
			return "\n잘못된 값 입력!!";

		String fmt = "\n\n%d : %s %d %d %d %d %.1f %s";
		SungJukV0 sj = sjdb.get(no - 1);

		StringBuffer sb = new StringBuffer();
		sb.append(String.format(fmt, no, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(), sj.getTot(), sj.getAvg(),
				sj.getGrd()));

		return sb.toString();
	}

	@Override
	public void modifySungJuk(SungJukV0 sj, int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println(WRONGINPUT);
			return;
		}

		processSungJuk(sj); // 성적 재계산
		sjdb.set(no - 1, sj);

		System.out.println("\n성적데이터가 수정되었습니다\n\n");
	}

	@Override
	public void removeSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println(WRONGINPUT);
			return;
		}

		sjdb.remove(no - 1);

		System.out.println("\n성적데이터가 삭제되었습니다\n\n");
	}

	private void processSungJuk(SungJukV0 sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avg = (double) tot / 3;
		String grd = "가";
		switch ((int) avg / 10) {
		}

		sj.setTot(tot);
		sj.setAvg(avg);
		sj.setGrd(grd);
	}

	private boolean checkSungJukNo(int no, int size) 
	{
		boolean isFail = false;
		if (no <= 0 || (no > size)) {
			isFail = true;
		}
		return isFail;
	}



	private List<SungJukV0> initSungJukFromSerialized()
	{
		List<SungJukV0> sjdb =  new ArrayList<SungJukV0>();
	
		try(
			FileInputStream fis = new FileInputStream(fpath2);
			ObjectInputStream ois = new ObjectInputStream(fis);
		   ){
			
			sjdb = (List<SungJukV0>)ois.readObject();
		}catch (FileNotFoundException fnfe) {System.out.println(FILENOTFOUND);}
		catch (IOException ioe) {System.out.println(FILEIOERROR);}
		catch (Exception ex) {System.out.println(ANYWAYERROR);}
		
		return sjdb;
	
	}
	
	private List<SungJukV0> initSungJukFromFile()
	{
		List<SungJukV0> sjdb =  new ArrayList<SungJukV0>();
		
		try 
		(
			FileReader fr = new FileReader(fpath1);
			BufferedReader br = new BufferedReader(fr);
		){
			while(br.ready())
			{
				String[] sjrow = (br.readLine().split("/"));
				SungJukV0 sj = new SungJukV0(sjrow[0],
						Integer.parseInt(sjrow[1]),
						Integer.parseInt(sjrow[2]),
						Integer.parseInt(sjrow[3]));
				sj.setTot(Integer.parseInt(sjrow[4]));
				sj.setAvg(Double.parseDouble(sjrow[4]));
				sj.setGrd(sjrow[4]);
				
				sjdb.add(sj);
			}
		}catch (FileNotFoundException fnfe) {System.out.println(FILENOTFOUND);}
		catch (IOException ioe) {System.out.println(FILEIOERROR);}
		catch (Exception ex) {System.out.println(ANYWAYERROR);}
			
		return sjdb;
		
	}
	
	public void finalize() throws Throwable
	{
		writeSungJukToSerialized();
		super.finalize();
	}
	
	private void writeSungJukToFile()
	{
		try(
			FileWriter fw = new FileWriter(fpath1);
			BufferedWriter bw = new BufferedWriter(fw);
		   ){
			StringBuffer out = new StringBuffer();
			
			for(SungJukV0 sj : sjdb)
				{
					out.append(sj.getName()).append("/")
						.append(sj.getKor()).append("/")
						.append(sj.getEng()).append("/")
						.append(sj.getMat()).append("/")
						.append(sj.getTot()).append("/")
						.append(sj.getAvg()).append("/")
						.append(sj.getGrd()).append("\n");
					bw.write(out.toString());
					out.setLength(0);
				}//for
			
			}catch (FileNotFoundException fnfe) {System.out.println(FILENOTFOUND);}
		catch (IOException ioe) {System.out.println(FILEIOERROR);}
		catch (Exception ex) {System.out.println(ANYWAYERROR);}
	}//writeSungJukToFile
	
	private void writeSungJukToSerialized()
	{
		try(
				FileOutputStream fos = new FileOutputStream(fpath2);
				ObjectOutputStream oos = new ObjectOutputStream(fos);)
			{
				oos.writeObject(sjdb);
			} 
			catch (FileNotFoundException fnfe) {System.out.println(FILENOTFOUND);}
			catch (IOException ioe) {System.out.println(FILEIOERROR);}
			catch (Exception ex) {System.out.println(ANYWAYERROR);}
	}//writeSungJukToSerialized
		
	
		
		
}