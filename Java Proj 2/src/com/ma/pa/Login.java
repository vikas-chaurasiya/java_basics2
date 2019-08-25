package com.ma.pa;

public class Login {
	public static void main(String[] args) {
		System.out.println("main block...");
		Inbox.checkmails();
	}

}
class Inbox
{
	static void checkmails() 
	{
		System.out.println("checking mails....");
	}
}

