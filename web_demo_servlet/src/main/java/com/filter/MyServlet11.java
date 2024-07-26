package com.filter;

import java.io.*;
import javax.servlet.*;
public class MyServlet11 extends GenericServlet
{
    public void service (ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
        response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        out.println ("You are logged into your account.");
    }
}