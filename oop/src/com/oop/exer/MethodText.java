package com.oop.exer;

public class MethodText {
    public static void main(String[] args) {
	MethodText m1=new MethodText();
	
	System.out.println(m1.method(4,5));
}
//    public double method() {
//    	int i;
//    	int j = 0;
//    	for( i=0;i<10;i++)
//    	{
//    		for( j=0;j<8;j++) {
//    			System.out.print("* ");
//    		}
//    		System.out.println();
//    	}
//    	return i*j;
//    }
    public double method(int m,int n) {

    	for(int i=0;i<m;i++)
    	{
    		for(int j=0;j<n;j++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    	return m*n;
    }
}

