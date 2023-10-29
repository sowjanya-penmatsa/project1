package com.tnsif.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new ArrayList();
		System.out.println("check the list"+list1.size());
		list1.add(1);
		list1.add('w');
		list1.add(3);
		System.out.println("the size of list"+list1.size());
		System.out.println("the list of elements are"+list1);
		System.out.println("the element is in list"+list1.contains(55));
		System.out.println("remove the element in the list"+list1.remove(1));
		System.out.println("element at the position in the list"+list1.get(0));
		Iterator<Integer>i=list1.iterator();
		while(i.hasNext()) {
			Integer p=i.next();
			System.out.println(p);
		}
	}
}

