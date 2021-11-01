package com.questions.Matrix;

public class ShellRotate {

	public static void main(String[] args) {
		int a[][]= {
		           {1, 2, 3,4,5,6},
		           {7,8,9,10,11,12},
		           {13,14,15,16,17,18},
		           {19,20,21,22,23,24}};
		int r=1;
		int minc=r-1,minr=r-1,maxc=a[0].length-r,maxr=a.length-r;
		//left
		
		for(int k=0;k<2;k++) {
			int temp1=a[minr][minc];
			int temp2=a[minr][minc];
		for(int i=minc,j=minr;j<maxr;j++) {
			temp1=a[j][i];
			a[j][i]=temp2;
					temp2=temp1;
		}
		//bottom
		for(int i=maxr,j=minc;j<maxc;j++) {
			temp1=a[i][j];
			a[i][j]=temp2;
					temp2=temp1;
		}
		//right
		for(int i=maxr,j=maxc;i>minr;i--) {
			temp1=a[i][j];
			a[i][j]=temp2;
					temp2=temp1;
		}
	
		//right
				for(int i=minr,j=maxc;j>=minc;j--) {
					temp1=a[i][j];
					a[i][j]=temp2;
							temp2=temp1;
				}
		}
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[0].length;j++)
						System.out.print(a[i][j]+" ");
					System.out.println();
				}
	}

}
