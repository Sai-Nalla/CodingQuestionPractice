package com.questions.Matrix;

public class SpiralTraversal {

	public static void main(String[] args) {
		int a[][]= {{6, 3, 4},
		           {1, 2, 5},
		           {8, 9, 7},};
		int minc=0,minr=0;
		int maxc=a.length-1,maxr=a[0].length-1;
		int tcnt=a.length*a[0].length;
		int cnt=0;
while(cnt<tcnt) {
	//left wall
	for(int i=minc, j=minr;j<=maxr;j++) {
		System.out.println(a[j][i]);	
		cnt++;
	}
	minc=minc+1;
	//bottom wall
	for(int i=maxr, j=minc;j<=maxc;j++) {
		System.out.println(a[i][j]);
		cnt++;
	}
	maxr=maxr-1;
	//right wall
	for(int i=maxr, j=maxc;i>=minr;i--) {
		System.out.println(a[i][j]);
		cnt++;
	}
	maxc=maxc-1;
	//top wall
	for(int i=maxc, j=minr;i>=minc;i--) {
		System.out.println(a[j][i]);	
		cnt++;
	}
	minr=minr+1;
	}
	}
}

