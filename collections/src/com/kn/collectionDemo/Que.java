package com.kn.collectionDemo;

import java.util.ArrayDeque;

public class Que {

	public static void main(String[] args) {
		ArrayDeque ad  = new ArrayDeque();
		ad.add(1);
		ad.addFirst(12);
		ad.addLast(45);
		System.out.println(ad);
	//	ad.get(4); get method is not present in array deque
	}

}
