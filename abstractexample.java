package com.may15;
import java.util.*;
abstract class abstractclass
{
	abstract void inputStudentdetails();
	abstract void inputStudentmarks();
	abstract int sum(int a,int b);
	void studentClass()
	{
		System.out.println("he is a student of class X");
	}
}
public class abstractexample extends abstractclass
{

	void inputStudentdetails() {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter name ,rollno of student");
		int rollno=ob.nextInt();
		String name=ob.next();
		System.out.println("the roll no is"+rollno+"the name is"+name);
		
	}

	void inputStudentmarks() 
	{
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter phy,chem ,maths marks");
		int phy=ob.nextInt();
		int chem=ob.nextInt();
		int maths=ob.nextInt();
		int total=phy+chem+maths;
		System.out.println("the total marks is"+total);
	}

	
	int sum(int a, int b) {
		
		return a+b;
	}
	public static void main(String[] args) 
	{
		abstractexample a=new abstractexample();
		a.inputStudentdetails();
		a.studentClass();
		a.inputStudentmarks();
		System.out.println("the sum is"+a.sum(6,7));
	}
}