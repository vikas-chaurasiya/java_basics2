package com.ma.pa;

public class Demo {
	public static void main(String[] args) {
		String[] s1= {"A","B","C"};
		String[] s2= {"X","Y","Z"};
		String h1="";
		String h2="";
		String s3=String.join(h1, s1);
		String s4=String.join(h2, s2);
		System.out.println(merge(s3,s4));
	
	}
	public static String merge(String s3, String s4) 
    { 
        StringBuilder finalString = new StringBuilder(); 
  
        int i = 0, j = 0; 
        while (i < s3.length() && j < s4.length()) { 
  
            finalString.append(s3.charAt(i++)); 
            finalString.append(s4.charAt(j++)); 
        } 
  
        
        if (i != s3.length()) { 
            finalString.append(s3.substring(i)); 
        } 
        if (j != s4.length()) { 
            finalString.append(s4.substring(j)); 
        } 
        return finalString.toString(); 
    }
}
