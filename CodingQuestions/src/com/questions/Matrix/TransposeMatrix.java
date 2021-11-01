package com.questions.Matrix;

public class TransposeMatrix {

	public static void main(String[] args) {
		int a[][]= {{6, 3, 4},
		           {1, 2, 5},
		           {8, 9, 7},};
		for(int row=0;row<a.length;row++) {
			for(int col=row;col<a.length;col++) {
				int temp=a[row][col];
				a[row][col]=a[col][row];
				a[col][row]=temp;
			}
		}
			for(int row=0;row<a.length;row++) {
				for(int col=0;col<a.length;col++) {
					System.out.print(a[row][col]);
				}
				System.out.println();
		}

	}

}
