package com.ma.pa;

import java.util.StringTokenizer;

//create object inside static user method and assign it to static variable
public class StringTokenizers 
{
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("my name is vikas");
		while(st.hasMoreTokens()) 
		{
			System.out.println(st.nextToken());
		}
	}
}
