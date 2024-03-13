package auto.testsuit;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;
import auto.pages.AlertDemoFunctions;
import auto.pages.CT_ACCOUNT;

public class Day16_BTVN_2 extends CommonBase{
	@BeforeMethod
	public void initChrome() throws InterruptedException {
		initChromeDriver(CT_Common.URLAlertDemo);
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
	
	@Test
	public void checkAlert() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(CT_ACCOUNT.BTN_TRY));
		driver.findElement(CT_ACCOUNT.BTN_TRY).click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		String driverTXT = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		assertEquals(driverTXT, "Welcome to Selenium WebDriver Tutorials");
	}
}
