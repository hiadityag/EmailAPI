package com.aditya;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.services.EmailService;
import com.services.TotalData;

@WebServlet("/SendEmail")
public class SendEmail extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TotalData td= new TotalData();
		System.out.println(request.getParameter("EmailSend"));
		System.out.println(request.getParameter("Message"));
		
		td.setSenderMessage(request.getParameter("EmailSend"), request.getParameter("Message"));
		EmailService es= new EmailService();
      String str= 	es.sendmails(td.getEmail(),td.getPasword(),td.getSenderEmail(),td.getMessage());
      System.out.println(str);
		
       	if(str.equals("mail sent"))
       	{
			 HttpSession hs=request.getSession();
			 hs.setAttribute("result",str);
			 RequestDispatcher rd=request.getRequestDispatcher("Reslt.jsp");
			 rd.forward(request, response); 
       	}
       	else
       	{
       		HttpSession hs=request.getSession();
			 hs.setAttribute("result",str);
			 RequestDispatcher rd=request.getRequestDispatcher("Reslt.jsp");
			 rd.forward(request, response); 
       	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
