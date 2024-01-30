package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {
public static void main(String[] args) throws SQLException
{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Komal@28");
	Statement st = con.createStatement();
	st.execute("insert into student3 values(2,'Rani',20,'develop')");
	st.execute("insert into student3 values(3,'komal',30,'tester')");
	st.execute("insert into student3 values(4,'Chhaya',40,'businesswomen')");
	System.out.println("values inserted successfully");
}
}
