package com.techment.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MobilePrice
 */
@WebServlet("/MobilePrice")
public class MobilePrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MobilePrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
		PrintWriter pw = 	response.getWriter();
		int price = 40000;
		
		int quantity = Integer.parseInt(request.getParameter("phone"));
		pw.println("you have selected: "+quantity);
		
		double totalPrice = quantity*price;
		pw.println("<br> <br>  Total price: "+totalPrice);
		
		pw.println("<a href ="+"Cart"+"> go to cart </a>");
		
		String totPrice = String.valueOf(totalPrice);
		Cookie cookie = new Cookie("mobileprice",String.valueOf(totPrice));
		response.addCookie(cookie);
	
	}

}
