package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Helper {
	public static Connection getC() throws SQLException {
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Komal@28");
	
		//PreparedStatement ps = con.prepareStatement("create table student6(id int,name varchar(10),age int)");
				
			return con;
	}
	}

	
		
		


