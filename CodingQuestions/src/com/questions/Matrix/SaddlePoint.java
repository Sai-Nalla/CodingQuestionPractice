package com.questions.Matrix;

public class SaddlePoint {

	public static void main(String[] args) {
		int a[][]= {{4,2,1,3},
		           {6,7,8,5},
		           {9,10,11,1},
		           {14,13,15,16}};
		//finding mincol in arow
		int scol=0;
		for(int row=0;row<a.length;row++) {
			for(int col=1;col<a[0].length;col++) {
				if(a[row][scol]>a[row][col])
					scol=col;
			}
			
			//finding max in the particular column
			boolean flag=true;
			for(int i=0;i<a[0].length;i++) {
				if(a[i][scol]>a[row][scol]) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println(a[row][scol]);
		}
		
		}
		
			}

}
