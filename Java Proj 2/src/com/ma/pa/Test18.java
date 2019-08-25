package com.ma.pa;


public class Test18 
{
	private static int a=10;
	private Test18() 
	{
		System.out.println("private constructor..");
	}
//	{
//		System.out.println("non static...");
//	}
	public static void main(String[] args) {
		System.out.println("a val:: "+Test18.a);
		new Test18();
	}
}
