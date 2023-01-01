package com.oop.exer;

public class Circle1Text {
	public static void main(String[] args) {
		PassObject p1=new PassObject();
		Circle1 c=new Circle1();
		p1.printAreas(c, 5);
		System.out.println(c.radius);
	
	}

}
class Circle1{
	double radius;
	public double findArea() {
		return Math.PI*radius*radius;
		
	}
}
class PassObject{
	public void printAreas(Circle1 c,int time ) {
		for(int i=1;i<=time;i++)
		{
			c.radius=i;
			System.out.println(c.radius+ "  "+c.findArea());
		}
		c.radius=c.radius+1;
	}
}