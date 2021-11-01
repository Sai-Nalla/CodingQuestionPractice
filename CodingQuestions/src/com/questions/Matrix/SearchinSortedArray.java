package com.questions.Matrix;

public class SearchinSortedArray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},
		           {5,6,7,8},
		           {9,10,11,12},
		           {13,14,15,16}};
		int key=13;
		int row=0,col=a[0].length-1;
		while(true) {
			if(key>a[row][col]) {
				row++;
			}
			else if(key<a[row][col]) {
				col--;
			}
			else if(key==a[row][col]) {
				System.out.println(row+" "+col);
				break;
			}
		}

	}

}
