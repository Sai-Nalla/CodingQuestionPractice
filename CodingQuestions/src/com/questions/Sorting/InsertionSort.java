package com.questions.Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		/*
		 * In this we will compare the value with its previous index valuse and if it is
		 * lesser then we will swap with that index
		 */
		int a[]= {4,2,7,5,9,1};
		int key,temp;
		for(int i=1;i<a.length;i++) {
			key=a[i];
			int j=i-1;
			while(j>=0&&a[j]>key) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
