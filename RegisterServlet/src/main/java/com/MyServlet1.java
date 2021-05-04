package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;

import jakarta.servlet.http.*;

/**
 * Servlet implementation class MyServlet1
 */
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * Default constructor. 
     */
    public MyServlet1() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String user=request.getParameter("username");  
	    String email=request.getParameter("email");  
	    String pass=request.getParameter("userpass");  
	    String state=request.getParameter("state");  

	          
	    if(user.equals("")  &&  pass.equals("") && email.equals("")  &&  state.equals("")){  
	        out.print("Please fill all the details and try again.");  
	    }  
	    else{  	        
	    	out.print("Thank You "+ user +"Registration Successful");  	         
	    }  
	          
	    out.close();  
	    }  
}
