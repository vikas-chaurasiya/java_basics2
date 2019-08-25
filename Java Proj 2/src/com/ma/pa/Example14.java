package com.ma.pa;
//create object directly in the declaration static variable
public class Example14 
{
	static int a =100;
	static 
	{
		System.out.println(Example14.a);
		
	}
	public static void main(String[] args) {
		System.out.println(Example14.a);
	}
}
