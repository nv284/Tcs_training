package com.forword;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispatcherDemo
 */
@WebServlet("/RequestDispatcherDemo")
public class RequestDispatcherDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("val1");  
	    String u=request.getParameter("val2"); 
	    String p=request.getParameter("val3");  
	          
	    if(p.equals("Edureka Learnings"))
	            {  
	        RequestDispatcher rd=request.getRequestDispatcher("display1");  
	        rd.forward(request, response);  
	    }  
	    else{  
	        out.print("Incorrect UserId or Password");  
	        RequestDispatcher rd=request.getRequestDispatcher("/info.html");  
	        rd.include(request, response);  
	                      
	        }  
	    }  
	  
	 

	}


