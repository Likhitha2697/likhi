package com.may15;
interface first
{
	void display();
}
interface second
{
	void display1();
}
interface third extends second
{
	void display3();
}
public class interfaceexample implements first,third
{

	public void display3() {
		// TODO Auto-generated method stub
		System.out.println("display1");
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display2");
	}
public static void main(String[] args) {
	interfaceexample ob =new interfaceexample();
	ob.display();ob.display1();ob.display3();
}
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("display3");
	}
}
