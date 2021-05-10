package Prime;

import java.io.*;
import java.util.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
/**
 * Servlet implementation class ClassPrime
 */
@WebServlet("/ClassPrime")
public class ClassPrime extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * Default constructor. 
     */
    public ClassPrime() {
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int number = Integer.parseInt(request.getParameter("number"));

		List<Integer> primeList = new ArrayList<>();
		
		for (int i = 0; i < number; i++) {
			if (isPrime(i))
				primeList.add(i);
		}
		request.setAttribute("primeList", primeList);
		request.getRequestDispatcher("primeResult.jsp").forward(request, response);
		
		out.close();
	}
	
	public static boolean isPrime (int input1) {
		if (1 == input1) return false;
		
		for (int i = 2; i < input1; i++) {
			if (i == input1) continue;
			if (input1 % i == 0) {
				return false;
			}
		}
		
		return true;
	}


}
