package com.kn.Objects;

import java.util.Scanner;

public class Studentdemo {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter no.of objects need to be created=");
		int obj  = scan.nextInt();
		Student[] srr = new Student[obj];
		for(int i =0;i<=srr.length-1;i++) {
			int id = scan.nextInt();
			String name  = scan.next();
			 int marks = scan.nextInt();
			 Student s  =new Student(id,name,marks);
			 srr[i] = s;
		}
		//for(Student s :srr) {			
		//System.out.println(s.id+" "+s.name+" "+s.marks);
		
		//}
	///	for(Student s : srr) {		
		//if( s.marks<35) {
		//	s.marks  = 35;
		//	System.out.println(s.id);
		//	System.out.println(s.name);
		//	System.out.println(s.marks);
		//}
			
		//}
		for(int i=0;i<srr.length;i++) {
			for(int j = i+1;j<=srr.length-1;j++) {
				if(s.marks[i]>s.marks[j]) {
					
				}
			}
		}
	}
	

}
