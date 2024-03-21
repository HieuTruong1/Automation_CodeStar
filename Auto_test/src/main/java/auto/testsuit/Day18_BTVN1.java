package auto.testsuit;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;
import auto.pages.CT_ACCOUNT;

public class Day18_BTVN1 extends CommonBase {
	@BeforeMethod
	@Parameters ("browserName")
	public void initBrowser(String browserValue) throws InterruptedException { //chrome //edge //firefox
		setupDriver(browserValue);
		driver.get(CT_Common.URL_DIENMAY);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@Test
	public void verifiedZaloChatBTN() throws InterruptedException {
		clickElement(CT_ACCOUNT.BTN_ZALOCHAT);
		changeToPopupWindow();
		getElementInDOM(CT_ACCOUNT.TXT_CHECK_POPUP);
		assertTrue(driver.findElement(CT_ACCOUNT.TXT_CHECK_POPUP).isDisplayed());
	}
}
