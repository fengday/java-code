package com.vacation.summer;

import java.util.Scanner;

public class ArrayText2 {
	public static void main(String[] args) {
		int arr[]= {12,43,65,87,89,98,123,435,567};
		Scanner scan=new Scanner(System.in);
		int dest=scan.nextInt();
		boolean isflag=true;
		int head=0;
		int end=arr.length-1;
		while(head<=end)
		{
			int middle=(head+end)/2;
			if(arr[middle]==dest)
			{
				System.out.println("找到"+middle);
				isflag=false;
				break;
			}else if(arr[middle]>dest)
			{
				end=middle-1;
			}else {
				head=middle+1;
			}
		}
		if(isflag==true)
		{
			System.out.println("未找到");
		}
	}

}
