package com.kn.palindrome;

public class StringPalindrome {

	public String stringPalindrome(String s1) {
		char[] crr  = s1.toCharArray();
		StringBuffer sb  = new StringBuffer();
		for(int i = crr.length-1;i>=0;i--) {
			sb = sb.append(crr[i]);
		}
		return sb.toString();
		
	}

}
