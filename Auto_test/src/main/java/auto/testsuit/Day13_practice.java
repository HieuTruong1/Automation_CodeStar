package auto.testsuit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;
import auto.constant.Day12URL;
import auto.pages.*;

public class Day13_practice extends CommonBase {
	@BeforeMethod
	public void initChrome() throws InterruptedException {
		initChromeDriver(CT_Common.URLRise);
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
	
	@Test //happy case
	public void loginSuccessfully() throws InterruptedException {
		Login login = new Login(driver);
		login.LoginFunction("client@demo.com", "riseDemo");
		assertTrue(driver.findElement(By.xpath("//span[text() = 'Dashboard']")).isDisplayed());
	}
	
	@Test //Wrong email
	public void loginWithInvalidEmail () throws InterruptedException {
		Login login = new Login(driver);
		login.LoginFunction("hieuvan@demo.com", "riseDemo");
		assertTrue(driver.findElement(ERR_MESSAGE.MSG_AUTHENTICATION_FAILED).isDisplayed(), "Test pass with incorrect Email");
	}
	
	@Test //Wrong password
	public void loginWithInvalidPass () throws InterruptedException {
		Login login = new Login(driver);
		login.LoginFunction("admin@demo.com", "riseDezzzmo");
		Thread.sleep(4000);
		assertTrue(driver.findElement(ERR_MESSAGE.MSG_AUTHENTICATION_FAILED).isDisplayed(), "Test pass with incorrect password");
	}
	
	@Test //Wrong Email & password
	public void loginWithInvalidAccount () throws InterruptedException {
		Login login = new Login(driver);
		login.LoginFunction("hieuvan@demo.com", "riseDezzzmo");
		Thread.sleep(4000);
		assertTrue(driver.findElement(ERR_MESSAGE.MSG_AUTHENTICATION_FAILED).isDisplayed(), "Test pass with incorrect email and password");
	}
	
	@Test //Logout
	public void logoutSuccessfully() throws InterruptedException {
		Login login = new Login(driver);
		login.LoginFunction("client@demo.com", "riseDemo");
		Logout logout = new Logout(driver);
		logout.logoutFunction();
		assertTrue(driver.findElement(By.xpath("//h2[text() = 'Sign in']")).isDisplayed());
	}
	
	@Test //Invalid Email format
	public void loginWithInvalidFormat () throws InterruptedException {
		Login login = new Login(driver);
		login.LoginFunction("admin123", "riseDezzzmo");
		// Find the message "Please enter a valid email address."
		assertTrue(driver.findElement(ERR_MESSAGE.MSG_ERROR_IVALID_EMAIL).isDisplayed());
		// assertTrue(driver.findElement(ERR_MESSAGE.MSG_AUTHENTICATION_FAILED).isDisplayed(), "Test pass with incorrect password");
	}
	
	@Test //Login with blank email
	public void loginWithBlankEmail () throws InterruptedException {
		Login login = new Login(driver);
		Clear clear = new Clear(driver);
		
		clear.clearEmail();
		login.LoginFunction("", "riseDemo");
		assertTrue(driver.findElement(ERR_MESSAGE.MSG_ERROR_REQUIRED).isDisplayed());
	}
	
	@Test //Login with blank pass
	public void loginWithBlankPass () throws InterruptedException {
		Login login = new Login(driver);
		Clear clear = new Clear(driver);
		
		clear.clearEmail();
		login.LoginFunction("client@demo.com", "");
		assertTrue(driver.findElement(ERR_MESSAGE.MSG_ERROR_REQUIRED).isDisplayed());
	}
	
	@Test //Login with blank EMail & pass
	public void loginWithBlankAccount () throws InterruptedException {
		Login login = new Login(driver);
		Clear clear = new Clear(driver);
		
		clear.clearAll();
		login.LoginFunction("", "");
		assertTrue(driver.findElement(ERR_MESSAGE.MSG_ERROR_REQUIRED).isDisplayed());
	}
}
