package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class ExecuteUpdate {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","Komal@28");
		Statement st = con.createStatement();
//		int a =st.executeUpdate("INSERT into admin(id,name,email,password) values (3,'Rushikesh','rushikesg@gmail.com','rushi123')");
	    int b = st.executeUpdate("delete from admin where id=3");
	    int c = st.executeUpdate("update admin set password ='1234' where id=1");
	    int d = st.executeUpdate("update admin set name ='komo' ");
	    
//	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	}

}
