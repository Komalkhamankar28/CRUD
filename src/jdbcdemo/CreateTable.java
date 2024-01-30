package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
public static void main(String[] args) throws SQLException, ClassNotFoundException
{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Komal@28");
	Statement st = con.createStatement();
	st.execute("create table student9(id int,name varchar(20),age int,role varchar(20))");
	System.out.println("table created successfully");
}
}
