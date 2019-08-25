package com.ma.pa;
import java.util.*;
public class Revstr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string: ");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		System.out.println("reverse string : ");
		int j=ch.length;
		for(int i=j;i>0;i--) 
		{
			System.out.print(ch[i-1]);
		}
	}
}
