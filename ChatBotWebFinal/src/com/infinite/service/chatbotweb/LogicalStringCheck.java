package com.infinite.service.chatbotweb;

public class LogicalStringCheck {

	public static boolean check(String msg) {
		System.out.println("msg:"+ msg);
		if (msg.contains("date") || msg.contains("time") || msg.contains("userdetails") || msg.contains("details")
				|| msg.contains("my details") || msg.contains("userdetails") || msg.contains("user details")
				|| msg.contains("remainder") || msg.contains("alaram") || msg.contains("timer")
				|| msg.contains("remind") || msg.contains("indian time") || msg.contains("us") || msg.contains("ast")
				|| msg.contains("ist")) {
			return true;
		}
		
		return false;
	}

	
}
