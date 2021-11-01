package com.questions.arrays;

public class ReverseGroupofArray {

	public static void main(String[] args) {
		int a[]= {1,5,7,3,9};
		int n=a.length;
		int k=3;
		for(int i=0;i<a.length;i=i+k) {
		
			a=reverse(a,i,Math.min(i+k-1,n- 1));
		}
		for(int i:a)
			System.out.println(i);
	}
	static int [] reverse(int a[],int n,int m) {
		int temp;
		while(n<m) {
			temp=a[n];
			a[n]=a[m];
			a[m]=temp;
			n++;
			m--;
		
	}
		return a;
	}

}
