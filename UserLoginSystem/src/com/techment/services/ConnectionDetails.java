package com.techment.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;


import java.sql.*;

public class ConnectionDetails {
	
	public static Connection getConnected() throws Exception
	{
		
//		Connection con = null;
		
		
			
			Class.forName(ConnectionProperty.DRIVER_NAME);
			System.out.println("class found and loaded");
			
			Connection con = DriverManager.getConnection(ConnectionProperty.URL, ConnectionProperty.ID, ConnectionProperty.PASSWORD);
		
			
//			System.out.println("con to connect Mysql = "+con);
			System.out.println("connected to my sql succefully ");
			
			
		

		
		
		return  con;
		
	}

}
