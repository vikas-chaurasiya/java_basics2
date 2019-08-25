package com.ma.pa;

public class Test7 {
	static
	{
		System.out.println("static");
	}
	{
		
		System.out.println("non-static :: "+this.hashCode());
	}
	Test7()
	{
		System.out.println("constructor"+this);
	}
	public static void main(String[] args) {
		System.out.println("main block...");
		new Test7();

		
	}

}


