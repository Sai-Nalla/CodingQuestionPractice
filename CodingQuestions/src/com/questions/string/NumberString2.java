package com.questions.string;

import java.util.ArrayList;
import java.util.List;

public class NumberString2 {

	private static String[] s2;

	public static void main(String[] args) {
		String[] logs= {"30 99 signin","30 105 signout","12 100 sigin","12 80 signout"};
		int maxspan=20;
		List<Integer> al=new ArrayList<>();
		for(int i=0;i<logs.length;i=i+2) {
			String[] s1=logs[i].split(" ");
			String[] s2 =new String[s1.length];
			if(i+1<logs.length) {
			s2=logs[i+1].split(" ");
			}
			//System.out.println(s2[1]);
			int index=Integer.valueOf(s1[0]);
			//System.out.println(index);
			int i1=Integer.parseInt(s2[1]);int i2=Integer.parseInt(s1[1]);
			if(i2-i1>=maxspan)
				al.add(index);

		}
			for(int i:al)
				System.out.println(i);
		
	}

}
