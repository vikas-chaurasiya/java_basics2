package com.ma.pa;
//constructor, static, non static and main
public class Example2 
{
	static 
	{
		System.out.println("static block"); //static only one time execute
	}
	//constructor and non static when the object creation in 3 times then execute to 3 time generates the output
	Example2()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("non static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		new Example2();
		new Example2();
		new Example2();
	}

}
