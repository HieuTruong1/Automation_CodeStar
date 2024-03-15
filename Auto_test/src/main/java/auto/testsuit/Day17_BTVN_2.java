package auto.testsuit;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;
import auto.pages.CT_ACCOUNT;

public class Day17_BTVN_2 extends CommonBase{
	@BeforeMethod
	public void initChrome() throws InterruptedException {
		initChromeDriver(CT_Common.URL_MEDIAMART);
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
	
	@Test
	public void checkClickOnChatZalo () throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btnZalo = getElementInDOM(CT_ACCOUNT.BTN_ZALO);
		
		wait.until(ExpectedConditions.elementToBeClickable(btnZalo));
		btnZalo.click();
		
		driver.switchTo().frame(btnZalo);
		
		wait.until(ExpectedConditions.elementToBeClickable(CT_ACCOUNT.BTN_CHAT_NHANH));
		driver.findElement(CT_ACCOUNT.BTN_CHAT_NHANH).click();
		
		assertTrue(driver.findElement(CT_ACCOUNT.TXT_VERIFYED1).isDisplayed());
		Thread.sleep(3000);
	}
}
