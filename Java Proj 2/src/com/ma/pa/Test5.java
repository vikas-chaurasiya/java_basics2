package com.ma.pa;

public class Test5 {
	{
		System.out.println("non-static");
	}
	Test5()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main block...");
		new Test5();
		
	}

}


