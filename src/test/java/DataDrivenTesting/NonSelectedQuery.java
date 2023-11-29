package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectedQuery 
{
	public static void main(String[] args) throws SQLException 
	{
		//Register the driver
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		// get connection for database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet52","root","root");
		
		// Create statements
		Statement state = con.createStatement();
		String Query="insert into student_info values('Kara',25,28),('Gopi',10,15);";
		
		// ExecuteUpdate Query
		int result = state.executeUpdate(Query);
		if(result>=1)
		{
			System.out.println("Data insert sucessfully....");
		}
		else 
		{
			System.out.println("Data is not inserted....");
			
		}
		
		//Close database
		con.close();
		
	}

}
