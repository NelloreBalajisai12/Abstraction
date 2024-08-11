package com.kn.reverseString;

public class ReverseString {


	public String reversingmethod(String reverseString) {
		char[] crr = reverseString.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = crr.length-1;i>=0;i--) {
			sb = sb.append(crr[i]);
		}
		return sb.toString();
	}

}
