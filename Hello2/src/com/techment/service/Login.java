package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		System.out.println("Hello this is my first servlet <br>");
		PrintWriter out = response.getWriter();
		out.print("hello this Krishna  from servlet Login thanks");
		
		String name = request.getParameter("u");
		String pass = request.getParameter("p");
		
		int nameLength = name.length();
		
		out.print("<br> your name is: "+name+"<br> name length: "+nameLength);
		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
