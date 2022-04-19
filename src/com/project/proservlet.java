package com.project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/authenticate")
public class proservlet extends HttpServlet {

	HashMap<String, String> userlist ;

	public static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/projectdb";

		Connection connect= null;
		try {
			connect = DriverManager.getConnection(url,"root","gta6");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connect;
	}// connection method end



	@Override
	public void init() throws ServletException {

		Connection connect = connect();
		userlist = new HashMap<>();

		try {
			PreparedStatement pstmt = connect.prepareStatement("select * from user_log");

			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {
				userlist.put(rs.getString(1), rs.getString(2)) ;

			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}//init end


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user = request.getParameter("uname");
		String pass = request.getParameter("pass");

		String pcheck = userlist.get(user);

		if(pcheck!=null) {

			if(pcheck.equals(pass)) {
				
				
				response.sendRedirect("http://localhost:8080/Project/Registration.html");
				response.getWriter().append("<script>alert('Incorrect Credential');<script>");
			}
			else {
				
				response.sendRedirect("http://localhost:8080/Project/");
			
			
			}

		}
		else {
		
			response.sendRedirect("http://localhost:8080/Project/");
			
		}





	}

}
