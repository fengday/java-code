package com.vacation.summer;

import java.util.Scanner;

public class IfText {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		if(score==100)
			System.out.println("BMW");
		else if(score>80&&score<=99)
			System.out.println("iphone xs max");
		else if(score>=60&&score<=80)
			System.out.println("ipad");
		else
			System.out.println("null");
		
	}

}
