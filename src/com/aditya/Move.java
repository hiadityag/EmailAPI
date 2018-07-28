package com.aditya;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.serivces.MyData;
import com.services.TotalData;
@WebServlet("/Move")
public class Move extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();
		hs.setAttribute("email",request.getParameter("email1"));
		hs.setAttribute("password",request.getParameter("password"));
		TotalData td = new TotalData();
		td.setEmailPass(request.getParameter("email"),request.getParameter("password"));
		RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request, response);
		}
				
		
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
	}

}
