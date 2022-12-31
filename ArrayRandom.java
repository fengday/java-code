package com.vacation.summer;

public class ArrayRandom {
	public static void main(String[] args) {
		int[] arr = new int[6];
		lable:for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 30 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i=0;
					continue lable;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
