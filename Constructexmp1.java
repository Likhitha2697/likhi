package com.may15;

public class Constructexmp1 extends Constructexmp
{
int salary;
String design;

	Constructexmp1(int empno, String name, String address,int salary,String design ) {
		super(empno, name, address);
		// TODO Auto-generated constructor stub
		this.salary=salary;
		this.design=design;
	}
void display()
{
	super.display();
	System.out.println(" the salary is "+ salary +" the designation is "+design);
}
public static void main(String[] args) 
{
	Constructexmp1 c=new Constructexmp1(101,"likhitha","bangalore",50000,"clerk");
	c.display();
}
}
