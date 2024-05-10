package com.tnsif.java.collecfions;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(2);
		ad.add(3);
		ad.add(4);
		ad.add(5);
		ad.add(6);
		
		System.out.println("elements in the ADQ: " +ad);
		System.out.println("peek element from ADQ: "+ad.peek());
		System.out.println("elements in the ADQ: " +ad);
		System.out.println("poll element from ADQ: "+ad.poll());
		System.out.println("elements in the ADQ: " +ad);
		System.out.println(" element from ADQ: "+ad.element());
		System.out.println("remove element from ADQ: "+ad.remove());
		System.out.println("elements in the ADQ: " +ad);
		

	}

}
