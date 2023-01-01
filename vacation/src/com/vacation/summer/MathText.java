package com.vacation.summer;

import java.util.Scanner;

public class MathText {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		double num1,num2;
		double num=b*b-4*a*c;
		num=Math.sqrt(num);
	if(a!=0)
	 {
		if(num>=0)
		{
			System.out.println("�˷���������");
			num1=(-b+num)*1.0/(2*a);
			num2=(-b-num)*1.0/(2*a);
			System.out.println(num1+","+num2);
	     }
		else {
			System.out.println("�˷����޸�");
		}
	 }
	else {
		System.out.println("�˷�����һ��");
		num1=-c*1.0/b;
	}
	}

}
