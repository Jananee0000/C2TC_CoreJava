package com.tnsif.java.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MulticatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOne, numberTwo, numberThree;
		try {
			numberOne=sc.nextInt();
			numberTwo=sc.nextInt();
			numberThree=numberOne/numberTwo;
		}catch(InputMismatchException | NullPointerException ex) {
			System.err.println("Invalid input! please enter integers only " +ex.getMessage());
		}catch(Exception ex) {
			System.out.println("Exception caught"+ex.getMessage());
		}
		
		

	}

}
