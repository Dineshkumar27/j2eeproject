package com.fita;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DatabaseAccess")
public class DatabaseAccess extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// JDBC driver name and database URL
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8";

		// Database credentials
		final String USER = "root";
		final String PASS = "admin";

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String title = "Database Result";

		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor = \"#f0f0f0\">\n" + "<h1 align = \"center\">" + title + "</h1>\n");
		Connection conn = null;
		Statement stmt = null;
		try {
			// Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// Step 1: Open a connection
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// Step 2:Execute SQL query
			stmt = conn.createStatement();

			String sql;
//			String sql2 = "update employees set age=34 where id=100";
//			stmt.executeUpdate(sql2);

			String sql3 = "delete from employees where id=100";
			stmt.executeUpdate(sql3);
			sql = "SELECT id, first, last, age FROM Employees";
			// Step 3: get the records
			ResultSet rs = stmt.executeQuery(sql);

			// Step 4: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("first");
				String last = rs.getString("last");

				// Display values
				out.println("ID: " + id + " ");
				out.println(", Age: " + age + " ");
				out.println(", First: " + first + " ");
				out.println(", Last: " + last + "<br>");
			}
			out.println("</body></html>");

			// Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
	}
}
