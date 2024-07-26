package com.org.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType ("text/html");
	        PrintWriter out = response.getWriter ();
	        String empid = request.getParameter ("empid");
	        try
	        {
	           Class.forName ("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "pass");
	            System.out.println("connected");
	            PreparedStatement ps =
	         con.prepareStatement ("select * from employee where empid=?");
	            ps.setString (1, empid);
	            out.print ("<table width=50% border=1>");
	            out.print ("<caption>Employee Details:</caption>");
	            ResultSet rs = ps.executeQuery ();
	            /* Printing column names */
	            out.print ("</br></br>");
	            ResultSetMetaData rsmd = rs.getMetaData ();
	            int total = rsmd.getColumnCount ();
	            out.print ("<tr>");
	            for (int i = 1; i <= total; i++)
	         {
	             out.print ("<th>" + rsmd.getColumnName (i) + "</th>");
	         }
	            out.print ("</tr>");
	            /* Printing result */
	            while (rs.next ())
	         {
	             out.print ("<tr><td>" + rs.getString (1) + "</td><td>" +  rs.getString (2) + " </td><td>" + rs.getInt (3) + "</td></tr>");
	         }
	            out.print ("</table>");
	        }
	        catch (Exception e2)
	        {
	            e2.printStackTrace ();
	        }
	        finally
	        {
	            out.close ();
	        }
	}

}
