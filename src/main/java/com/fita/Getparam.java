package com.fita;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Getparam
 */
@WebServlet("/Getparam")
public class Getparam extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		Step1 
		response.setContentType("text/html");
		// step 2
		String userName = request.getParameter("user");
		String passWord = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		// step 3
		out.println("Username is " + userName);
		out.println("Password is " + passWord);
	}

}
