package com.ma.pa;

import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;

import java.util.ArrayList;

import java.util.HashSet;

import java.util.List;

import java.util.Scanner;

import java.util.Set;


public class Example01 

{

	static String csvFile = "‪C:\\Users\\vikas\\Desktop\\Book.csv";

	static String line = "";

	static String splitBy = ","; 

	static int n;

	static List list = new ArrayList();

	static List list1 = new ArrayList();

	static List list3 = new ArrayList();

	static List list4 = new ArrayList();

	static List list5 = new ArrayList();

	static List l1 = new ArrayList();

	static List l2 = new ArrayList();

	static List l3 = new ArrayList();

	static List l4 = new ArrayList();

	static int id, id1, id2;

	static String entitlement, entitlement1, entitlement2;

	

	public static void main(String[] args) throws FileNotFoundException, IOException 

	{

		list5.add("abc");

		list5.add("cde");

		list5.add("def");

		list5.add("efg");

		list5.add("fgh");

		list5.add("xyz");

		list5.add("hij");

		System.out.println("enter number 1-4");

		System.out.println("1--->{id->entitlement}");

		System.out.println("2--->{entitlement->id}");

		System.out.println("3--->{(entitlement1,entitlement2)->common id}");

		System.out.println("4--->{(id1,id2)->common entitlement}");

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		

		if(n == 1)

		{

			System.out.println("enter id");

			id = sc.nextInt();

			fun1(id);

		}

		

		

		if(n == 2)

		{

			System.out.println("enter entitlement");

			entitlement = sc.next();

			fun2(entitlement);

		}

		

		if(n == 3)

		{

			System.out.println("enter entitlement");

			entitlement1 = sc.next();

			entitlement2 = sc.next();

			list3.add(entitlement1);

			list3.add(entitlement2);

			fun3(list3);

		}

		

		if(n == 4)

		{

			System.out.println("enter the number of id");

			n = sc.nextInt();

			for(int i=0; i<n; i++)

			{

				System.out.println("enter id");

				id1 = sc.nextInt();

				list4.add(id1);

			}

			fun4(list4);

		}

	}


	private static void fun1(int id) throws FileNotFoundException, IOException 

	{

		try(BufferedReader br = new BufferedReader(new FileReader(csvFile)))

		{

			br.readLine();

			while((line = br.readLine())!=null)

			{

				String[] value = line.split(splitBy);

				if(id == Integer.parseInt(value[0]))

				{

					list.add(value[3]);

				}

			}

		}

		System.out.println(list);

	}

	

	private static void fun2(String entitlement) throws FileNotFoundException, IOException

	{

		try(BufferedReader br = new BufferedReader(new FileReader(csvFile)))

		{

			br.readLine();

			while((line = br.readLine())!=null)

			{

				String[] value = line.split(splitBy);

				if(entitlement.equals(value[3]))

				{

					list1.add(value[0]);

				}

			}

		}

		System.out.println(list1);

	}

	

	private static void fun3( List list3) throws FileNotFoundException, IOException 

	{

		try(BufferedReader br = new BufferedReader(new FileReader(csvFile)))

		{

			br.readLine();

			while((line = br.readLine())!=null)

			{

				String[] value = line.split(splitBy);

				if(entitlement1.matches(value[3]))

				{

					l1.add(value[0]);

				}

				if(entitlement2.matches(value[3]))

				{

					l2.add(value[0]);

				}

			}

		}

		l1.retainAll(l2);

		System.out.println(l1);

	}

	

	private static void fun4( List list4) throws FileNotFoundException, IOException 

	{

		try(BufferedReader br = new BufferedReader(new FileReader(csvFile)))

		{

			br.readLine();

			while((line = br.readLine())!=null)

			{

				String[] value = line.split(splitBy);

				if(id1 == Integer.parseInt(value[0]))

				{

					l3.add(value[3]);

				}

				if(id2 == Integer.parseInt(value[0]))

				{

					l4.add(value[3]);

				}

				

			}

			l3.retainAll(l4); 

			System.out.println(l3);

		}

	}

}

