package com.kn.interface2;

 abstract public class Cal  implements Calculator2,Calculator1{

	@Override
	public void add() {
		System.out.println("add");
	}

	@Override
	public void subtract() {
		System.out.println("sub");
		
	}

	

}
