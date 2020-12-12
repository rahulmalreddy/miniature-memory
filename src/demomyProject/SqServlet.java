package demomyProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    PrintWriter out = res.getWriter();
   /*  int k =(int)req.getAttribute("k");
     k = k*k;
     out.println("these is rahul,these is sq servlet by request dispatcher"+k);*/
 //  int k = Integer.parseInt(req.getParameter("k"));
 //  k= k*k;
 //  out.println("result is"+k);
   String  name= req.getParameter("fullname");
   out.println("full name is"+name);
   
}
}