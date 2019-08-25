package com.ma.pa;
//create object inside static user method and assign it to static variable
public class Example16 
{
	static int a;
	public static void main(String[] args) {
		System.out.println(Example16.a);
		Example16.initialize();
		System.out.println(Example16.a);
	}

	static void initialize()
	{
		System.out.println(Example16.a);
		
	}
	
}
