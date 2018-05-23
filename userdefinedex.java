package com.may15;
import java.util.*;
public class userdefinedex extends Thread

{
public static void main(String[] args)throws Exception
{
	Scanner ob=new Scanner(System.in);
	System.out.println("enter ur java marks");
	int a=ob.nextInt();
	if(a<=40)
	throw new Exception("number should be greater than 40");
	else
		System.out.println("the entered number is OK");
}
}
