package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

	public class DeleteDatabaseDynamically {
		public static void main(String[] args) throws SQLException {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Komal@28");
		    Scanner scn = new Scanner(System.in);
		    System.out.println("enter new nameee");
			String name = scn.next();
			
			PreparedStatement ps = con.prepareStatement("delete from student where name=?");
			ps.setString(1,name);
			ps.execute();
			
			System.out.println("data deleted successfully");
		}

	}

