package com.ma.pa;

public class Example3 
{
	
	public static void main(String[] args)
	{
		System.out.println("main");
		Example3.fun();
		//compiler raises an error if accessed method definition is not present
		System.out.println("main");
	}
	static void fun()
	{
		System.out.println("user method");
	}

}
