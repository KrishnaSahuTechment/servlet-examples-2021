package com.techment.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class Login
 */
@WebServlet("/userLogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		
		String name = request.getParameter("u");
		String pass = request.getParameter("p");
		
		
		
//		out.print("<br> your name is: "+name+"<br> pass: "+pass);

		
		
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class is found");
			Connection con = DriverManager.getConnection(ConnectionProperty.URL, ConnectionProperty.ID, ConnectionProperty.PASSWORD);
			
			PreparedStatement ps = con.prepareStatement("select * from REGISTERUSER;");
						
			ps.execute();
			
			ResultSet rs=ps.executeQuery();
			int loggedin = 0;
			while(rs.next())
			{
				
				String uname = rs.getString(1);
				String password = rs.getString(2);
				
				if(uname.equals(name) && password.equals(pass))
				{loggedin = 1;
					System.out.println("Login successfull");
					RequestDispatcher rd = request.getRequestDispatcher("profile.html");
					 rd.include(request, response);
					 out.print("<br> welcome "+uname);
					 break;
				}
				else
				{
					loggedin = 2;		
										
				}
				
				
			}
			
			if(loggedin == 2)
			{
				RequestDispatcher rd = request.getRequestDispatcher("index.html");
				out.print("<br> incorrect userId or password please try again ");
			}
			
			
		}catch(Exception e) {
			
			System.out.println("caught: "+e);
		}
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
