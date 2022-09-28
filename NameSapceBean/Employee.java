package com.spring.NameSapceBean;

public class Employee {
	
	private String empname;
	private String empid;
	private String empaddress;
	private double salary;
	
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", empaddress=" + empaddress + ", salary=" + salary
				+ "]";
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
		
}
