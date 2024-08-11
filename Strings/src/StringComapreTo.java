
public class StringComapreTo {

	public static void main(String[] args) {
		String s1  = "rama";
		String s2  = "sita";
		System.out.println(s1.compareTo(s2));
		System.out.println(" it will return intger value  by comparing its dictionary ranking");
		if(s1.compareTo(s2)>0) {
			System.out.println("rama");
			System.out.println("sita");
		}
		else if(s1.compareTo(s2)<0) {
			System.out.println("sita");
			System.out.println("rama");
		}
		else {
			System.out.println("equal");
		}
	}

}
