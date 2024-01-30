package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteValues 
   {
public static void main(String[] args) throws SQLException
	   {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Komal@28");
	Statement st = con.createStatement();
	st.execute("delete from student where id=1");
	System.out.println("data deleted successfully");
}
}
