package com.fita;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contextdemo
 */
@WebServlet("/Contextdemo")
public class Contextdemo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		// creating ServletContext object
//		ServletContext context = getServletContext();

		// Getting the value of the initialization parameter and printing it
//		String userName = context.getInitParameter("username");
//		pw.println("username is=" + userName);

		ServletContext context = getServletContext();
		Enumeration<String> e = context.getInitParameterNames();

		String str = "";
		while (e.hasMoreElements()) {
			str = e.nextElement();
			pw.print("<br>" + str);
			pw.print(": " + context.getInitParameter(str));
		}

		pw.close();
	}

}
