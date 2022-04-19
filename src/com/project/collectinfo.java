package com.project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/collectinfo")
public class collectinfo extends HttpServlet {
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		
		response.getWriter().append("<body><div>");
		response.getWriter().append(fname+" "+mname+" "+lname);
		response.getWriter().append("</div></body>");
		
		
		
	}

}
