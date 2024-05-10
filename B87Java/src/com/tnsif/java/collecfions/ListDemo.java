package com.tnsif.java.collecfions;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> li = new ArrayList<>();
		Student sOne = new Student(123,"Rahul",90.5f);
		li.add(sOne);
		sOne=new Student(111,"Ravi",95.4f);
		li.add(sOne);
		sOne= new Student(134,"kumar",76.3f);
		li.add(sOne);
		System.out.println("details of the student: "+li);
		

	}

}
