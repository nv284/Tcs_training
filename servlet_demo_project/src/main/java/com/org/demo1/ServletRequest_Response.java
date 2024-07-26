package com.org.demo1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRequest_Response
 */
@WebServlet("/ServletRequest_Response")
public class ServletRequest_Response extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//  response.setContentType("text/html;charset=UTF-8");
		
	        PrintWriter out = response.getWriter();
	        try {
	           
	            String user = request.getParameter("user");
	            out.println("<h2> Welcome "+user+"</h2>");
	        } finally {            
	            out.close();
	        }
	}
	
	 public void doGet(HttpServletRequest req,HttpServletResponse res)
			   throws ServletException,IOException
			   {
			     res.setContentType("text/html");
			     PrintWriter pwriter=res.getWriter();
			     String uname=req.getParameter("val1");
			     String pw=req.getParameter("val2");
			     pwriter.println("User Details Page:");
			     pwriter.println("Hello "+uname);
			     pwriter.println("Your Password is **"+pw+"**");
			     pwriter.close();
			  }

}
