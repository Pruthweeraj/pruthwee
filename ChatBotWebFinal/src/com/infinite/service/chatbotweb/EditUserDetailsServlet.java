package com.infinite.service.chatbotweb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chatbot.utility.UserBean;

@SuppressWarnings("serial")
public class EditUserDetailsServlet extends HttpServlet {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respence)
			throws ServletException, IOException {
		System.out.println("enter to doGet() of EditUserDetailsServlet");

		// creating session
		HttpSession session = request.getSession();

		String botMessage = null;
		String userMessage = (String) session.getAttribute("userMessage");
		String userMessageUnchange = (String) session.getAttribute("userMessageUnchange");
		int counter = (int) session.getAttribute("counter");
		UserBean userBean = (UserBean) session.getAttribute("userBean");

		String uEditMessage = (String) session.getAttribute("uEditMessage");
		if (uEditMessage == null) {
			uEditMessage = "passwordCheck";
			userMessageUnchange = "Yes";
			botMessage = "Enter your password to continue <br/> the profile edit";
		} else if (uEditMessage.equalsIgnoreCase("passwordCheck")) {
			//String password = (String) session.getAttribute("password");
			if (userMessageUnchange.equals(userBean.getPassword())) {
				uEditMessage = "changefield";
				userMessageUnchange = "*************";
				botMessage = "Verification successful. <br/> What you want to edit..?<br/>" + "<ul>\r\n"
						+ "  <li>User Name</li>\r\n" + "  <li>Password</li>\r\n" + "  <li>First Name</li>\r\n"
						+ "  <li>Last Name</li>\r\n" + "  <li>Number</li>\r\n" + "  <li>Mail Id</li>\r\n" + "</ul>";
			} else {
				uEditMessage = "passwordCheck";
				String attempt = (String) session.getAttribute("atempetCount");
				int attemptCount ; //= (int) session.getAttribute("attemptCount");
				if (attempt == null) {
					attemptCount = 2;
					session.setAttribute("attemptCount", attemptCount);
					session.setAttribute("attempt", "attemptDone");
				}else {
					attemptCount = (int) session.getAttribute("attemptCount");
				}
				if (attemptCount != 0) {
					userMessageUnchange = "*************";
					botMessage = "Wrong Password <br/> Please Try again...!!!<br/><br/><lable style=\"color:red\">You hane "
							+ (attemptCount++) + " more change</leble>";
				} else {
					botMessage = "Sorry,<br/> Please try after some time...!!!";
					// make all session object to null
					uEditMessage = null;
					session.setAttribute("attempt", null);
				} // end of else
			} // end of else
		} else if (uEditMessage.equalsIgnoreCase("changefield")) {
			if (userMessage.equals("username") || userMessage.equals("user name")) {
				uEditMessage = "userName";
				botMessage = "Enter New user Name";
			} else if (userMessage.equals("password") || userMessage.equals("password")) {
				uEditMessage = "password";
				botMessage = "Enter New password";
			} else if (userMessage.equals("first name") || userMessage.equals("firstname")) {
				uEditMessage = "firstName";
				botMessage = "Enter New First Name";
			} else if (userMessage.equals("last name") || userMessage.equals("lastname")) {
				uEditMessage = "lastName";
				botMessage = "Enter New Last Name";
			} else if (userMessage.equals("number") || userMessage.equals("number")) {
				uEditMessage = "number";
				botMessage = "Enter New number";
			} else if (userMessage.equals("mail id") || userMessage.equals("mailid") || userMessage.equals("mail")) {
				uEditMessage = "maild";
				botMessage = "Enter New Mail Id";
			} // end of if
		} else if (uEditMessage.equalsIgnoreCase("userName")) {
			userBean.setUserName(userMessageUnchange);
			botMessage = "Change Successful";
			uEditMessage = null;
			session.setAttribute("attempt", null);
		} else if (uEditMessage.equalsIgnoreCase("password")) {
			userBean.setPassword(userMessageUnchange);
			botMessage = "Change Successful";
			uEditMessage = null;
			session.setAttribute("attempt", null);
		} else if (uEditMessage.equalsIgnoreCase("firstName")) {
			userBean.setfirstName(userMessageUnchange);
			botMessage = "Change Successful";
			uEditMessage = null;
			session.setAttribute("attempt", null);
		} else if (uEditMessage.equalsIgnoreCase("lastName")) {
			userBean.setlastName(userMessageUnchange);
			botMessage = "Change Successful";
			uEditMessage = null;
			session.setAttribute("attempt", null);
		} else if (uEditMessage.equalsIgnoreCase("number")) {
			userBean.setPhoneNumber(Long.parseLong(userMessage));
			botMessage = "Change Successful";
			uEditMessage = null;
			session.setAttribute("attempt", null);
		} else if (uEditMessage.equalsIgnoreCase("mailId")) {
			userBean.setMailId(userMessageUnchange);
			botMessage = "Change Successful";
			uEditMessage = null;
			session.setAttribute("attempt", null);
		}

		// Adding the updated uEditMessage for the next operation
		session.setAttribute("uEditMessage", uEditMessage);

		// adding the messages to map and redirecting to messanger.jsp
		Map messages = (Map) session.getAttribute("messages");

		if (messages == null) {
			Map map = new LinkedHashMap<>();
			ArrayList arrayList = new ArrayList<>();
			arrayList.add(userMessageUnchange);
			arrayList.add(botMessage);
			map.put(++counter, arrayList);
			session.setAttribute("messages", map);
			session.setAttribute("counter", counter);
		}

		if (messages != null) {
			ArrayList arrayList = new ArrayList<>();
			arrayList.add(userMessageUnchange);
			arrayList.add(botMessage);
			System.out.println(userMessage + "   " + botMessage);
			messages.put(++counter, arrayList);
			session.setAttribute("counter", counter);
		}

		respence.sendRedirect("Messanger.jsp");

	} // end of doGet

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("enter to doPost() of EditUserDetailsServlet");

	}// end of doPost
}// end of Service
