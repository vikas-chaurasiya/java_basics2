package com.ma.pa;

public class Test6 {
	static
	{
		System.out.println("static");
	}
	{
		System.out.println("non-static");
	}
	Test6()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main block...");
		new Test6();
		new Test6();
		new Test6();
		
	}

}


