package com.questions.Matrix;

public class RotateBy90 {

	public static void main(String[] args) {
		int a[][]= {{6, 3, 4},
		           {1, 2, 5},
		           {8, 9, 7},};
		int temp=0;
		//transpose
		for(int row=0;row<a.length;row++) {
			for(int col=row;col<a.length;col++) {
			 temp=a[row][col];
				a[row][col]=a[col][row];
				a[col][row]=temp;
			}
		}
		//reverse row by row
		for(int row=0;row<a.length;row++) {
			for(int col=0,col2=a.length-1;col<a.length/2;col++) {
			temp=a[row][col];
				a[row][col]=a[row][col2];
				a[row][col2]=temp;
				col2--;
			}
		}
		//Display
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a.length;col++) {
				System.out.print(a[row][col]);
			}
			System.out.println();
	}

	}

}
