package com.ma.pa;
import java.util.*;
public class Revstr1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s =sc.nextLine();
		
		char[] ch=s.toCharArray();
		List list=new ArrayList<>();
		for(char c:ch) 
			list.add(c);
		
		Collections.reverse(list);
		ListIterator li = list.listIterator();
		while(li.hasNext())
			System.out.print(li.next());
	
	}
}
