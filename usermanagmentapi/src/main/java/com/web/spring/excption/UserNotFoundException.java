package com.web.spring.excption;

public class UserNotFoundException extends RuntimeException {

	String msg;
	
	public UserNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
