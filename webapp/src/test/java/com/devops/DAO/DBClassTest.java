import com.devops.DAO.DBClass;
import junit.framework.TestCase; 
import com.devops.BO.Employee;

public class DBClassTest extends TestCase {
	public void testDBClassConstructor()
    {
		DBClass dc = new DBClass("10.51.238.183","8306","devopsdb","root2","pass123");
		dc.closeConnection();
		assertTrue( dc != null);
    }
	
	public void testDBClassAuthenticateCorrect()
    {
		DBClass dc = new DBClass("10.51.238.183","8306","devopsdb","root2","pass123");
		int ret = dc.authenticate(20000, "Carol");
		assertTrue( ret == 1);
    }
	
	public void testDBClassAuthenticateInCorrect()
    {
		DBClass dc = new DBClass("10.51.238.183","8306","devopsdb","root2","pass123");
		int ret = dc.authenticate(0, "");
		assertTrue( ret != 1);
    }
	
	public void testgetLateStayList()
	{
		DBClass dc = new DBClass("10.51.238.183","8306","devopsdb","root2","pass123");
		Employee[] emp_list=dc.getLateStayList();
		assertTrue(emp_list.length > 0);
	}
}

