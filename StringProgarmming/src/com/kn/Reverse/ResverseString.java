package com.kn.Reverse;

public class ResverseString {

	public void reveseString(String s) {
		String[] crr = s.split(" ");
		for(int i = crr.length-1;i>=0;i--) {
			System.out.print(crr[i] + " ");
		}
	}

}
