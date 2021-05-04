package serv;

import bean.AucBean;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;

public class aucServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public aucServ() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int itemId=Integer.parseInt(request.getParameter("itemid"));
		String itemName=request.getParameter("iname");
		String name=request.getParameter("uname");
		String email=request.getParameter("mail");
		int bid=Integer.parseInt(request.getParameter("bid"));
		String status=request.getParameter("chk");
		AucBean b=new AucBean(itemId,itemName,name,email,bid,status);
		request.setAttribute("b",b);
		request.getRequestDispatcher("Aucjsp.jsp").forward(request,response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
