package com.questions.Matrix;

public class SumofUpprAndLowr {

	public static void main(String[] args) {
		int a[][]= {{6, 5, 4},
		           {1, 2, 5},
		           {7, 9, 7}};
		int sum=0;
		for(int row=0;row<3;row++) {
			for(int col=row;col<3;col++) {
				sum+=a[row][col];
			}
		}
			for(int col=0;col<3;col++) {
				for(int row=col;row<3;row++) {
					sum+=a[row][col];
				}
		}
			System.out.println(sum);
		

	}

}
