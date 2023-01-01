package com.vacation.summer;

import java.util.Scanner;

public class IfText3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int ran=(int)(Math.random()*90+10);
	
	int num=scan.nextInt();System.out.println(ran );
	if(ran==num) {
		System.out.println("10000");
	}else if(ran%10==num/10&&ran/10==num%10) {
		System.out.println("5000");
	}
	else if((ran%10==num%10)||(ran/10==num/10)) {
		System.out.println("2000");
	}else if((ran/10==num%10)||(ran%10==num/10)) {
		System.out.println("1000");
	}else
		System.out.println("0");
}
}
