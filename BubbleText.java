package com.vacation.summer;

public class BubbleText {
	public static void main(String[] args) {
		int arr[]= {54,65,23,67,45,0,-4,-32,76,87};
		for(int j=0;j<arr.length-1;j++)
		{
			for(int k=0;k<arr.length-j-1;k++)
			{
				if(arr[k]>arr[k+1])
				{
					int temp=arr[k+1];
					arr[k+1]=arr[k];
					arr[k]=temp;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
