package com.filter;

import java.io.*;
import javax.servlet.*;
import java.util.*;
public class MyFilter1 implements Filter
{
    FilterConfig config;
    public void init (FilterConfig filterConfig)
    {
        config = filterConfig;
    }

    public void destroy ()
    {
    }

    //This method is called each time a client requests for a web resource i.e. preprocessing request
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException
    {
        response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();

        if (request.getParameter ("username").equals (config.getInitParameter ("username")) && request.getParameter ("password").equals(config. getInitParameter("password")))
        {
         out.println ("Login success!");
         out.println ("<br/>");
         out.println ("<br/>");
         out.println ("<br/>");

            //doFilter() calls the next filter in the chain or the requested web resource(if there is no more filter)
         chain.doFilter (request, response);
        }
        else
        {
         out.println ("Login failed!");
        }

        out.println ("<br/>");
        out.println ("<br/>");
        out.println ("<br/>");

        //post-processing the request and after the requested web resource is called.
      //  out.println ("<b><i>Message of the day - Never give up!</i></b>");
    }
}