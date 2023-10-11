package com.tns.staticprograms;

public class MyClass {
	private int section;
	private static int srNo;
	
	static
	{
		System.out.println(".......static block.........");
		srNo=100;
	}
	
   MyClass()
	{
		System.out.println(".........default constructor");
		srNo++;
		section++;
	}
	void hello() {
		srNo++;
	}
	static void display()
	{
		//System.out.println("section"+section);
		System.out.println("serialNo"+srNo);
	}
	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}

}
