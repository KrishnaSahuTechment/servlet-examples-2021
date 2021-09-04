package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindLargest
 */
@WebServlet("/FindLargest")
public class FindLargest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindLargest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		pw.print("<br>====================<br>");
		String whichCalculation = request.getParameter("calculateLargest");
		
		if(whichCalculation.equals("LARGEST"))
		{
			
			String num1 = request.getParameter("n1");
			int number1 = Integer.parseInt(num1); 
			
			String num2 = request.getParameter("n2");
			int number2 = Integer.parseInt(num2);	
			
			String num3 = request.getParameter("n3");
			int number3 = Integer.parseInt(num3);
			
			if(number1>number2&&number1>number3)
			{
				pw.println("Largest : "+number1);
			}
			else if(number2>number1&&number2>number3)
			{
				pw.println("Largest : "+number2);
			}
			else if(number3>number1&&number3>number2)
			{
				pw.println("Largest : "+number3);
			}
			else
			{
				pw.println("number is equal");
			}
			
				
			
		}
	}

}
