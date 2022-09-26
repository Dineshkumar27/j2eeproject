package com.fita;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
//           
//            String user = request.getParameter("user");
//            String pass=request.getParameter("pass");
//            out.println("<h2> Welcome "+user+"</h2> ");
//            out.println("<h2> your password is "+pass+"</h2> ");
//            
//            if(pass.equals("fita")) {
//            	response.sendRedirect("Thanks");
//            }
        } finally {            
            out.close();
        }
	}
}
    

