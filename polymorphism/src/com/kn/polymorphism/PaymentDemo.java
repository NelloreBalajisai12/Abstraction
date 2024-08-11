package com.kn.polymorphism;
public class PaymentDemo {

	public static void main(String[] args) {
		 Payment  p =  new Payment();
		  Upi u = new Upi();
		  Cash c = new Cash();
		  Card ca= new Card();
		  Pay pa = new Pay();
		  pa.pay(u);
		  pa.pay(c);
		  pa.pay(ca);
		  

}
}
