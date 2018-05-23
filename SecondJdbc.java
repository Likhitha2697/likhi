package com.may15;
import java.sql.*;
import java.util.*;
public class SecondJdbc 
{
public static void main(String[] args) throws Exception 
{Scanner ob=new Scanner(System.in);
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr" );
 System.out.println("enter empno,name,address");	
 PreparedStatement st=con.prepareStatement("insert into mphasisstudent values(?,?,?)");
 int a=ob.nextInt();
 String b=ob.next();
 String c=ob.next();
 st.setInt(1,a); st.setString(2,b);st.setString(3,c);st.execute();
 System.out.println("row inserted");
 
 
 System.out.println("enter the empno which u want to delete");
 PreparedStatement st2=con.prepareStatement("delete from mphasisstudent where empno=?");
 int y=ob.nextInt();
 st2.setInt(1,y);
 st2.execute();
 System.out.println("row deleted");
 
 
 System.out.println("enter the empno and address which you want to update");
 PreparedStatement st3=con.prepareStatement("update mphasisstudent set address=? where empno=?");
 int x=ob.nextInt();
 String z=ob.next();
 st3.setString(1,z);
 st3.setInt(2, x);
 st3.execute();
 System.out.println("row updated");
 
 Statement st1=con.createStatement();
	ResultSet rs=st1.executeQuery("select * from mphasisstudent");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" " +rs.getString(2)+ " " + rs.getString(3));
	}
}
}
