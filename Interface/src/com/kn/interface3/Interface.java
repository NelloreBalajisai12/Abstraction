package com.kn.interface3;

public interface Interface {
	public abstract void m1();
	public static void m2() {
		System.out.println(" static ");
	}
	default void d() {
		
	}

}
