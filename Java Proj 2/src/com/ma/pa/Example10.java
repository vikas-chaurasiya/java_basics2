package com.ma.pa;
//create object inside static block and assign object reference to local variable
public class Example10 
{
	static 
	{
		int a=100; // a is local variable
		System.out.println(a);
	}
	public static void main(String[] args) {
		//System.out.println(a); Error
	}
}
