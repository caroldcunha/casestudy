package com.devops.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.devops.DAO.DBClass;


@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		
		int ret_status=new DBClass().authenticate(Integer.parseInt(request.getParameter("id")),request.getParameter("passwd"));
=======
	    String dbHost = request.getParameter("dbhost");
		String dbPort = request.getParameter("dbport");
		String dbName = request.getParameter("dbname");
		String dbUser = request.getParameter("dbuser");
		String dbPasswd = request.getParameter("dbpasswd");
		
		int ret_status=new DBClass(dbHost ,dbPort ,dbName ,dbUser ,dbPasswd).authenticate(Integer.parseInt(request.getParameter("id")),request.getParameter("passwd"));
>>>>>>> b7b99354840a04a0552a4e230e51928e5bccc4ac
		PrintWriter out=response.getWriter();
		out.println(ret_status);
		out.close();
		
	}

}
