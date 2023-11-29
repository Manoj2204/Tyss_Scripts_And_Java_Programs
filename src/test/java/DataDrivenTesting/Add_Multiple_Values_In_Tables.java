package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Add_Multiple_Values_In_Tables 
{
	public static void main(String[] args) throws SQLException 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Query");
		String query = sc.nextLine();
		//Register the database
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		
		// Get Connection of database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet52", "root", "root");
		
		//Create statements 
		Statement state = con.createStatement();
		
		
//		///Execute Query
//		//ResultSet result = state.executeUpdate(query);
//		while(result.next())
//		{
//			System.out.println(result.getString(1)+"  "+result.getString(2)+"  "+result.getString(3));
//		}
//		
//		//Close the database
		
	}

}
