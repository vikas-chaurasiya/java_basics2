package com.ma.pa;
//create object inside static block and assign object reference to static variable
public class Example13 
{
	static Example13 obj;
	static 
	{
		System.out.println(Example13.obj);
		Example13.obj = new Example13();
	}
	public static void main(String[] args) {
		System.out.println(Example13.obj);
	}
}
