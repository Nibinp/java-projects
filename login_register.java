package login_and_registration;
import java.sql.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		final  String adminpas = "nibinps4";
		int option;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----------------------------");
		System.out.println("1 -> Login .");
		System.out.println("2 -> Registration .");
		System.out.println("3 -> Read all data.");
		System.out.println("-----------------------------");
		
		System.out.print("select option - ");
		option= scan.nextInt();

		if(option ==1)
		{
			login();
		}
		else if(option ==2)
		{
			register();
		}
		else if(option==3)
		{
			String pass;
			System.out.print("Admin password :");
			pass = scan.next();
			
			if(pass.equals(adminpas))
			{
				readdata();
			}
			else
			{
				System.out.println("Wrong pssword ! \nNot an admin");
			}
			
		}
		else {
			System.out.println("Invalid input !");
		}
		
	}




public static void login() throws SQLException
{                 
	

    String url ="jdbc:mysql://localhost:3306/nibin";
	String user ="root";
	String pass="#nibinps4@2006";
	Connection con = DriverManager.getConnection(url, user, pass);
	
	String Query = "select * from loginreg;";
	
	Statement st= con.createStatement();
	ResultSet rs = st.executeQuery(Query);
	
	String name;
	
	Scanner scan = new Scanner(System.in); 
	System.out.print("Enter UserName : ");
	name= scan.next();
	
	
	
    boolean	isthere =false;
	while(rs.next())
	{
		if(name.equals(rs.getString(2)))
		{
			String pas;
			
			System.out.print("UserName : " + rs.getString(2) + "\n");
			System.out.print("Enter password :");
			pas = scan.next();
			
		
			if(pas.equals(rs.getString(3)))
			{
				System.out.println("City :" + rs.getString(4));
				isthere= true;
			}
			else 
			{
				System.out.println("Wrong password ");
			}
		}
	}
	if(!isthere)
	{
		System.out.println("Invalid ID ");
	}
		con.close();
}	

public static void register() throws SQLException
{
    String url ="jdbc:mysql://localhost:3306/nibin";
	String user ="root";
	String pass="#nibinps4@2006";
	Connection con = DriverManager.getConnection(url, user, pass);
	
	int id;
	String username,password,city;
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter id :");
	id= scan.nextInt();
	System.out.print("Enter name :");
	username = scan.next();
	System.out.print("Enter password :");
	password = scan.next();
	System.out.print("Enter city :");
	city = scan.next();
	
	String Query ="insert into loginreg values(" + id+",'" + username + "','" + password + "','" + city +"');";
	Statement st = con.createStatement();
	int rows = st.executeUpdate(Query);
	
	
	if(rows ==1)
	{
		System.out.println("user registered");
	}
	
	con.close();
}


public static void readdata() throws SQLException
{
	String url ="jdbc:mysql://localhost:3306/nibin";
	String user ="root";
	String pass="#nibinps4@2006";
	Connection con = DriverManager.getConnection(url, user, pass);
	//this statement loads and registers the the database
	
	String Query = "select * from loginreg;";
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(Query);
	
	
	while(rs.next())
	{
		System.out.println(" id :" + rs.getInt(1) );
		System.out.println(" UserName :" + rs.getString(2));
		System.out.println(" password :" +rs.getString(3) );
		System.out.println(" city :" + rs.getString(4) + "\n");
	}
	
	con.close();
}




}
