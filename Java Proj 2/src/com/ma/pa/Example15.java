package com.ma.pa;
//create object directly in the declaration static variable
public class Example15 
{
	static Example15 obj = new Example15();
	static 
	{
		System.out.println(Example15.obj);
		
	}
	public static void main(String[] args) {
		System.out.println(Example15.obj);
	}
}
