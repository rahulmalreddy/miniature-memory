package demomyProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out= res.getWriter();
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		if(password.contentEquals("rahul")) {
			RequestDispatcher rd=req.getRequestDispatcher("lll");  
	        rd.forward(req, res);  
	       
	    }  
	    else{  
	        out.print("Sorry UserName or Password Error!");  
	       
	                      
	        }  
		

}
}
