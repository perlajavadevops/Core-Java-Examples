package com;
public class Student {//Plain Old Java Objects or entities or beans or dtos

	private int sno;// 0
	private String name;// null
	private String address;// null
	private boolean flag;//false
	
	
	public boolean isFlag() {//true or false
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setAddress("USA");
		st1.setName("perla");
		st1.setSno(900);
		st1.setFlag(true);
		System.out.println(st1.getSno());
		System.out.println(st1.getName());
		System.out.println(st1.getAddress());
		System.out.println(st1.isFlag());
	}

}
