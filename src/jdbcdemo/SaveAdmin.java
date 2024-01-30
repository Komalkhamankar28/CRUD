package jdbcdemo;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveAdmin {

	public static void main(String[] args) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","Komal@28");
		PreparedStatement ps = con.prepareStatement("INSERT into ADMIN(id,name,email,password) values (?,?,?,?)");
				
		       Scanner scn = new Scanner(System.in);
				System.out.println("enter id");
				int id = scn.nextInt();
				
				System.out.println("enter name");
				String name = scn.next();
				
				System.out.println("enter email");
				String email = scn.next();
				
				System.out.println("enter password");
				String password = scn.next();
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, email);
				ps.setString(4, password);
				
				ps.execute();
				System.err.println("data saved");
				
	}
}
