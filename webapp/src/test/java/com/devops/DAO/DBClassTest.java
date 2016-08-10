import com.devops.DAO.DBClass;

import junit.framework.TestCase; 

public class DBClassTest extends TestCase {

	public void testDBClassConstructor()
    {
		DBClass dc = new DBClass("10.244.54.78","3306","devopsdb","root","Pspl@123");
		dc.closeConnection();
		assertTrue( dc != null );
    }
	
	public void testDBClassAuthenticateCorrect()
    {
		DBClass dc = new DBClass("10.244.54.78","3306","devopsdb","root","Pspl@123");
		int ret = dc.authenticate(11560, "12345");
		assertTrue( ret == 1 );
    }
	
	public void testDBClassAuthenticateInCorrect()
    {
		DBClass dc = new DBClass("10.244.54.78","3306","devopsdb","root","Pspl@123");
		int ret = dc.authenticate(0, "");
		assertTrue( ret != 1 );
    }
	
}

