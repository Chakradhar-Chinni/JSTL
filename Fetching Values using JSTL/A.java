package com.jstl.telusko;
//import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
public class A extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		String name = "Welcome to JSTL";
		request.setAttribute("label",name);
		
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request,response);
	}
}
