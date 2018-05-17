package com.may15;
import java.util.*;
interface bank
{
	void createAccount();
	void deposit();
	void withDraw();
	void balCheck();
	
}
public class mainClass implements bank
{
	int accno,phno;
	String name,email;
	float deposit,withDraw;
	float bal=500.45f;

	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("enter account details");
		Scanner ob=new Scanner(System.in);
		accno=ob.nextInt();
		phno=ob.nextInt();
		name=ob.next();
		email=ob.next();
		System.out.println(" the accountnumber is "+accno+" account holder name is "+name+"his email and phone number are"+email+phno );
	}

	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("enter amount to be deposited");
		Scanner ob=new Scanner(System.in);
		deposit=ob.nextFloat();
		System.out.println("the deposited amount is"+deposit);
	}

	public void withDraw() {
		// TODO Auto-generated method stub
		System.out.println("enter amount to be withdrwan");
		Scanner ob=new Scanner(System.in);
		withDraw=ob.nextFloat();
		System.out.println("enter amount that is  withdrwan" +withDraw);
	}

	public void balCheck() {
		// TODO Auto-generated method stub
		System.out.println("The net balance details");
		bal=bal+deposit-withDraw;
		System.out.println("the net balance is"+bal);
	}
	
	public static void main(String[] args)
	{
		mainClass m=new mainClass();
		m.createAccount();
		m.deposit();
		m.withDraw();
		m.balCheck();
		
	}
}
