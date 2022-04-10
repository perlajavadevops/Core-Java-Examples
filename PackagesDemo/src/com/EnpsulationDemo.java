package com;

import java.io.Serializable;

class Employee implements Serializable{//POJO--Plain Old Java Object --Beans - Entity
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 2728121832248045888L;//Expert
	
	private int empNo;
	private String name;
	private String sala;
	private String address;
	private boolean isEmployeeFlag;
	
	public boolean isEmployeeFlag() {
		return isEmployeeFlag;
	}

	public void setEmployeeFlag(boolean isEmployeeFlag) {
		this.isEmployeeFlag = isEmployeeFlag;
	}

	public void setEmpNo(int empNo){
		this.empNo = empNo;
	}
	
	public int getEmpNo(){
		return empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	/*public Employee(int empNo, String name, String sala, String address) {
		this.empNo = empNo;
		this.name = name;
		this.sala = sala;
		this.address = address;
	}*/
	
	/*public String displayEmployee() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", sala=" + sala
				+ ", address=" + address + "]";
	}*/
	
	
}
/*
 * En
 * Obj
 * class
 * Pol
 * in
 * abstr
 * 
 */
public class EnpsulationDemo {

	public static void main(String[] args) {
		//Employee emp = new Employee(101, "Reddy", "23", "Ed");
		//emp.empNo=90;
		
		Employee emp = new Employee();
		emp.setAddress("USA");
		emp.setEmpNo(102);
		emp.setName("Reddy");
		emp.setSala("343");
		emp.setEmployeeFlag(true);
		System.out.println(emp.getAddress());
		System.out.println(emp.getEmpNo());
		System.out.println(emp.getName());
		System.out.println(emp.getSala());
		System.out.println(emp.isEmployeeFlag());
		
	}
}

class AAA{
	
	public static void main(String[] args) {
	   Employee employee = new Employee();
	}
}