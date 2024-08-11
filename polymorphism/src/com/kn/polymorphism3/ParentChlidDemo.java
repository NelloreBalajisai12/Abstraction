package com.kn.polymorphism3;

public class ParentChlidDemo {

	public static void main(String[] args) {
		Parent p1  = new Parent();
		p1.display();
		Child c  = new Child();
		c.display();
		Parent p2 = new Child();
		p2.display();
	}
	}


