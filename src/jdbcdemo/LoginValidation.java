package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginValidation {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","Komal@28");
		PreparedStatement ps = con.prepareStatement("select * from admin where email=? and password=?");
		System.out.println("Enter email");
		Scanner scn = new Scanner(System.in);
		String email = scn.next();
		
		System.out.println("Enter password");
		String password = scn.next();
		
		ps.setString(1, email);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
		System.out.println("Welcome");
		}
		else {
			System.out.println("Invalid Credentails");
		}
	}

}
