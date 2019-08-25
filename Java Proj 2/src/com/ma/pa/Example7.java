package com.ma.pa;
//using this keyword
public class Example7 
{
	int a;
	public static void main(String[] args) {
		new Example7();
	}
	{
		System.out.println(this.a);
		this.a=100;
		System.out.println(this.a);
	}
	Example7()
	{
		System.out.println(this.a);
	}

}
