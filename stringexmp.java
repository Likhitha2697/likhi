package com.may15;

public class stringexmp 
{
public static void main(String[] args)
{
	String s1= "Mphasis Software";
	System.out.println(s1);
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.indexOf('M'));
	System.out.println(s1.lastIndexOf('a'));
	System.out.println(s1.substring(5));
	System.out.println(s1.substring(4,10));
	System.out.println(s1.startsWith("hp"));
	System.out.println(s1.endsWith("re"));
	System.out.println(s1.replace("software","soft"));
	String ss="Mphasis software,mumbai";
	System.out.println(ss);
	System.out.println(s1);
	System.out.println("the length os string= "+ss.length());
	System.out.println(ss.replace("mumbai", "Bangalore"));
	char name[]=s1.toCharArray();  //convert string to char array}
	int leng=name.length;
	System.out.println("length of an array= "+leng);
	for(int i=0;i<leng;i++)
	{
		System.out.println(name[i]);
		
	}
}
}
