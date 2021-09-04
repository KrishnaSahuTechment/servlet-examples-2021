package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindAge
 */
@WebServlet("/FindAge")
public class FindAge extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAge() {
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
		pw.print("<br>=========Age===========<br>");
		String whichCalculation = request.getParameter("calculateAge");
		
		if(whichCalculation.equals("AGE"))
		{
			
			String birthdate = request.getParameter("n1");
			
			LocalDate today = LocalDate.now();
			
//			LocalDate birthdate =	LocalDate.of(1995, 10, 20);
			
			LocalDate BirthDateAfterParse =  LocalDate.parse(birthdate);
			
			Period period = Period.between(BirthDateAfterParse, today);
			
			System.out.println("years: "+period.getYears()+" Months: "+period.getMonths()+" Day: "+period.getDays());
			
			pw.println("today: "+today+"<br><br>");
			pw.println(" Your age is years: "+period.getYears()+" Months: "+period.getMonths()+" Day: "+period.getDays());
//		System.out.println((birthdate.isBefore(today)));
			
		}	
		
		
		
		
	}

}
