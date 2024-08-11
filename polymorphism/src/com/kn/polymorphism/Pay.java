package com.kn.polymorphism;

public class Pay extends Payment {
   public void pay(Payment p ) {
	   p.bill();p.offers();
	   p.pay();
   }
}
