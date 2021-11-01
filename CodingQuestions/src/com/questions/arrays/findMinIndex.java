package com.questions.arrays;

public class findMinIndex {

	public static void main(String[] args) {
		
		int a[]= {7,5,1,2,9};
		int mini=0;
		for(int i=1;i<a.length;i++) {
			if(a[mini]>a[i])
				mini=i;
		}
		System.out.println(mini+" "+a[mini]);
	}

}
