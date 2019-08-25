package com.ma.pa;

public class IfElseCondition1 {
	public static void main(String[] args) {
		int num=2400;
		if(((num %4 == 0) && (num % 100 != 0)) || (num%400==0))
			System.out.println("leap year");
		else
			System.out.println("common year");
	}
}
