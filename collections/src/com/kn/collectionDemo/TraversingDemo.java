package com.kn.collectionDemo;

import java.util.*;

public class TraversingDemo {

	public static void main(String[] args) {
		ArrayList<Integer> l1  = new ArrayList<Integer>();
		l1.add(15);
		l1.add(5);
		l1.add(89);
		l1.add(26);
		l1.add(29);
		l1.add(2788);
		// for lopp
		//for(int i =0;i<l1.size();i++) {
			//System.out.println(l1.get(i));
		//}
		//for each
		//for(int s:l1) {
			//System.out.println(s);
		//}
		// iterator
	//	Iterator itr = l1.iterator();
		//while(itr.hasNext()) {
		//	System.out.println(itr.next());
	//	}
		//
		ListIterator<Integer> ntr = l1.listIterator(l1.size());
		  while(ntr.hasPrevious()) {
			  System.out.println(ntr.previous());
		  }
		ArrayDeque<Integer> ad  = new ArrayDeque<Integer>();
		ad.add(15);
		ad.add(5);
		ad.add(89);
		ad.add(26);
		ad.add(29);
		ad.add(2788);
		//back traversing
		Iterator itr  = ad.descendingIterator();
		    while(itr.hasNext()) {
		    	System.out.println(itr.next());
		    }
	}

}
