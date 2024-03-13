package auto.testsuit;

import static org.testng.Assert.assertEquals;
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

public class Day16_Alert_Practise extends CommonBase {
	private String message = "Hieu Test 1";

	@BeforeMethod
	public void initChrome() throws InterruptedException {
		initChromeDriver(CT_Common.URLAlert);
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
	
	@Test
	public void testAlert() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); ////
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Automation Demo Site ']")));
		
		WebElement tabAlertOK = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		WebElement tabAlertOKCancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		
		WebElement btnAlert1 = driver.findElement(By.xpath("//div[@id = 'OKTab']/child::button"));
		WebElement btnAlert2 = driver.findElement(By.xpath("//div[@id = 'CancelTab']/child::button"));
		
		tabAlertOK.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnAlert1));
		btnAlert1.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		//Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		wait.until(ExpectedConditions.elementToBeClickable(tabAlertOKCancel));
		tabAlertOKCancel.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnAlert2));
		btnAlert2.click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
		assertEquals(true, driver.findElement(By.xpath("//p[text()='You Pressed Cancel']")).isDisplayed());
	}
	
	@Test //txtbox Alert
	public void testAlerttxtbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Automation Demo Site ']")));
		WebElement tabAlertTextbox = driver.findElement(By.xpath("//a[text()= 'Alert with Textbox ']"));
		WebElement btnAlerttxt = driver.findElement(By.xpath("//div[@id = 'Textbox']/child::button"));
		
		tabAlertTextbox.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnAlerttxt));
		btnAlerttxt.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().sendKeys(message);
		driver.switchTo().alert().accept();
		
		WebElement txtboxmsg = driver.findElement(By.xpath("//p[@id = 'demo1']"));
		assertTrue(txtboxmsg.isDisplayed());
		
		assertEquals(true, driver.findElement(By.xpath("//p[text()='Hello "+message+" How are you today']")).isDisplayed());
	}
}
