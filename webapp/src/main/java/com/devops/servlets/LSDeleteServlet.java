package com.devops.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.devops.DAO.DBClass;


@SuppressWarnings("serial")
public class LSDeleteServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD
			
		new DBClass().deleteLateStay(Integer.parseInt(request.getParameter("id")));
=======
		String dbHost = request.getParameter("dbhost");
		String dbPort = request.getParameter("dbport");
		String dbName = request.getParameter("dbname");
		String dbUser = request.getParameter("dbuser");
		String dbPasswd = request.getParameter("dbpasswd");
			
		new DBClass(dbHost ,dbPort ,dbName ,dbUser ,dbPasswd).deleteLateStay(Integer.parseInt(request.getParameter("id")));
>>>>>>> b7b99354840a04a0552a4e230e51928e5bccc4ac
	}

}
