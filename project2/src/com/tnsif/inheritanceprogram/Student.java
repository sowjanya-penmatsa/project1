package com.tnsif.inheritanceprogram;

public class Student extends Citizen {
	
	public Student() {
		super();
		
	}
	private int rollno;
	private String collegename;
	//@Override
	//public String toString() {
		//return "Student [rollno=" + rollno + ", collegename=" + collegename + "]";
	//}
	public Student(String name, long aadharno, String address, long phno) {
		super(name, aadharno, address, phno);
		// TODO Auto-generated constructor 
        this.rollno=rollno;
        this.collegename=collegename;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	

	
}
