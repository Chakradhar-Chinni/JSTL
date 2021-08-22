package com.jstl.telusko;
//import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
public class A extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		
		List<userbean> studs = Arrays.asList(new userbean(1,"Navin"),new userbean(2,"Aarti"),new userbean(3,"Pratik"));
		request.setAttribute("users",studs);
		
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request,response);
		
	}
}
