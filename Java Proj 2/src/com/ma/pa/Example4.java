package com.ma.pa;

public class Example4 
{
	//Default constructor is not taking any arguments and with empty definition
	public static void main(String[] args)
	{
		System.out.println("main");
		new Example4();//no error: invokes default constructor
	}
	Example4()
	{
		System.out.println("constructor");
	}

}
