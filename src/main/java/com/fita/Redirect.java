package com.fita;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Redirect")
public class Redirect extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		resp.sendRedirect("/Myservlet/Thanks");
		
		resp.sendRedirect("https://www.google.co.in");  
		
	}

}
