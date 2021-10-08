package com.Patterns;

import javax.sound.midi.Soundbank;

public class pattern5 {
	/*
	          1
	        212
	      32123
	     4321234
	 */

	public static void main(String[] args) {
		int n=3;
		for(int row=1;row<=n;row++) {
			for(int space=row;space<n;space++) 
				System.out.print(" ");
			for(int col= row;col>0;col--)
				System.out.print(col);
			
		for(int col=2;col<=row;col++)
			System.out.print(col);
		System.out.println();
		}
	}

}
