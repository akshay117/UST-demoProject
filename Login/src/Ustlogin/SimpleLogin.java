package Ustlogin;
import java.io.*;
import javax.servlet.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException{
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String user = req.getParameter("userName");
		String pass = req.getParameter("userPassword");
		
		if(user.equals("admin") && pass.equals("admin"))
			pw.println("------------------Login SuccessFull-----------------------");
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1> Student Details</h1>");
		pw.print("<h2> Grade:Good </h2>");
		pw.print("</body>");
		pw.print("</html>");	
		 
		    
	/*	else 
		//pw.println("---------Login Unsuccessfull----------- ");
		pw.close(); */
	 }

}
