<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>
</head>
<body>

<%@page import="java.sql.*,java.util.*"%>


<%@page import ="java.io.*"%>
<%@page import ="java.*"%>
 
<%@page import ="javax.servlet.*"%>

<%@page  import = "java.util.*"%>
<%@page  import  = "java.sql.*" %>


<%
String name = request.getParameter("u");
String pass = request.getParameter("p");

out.println("user name: "+name+"<br><br>");
out.println("password: "+pass+"<br><br>");





out.print("<br> your name is: "+name+"<br> pass: "+pass);



try {
	



	
	 String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	 String URL ="jdbc:mysql://localhost:3306/userTechment?autoReconnect=true&useSSL=false" ;
	 String ID = "root";
	 String PASSWORD = "root";
	
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver Class is found");
	java.sql.Connection  con = DriverManager.getConnection(URL,ID,PASSWORD);
	
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
			RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
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
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		out.print("<br> incorrect userId or password please try again ");
	}
	
	
}catch(Exception e) {
	
	System.out.println("caught: "+e);
}



%>


<%--
this is comment
 --%>

</body>
</html>