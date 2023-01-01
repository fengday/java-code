package com.vacation.summer;

import java.util.Scanner;

public class IfText2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		double num3=scan.nextDouble();
		if(num1>=num2&&num2>=num3) {
			System.out.println(num1);
		}else if(num1<num2&&num2>num3)
		{
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
	}

}
