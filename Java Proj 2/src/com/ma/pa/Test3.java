package com.ma.pa;

public class Test3 {
	static int a;
	public static void main(String[] args) {
		System.out.println(Test3.a);//0
		Test3.a=Test3.assignValue();
		System.out.println(Test3.a);//100
	}
	static int assignValue() 
	{
		System.out.println(Test3.a);//0
		return 100;
	}
}
