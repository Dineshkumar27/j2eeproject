package com.fita;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Urlrewriting
 */
@WebServlet("/Urlrewriting")
public class Urlrewriting extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String n = request.getParameter("userName");
			out.print("Welcome " + n);

			// creating submit button
			/*
			 * out.print("<form action='Servlet2?uname='" + n + "method='post'>");
			 * out.print("<input type='submit' value='go'>"); out.print("</form>");
			 */

			out.println("<a href='Servlet2?uname'" + n + ">visit</a>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
