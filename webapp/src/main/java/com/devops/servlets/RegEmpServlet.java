package com.devops.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.devops.BO.Employee;
import com.devops.DAO.DBClass;

@SuppressWarnings("serial")
public class RegEmpServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD

=======
		
		String dbHost = request.getParameter("dbhost");
		String dbPort = request.getParameter("dbport");
		String dbName = request.getParameter("dbname");
		String dbUser = request.getParameter("dbuser");
		String dbPasswd = request.getParameter("dbpasswd");
>>>>>>> b7b99354840a04a0552a4e230e51928e5bccc4ac
		
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEmp_id(Integer.parseInt(request.getParameter("id")));
		emp.setEmp_location(null);
		emp.setEmp_passwd(request.getParameter("passwd"));
		emp.setEmp_name(request.getParameter("name"));
		
<<<<<<< HEAD
		int ret_status=new DBClass().register(emp);
=======
		int ret_status=new DBClass(dbHost ,dbPort ,dbName ,dbUser ,dbPasswd).register(emp);
>>>>>>> b7b99354840a04a0552a4e230e51928e5bccc4ac
		PrintWriter out=response.getWriter();
		out.println(ret_status);
		out.close();
		
	}

}
