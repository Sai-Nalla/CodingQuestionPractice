package com.questions.string;

public class SmallToBigConversion {
	public static void main(String[] args) {
		String s="mjnAGT";
		for(int i=0;i<s.length();i++) {
			if((int)s.charAt(i)>=97)
				s=s.replace(s.charAt(i), (char)(s.charAt(i)-32));
			else
				s=s.replace(s.charAt(i), (char)(s.charAt(i)+32));
			
		
		}
	
		System.out.println(s);
	}

}
