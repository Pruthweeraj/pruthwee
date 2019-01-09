package com.infinite.service.chatbotweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class ProcessServlet extends HttpServlet  {

	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respence)
			throws ServletException, IOException {

	} //end of doGet

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("enter to doPost() of ProcessServlet");
	
		//creating session
		HttpSession session = request.getSession();
		String address = null;
		//Getting the userMessage from the session
		String userMessage = (String)session.getAttribute("userMessage");
		
		//creating a object for LogicalStringCheck class
		System.out.println("userMessage:"+userMessage);
		boolean logicalStringCheck = LogicalStringCheck.check(userMessage);
		
		//if logicalStringCheck if true then forward to LogicalReplayServlet
		if(logicalStringCheck == true) {
			address = "LogicalReplayServlet";
			RequestDispatcher rd =request.getRequestDispatcher(address);	
			rd.forward(request,response);
		}else if ((boolean)session.getAttribute("internet")) {
			address = "DBServlet";
			RequestDispatcher rd =request.getRequestDispatcher(address);	
			rd.forward(request,response);	
		}
		
		
		
		
		
		
	}//end of doPost
}//end of service
