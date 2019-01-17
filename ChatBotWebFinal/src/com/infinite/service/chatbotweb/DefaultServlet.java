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

@SuppressWarnings("serial")
public class DefaultServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respence)
			throws ServletException, IOException {

	} //end of doGet

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("enter to doPost() of DefaultServlet");
	
		
		// creating session
				HttpSession session = request.getSession();

				String botMessage = null;
				String userMessage = (String) session.getAttribute("userMessage");
				String userMessageUnchange = (String) session.getAttribute("userMessageUnchange");
				int counter = (int) session.getAttribute("counter");
		
		
				botMessage = "Can't process this request";
				
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

				response.sendRedirect("Messanger.jsp");

		
		
		
	}//end of doPost
}//end of service
