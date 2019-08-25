package com.ma.pa;
//create object inside static user method and assign it to static variable
public class ToString 
{
	private int number;
	private String name;
	private String addrs;
	
	public ToString(int number, String name, String addrs) {
		this.number = number;
		this.name = name;
		this.addrs = addrs;
	}
	
	@Override
	public String toString() {
		
		return number+" "+name+" "+addrs;
	}
	 
	public static void main(String[] args) {
		ToString ts1=new ToString(101,"vikas","hyderabad");
		ToString ts2=new ToString(102,"santosh","dubai");
		
		System.out.println(ts1);
		System.out.println(ts2);
	}	
	
}
