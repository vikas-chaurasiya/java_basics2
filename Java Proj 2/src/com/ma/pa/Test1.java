package com.ma.pa;

public class Test1 {
	
	
	static 
	{
		int a=23;
		Test1.a=a+Test1.a;
		System.out.println(Test1.a);
	}
	static int a=10;
	public static void main(String[] args) {
		
		
		System.out.println(Test1.a);
	}
	static 
	{
		System.out.println(a);
		a=Test1.a+a;
		System.out.println(a);
	}

}
