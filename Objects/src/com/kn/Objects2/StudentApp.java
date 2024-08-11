package com.kn.Objects2;

import java.util.Scanner;

public class StudentApp {

	public static Student[] Objectcreation(int n) {
		Scanner scan  = new Scanner(System.in);
		Student[] s = new Student[n];
		for(int i =0;i<=s.length-1;i++) {
		System.out.println("enter the"+(i+1)+" id = ");
		  int id  = scan.nextInt();
		  System.out.println("enter the"+(i+1)+" name = ");
		  String name  = scan.next();
		  System.out.println("enter the"+(i+1)+" marks = ");
		  int marks  = scan.nextInt();
		  s[i] =  new Student(id,name,marks);
		}
		return s;
	}

	public static Student[] DescendingOrder(Student[] srr) {
		Student[] desc = new Student[srr.length-1];
		   for(int i =0;i<=desc.length-1;i++) {
			   for(int j =i+1;j<=desc.length-1;j++) {
				   if((desc[i].name).compareTo(desc[j].name)>0) {
					      Student temp ;
					     temp = desc[i];
					     desc [i]= desc[j];
					     desc[j]= temp;
				   }
			   }
		   }
		return desc;
	}

}
