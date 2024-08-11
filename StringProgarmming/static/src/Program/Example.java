package Program;

public class Example {
	// static variables
	static  int  x ,y;
	//static block
	static {
		System.out.println("static block");
		x =20;
		y = 45;
	}
	//Static method
	public static void display1() {
		System.out.println(" static method called");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	// instance variable
	int a, b;
	//instance block
	{
		System.out.println("instance block ");
		 a = 300;
		 b = 500;
		 x = 90;
		 y=8;
	}
	//instance method
	public  void display2() {
		System.out.println(" instance method called");
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	public Example() {
		System.out.println("constructor called");
	}
	

}
