package com.kn.multhreading2;

public class Demo {

	public static void main(String[] args) {
		PrintNUm t1  = new PrintNUm();
		t1.start();
		Alpha t2  = new Alpha();
		t2.start();
	}

}
