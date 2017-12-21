package project.v1;

public class SungJukV0 {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private String grd;

	public SungJukV0() {}


	public SungJukV0(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMat() {
		return mat;
	}


	public void setMat(int mat) {
		this.mat = mat;
	}


	public int getTot() {
		return tot;
	}


	public void setTot(int tot) {
		this.tot = tot;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public String getGrd() {
		return grd;
	}


	public void setGrd(String grd) {
		this.grd = grd;
	}
	@Override
	public String toString() {
		String fmt = "SungJukV0 [name=%s, kor=%d, eng=%d, mat=%d, tot=%d, avg=%.1f, grd=%s]";
		return String.format(fmt, name,kor,eng,mat,tot,avg,grd);
	}
}
