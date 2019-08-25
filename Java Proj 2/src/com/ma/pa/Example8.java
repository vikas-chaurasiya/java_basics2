package com.ma.pa;
// printing object address inside main and constructor 
public class Example8 
{
	Example8()
	{
		System.out.println("object address inside constructor"+this);
	}
	public static void main(String[] args) {
		Example8 obj =new Example8();
		System.out.println("object address inside main "+obj);
	}
}
