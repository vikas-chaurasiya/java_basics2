package com.ma.pa;

public class Test15 {
	static Test15 obj =new Test15();
	static 
	{
		System.out.println(Test15.obj.hashCode());
	}
	public static void main(String[] args) {
		System.out.println(Test15.obj);
	}
}
