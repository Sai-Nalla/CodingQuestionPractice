package com.Patterns;

/*
*
**
***
**
*

*/
public class Pattern3 {
	public static void main(String[] args) {
		int n=3;
	/*for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=n-1;i>0;i--) {
		for(int j=i;j>0;j--)
			System.out.print("*");
		System.out.println();
	}*/
	print(3);
	}
	static void  print(int n) {
		int col=0;
		for(int row=1;row<=2*n-1;row++) {
			if(row>n) {
				col=(2*n-1)-row+1;
			}else
				col=row;
			for(int i=0;i<col;i++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
			
		
}
	
