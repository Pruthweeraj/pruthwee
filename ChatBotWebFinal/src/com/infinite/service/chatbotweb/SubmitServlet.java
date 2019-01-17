package com.infinite.service.chatbotweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class SubmitServlet extends HttpServlet  {

	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respence)
			throws ServletException, IOException {

	} //end of doGet

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("enter to doPost() of SubmitServlet");
		
		//creating session 
		HttpSession session = request.getSession();
		String address = null;
	
		String userMessageUnchange = request.getParameter("userMessage");
		String userMessage = userMessageUnchange.trim().toLowerCase();
		
		// Adding userUnchangeMessage and userMessage to session
		session.setAttribute("userMessageUnchange", userMessageUnchange);
		session.setAttribute("userMessage", userMessage);
		//forwarding to ProcessServlet
		address = "ProcessServlet";
		RequestDispatcher rd =request.getRequestDispatcher(address);	
		rd.forward(request,response);
		
		
		}//end of doPost
	
}
