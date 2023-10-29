package com.tns.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] values=new Integer[] {33,44,55};
		Stream<Integer>stream=Arrays.stream(values);
		//map function
		System.out.println("square of no"+Arrays.toString(values));
		stream.map(num->num*num).forEach(System.out::println);
		//limit returns first 2 elements
		System.out.println("first two elements");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		//skip first 2 elements
		System.out.println("skip first two elements");
		Arrays.stream(values).skip(2).forEach(System.out::println);
		//distinct elements
		List <Integer>list=Arrays.asList(11,22,22,33,33,33,44,44,44,44);
		System.out.println("distinct elements");
		list.stream().distinct().forEach(System.out::println);
		//count distinct
		long c=list.stream().distinct().count();
		System.out.println("count distinct elements");
		System.out.println(c);
		//uppercase conversion
		List<String> letters=Arrays.asList("dharma","sowji");
		Stream<String>stream1=letters.stream();
		System.out.println("to uppecase");
		List<String>s1=stream1.map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		//filter operation
		List<Integer>s2=Arrays.asList(22,33,44,55,66,77);
		System.out.println("filter odd numbers");
		s2.stream().filter(num->num%2==1).forEach(System.out::println);

	}

}
