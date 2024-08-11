import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
            	System.out.println("enter the string ");
                String s1=sc.next();
                System.out.println(" ente the num");
                int x=sc.nextInt();
               System.out.print(s1);
               int d = s1.length();
               for(int j = d;j<=15;j++){
                   System.out.print(" ");
               }
               if(x>=100){
                   System.out.print(x);
               }
              else if(x>=10&&x<99){
                   System.out.print("0"+x);
               }
               else if(x>=1&&x<9){
                   System.out.print("00"+x);
               }
               System.out.println();
            }
            System.out.println("================================");

    }
}




