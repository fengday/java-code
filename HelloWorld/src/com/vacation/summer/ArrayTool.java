package com.vacation.summer;

import java.util.Arrays;

public class ArrayTool {
	public static void main(String[] args) {
		int arr1[]= {2,4,1,5};
		int arr2[]= {2,4,3,5};
//		1 boolean equals(int[] a,int[] b) 判断两个数组是否相等。
		boolean isEquals=Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
//		2 String toString(int[] a) 输出数组信息。
		System.out.println(Arrays.toString(arr1));
//		3 void fill(int[] a,int val) 将指定值填充到数组之中。
		Arrays.fill(arr2, 10);
		System.out.println(Arrays.toString(arr2));
//		4 void sort(int[] a) 对数组进行排序。
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
//		5 int binarySearch(int[] a,int key) 对排序后的数组进行二分法检索指定的值。
		int arr[]= {12,43,65,87,89,98,123,435,567};
		int isflag=Arrays.binarySearch(arr, 64);
		if(isflag>=0)
		{
			System.out.println(isflag);
		}else {
			System.out.println("没找到");
		}
	}

}
