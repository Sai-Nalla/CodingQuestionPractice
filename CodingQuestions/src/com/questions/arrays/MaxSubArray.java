package com.questions.arrays;

public class MaxSubArray {

	public static void main(String[] args) {
		int a[]= {-2,1,-3,4,-1,2,1,-5,4};
		int maxsum=0,sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				sum=0;
				for(int k=i;k<=j;k++) {
					sum+=a[k];
				}
				maxsum=Math.max(maxsum, sum);
			}
		}
		System.out.println(maxsum);

	}

}
