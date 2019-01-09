package com.infinite.service.chatbotweb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.infinite.dao.chatbotweb.DBConnection;

@SuppressWarnings("serial")
public class DBServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respence)
			throws ServletException, IOException {

	} // end of doGet

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("enter to doPost() of DBServlet");

		// creating session
		HttpSession session = request.getSession();
		String address = null;
		// Getting the userMessage from the session
		String userMessage = (String) session.getAttribute("userMessage");
		String userMessageUnchange = (String) session.getAttribute("userMessageUnchange");
		int counter = (int) session.getAttribute("counter");
		String botMessage = null;

		Connection con;
		int n = 1;
		String u1, u2, u3, b1, b2, b3;

		con = DBConnection.connect();
		String query = "Select * from msg";

		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String dMsg_u1 = rs.getString("u1");
				String dMsg_u2 = rs.getString("u2");
				String dMsg_u3 = rs.getString("u3");

				if ((userMessage.equals(dMsg_u1)) || (userMessage.equals(dMsg_u2)) || (userMessage.equals(dMsg_u3))) {
					// System.out.println("going to if block");
					Random random = new Random();
					int randomValue = (int) (random.nextInt(3 - 1 + 1) + 1);
					System.out.println(randomValue);
					if (randomValue == 1) {
						botMessage = rs.getString("b1");
					} else if (randomValue == 2) {
						botMessage = rs.getString("b2");
					} else if (randomValue == 3) {
						botMessage = rs.getString("b3");
					}

				} else {
					botMessage = "Sorry! i can't process this request";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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