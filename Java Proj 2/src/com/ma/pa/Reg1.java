package com.ma.pa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1 {

	public static void main(String[] args) {
		Pattern p=null;
		Matcher m=null;
		p= Pattern.compile("\\b([A-Z][a-z]*)\\b");
		m=p.matcher("My name Is Vikas ");
		while(m.find()) 
		{
			System.out.println(m.group(1));
		}
		
	}

}
