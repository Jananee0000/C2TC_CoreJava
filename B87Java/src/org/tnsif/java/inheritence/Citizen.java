package org.tnsif.java.inheritence;

public class Citizen {
	

	protected long aadharNo;
	protected String nationality;
	protected String dob;
	protected String address;
	//parameterized constructor
	public Citizen(long aadharNo, String nationality, String dob, String address) {
		super();
		this.aadharNo =  aadharNo;
		this.nationality = nationality;
		this.dob = dob;
		this.address = address;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Citizen [aadharNo=" + aadharNo + ", nationality=" + nationality + ", dob=" + dob + ", address="
				+ address + "]";
	}
	
	
	
	
}
