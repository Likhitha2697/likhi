package com.may15;
import java.util.*;
public class arrayexception
{
public static void main(String[] args) 
{
	try{
		int a[]=new int[5];
		Scanner ob=new Scanner(System.in);
		System.out.println("enter 5 nos");
		for(int i=0;i<5;i++)
		
			a[i]=ob.nextInt();
		System.out.println(" 5 nos are");	
		for(int i=0;i<=5;i++)
			System.out.println(a[i]);
	}
	catch(Exception a)
	{
		System.out.println("the error is "+a);
	}
}
}
