package com.oop.exer;

public class Circle {
	double r; 
	public void findArea()
	{
		double area=Math.PI*r*r;
		System.out.println(area);
	}
	public double newArea()
	{
		double area=Math.PI*r*r;
		return area;
	}

}
