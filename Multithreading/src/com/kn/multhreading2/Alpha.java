package com.kn.multhreading2;

public class Alpha  extends Thread{
	public void run() {
		for(int i =65;i<=74;i++) {
			System.out.println((char)i);
		}
	}

}
