package org.tnsif.java.inheritence;

public class Student extends Citizen{
	private int id;
	private String name;
	private String department;
	private long contactNumber;
	
	//parameterized constructor
	public Student(long aadharNo, String nationality, String dob, String address, int id, String name,
			String department, long contactNumber) {
		super(aadharNo, nationality, dob, address);
		this.id = id;
		this.name = name;
		this.department = department;
		this.contactNumber = contactNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", contactNumber="
				+ contactNumber + "]" + super.toString();
	}
	
	
	
}
