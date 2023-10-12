package com.tns.exception;

public class NestedTryy {
	public static void check() {
		String str="tns";
		int slength=str.length();
		System.out.println("the length is"+slength);
		int arr[] = null;
		int y=6;
		try {//outer try
			int z=y/0;// exception occured
			try {// inner try
				System.out.println(arr[1]);// exception arises
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex) {// inner catch
				System.out.println("Indexout of bound"+ex.getMessage());
			}
			catch(NullPointerException ex) {
				System.out.println("NullPointer"+ex.getMessage());
			}
		}
			catch(ArithmeticException ex) {// outer catch
				System.out.println("Arithmetic exception"+ex.getMessage());
			}
		}
		
	}


