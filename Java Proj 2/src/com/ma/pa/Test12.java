package com.ma.pa;

public class Test12 {
	int a,b;
	Test12(int a, int b)
	{
		a=a;
		System.out.println(a);
		this.b=this.a;
	}
	public static void main(String[] args) {
		Test12 obj =new Test12(10,20);
		System.out.println(obj.a+" "+obj.b);
	}
}


