
public class Average {

	public static void main(String[] args) {
		String s = "2/8:11,22,33,44,55,66,77,88#5:77,77,88,99,99#@";
		String[] crr = s.split("/");
		int n = Integer.parseInt(crr[0]);
		String brr[] = crr[1].split("#");
		for(int i =0;i<n;i++) {
			int sum =0;
		String frr[]=brr[i].split(":");
		   int m = Integer.parseInt(frr[0]);
		   String vi[] = frr[1].split(",");
		   for(int j =0;j<m;j++) {
			   int v =Integer.parseInt(vi[j]);
			   sum =sum+v;
		   }
		   int avg = sum/m;
		   System.out.println("c"+(i+1)+" ="+avg);
		}
		
		
	}

}
