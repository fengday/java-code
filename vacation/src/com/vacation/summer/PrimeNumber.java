package com.vacation.summer;

public class PrimeNumber {
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		for(int i=2;i<100000;i++)
		{
			boolean a=true;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0) {
					a=false;
					break;
				}
			}
			if(a==true)
				System.out.println(i);

		}
		long end=System.currentTimeMillis();
		System.out.println("时间"+(end-start));
	}

}