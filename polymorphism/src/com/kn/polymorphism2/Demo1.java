package com.kn.polymorphism2;

public class Demo1  {
	public void fainal(SoftwareEngineer  se) {
		se.Attendmetting();
		se.WriteTestCase();
		if(se instanceof BackendEnginner) {
		((BackendEnginner)(se)).Doproject();
		}
		else if(se instanceof DataBaseEngineer ) {
			((DataBaseEngineer )(se)).Doproject();
			((DataBaseEngineer )(se)).teamSql();
			
			}
		else if(se instanceof BackendJava ) {
			((BackendJava )(se)).teamjava();
			
			}
		else if(se instanceof BackendPython ) {
			((BackendPython )(se)).learnpython();
			
			}
	}

}
