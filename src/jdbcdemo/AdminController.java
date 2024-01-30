package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AdminController
{
	
	public static void main(String[] args) throws Exception {
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
		System.out.println("-----------Welcome------------");
		System.out.println("1. ADD EMPLOYEE 2.VIEW EMPLOYEE 3.VIEW ALL EMPLOYESSS");
		System.out.println("4. BLOCK EMPLOYEE 5.UNBLOCK EMPLOYEE 6.DELETE EMPLOYEE BY ID");
		System.out.println("7.UPDATE EMPLOYEE");
		
		int choice = scn.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			   PreparedStatement pstatement = con.prepareStatement("insert into employee(id,name,email,password,accountstatus)values(?,?,?,?,?)");
			   System.out.println("enter id of employee");
			   int id = scn.nextInt();
			   System.out.println("enter name of employee");
			   String name = scn.next();
			   System.out.println("enter email of employee");
			   String email1 = scn.next();
			   System.out.println("enter password of employee");
			   String password1 = scn.next();
			   System.out.println("enter accountstatus of employee");
			   String accountstatus = scn.next();
			   
			   pstatement.setInt(1, id);
			   pstatement.setString(2, name);
			   pstatement.setString(3, email);
			   pstatement.setString(4, password);
			   pstatement.setString(5, accountstatus);
			   pstatement.execute();
			   System.out.println("data saved succesfully");
		   }
		
		      break;
		
		case 2:{
			PreparedStatement pstatement = con.prepareStatement("select employee id to view details");
			System.out.println("enter employee id to view details");
			int id = scn.nextInt();
			pstatement.setInt(1, id);
			ResultSet rset = pstatement.executeQuery();
			if(rset.next()) {
				System.out.println(rset.getInt(1));
				System.out.println(rset.getString(2));
				System.out.println(rset.getString(3));
				System.out.println(rset.getString(4));
				System.out.println(rset.getBoolean(5));
			}
			else {
				System.out.println("no employee found-invalid id");
			}
		}
		       break;
		 
		case 3:{
			
		}break;
		case 4:{
			
		}break;
		case 5:{
		}break;
		case 6:{
			
		}break;
		case 7:{
			
		}break;
	}
		}
	}
}

		
		
	
		
		
	

	


