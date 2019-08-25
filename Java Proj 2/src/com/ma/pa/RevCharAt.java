package com.ma.pa;

public class RevCharAt 
{
	public static void main(String[] args) {
		String str="this is book";
		String rev="";
		for(int i=str.length()-1; i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
				
	}
	
}
