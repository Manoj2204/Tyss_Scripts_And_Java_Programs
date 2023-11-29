package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest 
{
	public static void main(String[] args) throws SQLException 
	{
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the Query");
//		String query = sc.nextLine();
		//Register the driver
		Driver driver= new Driver(); 
		DriverManager.registerDriver(driver);
		
		//get connection of database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet52", "root", "root");
		
		//Creates Statements
		Statement state = con.createStatement();
		String query="select * from student_info;";
		
		
		//Excecute Query
		 ResultSet result = state.executeQuery(query);	
		
		 while(result.next())
		 {
			 System.out.println(result.getString(1)+"  "+result.getInt(2)+"  "+result.getInt(3));
		 }
		 //close database
		 con.close();

	}
}
