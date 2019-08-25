package com.ma.pa;

public class Test16 {
	static Test16 obj=new Test16();
	static 
	{
		Test16.obj.fun();
	}
	public static void main(String[] args) {
		System.out.println("main..");
		Test16.obj.fun();
	}
	void fun() 
	{
		System.out.println("fun....");
	}
}
