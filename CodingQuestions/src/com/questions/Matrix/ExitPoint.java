package com.questions.Matrix;

public class ExitPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{0,0,1,0},
		           {1, 0,0,0},
		           {0,0,0,0},
		           {1,0,1,0}};
		int i=0,j=0;
		int dir=0;
		while(true) {
			dir=(dir+a[i][j])%4;
			//west
			if(dir==0) 
				j++;
			else if(dir==1)
				i++;
			else if(dir==2)
				j--;
			else if(dir==3)
				i--;
			if(i<0) {
				i=i+1;
				break;
			}
			if(i>a.length-1) {
				i=i-1;
				break;
			}
			if(j<0) {
				j=j+1;
				break;
			}
			if(j>a.length-1) {
			j=j-1;
				break;
			}
		}
			
System.out.println(i+" "+j+" "+a[i][j]);
	}
	}
