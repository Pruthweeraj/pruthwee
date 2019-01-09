<%@page import="com.chatbot.utility.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Infinite ChatBox</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>

<form action="submit" method="post">

	<div class="chatbox">
		<div class="chatlogs">




			<%
					response.setContentType("text/html");

					//retriving userName from session
					UserBean userBean = (UserBean) session.getAttribute("userBean");
				%>

			<div class="chat infinite">

				<div class="user-photo">
					<img src="infinite.png">
				</div>
				<p class="chat-message">
					Welcome...<%=userBean.getfirstName()%>
					:)
				<p>
			</div>


			<!-- checking Internet connection availability-->
			<%
					boolean internet = (boolean) session.getAttribute("internet");
					if (!internet) {
				%>
			<div class="chat infinite">

				<div class="user-photo">
					<img src="infinite.png">
				</div>
				<p class="chat-message">
					Internet Connection is <br /> not available :(
				<p>
			</div>

			<div class="chat infinite">

				<div class="user-photo">
					<img src="infinite.png">
				</div>
				<p class="chat-message">
					Now you can access <br /> these features :) <br />
				</p>
			</div>

			<div class="chat infinite">

				<div class="user-photo">
					<img src="infinite.png">
				</div>
				<p class="chat-message">
					Date <br /> Time <br />userDetails etc...
				<p>
			</div>



			<%
					}

					//Accessing the (Map)messages from session
					Map map = (Map) session.getAttribute("messages");

					if (map != null) {
						Iterator<Map.Entry<Number, Object>> itr = map.entrySet().iterator();
						while (itr.hasNext()) {
							Map.Entry<Number, Object> entry = itr.next();
							ArrayList arrayList = (ArrayList) (entry.getValue());
				%>

			<div class="chat user">

				<div class="user-photo">
					<img src=user.jpg>
				</div>
				<p class="chat-message"><%=arrayList.get(0)%></p>
			</div>

			<div class="chat infinite">

				<div class="user-photo">
					<img src="infinite.png">
				</div>
				<p class="chat-message"><%=arrayList.get(1)%>
				<p>
			</div>

			<%
					}
					}
				%>



		</div>
		<div class="chat-form">
			<textarea name="userMessage" placeholder="Enter the message"></textarea>
			<button name="submit" value="submit">Send</button>
		</div>
	</div>

</form>
</body>
</head>
</html>