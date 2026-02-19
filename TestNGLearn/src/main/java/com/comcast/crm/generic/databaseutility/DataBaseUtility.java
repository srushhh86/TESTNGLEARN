package com.comcast.crm.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {

	Connection con=null; // another method we close so declare globally
	public void getDBConnection(String url,String username,String password) throws SQLException
	{
		
		try
		{
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection(url, username, password);

		}
		catch(Exception e)
		{
			
		}
				
	}
	
	public void getDBConnection() throws SQLException
	{
		
		try
		{
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3307/ninza_hrm", "rmgyantra", "rmgy@9999");

		}
		catch(Exception e)
		{
			
		}
				
	}
	
	
	public void closeDBConnection() throws SQLException 
	{
		con.close();
	}

	
	public ResultSet executeConSelectQuery(String query) throws SQLException
	{
		ResultSet result=null;
		try {
			Statement stat = con.createStatement();
			result = stat.executeQuery(query);

		}
		catch(Exception e)
		{
			
		}
		return result;
				
	}
	
	

	public int executeNonSelectQuery(String query) throws SQLException
	{
		int result=0;
		try {
			Statement stat = con.createStatement();
			result = stat.executeUpdate(query);

		}
		catch(Exception e)
		{
			
		}
		return result;
				
	}
	
	
	

	
}
