package com.techment.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;



/**
 * Servlet implementation class SignUP
 */
@WebServlet("/SignUP")
public class SignUP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUP() {
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
		
		
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		
				
		
		out.print("<br> your name is: "+name+"<br> email: "+email+"<br> county: "+country+"<br> pass: "+pass );
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class is found");
			Connection con = DriverManager.getConnection(ConnectionProperty.URL, ConnectionProperty.ID, ConnectionProperty.PASSWORD);
			
			PreparedStatement ps = con.prepareStatement("Insert into REGISTERUSER (NAME,PASS,EMAIL,COUNTRY) values (?,?,?,?);");
			
			ps.setString(1, name);
			ps.setString(2, pass);
			ps.setString(3, email);
			ps.setString(4, country);
			
			ps.execute();
			
			System.out.println("inserted");
			
			out.print("<br> "+name+" Signup succefully ");
			out.print("<br> Signup succefully ");
			out.print("<a href ='login.html'>click here for LogIn</a><br>");
			
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
