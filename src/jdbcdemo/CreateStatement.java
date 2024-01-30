package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class CreateStatement 
{
public static void main(String[]args) throws SQLException, ClassNotFoundException
{
Class.forName("com.mysql.cj.jdbc.Driver");

System.out.println("Driver Register Successfully");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Komal@28");//establish connection
System.out.println("CONNECTION ESTABLISHED SUCCESSFULLY");
//LOADAndRegisterDriver l = new LoadAndRegisterDriver();

//System.out.println(l.getClass());
System.out.println(con.getClass());

	Statement st = con.createStatement();
System.out.println("Statement created successfully");

st.execute("create database successfully");
System.out.println("database created successfully");
}
}
