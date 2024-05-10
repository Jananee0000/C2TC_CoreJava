package com.tnsif.java.exceptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//try {
			int d = 0;
			int a= 42/d;
		//}finally {
			System.out.println("finally block will execute irrespective of an exception");
		//}
		System.out.println("will not be printed");

	}

}
