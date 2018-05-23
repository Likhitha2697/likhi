package com.may15;
import java.util.*;

public class arraylistexample1 {
public static void main(String[] args)
{
ArrayList al=new ArrayList();
al.add("10");al.add("30");al.add("20");al.add("40");al.add("50");
System.out.println(al);
al.add(3,"500");
System.out.println(al);
al.remove(2);
al.set(4,"1000");
System.out.println(al);
for(Object obj:al)
System.out.println(obj);
System.out.println("*******************************");
Iterator it=al.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
System.out.println("Forward Direction");
ListIterator it1=al.listIterator();
while(it1.hasNext())
{
	System.out.println(it1.next());
	}
System.out.println("Backward Direction");
while(it1.hasPrevious())
{
	System.out.println(it1.previous());
}
}
}
