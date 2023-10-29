package com.tns.overload;

import java.util.Arrays;
import java.util.List;

public class FilterOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>s2=Arrays.asList(22,33,44,55,66,77);
		System.out.println("filter odd numbers");
		s2.stream().filter(num ->num%2==1).forEach(System.out::println);

	}

}
