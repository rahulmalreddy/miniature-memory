package demomyProject;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	//	HttpSession session =req.getSession();
	//	String name = (String) session.getAttribute("fullname");
		
    PrintWriter out = res.getWriter();
	//	out.println("full name is"+name);
		
		String fullname="";
		Cookie cookies[] = req.getCookies();
		for(Cookie c:cookies ) {
			if(c.getName().equals("fullname"))
				fullname= c.getValue();
		}
	
		out.println("fullname s "+fullname);
	}
	
       
}
