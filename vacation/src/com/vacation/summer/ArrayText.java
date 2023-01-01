package com.vacation.summer;

public class ArrayText {
	public static void main(String[] args) {
		String []name=new String[4];//动态初始化
		name[0]="小明";
		name[1]="王五";
		
		int age[];
		age=new int[4];
		age[0]=24;
		age[2]=23;
		
		int []arr=new int[] {2,4,5};//静态初始化
		
		int[]ar= {4,8,6};
		String sex[]= {"李强","王五"};
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
	}

}
