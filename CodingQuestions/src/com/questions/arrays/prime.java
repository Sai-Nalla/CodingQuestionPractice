package com.questions.arrays;

public class prime {
	/*tatic boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;	
		}
		return true;
	}*/
	static boolean isPrime(int n) {
		if(n==1||n==2||n==3)
			return false;
		if(n%2==0||n%3==0)
			return false;
		for(int i=5;i*i<=n;i=i+6) {
			if(n%i==0||n%(i+2)==0)
				return false;
		}
		return true;
	}
 public static void main(String[] args) {
	 int n=21;
	System.out.println(isPrime(n));
}
}
