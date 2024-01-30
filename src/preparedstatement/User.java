package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;


public class User {

	public static void main(String[] args) throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Komal@28");
		PreparedStatement ps = con.prepareStatement("insert into student7(id,name,email,password,age)values(?,?,?,?,?)");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter id");
		int id = scn.nextInt();
		
		System.out.println("enter name");
		String name = scn.next();
		
		System.out.println("enter email");
		String email = scn.next();
		
		System.out.println("enter passwrod");
		String password = scn.next();
		
		System.out.println("enter age");
		int age = scn.nextInt();
		
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setString(3,email);
		ps.setString(4, password);
		ps.setInt(5,age);
		
		
		ps.execute();
	
		
		System.out.println("data saved successfully");
	}
}

