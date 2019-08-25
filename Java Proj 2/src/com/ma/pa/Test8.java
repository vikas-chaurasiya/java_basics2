package com.ma.pa;

public class Test8 {
	
	{
		System.out.println("non static "+this);
	}
	Test8()
	{
		System.out.println("constructor  "+this);
	}
	public static void main(String[] args) {
		
		Test8 obj =new Test8();
		System.out.println("main block :: "+obj);
		
	}

}


