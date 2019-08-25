package com.ma.pa;

public class Test4 {
	static int a,b;
	public static void main(String[] args) {
		Test4.m(20,30);
		System.out.println(Test4.a+b);
	}
	static void m(int a, int x) 
	{
		System.out.println(a);
		a=a;
		b=x;
	}
}
