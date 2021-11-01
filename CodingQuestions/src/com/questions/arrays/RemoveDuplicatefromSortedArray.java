package com.questions.arrays;

public class RemoveDuplicatefromSortedArray {

	public static void main(String[] args) {
		int a[]= {1,1,2,2,3,3,4};
		int res=1;
		for(int i=1;i<a.length;i++) {
			if(a[res-1]!=a[i]) {
				a[res]=a[i];
				res++;
			}
		}
		for(int i=0;i<res;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
