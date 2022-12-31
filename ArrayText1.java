package com.vacation.summer;

import java.util.Scanner;

public class ArrayText1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入学生人数");
		int number=scan.nextInt();
		int score[]=new int[number];
		System.out.println("输入学生分数");
		for( int i=0;i<score.length;i++)
				{
			 score[i]=scan.nextInt();
				}
		int max=0;
		for(int j=0;j<score.length;j++)
		{
			if(max<score[j])
			{
				max=score[j];
			}
		}
		System.out.println(max);
		for(int k=0;k<score.length;k++)
		{
			if(score[k]>(max-10))
			{
				System.out.println("student"+k+"成绩为"+score[k]+"等级为"+"A");
			}else if(score[k]>(max-20))
			{
				System.out.println("student"+k+"成绩为"+score[k]+"等级为"+"B");
			}else if(score[k]>(max-30))
			{
				System.out.println("student"+k+"成绩为"+score[k]+"等级为"+"C");
			}else
				System.out.println("student"+k+"成绩为"+score[k]+"等级为"+"D");
		}
	}

}
