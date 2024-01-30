package preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.DriverManager;

public class FetchDataDynamically {
	
	public static void main(String[] args) throws SQLException {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter id");
		int id = scn.nextInt();
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Komal@28");
		PreparedStatement ps = con.prepareStatement("select * from user where id=?");
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) 
		{
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getString(4));
		System.out.println(rs.getLong(5));
		
		ps.execute();
		
		}		
	}
}
