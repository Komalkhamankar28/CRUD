package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchDatabaseDynamic 
{
	public static void main(String[] args) throws SQLException {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter name");
		String name = scn.next();
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Komal@28");
		PreparedStatement ps = con.prepareStatement("select * from student where name=?");
		ps.setString(1, name);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) 
		{
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		}
		else
		{
			System.out.println("no data found");
	
				
			
				
		
		}		
	}

}

