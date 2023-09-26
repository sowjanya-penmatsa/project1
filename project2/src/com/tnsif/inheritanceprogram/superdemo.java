package com.tnsif.inheritanceprogram;

class parent{
	int var=100;
}

public class superdemo extends parent {
	int var=50;
	void display() {
		System.out.println("the child value is"+var);
		System.out.println("the child value is"+super.var);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		superdemo ob=new superdemo();
		ob.display();

	}

}
