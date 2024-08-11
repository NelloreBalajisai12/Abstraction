import java.util.Scanner;

public class RomanCOnversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuffer roman = new StringBuffer();
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		int[] arr = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] srr = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		for(int i =0;i<=arr.length-1;i++) {
			while(num>=arr[i]) {
				num = num-arr[i];
				roman.append(srr[i]);
			}
		}
		System.out.println(roman);
	}

}
