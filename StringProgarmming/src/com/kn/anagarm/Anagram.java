package com.kn.anagarm;

public class Anagram {
	public static boolean IsAnagram(String a, String b) {
		boolean isanagram = false;
		if(a.length() == b.length()) {
			char[] crr = a.toCharArray();
			for(int i=0;i<=crr.length-1;i++) 
				for(int j = i+1;j<=crr.length-1-i;j++) {
					if(crr[i]>crr[j]) {
						char temp = crr[i];
						crr[i]=crr[j];
						crr[j] = temp;
					}
				}
			System.out.println(crr);
		
				char[] drr = b.toCharArray();
			     for(int i =0;i<=drr.length-1;i++) {
			    	 for(int j = i+1;j<=drr.length-1;j++) {
						if(drr[i]>drr[j]) {
							char temp = drr[i];
							drr[i]=drr[j];
							drr[j] = temp;
						}

			    	 
			     }
			}
			     System.out.println(drr);
			     for(int i=0;i<=crr.length-1;i++) {
			    	 if(crr[i]!=drr[i]) {
			    		 isanagram = false;
			    		 break;
			    	 }
			    	 else {
			    		 isanagram = true;
			    	 }
			     }
		}
		else {
			isanagram = false;
		}
		return isanagram;
	}

}
