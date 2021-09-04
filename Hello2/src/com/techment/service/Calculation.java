package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.util.Which;

/**
 * Servlet implementation class Calculation
 */
@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculation() {
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
	
		String whichCalculation = request.getParameter("calculate");
		
		if(whichCalculation.equals("ADD"))
		{
			
			String num1 = request.getParameter("n1");
			int number1 = Integer.parseInt(num1); 
			
			String num2 = request.getParameter("n2");
			int number2 = Integer.parseInt(num2);	
			
			int add = (number1+number2);
			pw.println("Addition : "+add);
			
		}
		
		else if(whichCalculation.equals("SUB"))
			{
				
				String num1 = request.getParameter("n1");
				int number1 = Integer.parseInt(num1); 
				
				String num2 = request.getParameter("n2");
				int number2 = Integer.parseInt(num2);	
				
				int sub = (number1-number2);
				pw.println("Substraction : "+sub);
				
			}
		else if(whichCalculation.equals("MUL"))
		{
			
			String num1 = request.getParameter("n1");
			int number1 = Integer.parseInt(num1); 
			
			String num2 = request.getParameter("n2");
			int number2 = Integer.parseInt(num2);	
			
			int sub = (number1*number2);
			pw.println("Multiplication : "+sub);
			
		}
		else if(whichCalculation.equals("DIV"))
		{
			
			String num1 = request.getParameter("n1");
			int number1 = Integer.parseInt(num1); 
			
			String num2 = request.getParameter("n2");
			int number2 = Integer.parseInt(num2);	
			
			int sub = (number1/number2);
			pw.println("Division : "+sub);
			
		}
		else if(whichCalculation.equals("LARGEST"))
		{
			
			String num1 = request.getParameter("n1");
			int number1 = Integer.parseInt(num1); 
			
			String num2 = request.getParameter("n2");
			int number2 = Integer.parseInt(num2);	
			
			
			if(number1>number2)
			{
				pw.println("Largest : "+number1);
			}
			else if(number1<number2)
			{
				pw.println("Largest : "+number2);
			}
			else
			{
				pw.println("number is equal");
			}
			
				
			
		}
		
	
	}

}
