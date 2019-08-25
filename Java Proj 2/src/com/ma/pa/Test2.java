package com.ma.pa;

public class Test2 {
	static int a;
	public static void main(String[] args) {
		System.out.println("a value ::"+Test2.a);// value =0
		Test2.assignValue();
		System.out.println("a value ::"+Test2.a);//value=1000
	}
	static void assignValue()
	{
		System.out.println(Test2.a);//value=0
		Test2.a=1000;
		System.out.println(Test2.a);//value=1000
	}
}
