package com.ma.pa;

public class Test11 {
	
	static int x=10;
	int y;
	Test11(int z)
	{
		z=this.y;
		System.out.println(z);
		Test11.x=z;
		System.out.println(Test11.x);
		this.y=Test11.x;
		System.out.println(this.y);
	}
	
	public static void main(String[] args) {
		System.out.println(Test11.x);//10
		Test11 obj =new Test11(20);
		System.out.println(Test11.x+obj.y);
	}
}


