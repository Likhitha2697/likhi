package com.may15;
import java.util.*;
public class exceptionex 
{
public static void main(String[] args)
{
	
	try{
	Scanner ob=new Scanner(System.in);
	System.out.println("enter 2 nos");
	int a=ob.nextInt();
	int b=ob.nextInt();
	int c=a/b;
	System.out.println("the result is "+c);
	}
	catch(ArithmeticException ae)
	{
		ae.printStackTrace();
	}
	catch(Exception a)
	{
		System.out.println("the error is "+a);
	}
	
	finally
	{
	System.out.println("the program will continue.....");
}
}
}
