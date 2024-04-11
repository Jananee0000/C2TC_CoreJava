package org.tnsif.java.statickeyword;

public class EmployeeStatic {
	private int id;
	private String name;
	private static String company="IBM";
	
	public EmployeeStatic(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		EmployeeStatic.company = company;
	}

	@Override
	public String toString() {
		return "EmployeeStatic [id=" + id + ", name=" + name + ", company name=" + company+ "]";
	}
	
	
	

}
