package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


	public class UpdateDatabaseDynamically {
		public static void main(String[] args) throws SQLException {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Komal@28");
		    Scanner scn = new Scanner(System.in);
		    System.out.println("enter student id to update");
			int id = scn.nextInt();
			
			System.out.println("enter new name");
			String name = scn.next();
			
			PreparedStatement ps = con.prepareStatement("update student set name=? where id=?");
			ps.setString(1,name);
			ps.setInt(2,id);
			
			ps.execute();
			
			System.out.println("data update successfully");
		}

	}


