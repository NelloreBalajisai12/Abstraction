package com.kn.abstraction2;

 abstract public class Program {
	// static variable
      static int i =10;
     //instance variable
      int j =20;
      //
      static {
    	  System.out.println(" static block");
      }
      {
    	  System.out.println("instance block");
      }
      
      public static void m1() {
    	  System.out.println(" static method ");
    	  
      }
      public void m2() {
    	  System.out.println(" concrete instance class");
      }
      public abstract void m3();
      final public void m4() {
    	  System.out.println("final method");
      }
      public Program() {
    	  System.out.println("parent class constructorr");
      }
      
}
