import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		String s3 = scan.next();
		String s1 = "Nellore Balaji Sai REddy";
		String s2  =  "Nellore Balaji Sai Reddy";
	
		// string equals
		if(s1.equals(s2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("unequal");
		}
		
		// ignoring case
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("ignoring case");
		}
		else {
				System.out.println("not ignoring");
		}
		//upper case
        System.out.println(s1.toUpperCase());
        //lower case
        System.out.println(s1.toLowerCase());
        //character at the index
        System.out.println(s1.charAt(3));
        // first occurence index of a partiular character
        System.out.println(s1.indexOf('a'));
        // last occurence of character
        System.out.println(s1.lastIndexOf('a'));
        // sub string
        System.out.println(s1.substring(5));
        //sub string start and end point
        System.out.println(s1.substring(5,10));
        // contains
        System.out.println(s1.contains("Sai"));
        // length of string
        System.out.println(s1.length());
        // string starting leeter 
        System.out.println(s1.startsWith("Balaji"));
        //string ending letter
        System.out.println(s1.endsWith("REddy"));
        // string replace
        System.out.println(s1.replace("Balaji", "king"));
        // replace all
        System.out.println(s1.replaceAll("a","c"));
        // split
        String [] srr  = s1.split(" ");
        for(int i = srr.length-1;i>=0;i--) {
        System.out.print(srr[i]+" ");
        }
        // trim removes trailing and leading spaces 
        System.out.println();
        
        System.out.println(s1.trim());
	}

}
