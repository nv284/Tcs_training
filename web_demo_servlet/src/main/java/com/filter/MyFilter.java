package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/MyFilter")
public class MyFilter extends HttpFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter (ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException
    {
        PrintWriter out = resp.getWriter ();
        String s = config.getInitParameter ("construction");
        if (s.equals ("yes"))
        {
         out.print ("This page is under construction");
        }
        else
        {
         chain.doFilter (req, resp); // sends request to next resource
        }
    }

	/**
	 * @see Filter#init(FilterConfig)
	 */
	FilterConfig config;
    public void init (FilterConfig config) throws ServletException
    {
        this.config = config;
    }

}
