package com.vacation.summer;

public class PrimeNumble1 {
	long start=System.currentTimeMillis();
	label:for(int i=2;i<100000;i++)
	{
		
		 for(int j=2;j<=Math.sqrt(i);j++)
		{
			if(i%j==0) 
			{
				continue laber;
				
			}
		}
			System.out.println(i);

	}
	long end=System.currentTimeMillis();
	System.out.println("����ʱ��Ϊ"+(end-start));

}
}
