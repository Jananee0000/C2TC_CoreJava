package com.tnsif.java.arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get the array
		int[] arr= {13,56,12,67,1};
		
		//print array elements in one line
		System.out.println("Array elements before sorting: "+ Arrays.toString(arr));
		
		//sort the array
		Arrays.sort(arr);
		
		//print array elements in one line
		System.out.println("Array elements after sorting: "+ Arrays.toString(arr));
		
		int key =12;
		System.out.println(key + " is found at the index "   +  Arrays.binarySearch(arr,key));
			
		int[] arrOne= {2,56,3,1,67};
		if(arr.equals(arrOne)) {
			System.out.println("Both arrays are equal");
		}else {
			System.out.println("Both arrays have different elements");
		}
	}

}
