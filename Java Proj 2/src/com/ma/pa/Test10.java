package com.ma.pa;

public class Test10 {
	
	int balance;
	Test10(int balance)
	{
		this.balance=balance;
	}
	
	public static void main(String[] args) {
		
		Test10 obj =new Test10(1000);
		Test10 obj1 =new Test10(1089);
		
		System.out.println("main block :: "+obj.balance);
		System.out.println("main block :: "+obj1.balance);
		
		
	}
}


