package com.oop.exer;

public class StudentText1 {
	public static void main(String[] args) {
	Student1[] stu=new Student1[20];
	Student1 text=new Student1();
	text.ran(stu);
	text.print(stu);
	System.out.println("************");
	text.search(stu);
	text.print(stu);
	System.out.println("************");
	text.searchState(stu, 2);;
	}
	
	
	
}


class Student1{
	int number;
	int state;
	int score; 
	public String info1() {
		return "学号"+ number+"年级,"+state+"分数,"+score;
	}
	public void print(Student1[] stu) 
	{
		for(int i=0;i<stu.length;i++)
		{
			System.out.println(stu[i].info1());
		}
    }
	public void searchState(Student1[] stu,int search)
	{
		for(int i=0;i<stu.length ;i++)
		{
			if(stu[i].state==search) {
			System.out.println(stu[i].info1());}
		}
	}
	public void ran(Student1[] stu) {
		for(int i=0;i<stu.length;i++)
		{
			stu[i]=new Student1();
			stu[i].number=i+1;
			stu[i].state=(int) (Math.random()*6+1);
			stu[i].score=(int) (Math.random()*101);
			
		}
	}
	
	public void search(Student1[] stu)
	{
		for(int i=0;i<stu.length-1;i++)
		{
			for(int j=0;j<stu.length-1-i;j++)
			{
				if(stu[j].score>stu[j+1].score)       
				{ 
					Student1 temp=stu[j+1];
					stu[j+1]=stu[j];
					stu[j]=temp;
				}
			}
		}
	}  
	
}

