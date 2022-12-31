package com.vacation.summer;

public class ArrayYangHui {
	public static void main(String[] args) {
		int[][] yanghui=new int[10][];
		for(int i=0;i<yanghui.length;i++)
		{
			yanghui[i]=new int[i+1];
			yanghui[i][0]=yanghui[i][i]=1;
			if (i > 1) {
				for(int a=1;a<yanghui[i].length-1;a++)
				{
					yanghui[i][a] = yanghui[i-1][a-1] + yanghui[i-1][a];

				}
				
			}
		}
		for(int j=0;j<yanghui.length;j++)
		{
			for(int k=0;k<yanghui[j].length;k++)
			{
				
				System.out.print(yanghui[j][k]+"  ");
			}
			System.out.println();
		}
	}

}
