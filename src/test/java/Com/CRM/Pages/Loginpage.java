package Com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	


	    private WebDriver driver;

	    public Loginpage(WebDriver driver) {
	        this.driver = driver;
	    }

	    private By email = By.id("email-id");
	    private By pass = By.id("password");
	    private By loginBtn = By.id("submit-id");

	    public String loginValidate(String em, String pd) {

	        driver.findElement(email).sendKeys(em);
	        driver.findElement(pass).sendKeys(pd);
	        driver.findElement(loginBtn).click();

	        return driver.getCurrentUrl();
	    }
	}


