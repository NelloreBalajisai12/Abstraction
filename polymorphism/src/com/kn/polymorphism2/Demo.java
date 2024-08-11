package com.kn.polymorphism2;

public class Demo {

	public static void main(String[] args) {
		SoftwareEngineer se  = new SoftwareEngineer();
		BackendEnginner be  = new BackendEnginner();
		DataBaseEngineer de  = new DataBaseEngineer();
		BackendJava bej = new BackendJava();
		BackendPython  bep  = new BackendPython();
		Demo1 dee  = new Demo1();
		dee.fainal(se);
		dee.fainal(be);
		dee.fainal(de);
		dee.fainal(bej);
		dee.fainal(bep);
		
	}

}
