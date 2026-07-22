package Com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.main;

public class LoginpageTestCase extends main {

	

	@BeforeClass
	public void setuppage()
	{
		hp.clicklogin();
	}

	@Test
	
		public  void logincheck()
		{
			
			String act=lp.loginValidate("test@123","pwd");
			Assert.assertTrue(act.contains("customers"), "Fail");
			System.out.println("Pass");
		}
	}


