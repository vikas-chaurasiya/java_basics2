package com.ma.pa;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception1 {
	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(10 / 0);

	}
}
