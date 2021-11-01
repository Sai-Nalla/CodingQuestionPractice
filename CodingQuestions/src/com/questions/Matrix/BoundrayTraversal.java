package com.questions.Matrix;

public class BoundrayTraversal {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},
		           {5,6,7,8},
		           {9,10,11,12},
		           {13,14,15,16}};
		int minc=0,minr=0;
		int maxc=a.length-1,maxr=a.length-1;
		//top
		for(int i=minc,j=minr;i<=maxc;i++) {
			System.out.print(a[j][i]);
		}
		minr=minr+1;
		//right
		for(int i=minr,j=maxc;i<maxr;i++) {
			System.out.print(a[i][j]);
		}
		maxc--;
		//bottom
		for(int i=maxr,j=maxc;j>=minc;j--) {
			System.out.print(a[i][j]);
		}
		maxr--;
		//left
		for(int i=maxr,j=minc;i>=minr;i--) {
			System.out.print(a[i][j]);
		}
	}

}
