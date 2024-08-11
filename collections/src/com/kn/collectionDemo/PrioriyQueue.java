package com.kn.collectionDemo;

import java.util.PriorityQueue;

public class PrioriyQueue {

	public static void main(String[] args) {
		//hetergenous data is not allowed
		PriorityQueue<Integer> pq = new   PriorityQueue<Integer>();
		pq.add(12);
		pq.add(13);
		pq.add(15);
		pq.add(14);
		pq.add(3);
		System.out.println(pq);
	}

}
