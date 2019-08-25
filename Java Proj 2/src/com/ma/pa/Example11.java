package com.ma.pa;
//create object inside static block and assign object reference to local variable
public class Example11 
{
	static 
	{
		Example11 obj = new Example11(); // object is local variable
		System.out.println(obj);
	}
	public static void main(String[] args) {
		//System.out.println(a); Error
	}
}
