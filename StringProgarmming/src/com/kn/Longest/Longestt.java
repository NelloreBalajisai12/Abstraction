package com.kn.Longest;

public class Longestt{
	
	public String longestword(String s,String f) {
		String[] crr = s.split(" ");
		int j =0;
		for(int i = 0;i<=crr.length-1;i++) {
			int lenht = crr[i].length();
		 if(lenht>j) {
			 j = lenht;
			  f  = crr[i];
			 
		 }
		 else if (lenht<j) {
			 j = j;
			 
		 }
			
		}
		return f;
		
	}

}
