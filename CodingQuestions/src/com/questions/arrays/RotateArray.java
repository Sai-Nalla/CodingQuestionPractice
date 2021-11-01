package com.questions.arrays;

public class RotateArray {

	public static void main(String[] args) {
	
		int a[]= {1,5,7,3,9,2};
		int n=a.length-1;
		int r=2;
		//rverse the array till lenght-r
		a=reverse(a,0,n-r);
		a=reverse(a,n-r+1,n);
		a=reverse(a,0,n);
		for(int i:a)
			System.out.println(i);
	}
	static int[] reverse(int a[],int r,int n) {
		int temp;
		int k=r;
		while(r<=n) {
			//swap
			temp=a[r];
			a[r]=a[n];
			a[n]=temp;
			r++;
			n--;
		}
		return a;
	}

}
