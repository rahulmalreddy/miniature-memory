package crudOperation;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)   
	           throws ServletException, IOException {  
	  // PrintWriter out=response.getWriter();  
	   
	   
	      String sid=request.getParameter("id");  
	        int id=Integer.parseInt(sid);  
	        Empdao.delete(id);  
	        response.sendRedirect("ViewServlet");  
	   
}
}
