package com.kn.ReveseEachString;

public class ReveseString {

	public void ReverseWords(String s) {
		String[] srr  = s.split(" ");
		for(int i = 0;i<=srr.length-1;i++) {
			  String a = srr[i];
			  wordReverse(a);
			  System.out.print(" ");
		}
	}

	private void wordReverse(String a) {
		for(int j = a.length()-1;j>=0;j--) {
			  char[] crr  = a.toCharArray();
			  System.out.print(crr[j]);
		  }
	}

}
