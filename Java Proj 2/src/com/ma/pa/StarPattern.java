package com.ma.pa;


//create object inside static user method and assign it to static variable
public class StarPattern 
{
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) 
		{
			for(int j=5;j>=1;j--) 
			{
				if(i>=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
