package com.Patterns;

/*
1
23
456
78910
*/
public class Pattern2 {
	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(n++);
			}
			System.out.println();
		}	
	}
}
