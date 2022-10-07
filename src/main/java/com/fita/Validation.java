package com.fita;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validation
 */
@WebServlet("/Validation")
public class Validation extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		if (name.equals("Fita") && pass.equals("fita123")) {
			RequestDispatcher dis = request.getRequestDispatcher("Welcome");
			dis.forward(request, response);
		} else {
			pwriter.print("User name or password is incorrect!");
			RequestDispatcher dis = request.getRequestDispatcher("Index.html");
			dis.include(request, response);
		}
	}
}