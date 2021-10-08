package com.Patterns;

/*  3
     44
	 555
	 6666
*/
public class Pattern1 {

	public static void main(String[] args) {
		int n=3;
		int m=5;
		for(int i=1;i<m;i++) {
	     	for(int j=i;j>0;j--)
				System.out.print(n);
	     	n++;
	     	System.out.println();
		}
		
	}

}
