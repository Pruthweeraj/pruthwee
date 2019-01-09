package com.infinite.login.chatbotweb;

import java.io.*;
import java.sql.*;
import java.util.Properties;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.infinite.dao.chatbotweb.DBConnection;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respence)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		// creating session
		HttpSession session = request.getSession();
		boolean internet = false;

		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		try (Connection con = DBConnection.connect()) {
			if (con != null) {

				// set Internet is available
				internet = true;
				session.setAttribute("internet", internet);
				System.out.println("internet is available");
				PreparedStatement ps = con.prepareStatement("select * from regBot where USER_NAME=? and PASSWORD=? ");
				ps.setString(1, userName);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					pw.println("<lable style=\"color:pink\">HI User </br> Login success..!!!</leble>");
					// RequestDispatcher rd =req.getRequestDispatcher("dis");

					// Loading the SuccessServlet
					RequestDispatcher rd = request.getRequestDispatcher("success");
					rd.forward(request, response);

				} // end of if
				else {
					pw.println(
							"<lable style=\"color:red\">Invalid UserName or Password  </br> Please try again..!!!</leble>");
					RequestDispatcher rd = request.getRequestDispatcher("Login.html");
					rd.include(request, response);

				} // end of else

			} else {
				// set Internet is not available
				internet = false;
				session.setAttribute("internet", internet);
				System.out.println("internet is not available");

				// open the file name login.txt
				Properties properties = new Properties();

				FileInputStream fileInputStream = null;
				try {
						String address = "C:\\Users\\PR\\Desktop\\LastUse\\login.txt";
						System.out.println(address);
						fileInputStream = new FileInputStream(address);
					//fileInputStream = new FileInputStream("C:\\Users\\pruthweerajp\\pr\\login.txt");
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				}

				// loading the file to the properties object
				try {
					properties.load(fileInputStream);
				} catch (IOException e) {
					e.printStackTrace();
				}

				// if exist then redirect the user to the SuccessServlet
				String fileUserName = properties.getProperty("userName");
				String filePassword = properties.getProperty("password");
				if (fileUserName.equals(userName) && filePassword.equals(password)) {
					System.out.println("valid user ");
					RequestDispatcher rd = request.getRequestDispatcher("success");
					rd.forward(request, response);

				}

				// if not exist then reload the login page with a invalid credential message

				pw.println(
						"<lable style=\"color:red\">Invalid UserName or Password  </br> Please try again..!!!</leble>");
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);

			}
		} // end of try

		catch (Exception e) {
			e.printStackTrace();
		}

	}// end of doPost
}//end of service
