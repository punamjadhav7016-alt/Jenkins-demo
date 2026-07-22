package Com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.main;

public class HomeTestCase extends main{
	@Test(priority=1)
	public void verifyURL()
	{
	String act=hp.AppUrl();
	Assert.assertTrue(act.contains("crm"),"Fail");
	System.out.println("UrlMatch ");
	}
	@Test(priority=2)
	public void verifyTitle()
	
	{
		String act=hp.getTitle();
		Assert.assertTrue(act.contains("Customer"),"Test Fail");
		System.out.println("TitleMatch ");

	}
	@Test(priority=3)
	public void verifySiginin()
	
	{
		String nextpageURL=hp.clicklogin();
		Assert.assertTrue(nextpageURL.contains("login"),"Test Fail");
		System.out.println("pass ");

	}

}



