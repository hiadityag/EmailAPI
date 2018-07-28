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
	
	public String EmailSending(String email,String pasword,String sendEmail, String message)
	{
		Properties properties = new Properties();
		properties.put("mail.smtp.host","smtp.gmail.com");
		properties.put("mail.smtp.port", 25);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		// creates a new session with an authenticator
		Authenticator auth = new Authenticator() {
		    public PasswordAuthentication getPasswordAuthentication() {
		        return new PasswordAuthentication(email, pasword);
		    }
		};

		Session sess = Session.getInstance(properties, auth);

		// creates a new e-mail message
		Message msg = new MimeMessage(sess);
   try
   {
		msg.setFrom(new InternetAddress(email));
		InternetAddress[] toAddresses = { new InternetAddress(sendEmail) };
		msg.setRecipients(Message.RecipientType.TO, toAddresses);
		msg.setSubject("Mail");
		msg.setSentDate(new Date());
		msg.setText(message);

		// sends the e-mail
		Transport.send(msg);
		return "mailsent";
   }
   catch(Exception e)
   {
	   return e.getMessage();
   }
	}

}
