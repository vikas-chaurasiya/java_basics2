package com.ma.pa;

public class ClassLoaderTest {
	public static void main(String[] args) {
		
		Class c=ClassLoaderTest.class;
		System.out.println(c.getClass());
		System.out.println(String.class.getClassLoader());
	}
}
