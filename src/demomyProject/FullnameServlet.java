package demomyProject;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FullnameServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		String name1 = req.getParameter("firstname");
		String name2 = req.getParameter("lastname");
		String fullname  = name1+name2;
		
		
	//	HttpSession session = req.getSession();
	//	session.setAttribute("fullname",fullname); 
		
		Cookie cookie = new Cookie("fullname", fullname);
		res.addCookie(cookie);
		
		res.sendRedirect("nn");
		
	}

}
