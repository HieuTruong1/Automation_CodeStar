package auto.testsuit;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;
import auto.pages.Login;

public class Day14_practise extends CommonBase {
	@BeforeMethod
	public void initChrome() throws InterruptedException {
		initChromeDriver(CT_Common.URLAladaLogin);
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
	
	@Test //Login
	public void loginALada() throws InterruptedException {
		//login
		Login login = new Login(driver);
		login.LoginFunction2("test212@gmail.com", "Test321");
		
		//move to chang password page
		login.moveToChange();
		
		//change pass 
		login.ChangePass("test212@gmail.com","Test123" , "Test321");
		Thread.sleep(initwaitTime);
		
		//assertEquals(true, driver.findElement(By.xpath("//div[@class = 'avatar2']/img")).isDisplayed(), "Login successfully");
	}
	
	@Test //re-login with new password
	public void reLoginALada() throws InterruptedException {
		Login login = new Login(driver);
		login.LoginFunction2("test212@gmail.com", "Test321");
		
		assertEquals(true, driver.findElement(By.xpath("//div[@class = 'avatar2']/img")).isDisplayed(), "Login successfully");
	}
}
