package com.questions.arrays;

public class ProductNumber {
	public static void main(String[] args) {
		int a=8;
		int max_res=0;
		for(int i=2;i<a/2;i++) {
			int n=a;
			int  res=1;
			int j=i;
			while(n>0) {	
				if(n%j==0) {
					n=n-j;
					res*=j;
				}
				else 
					j++;
			}
			Math.max(max_res, res);
		}
		
		
	}

}
