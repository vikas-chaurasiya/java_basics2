package com.ma.pa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Listable 
{
	public static void main(String[] args) {
		List list=new ArrayList();
		List list1=new ArrayList();
		List list2=new ArrayList();
		list.add(1); list.add(2); list.add(3); list.add(4);
		System.out.println("all the list "+list);
		list1=list.subList(0, 2);
		System.out.println("first part of list "+list1);
		list2=list.subList(2, 4);
		System.out.println("second part of list "+list2);
		Collections.reverse(list1);
		Collections.reverse(list2);
		System.out.println("reverse the first part of list "+list1);
		System.out.println("reverse the second part of list "+list2);
		list1.addAll(list2);
		System.out.println("merging the first list and second list "+list1);
	}
	
}
