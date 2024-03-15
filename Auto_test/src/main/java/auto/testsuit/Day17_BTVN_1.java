package auto.testsuit;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;
import auto.pages.CT_ACCOUNT;

public class Day17_BTVN_1 {
	public class Day16_BTVN_2 extends CommonBase{
		@BeforeMethod
		public void initChrome() throws InterruptedException {
			initChromeDriver(CT_Common.URL_DIENMAY);
		}
		
		@AfterMethod
		public void closeChrome() {
			driver.close();
		}
		
		@Test 
		public void checkClickOnChatMessenger () throws InterruptedException {
			//blank_f83d71cf84e2f4d42
			WebElement btnMess = getElementInDOM(CT_ACCOUNT.messengerBuble);
			driver.switchTo().frame(btnMess);
			
			//click bat dau cht
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(CT_ACCOUNT.BTN_MESSENGER_LOGIN));
			driver.findElement(CT_ACCOUNT.BTN_MESSENGER_LOGIN).click();
			
			assertTrue(driver.findElement(CT_ACCOUNT.TXT_DANGNHAP).isDisplayed());
			Thread.sleep(3000);
		}
	}
}
