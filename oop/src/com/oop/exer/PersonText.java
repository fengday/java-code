package com.oop.exer;

public class PersonText {
	public static void main(String[] args) {
		
	
	Person p1=new Person();
	p1.name="张三";
	p1.age=18;
	p1.sex=1;
	p1.study();
	p1.showAge();
	p1.addAge(2);
	System.out.println(p1.name+p1.age);
	
	}

}
