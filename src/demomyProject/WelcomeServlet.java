package demomyProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String name= req.getParameter("username");
		PrintWriter out = res.getWriter();  
		out.println("welcome to  website"+name);
		
		
	}

	private String getAttribute(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
