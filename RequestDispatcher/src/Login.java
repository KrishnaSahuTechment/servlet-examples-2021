

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
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
		 
		String checkAges = request.getParameter("age");
		
		
		
			int age = Integer.parseInt(checkAges);
			 
			 if(age>=18)
			 {
				
				 RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
				 rd.include(request, response);
				 out.println("you can  vote age");
			 }
			 else
			 {
				 
				 RequestDispatcher rd = request.getRequestDispatcher("index.html");
				 rd.include(request, response);
				 out.println("you can not vote age should be greater than 18");
				 
			 }
			 
		
	
	}

}
