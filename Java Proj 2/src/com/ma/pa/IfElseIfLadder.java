package com.ma.pa;

import java.util.Scanner;

public class IfElseIfLadder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int marks=sc.nextInt();
		if(marks>=33 && marks<40)
			System.out.println("D grade");
		else if(marks>40 && marks<50)
			System.out.println("C grade");
		else if(marks>50 && marks<60)
			System.out.println("B grade");
		else if(marks>60 && marks<100)
			System.out.println("A grade");
		else if(marks>100)
			System.out.println("please enter the below 100");
		else
			System.out.println("fail");
		
	}
}
