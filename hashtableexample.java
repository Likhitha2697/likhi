package com.may15;
import java.util.*;
public class hashtableexample {
	public static void main(String[] args)
	{
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(101,"s");
		ht.put(102,"a");
		ht.put(103,"h");
		ht.put(104,"i");
		ht.put(105,"t");
		ht.put(106,"h");
		ht.put(107,"y");
		ht.put(108,"a");
		System.out.println(ht);
		ht.remove(103);
		System.out.println(ht);
	}

}
