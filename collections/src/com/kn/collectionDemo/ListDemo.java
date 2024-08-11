package com.kn.collectionDemo;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		 ArrayList l1  = new ArrayList();
		 l1.add(1);
		 l1.add(1.1);
		 l1.add("lis");
		 l1.add('l');
		 l1.add(20);
		 l1.add(14);
		 ArrayList l11  = new ArrayList();
		 l11.add(13);
		 l11.add(90);
		 l11.add(900);
		// l11.add(4,78);
		 l11.add(14);
		// System.out.println(l1.get(2));
	//	 System.out.println(l1.indexOf(14));
	//	 System.out.println(l1.lastIndexOf(12));
	//	 System.out.println(l1);
		// System.out.println(l1.size());
		 l11.addAll(l1);
		 l11.addAll(2,l1);
		 System.out.println(l1);
		 System.out.println(l11);
		 
	}

}
