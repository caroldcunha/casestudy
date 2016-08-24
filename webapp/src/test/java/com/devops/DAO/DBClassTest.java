<<<<<<< HEAD
package com.devops.DAO;

=======
>>>>>>> b7b99354840a04a0552a4e230e51928e5bccc4ac
import com.devops.DAO.DBClass;
import junit.framework.TestCase; 
import com.devops.BO.Employee;

public class DBClassTest extends TestCase {
<<<<<<< HEAD
	
	public void testDBClassConstructor()
    {
		DBClass dc = new DBClass();
=======
	public void testDBClassConstructor()
    {
		DBClass dc = new DBClass("10.51.238.183","8306","devopsdb","root","pass123");
>>>>>>> b7b99354840a04a0552a4e230e51928e5bccc4ac
		dc.closeConnection();
		assertTrue( dc != null);
    }
	
	public void testDBClassAuthenticateCorrect()
    {
<<<<<<< HEAD
		DBClass dc = new DBClass();
		int ret = dc.authenticate(20000, "Carol");
		assertTrue( ret == 1);

=======
		DBClass dc = new DBClass("10.51.238.183","8306","devopsdb","root","pass123");
		int ret = dc.authenticate(20000, "Carol");
		assertTrue( ret == 1);
>>>>>>> b7b99354840a04a0552a4e230e51928e5bccc4ac
    }
	
	public void testDBClassAuthenticateInCorrect()
    {
<<<<<<< HEAD
		DBClass dc = new DBClass();
		int ret = dc.authenticate(0, "");
		assertTrue( ret != 1);

=======
		DBClass dc = new DBClass("10.51.238.183","8306","devopsdb","root","pass123");
		int ret = dc.authenticate(0, "");
		assertTrue( ret != 1);
>>>>>>> b7b99354840a04a0552a4e230e51928e5bccc4ac
    }
	
	public void testgetLateStayList()
	{
<<<<<<< HEAD
		DBClass dc = new DBClass();
		Employee[] emp_list=dc.getLateStayList();
		assertTrue(emp_list.length > 0);

=======
		DBClass dc = new DBClass("10.51.238.183","8306","devopsdb","root","pass123");
		Employee[] emp_list=dc.getLateStayList();
		assertTrue(emp_list.length > 0);
>>>>>>> b7b99354840a04a0552a4e230e51928e5bccc4ac
	}
}

