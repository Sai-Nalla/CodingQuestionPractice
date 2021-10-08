package com.questions.string;

public class number {
	public static void main(String[] args) {
		String s="ab2c45bg7";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
			if(Character.isDigit(c[i]))
				System.out.println(c[i]);
		s=s.replaceAll("\\D"," ");
		s=s.trim();
		s=s.replaceAll("\\s+", " ");
		System.out.println(s);
		String[] ch=s.split(" ");
		int sum=1;
		for(String s1:ch) {
		sum*=Integer.parseInt(s1);
		}
		System.out.println(sum);
	}
	
}
