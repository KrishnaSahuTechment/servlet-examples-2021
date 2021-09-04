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
 * Servlet implementation class LaptopPrice
 */
@WebServlet("/LaptopPrice")
public class LaptopPrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LaptopPrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = 	response.getWriter();
		
		int price = 70000;
		int quantity = Integer.parseInt(request.getParameter("laptop"));
		pw.println("you have selected :"+quantity);
		
		double totalPrice = quantity*price;
		pw.println("<br> <br> Total price "+totalPrice);
		
		pw.println("<a href ='Cart'> go to cart </a>");
		
		String totPrice = String.valueOf(totalPrice);
		Cookie cookie = new Cookie("laptopprice",String.valueOf(totPrice));
		response.addCookie(cookie);
	}

}
