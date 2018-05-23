package com.may15;
import java.util.*;

public class arraylistexample {
public static void main(String[] args)
{ ArrayList al=new ArrayList();
al.add("10");al.add("30");al.add("20");al.add("40");al.add("50");
System.out.println(al);
al.add(3,"500");
System.out.println(al);
al.remove(2);
al.set(4,"1000");
System.out.println(al);
System.out.println(al.size());
al.clear();
System.out.println(al);
System.out.println(al.size());

}
}
