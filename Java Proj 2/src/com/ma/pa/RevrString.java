package com.ma.pa;

import java.util.Scanner;

public class RevrString 
{
	public static void main(String[] args) {
		
		
		String s1="VIKASCHAURASIYA";
		int cnt=0;
	
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i+1; j < s1.length(); j++) {
				if(s1.charAt(i)==s1.charAt(j)) 
				{
					cnt++;
				}
			}
			System.out.println(s1.charAt(i)+" is repeated by "+cnt);
	        String d=String.valueOf(s1.charAt(i));
	        cnt = 0;
		}
		
		
		
	}
	
}
