package com.Patterns;

public class pattern4 {
	/*
	 123
	 654
	 789
	 */

	public static void main(String[] args) {
		int n=3;
		for(int row=0;row<n;row++) {
			if(row%2==0) {
				for(int col=n*row+1;col<=n*row+n;col++)
					System.out.print(col);
			}
			else {
				for(int col=n*row+n;col>n*row;col--)
				System.out.print(col);
		}
System.out.println();
	}
		
}
	
}