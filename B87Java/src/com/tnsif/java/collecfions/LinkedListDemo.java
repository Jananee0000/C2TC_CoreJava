package com.tnsif.java.collecfions;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li = new LinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println("number in the list are: "+li);
		li.add(1,15);
		System.out.println("number in the list are: "+li);
		 li.addFirst(5);
		li.addLast(35);
		System.out.println("number in the list are: "+li);
		System.out.println("element in the first index: "+ li.getFirst());
		System.out.println("element in the last index: "+ li.getLast());
		
		li.removeFirst();
		li.removeLast();
		System.out.println("number in the list are: "+li);
		

	}

}
