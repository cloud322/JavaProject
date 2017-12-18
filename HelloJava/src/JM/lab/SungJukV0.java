package JM.lab;

public class SungJukV0 {

	//V0 class - value object
	//값만 저장하는 특수한 class
	
	// 맴버변수 private으로 선언
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private String grd;
	
	
	//생성자
	public SungJukV0() {
		// TODO Auto-generated constructor stub
	}


	public SungJukV0(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	//setter getter

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

	//toString

	@Override
	public String toString() {
		return "SungJukV0 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", avg="
				+ avg + ", grd=" + grd + "]";
	}
	
	
	
	
	
	

	

}
