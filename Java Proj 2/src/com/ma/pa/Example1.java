package com.ma.pa;
//constructor and non static and main
public class Example1 
{
	int a;//non  static variable
	Example1()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("non static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		new Example1();
	}

}
