package com.basic.TimBuchhk;

import java.util.ArrayList;


public class PrimeInRange {
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String ar[])
	{ 
		ArrayList<Integer> allPrime = new ArrayList<>();
		char ch[]=new char[50];
		int k=0;
		for(int i=20;i<100;i++)
		{
			if(isPrime(i)==true)
			{
			allPrime.add(i);
			ch[k] = (char)i;
			k++;
			}
		}
		for(char c:ch)
		System.out.println(c);
	}

}
