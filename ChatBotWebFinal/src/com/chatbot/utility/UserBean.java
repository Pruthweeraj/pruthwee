package com.chatbot.utility;

public class UserBean {
	
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String mailId;
	
	
	
	
	public UserBean(String userName, String password, String firstName, String lastName, long phoneNumber, String mailId) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.mailId = mailId;
	}
	//generated setters and getters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String fName) {
		this.firstName = fName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lName) {
		this.lastName = lName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	@Override
	public String toString() {
		return "User Details <br/> User Name = "+userName +"<br/> First Name = "+firstName+" <br/> Last Name = "+lastName +"<br/> PhoneNumber = "+phoneNumber+"<br/> Mail Id = "+mailId
				+"<br/><a href=\"EditUserDetailsServlet\"> Edit your Profile...</a>";

	}
	
	
	
	

}
