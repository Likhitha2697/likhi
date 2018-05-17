package com.may15;

public class constoverload 
{
constoverload()
{
	System.out.println("this is default constructor");
}
constoverload(int a,int b)
{
	System.out.println("the sum is"+(a+b));
}
int sum(int x,int y)
{
	return x+y;
}
public static void main(String[] args)
{
	constoverload ob=new constoverload();
	constoverload ob1=new constoverload(5,6);
	constoverload ob2=new constoverload(56,67);
	System.out.println("the sum function is"+ob.sum(8,8));
}
}
 