package com.method.java;

public class OverLoadsText {
	public static void main(String[] args) {
		OverLoads number=new OverLoads();
		number.mOL(3);
		number.mOL(4, 5);
		number.mOL("字符串");
		
	}

}
class OverLoads{
	public void mOL(int x) {
		System.out.println(x*x);
	}
	public void mOL(int x,int y) {
		System.out.println(x*y);
	}
	public void mOL(String x) {
		System.out.println(x);
	}
}
