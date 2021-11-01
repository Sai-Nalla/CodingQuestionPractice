package com.questions.Matrix;

public class DiagonalTraversal {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},
		           {5,6,7,8},
		           {9,10,11,12},
		           {13,14,15,16}};
		//col travesing
		for(int col=0;col<a.length;col++) {
			//row increment and col increment
			for(int row=0,col2=col;row<a.length &&col2<a.length;row++) {
				System.out.println(a[row][col2++]);
			}
		}

	}

}
