package com.ma.pa;


//create object inside static user method and assign it to static variable
public class SecondArray 
{
	public static void main(String[] args) {
		int a[]= {4,5,6,2,4,71,0,8};
		int temp;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);
	}
}
