package Practice_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Read_Data_From_DataBase {

	public static void main(String[] args) throws SQLException 
	{
		//Register the driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//Get connection of database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet52","root","root");
		
		//Create Statements
		Statement state = con.createStatement();
		String query="select * from student_info;";
		
		//Execute Query
		ResultSet result = state.executeQuery(query);
		while(result.next())
		{
			System.out.println(result.getString(1)+"  "+result.getString(2)+"  "+result.getString(3));
			
		}
		
		// Close the database
		con.close();

	}

}
