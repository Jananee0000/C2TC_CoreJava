package com.tnsif.multithreading;

public class ChildThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread tOne = new ChildThread(5,"Hello world");
		
		tOne.start();
		
		ChildThread tTwo = new ChildThread(10,"Hello world java");
		
		tTwo.start();
	}

}
