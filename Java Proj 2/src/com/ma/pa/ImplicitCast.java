package com.ma.pa;

public class ImplicitCast 
{
	public static void main(String[] args) {
		byte b=100;
		int i= b;//implicit cast
		System.out.println("i val "+i);
		
		char ch='a';
		int j=ch;
		System.out.println("j val "+j);
	}
}
