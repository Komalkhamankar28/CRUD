package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValuesDynamically
{
	public static void main(String[] args) throws SQLException {
		
	        Connection con = Helper.getC();
			try (Scanner scn = new Scanner(System.in)) {
				System.out.println("enter id");
				int id = scn.nextInt();
				System.out.println("enter name");
				String name = scn.next();
				System.out.println("enter age");
				int age = scn.nextInt();
				
				PreparedStatement ps = con.prepareStatement("insert into student(id,name,age) values (?,?,?)");
				
				ps.setInt(1,id);
				ps.setString(2,name);
				ps.setInt(3,age);
				
				ps.execute();
			}
			System.out.println("data saved successfully");
			
			
		}

	}


