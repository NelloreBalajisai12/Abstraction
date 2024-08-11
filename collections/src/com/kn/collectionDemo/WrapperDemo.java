package com.kn.collectionDemo;

import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[] args) {
		Integer i  = new Integer(10);
		ArrayList li = new ArrayList();
		li.add(10);  // it is coverted to wrapper class by add (new Integer(10)
		li.get(0); //(int)li(get(0)
	}
	

}
