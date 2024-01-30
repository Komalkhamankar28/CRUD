package jdbcdemo;

public class LoadandRegisterDriver 
{
public static void main(String[] args) throws ClassNotFoundException
{
	Class.forName("com.mysql.cj.jdbc.Driver") ;//url of jdbc driver
	System.out.println("driver register successfully");
}
}
