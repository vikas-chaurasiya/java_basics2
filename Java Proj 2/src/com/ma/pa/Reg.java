package com.ma.pa;

import java.util.Scanner;

public class Reg {

	public static void main(String[] args) {
		String firstName=null;
		
		Scanner sc=new Scanner(System.in);
		
		do 
		{
			System.out.println("enter your first name:  ");
			firstName=sc.next();
			firstName= firstName.toUpperCase();
		}
		while(!firstName.matches("^[^\\d\\s]+$"));
		System.out.println("thank "+ firstName);
		
	}

}
