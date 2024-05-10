//Program to demonstrate arraylist class
package com.tnsif.java.collecfions;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> list= new ArrayList();
		list.add(1);
		list.add("Rahul");
		list.add(9923412345l);
		list.add(71.5);
		System.out.println("Details of the list: "+list);
		list.add("bangalore");
		System.out.println("details of the list: "+list);
		list.add("bangalore");
		System.out.println("details of the list: "+list);
		list.add(null);
		System.out.println("details of the list: "+list);

	}

}
