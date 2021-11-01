
package com.questions.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class a {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s="acffD";
	ArrayList<Character> al=new ArrayList<Character>();
	char[] ch=s.toCharArray();
	for(int i=0;i<s.length();i++) {
	al.add(ch[i]);
}
	for(int i=1;i<s.length();i++) {
	//	System.out.println(al.get(i)+" "+al.get(i-1)+" "+i);
		if(al.get(i-1)!=al.get(i))
				System.out.println(al.get(i));
	}
}
}
