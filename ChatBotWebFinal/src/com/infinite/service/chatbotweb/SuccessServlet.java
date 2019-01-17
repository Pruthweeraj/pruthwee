package com.infinite.service.chatbotweb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chatbot.utility.UserBean;

@SuppressWarnings("serial")
public class SuccessServlet extends HttpServlet {

	//adding a counter
		static int counter = 0;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respence)
			throws ServletException, IOException {

		
	} //end of doGet service
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse respence)
			throws ServletException, IOException {
		
		//creating session
		HttpSession session = request.getSession();
		
		// open the file name login.txt
		Properties properties = new Properties();

		FileInputStream fileInputStream = null;
		try {
			String address = "C:\\Users\\PR\\Desktop\\Last Use\\login.txt" ;
			 fileInputStream = new FileInputStream (address);
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
		String userName = properties.getProperty("userName");
		String password = properties.getProperty("password");
		String firstName = properties.getProperty("firstName");
		String lastName = properties.getProperty("lastName");
		long phoneNumber = (Long.parseLong(properties.getProperty("phoneNumber")));
		String mailId = properties.getProperty("userName");

		// creating a UserBean object
		UserBean userBean = new UserBean(userName, password, firstName, lastName, phoneNumber, mailId);
		
		// Adding userBean object to HttpSession object
		session.setAttribute("userBean", userBean);
		System.out.println("userBean object created and added to the session");
		session.setAttribute("counter", counter);

		
		// Loading the Messanger.jsp
		respence.sendRedirect("Messanger.jsp");
		
		
	} //end of doPost service
	
	
	
	
}//end of service
