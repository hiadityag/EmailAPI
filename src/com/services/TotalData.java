package com.services;

public class TotalData {
	String email, pasword, senderEmail, Message;
	
	public void setEmailPass(String email, String password)
	{
		this.pasword=password;
		this.email=email;
	}
	
	public void setSenderMessage(String sendemail,String message)
	{
		this.Message=message;
		this.senderEmail= sendemail;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
	

}
