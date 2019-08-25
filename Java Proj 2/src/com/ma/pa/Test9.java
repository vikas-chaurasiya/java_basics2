package com.ma.pa;

public class Test9 {
	
	int a=1;
	Test9(int a)
	{
		this.a=a;
		System.out.println("constructor  "+this.a);
	}
	
	public static void main(String[] args) {
		
		Test9 obj =new Test9(10);
		System.out.println("main block :: "+obj.a);
		
	}
}


