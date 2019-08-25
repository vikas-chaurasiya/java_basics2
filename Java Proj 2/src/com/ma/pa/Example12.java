package com.ma.pa;
//create object inside static block and assign object reference to static variable
public class Example12 
{
	static int a;
	static 
	{
		System.out.println(Example12.a);
		Example12.a = 100;
	}
	public static void main(String[] args) {
		System.out.println(Example12.a);
	}
}
