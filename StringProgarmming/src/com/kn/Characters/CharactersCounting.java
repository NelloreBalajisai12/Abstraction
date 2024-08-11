package com.kn.Characters;

public class CharactersCounting {

	public void charcterfinding(String s) {
		char[] srr = s.toCharArray();
		int vowel = 0;
		int cons = 0;
		int num = 0;
		int spcchar = 0;
		for(int i = 0;i<=srr.length-1;i++) {
			if(srr[i] == 'a'|| srr[i] == 'e' || srr[i] == 'o'|| srr[i] == 'i'|| srr[i] == 'u') {
				vowel++;
			}
			else if(srr[i] == '0'|| srr[i] == '1' || srr[i] == '2'|| srr[i] == '3'|| srr[i] == '4'|| srr[i] == '5'|| srr[i] == '6'|| srr[i] == '7'|| srr[i] == '8'|| srr[i] == '9') {
				num++;
			}
			else if(srr[i] == '~'|| srr[i] == '!' || srr[i] == '@'|| srr[i] == '$'|| srr[i] == '%'|| srr[i] == '^'|| srr[i] == '&'|| srr[i] == '*'|| srr[i] == '('|| srr[i] == ')'|| srr[i] == ' ') {
				spcchar++;
			}
			else {
				cons++;
			}
			
			
		}
		System.out.println(vowel);
		System.out.println(cons);
		System.out.println(num);
		System.out.println(spcchar);
 	}

}
