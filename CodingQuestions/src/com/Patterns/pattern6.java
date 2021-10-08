package com.Patterns;

public class pattern6 {
	/*
       1
     212
    32123
  	 212
  	   1
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for(int row=1;row<=2*n-1;row++) {
			int space=0;
			if(row<=n) {
				space=row;
			for(int i=space;i<n;i++)
				System.out.print(" ");
			for(int col= row;col>0;col--)
				System.out.print(col);
			
		for(int col=2;col<=row;col++)
			System.out.print(col);
		}
			else {
				space=2*n-1-row;
				for(int i=space;i<n;i++)
					System.out.print(" ");
				for(int col= 2*n-row;col>0;col--)
					System.out.print(col);
				for(int col=2;col<=2*n-row;col++)
					System.out.print(col);
			}
			System.out.println();
			}
		}

	}

