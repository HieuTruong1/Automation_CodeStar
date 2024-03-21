package auto.testsuit;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;
import auto.pages.CT_ACCOUNT;

public class Day18_BTVN2 extends CommonBase{
	@BeforeMethod
	@Parameters ("browserName")
	public void initBrowser(String browserValue) throws InterruptedException { //chrome //edge //firefox
		setupDriver(browserValue);
		driver.get(CT_Common.URL_BEPANTOAN);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@Test
	public void verifiedBTNChat() throws InterruptedException {
		clickElement(CT_ACCOUNT.BTNCHATNGAY);
		changeToPopupWindow();
		getElementInDOM(CT_ACCOUNT.TXT_CHECK_CHATNGAY);
		Thread.sleep(3000);
		assertTrue(driver.findElement(CT_ACCOUNT.TXT_CHECK_CHATNGAY).isDisplayed());
		
	}
}
