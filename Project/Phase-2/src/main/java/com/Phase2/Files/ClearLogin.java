package com.Phase2.Files;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clearLogin")
public class ClearLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out;
	RequestDispatcher rd;
	private Connection connection;
	private Statement stmt;
	private PreparedStatement ps;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	public void init(ServletConfig sc) {
		ServletContext context = sc.getServletContext();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(context.getInitParameter("adminUrl"),
					context.getInitParameter("adminUser"), context.getInitParameter("adminPass"));
			ps = connection.prepareStatement("insert into userdetails values(?, ?)");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		int result = 0;

		out = response.getWriter();
		if (Username != null && Password != null && Username.trim().length() > 0 && Password.trim().length() > 0) {

			try {
				ps.setString(1, Username);
				ps.setString(2, Password);
				result = ps.executeUpdate();
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				rd = request.getRequestDispatcher("travelDetails.html");
				rd.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

		else {
			rd = request.getRequestDispatcher("userLogin.html");
			response.setContentType("text/html");
			rd.include(request, response);
			out.println("<h3 style=\"text-align: center;\">Sorry Enter Valid Credentials...</h3>");

		}

	}
}
