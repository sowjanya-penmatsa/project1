package com.tns.exception;

import java.util.InputMismatchException;

public class WithExecption {
	
	public static void divide() {
		int a=6,b=0,c;
		try {//exception is raised
		c=a/b;
	}
		catch(ArithmeticException e) {//exception is handled and e is object of exception
			System.out.println("Exception Caught"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Caught"+e.getMessage());
			
		}
		catch(InputMismatchException e) {
		System.out.println("Exception Caught"+e.getMessage());
		}
	
}
}
		
