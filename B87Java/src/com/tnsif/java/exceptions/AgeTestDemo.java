package com.tnsif.java.exceptions;

import java.util.Scanner;

public class AgeTestDemo {
	
	static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Invalid age, you are not eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("enter your age");
		age=sc.nextInt();
		try {
			validate(age);
		}catch(InvalidAgeException ex) {
			System.err.println("exception is caught!!"+ ex.getMessage());
		}
		

	}

}
