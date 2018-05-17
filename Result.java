package com.may15;
import java.util.*;
 class Student
{
	static int rollno;
	static String name;
	static String email;
	Scanner ob=new Scanner(System.in);                                                                    
	protected static void  input()
	{
		
		System.out.println("enter rollno,name,email");
		Scanner ob=new Scanner(System.in);  
		rollno=ob.nextInt();
		name=ob.next();
		email=ob.next();
	}
	static void display()
 {
	 System.out.println("the roll no is"+rollno);
	 System.out.println("name of student is "+ name);
	 System.out.println("email id is "+email);
 }
}
public class Result extends Student
{
	static int m1,m2,m3;
	static float total,avg;
     static void input1()
	{
		input();
		
		System.out.println("enter marks of m1,m2,m3");
		Scanner ob=new Scanner(System.in);  
		m1=ob.nextInt();
		m2=ob.nextInt();
		m3=ob.nextInt();
		total=(m1+m2+m3);
		avg=total/3;
	}
	 static void display1()
	{
		display();
		System.out.println("the total is"+total+ "the average is "+avg);
		
	}
	public static void main(String[] args) 
	
	{
		input1();
		display1();
	}
}