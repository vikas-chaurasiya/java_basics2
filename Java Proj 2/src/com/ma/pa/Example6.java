package com.ma.pa;
//printing object address
public class Example6 
{
	Example6()
	{
		System.out.println(this);
		System.out.println(this.hashCode());
	}
	public static void main(String[] args) {
		new Example6();
	}

}
