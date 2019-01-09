package com.infinite.login.chatbotweb;

import java.io.*;
import java.sql.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.infinite.dao.chatbotweb.DBConnection;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		String userName = request.getParameter("name");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		long phoneNumber = Long.parseLong(request.getParameter("phonenumber"));
		String mailId = request.getParameter("mailid");

		// Storing the credentials in a file called login.txt
		File file = new File("C:\\Users\\PR\\Desktop\\Last Use", "login.txt");
		// File file = new File("C:\\Users\\pruthweerajp\\pr", "login.txt");
		// creating a file name as login.txt
		PrintWriter printWriter = new PrintWriter(file);

		// writing all the details in the file and then printing registration successful
		printWriter.println("userName=" + userName);
		printWriter.println("password=" + password);
		printWriter.println("firstName=" + firstName);
		printWriter.println("lastName=" + lastName);
		printWriter.println("phoneNumber=" + phoneNumber);
		printWriter.println("mailId=" + mailId);

		printWriter.println("updated successfully on: " + new Date().toString());
		printWriter.flush();
		printWriter.close();

		System.out.println("Registation Details writted in the login.txt file");
		pw.println("User Registered Successfully on local System");

		// Registering the user to database
		try (Connection con = DBConnection.connect()) {
			if (con != null) {
				PreparedStatement ps = con.prepareStatement("insert into regBot values(?,?,?,?,?,?)");

				ps.setString(1, userName);
				ps.setString(2, password);
				ps.setString(3, firstName);
				ps.setString(4, lastName);
				ps.setLong(5, phoneNumber);
				ps.setString(6, mailId);
				int k = ps.executeUpdate();
				if (k == 1) {
					pw.println("User Registered Successfully");

				} // end of if

			}

		} // end of try
		catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("Login.html");
		rd.include(request, response);

	}

}
