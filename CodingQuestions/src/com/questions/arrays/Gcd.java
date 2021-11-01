package com.questions.arrays;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=10;
		
		/*for(int i=1;i<=Math.min(a, b);i++) {
			if(a%i==0&&b%i==0)
				System.out.println(i);*/
		System.out.println(gcd(a,b));		
		}
	static int gcd(int a,int b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);

	}

}
