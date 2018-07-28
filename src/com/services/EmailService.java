package com.services;


import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailService {
	String email,password;
	
	public String sendmails(String email, String password,String sendEmail, String msgs){
		this.email=email;
		this.password=password;
		try
		{
		String host="smtp.gmail.com";
		String subject = "Mail From SMTP Testing";
		Properties props = System.getProperties();
		// -- Attaching a default session or we could

		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host",host);
		props.put("mail.smtp.user", email);
		props.put("mail.smtp.password", password);
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.port","587");
		props.put("mail.smtp.auth","true");
		Authenticator auth = new EmailService.SMTPAuthenticator();
		Session session= Session.getInstance(props, auth);

		//-- Create a message --
		Message msg = new MimeMessage(session);
		//-- Set the FROM and TO fields --
		msg.setFrom(new InternetAddress(email));
		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(sendEmail,false));
		msg.setSubject(subject);
		msg.setText(msgs);

		//-- set some other header info--
		msg.setHeader("Power of SMTP", "Power of SMTP :)");
		msg.setSentDate(new Date());
		//-- send the message--
		Transport.send(msg);
		return "mail sent";
		}
		catch(Exception e)
		{
         return e.getMessage();
		}
		}

		private class SMTPAuthenticator extends Authenticator{

		public PasswordAuthentication getPasswordAuthentication(){
		return new PasswordAuthentication(email,password);

		}
		}
	}


