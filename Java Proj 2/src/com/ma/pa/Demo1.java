package com.ma.pa;

public class Demo1 
{
	public static void main(String[] args) {
		int temp;
		int[] a= {14,46,47,45,92,52,48,36,66,85};
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length;j++) 
			{
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);
}
}
