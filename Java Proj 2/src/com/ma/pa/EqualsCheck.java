package com.ma.pa;

public class EqualsCheck 
{
	public static void main(String[] args) {
		String a="vikas";
		String b="vikas";
		System.out.println(a.equals(b));
		System.out.println(a==b);
		System.out.println(a.intern()==b.intern());
}
}
