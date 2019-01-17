package com.infinite.service.chatbotweb;

import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class LogicalReplayServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respence)
			throws ServletException, IOException {

	} // end of doGet

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("enter to doPost() of LogicalReplayServlet");

		// creating session
		HttpSession session = request.getSession();
		//String address = null;

		String botMessage = null;
		String userMessage = (String) session.getAttribute("userMessage");
		String userMessageUnchange = (String) session.getAttribute("userMessageUnchange");
		int counter = (int) session.getAttribute("counter");

		// check if contains any logical message
		if (userMessage.contains("date")) {
			botMessage = new Date().toString();
			// Us time
		} else if (userMessage.contains("us time") || userMessage.contains("us time")
				|| userMessage.contains("usa time") || userMessage.contains("ast")) {
			botMessage = ZonedDateTime.now(ZoneId.of("America/Montreal"))
					.format(DateTimeFormatter.ofPattern("hh:mm  dd-MMM-uuuu"));
			// Indian time
		} else if (userMessage.contains("time") || userMessage.contains("indian time") || userMessage.contains("ist")) {
			botMessage = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"))
					.format(DateTimeFormatter.ofPattern("hh:mm  dd-MMM-uuuu"));
			// view userDetails
		} else if (userMessage.contains("userdetails") || userMessage.contains("details")
				|| userMessage.contains("my details") || userMessage.contains("userdetails")
				|| userMessage.contains("user details")) {

			botMessage = session.getAttribute("userBean").toString();
		}else if (userMessage.contains("remainder") || userMessage.contains("alaram") || userMessage.contains("timer")
				|| userMessage.contains("remind")) {
			botMessage =  "reminder code here";
		}

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
		
	}// end of doPost
}// end of service