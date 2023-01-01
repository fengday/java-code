package com.oop.exer;

public class ExerText {
	public static void main(String[] args) {
		int a=10;
		int b=10;
		ExerText e=new ExerText();
		e.method(a,b);
		System.out.println(a);
		System.out.println(b);
	}

	private  void method(int a, int b) {
		// TODO Auto-generated method stub
		a=a*10;
		b=b*20;
		System.out.println(a);
		System.out.println(b);
		System.exit(0);
		
	}

}
