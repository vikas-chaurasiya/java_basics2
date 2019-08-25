package com.ma.pa;

class First
{
	First()
	{
		System.out.println("constructor...");
	}
	void fun() 
	{
		System.out.println("fun....");
	}
}
public class Connect {
	public static void main(String[] args) {
		System.out.println("main");
		First obj =new First();// constructor will be executed
		obj.fun();
	}
}
