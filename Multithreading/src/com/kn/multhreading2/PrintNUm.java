package com.kn.multhreading2;

public class PrintNUm  extends Thread{
	public void run() {
	for(int i =0;i<=7;i++) {
		System.out.println(i);
	}
}
}
