package com.tnsif.java.collecfions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> sOne = new TreeSet();
		sOne.add(5);
		sOne.add(7);
		sOne.add(7);
		System.out.println("the values stored in a set: "+sOne);
	
		sOne.add(null);
		System.out.println("the values stored in a set: "+sOne);
		

	}

}
