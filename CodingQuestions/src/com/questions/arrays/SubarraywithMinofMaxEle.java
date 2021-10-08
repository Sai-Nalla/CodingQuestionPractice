package com.questions.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubarraywithMinofMaxEle {
	public static void main(String[] args) {
		
	
	int a[]= {8,2,4,6};
	int k=2;
	int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
	List<Integer> al=new ArrayList<>();
	for(int i=0;i<a.length-k+1;i++) {
		min=Integer.MAX_VALUE;
		for(int j=i;j<k+i;j++) {
			min=Math.min(min, a[j]);
		}
		al.add(min);
	}
	for(int i:al) {
	max=Math.max(max,i);
	}
	System.out.println(max);
	}
	
}
