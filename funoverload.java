package com.may15;

public class funoverload
{
 int sum(int a,int b)
 {
	 return a+b;
 }
 int sum(int a,int b,int c)
 {
	 return a+b+c;
 }
 float sum(float a,float b)
 {
	 return a+b;
 }
 public static void main(String[] args) 
 { funoverload f=new funoverload();
 System.out.println("the sum is "+f.sum(6,7));
	System.out.println("the sum is "+f.sum(6.7f, 4.5f));
System.out.println("the sum is "+f.sum(5,6,7));
}
}
