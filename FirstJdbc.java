package com.may15;
import java.sql.*;
public class FirstJdbc 
{
public static void main(String[] args)throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr" );
	Statement st=con.createStatement();
	/*st.execute("create table mphasisstudent(empno number,name varchar2(30),address varchar2(30))");
	System.out.println("table is created");*/
	st.execute("insert into mphasisstudent values(101,'sandip','banglore')");
	System.out.println("row is inserted");
	Statement st1=con.createStatement();
	ResultSet rs=st1.executeQuery("select * from mphasisstudent");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" " +rs.getString(2)+ " " + rs.getString(3));
	}
}
}
