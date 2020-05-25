package com.basic.TimBuchhk;

import java.util.Scanner;

public class EncryptionDecryption {
	public static String encryption(String str , int n)
	{
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[i] = (char)((int)ch[i]+n);
		}
		String enc = String.valueOf(ch);
		return enc;
		
	}
	public static String decryption(String str , int n)
	{
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[i] = (char)((int)ch[i]-n);
		}
		String enc = String.valueOf(ch);
		return enc;
	}
	public static void main(String ar[])
	{
		System.out.println("1.Encryption\n2.Decryption\nEnter your choice: ");
		Scanner sc = new Scanner(System.in);
		int opt=sc.nextInt();
		System.out.println("Enter nth shift number: ");
		int n = sc.nextInt();
		System.out.println("Enter String value: ");
		String val = sc.next();
		String result = null;
		if(opt==1)
		{
			result = encryption(val, n);
		}
		else if(opt==2)
		{
			result = decryption(val, n);
		}
		System.out.println(result);
	}

}
