package com.questions.Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,2,7,5,9,1};
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[j]<a[j-1]) {
					 temp=a[j];
					 a[j]=a[j-1];
					 a[j-1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
