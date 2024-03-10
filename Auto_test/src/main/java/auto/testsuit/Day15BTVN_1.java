package auto.testsuit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;
import auto.pages.Day15RiseFunctions;
import auto.pages.ERR_MESSAGE;

public class Day15BTVN_1 extends CommonBase {
	private String user = "Test1321";
	private String user2 = "";
	private String testMail = "Test1tmail.com";
	private String email = "admin@demo.com";
	private String pass = "riseDemo";
	
	@BeforeMethod
	public void initChrome() throws InterruptedException {
		initChromeDriver(CT_Common.URLRise);
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
	
	@Test (priority = 1) //  happy case
	public void addClientSuccessfully() throws InterruptedException {
		Day15RiseFunctions f = new  Day15RiseFunctions(driver);
		f.LoginFunction(email, pass);
		Thread.sleep(3000);
		f.addClient(user,testMail);
		f.searchClient(user);
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//td/child::a[text() = '"+user+"']")).isDisplayed());
	}
	
	@Test // search false
	public void serachClientFailed() throws InterruptedException {
		Day15RiseFunctions f = new  Day15RiseFunctions(driver);
		f.LoginFunction(email, pass);
		Thread.sleep(3000);
		f.searchClient(user);
		Thread.sleep(3000);
		System.out.println(f.isPresent(By.xpath("//td/child::a[text() = '"+user2+"']")));
		//assertFalse(f.isPresent(By.xpath("//td/child::a[text() = '"+user2+"']")));
	}
	
	@Test (priority = 2) // add client with blank company name
	public void addClientFailed() throws InterruptedException {
		Day15RiseFunctions f = new  Day15RiseFunctions(driver);
		f.LoginFunction(email, pass);
		Thread.sleep(3000);
		f.addClient(user2,testMail);
		assertTrue(driver.findElement(ERR_MESSAGE.MSG_RISE_COMPANY_REQUIRE).isDisplayed());
	}
}
