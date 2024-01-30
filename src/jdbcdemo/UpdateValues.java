package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateValues 
  {
public static void main(String[] args)  throws SQLException
    {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Komal@28");
	Statement st = con.createStatement();
	st.execute("update student set name='din' where id=3");
	System.out.println("data updated successfully");
}
}
