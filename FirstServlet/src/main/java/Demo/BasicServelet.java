package Demo;
import java.io.*;
//import javax.servlet.*;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BasicServelet extends HttpServlet{

	public String message;
	
	public void init() throws jakarta.servlet.ServletException{
		// TODO Auto-generated method stub
		message="HELLO WORLD!";

	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>" + message + "</h1>");

	}
	
	public void destroy() {
		// TODO Auto-generated method stub

	}
}
//http://localhost:8080/FirstServlet/welcome   
//use this to open the servlet


