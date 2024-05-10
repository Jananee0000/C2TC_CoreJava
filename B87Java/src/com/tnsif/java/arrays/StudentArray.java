package com.tnsif.java.arrays;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring an array of student
		Student[] studArray;
		//allocating memory for 5 students
		studArray = new Student[5];
		
		studArray[0]=new Student(1,"Rahul");
		studArray[1]=new Student(2,"Ravi");
		studArray[2]=new Student(3,"Ramya");
		studArray[3]=new Student(4,"Rohith");
		studArray[4]=new Student(5,"Ravin");
		
		//access these student data
		for(int i=0; i<studArray.length;i++) {
			System.out.println(studArray[i].getRollNo()+ " " +studArray[i].getName());
		}
	}

}
