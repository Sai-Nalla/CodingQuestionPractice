package com.questions.Matrix;

public class SnakePattern {

	public static void main(String[] args) {
		int a[][]= {{6, 5, 4},
		           {1, 2, 5},
		           {8, 9, 7},
		           {4,7,1}};
		
			
		for(int row=0;row<a.length;row++) {
			if(row%2==0) {
				for(int col=0;col<a[0].length;col++) 
					System.out.print(a[row][col]);
			}
				else
					for(int col=a[0].length-1;col>=0;col--) {
						System.out.print(a[row][col]);
					}
			}
		}
	}

