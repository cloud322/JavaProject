package project.v1b;

public class CustomerV0 {
	int cusNum;
	String name;
	String socSec;
	String adrass;
	String phoneNum;
	
	public CustomerV0() {}
	
	public CustomerV0(int cusNum, String name, String socSec, String adrass, String phoneNum) {
		super();
		this.cusNum = cusNum;
		this.name = name;
		this.socSec = socSec;
		this.adrass = adrass;
		this.phoneNum = phoneNum;
	}

	public int getCusNum() {
		return cusNum;
	}

	public void setCusNum(int cusNum) {
		this.cusNum = cusNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSocSec() {
		return socSec;
	}

	public void setSocSec(String socSec) {
		this.socSec = socSec;
	}

	public String getAdrass() {
		return adrass;
	}

	public void setAdrass(String adrass) {
		this.adrass = adrass;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "CustomerV0 [cusNum=" + cusNum + ", name=" + name + ", socSec=" + socSec + ", adrass=" + adrass
				+ ", phoneNum=" + phoneNum + "]";
	}
	
	
	
	

}
