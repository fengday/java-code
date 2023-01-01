package com.oop.exer;

import java.util.Arrays;

public class StudentText {
	public static void main(String[] args) { 
		Student[] stu=new Student[20];
		for(int i=0;i<stu.length;i++)
		{
			stu[i]=new Student();
			stu[i].number=i+1;
			stu[i].state=(int)(Math.random()*(6)+1);
			stu[i].score=(int)(Math.random()*(100+1));
			
		}
		
		for(int i=0;i<stu.length;i++)
		{
			System.out.println(stu[i].prin());
		}
		System.out.println("*********");
		for(int i=0;i<stu.length ;i++)
		{
			if(stu[i].state==3) {
				
			
			System.out.println(stu[i].prin());}
		}
		System.out.println("*********");
		for(int i=0;i<stu.length-1;i++)
		{
			for(int j=0;j<stu.length-i-1;j++)
			{
				if(stu[j].score>stu[j+1].score)
				{
					Student temp=stu[j];
					stu[j]=stu[j+1];
					stu[j+1]=temp;
				}
			}
		}

		for(int i=0;i<stu.length;i++)
		{
			System.out.println(stu[i].prin());
		}

		
	}

}
class Student{
	int number;
	int state;
	int score;
	public String  prin()
	{
		return "学号："+number+",年级："+state+",分数"+score;
	}
	
}
