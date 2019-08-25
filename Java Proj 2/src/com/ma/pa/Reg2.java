package com.ma.pa;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any text ");
		String str=sc.nextLine();
		//System.out.println(str);
		StringBuffer sbf=new StringBuffer();
		Matcher m=Pattern.compile("([a-z])([a-z]*)" , Pattern.CASE_INSENSITIVE).matcher(str);
		while(m.find()) 
		{
			m.appendReplacement(sbf, m.group(1).toUpperCase() + m.group(2).toLowerCase());
			
		}
		System.out.println(m.appendTail(sbf).toString());
	}

}
