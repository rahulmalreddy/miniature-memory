package demomyProject;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	//	int i =Integer.parseInt(req.getParameter("num1"));
	//	int j =Integer.parseInt(req.getParameter("num2"));
		
		
		String name1 = req.getParameter("name1");
		String name2 = req.getParameter("name2");
		String fullname  = name1+name2;
		

	//	int k = i+j;

//	PrintWriter out= res.getWriter();
//out.println("name is"+fullname);

		

/*	RequestDispatcher rd = req.getRequestDispatcher("Sq");
	rd.forward(req, res);
	req.setAttribute("k", k);*/
	
//	res.sendRedirect("Sq?k="+k);
	res.sendRedirect("Sq?fullname="+fullname);
	
	}

}
