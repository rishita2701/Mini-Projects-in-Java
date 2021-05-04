package Basics;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;;

public class Login extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String user=request.getParameter("username");  
	    String pass=request.getParameter("userpass");  
	          
	    if(user.equals("Rishita")  &&  pass.equals("rish")){  
	        out.print("SUCCESS");  
	    }  
	    else{  	        
	    	out.print("FAILED");  	         
	    }  
	          
	    out.close();  
	    }  
}
