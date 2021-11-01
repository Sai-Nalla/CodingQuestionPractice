package com.questions.Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * For every iteration finding the min element  index and swaping with the coresponding
		 * iteration indexx element
		 */
		int a[]= {4,2,7,5,9,1};
		int min,temp;
		for(int i=0;i<a.length-1;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) 
					min=j;
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}