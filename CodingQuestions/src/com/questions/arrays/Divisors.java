package com.questions.arrays;

public class Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		for(int i=1;i*i<=n;i++) {
			if(n%i==0)
				System.out.println(i);
		
		}
		for(int i=(int)Math.sqrt(n);i>0;i--) {
			if(n%i==0)
				System.out.println(n/i);
		}

	}

}
