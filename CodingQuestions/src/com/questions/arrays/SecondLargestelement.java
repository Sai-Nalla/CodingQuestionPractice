package com.questions.arrays;

public class SecondLargestelement {

	public static void main(String[] args) {
	int a[]= {5,7,6,3,2};
	int max=a[0],sec_max=a[0];
	int prev_max=-1;
	if(a[1]<a[0]){
		sec_max=a[1];
	}
	for(int i=1;i<a.length;i++) {
	 prev_max=max;
		max=Math.max(max, a[i]);
		if(max!=a[i]) {
			sec_max=Math.max(sec_max, a[i]);
		}
		else if(max==a[i]) {
			sec_max=Math.max(sec_max,prev_max);
		}	
	}
	System.out.println(sec_max);

	}

}
