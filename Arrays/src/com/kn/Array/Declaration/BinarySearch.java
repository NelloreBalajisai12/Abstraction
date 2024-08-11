package com.kn.Array.Declaration;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int[] arr = new int[]{10,11,12,13,14,15,12};
		System.out.println("enter the element to search");
	  int ele = scan.nextInt();
	  int low =0;
	  int high = arr.length -1;
	  binarysearch(low,high,ele,arr); 
		
	}

	 static void binarysearch(int low, int high, int ele,int[] arr) {
		 int mid;
		  boolean isboolean  =  false;
		  int position  =-1;
		  while(low<=high) {
			mid  = (low+high)/2;
			if(ele  == arr[mid]) {
				isboolean = true;
				position = mid+1;
				break;
			}
			else if(ele>arr[mid]) {
				low = mid+1;
				high = high;
			}
			else {
				high =  mid -1;
				low = low;
			}
			
		 }
		  if(isboolean == false ) {
			  System.out.println("element not found");
		  }
		  else {
			  System.out.println("element found at "+position);
		  }
	} 

}
