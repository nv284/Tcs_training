package com.org.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class MyServlet1
 * servletConfig
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<h2> Using ServletConfig object</h2> ");


	//Reading one parameter 
	out.println("<b>Reading only one parameter its value </b> <br/>");
	out.println("The Subject is " + getInitParameter("Subject"));
	out.println("<br/>");
	out.println("<br/>");


	//Reading all the parameters
	out.println("</b> Reading all the parameter and their values </b>  <br/>");
	Enumeration enum1 =  getInitParameterNames();
	while(enum1.hasMoreElements())
	{
	String paramName = (String)enum1.nextElement();
	String paramValue = getInitParameter(paramName);
	out.println("Parameter "+ paramName + " has a value " + paramValue);
	out.println("<br/>");
	}
	out.println("<br/>");


	//Reading the name of the Servlet
	out.println("</b> Reading the name of Servlet</b>  <br/>");
	out.println("Servlet Name : " + getServletName());
	}
}
