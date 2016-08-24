package com.devops.servlets;

import java.io.IOException;
<<<<<<< HEAD
=======
import java.io.PrintWriter;

>>>>>>> b7b99354840a04a0552a4e230e51928e5bccc4ac
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.devops.DAO.DBClass;


@SuppressWarnings("serial")
public class LateStayServlet extends HttpServlet {
	
	    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
<<<<<<< HEAD
		// TODO Auto-generated method stub
		new DBClass().updateLateStay(Integer.parseInt(request.getParameter("id")),request.getParameter("location"),request.getParameter("action"));
=======
		String dbHost = request.getParameter("dbhost");
		String dbPort = request.getParameter("dbport");
		String dbName = request.getParameter("dbname");
		String dbUser = request.getParameter("dbuser");
		String dbPasswd = request.getParameter("dbpasswd");
		// TODO Auto-generated method stub
		new DBClass(dbHost ,dbPort ,dbName ,dbUser ,dbPasswd).updateLateStay(Integer.parseInt(request.getParameter("id")),request.getParameter("location"),request.getParameter("action"));
>>>>>>> b7b99354840a04a0552a4e230e51928e5bccc4ac
		
		
	}

}
