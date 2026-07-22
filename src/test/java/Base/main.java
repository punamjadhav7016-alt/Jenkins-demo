package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import Com.CRM.Pages.Homepage;
import Com.CRM.Pages.Loginpage;

public class main {

	

		public WebDriver driver;
		public Homepage hp;
		public Loginpage lp;

		@BeforeTest
		public void setup() {
			driver=new ChromeDriver();
			driver.get("https://automationplayground.com/crm/");
			  hp= new Homepage(driver);
			  lp=new Loginpage(driver);
			
		}
	}


