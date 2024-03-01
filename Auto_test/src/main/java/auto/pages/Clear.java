package auto.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clear {
	private WebDriver driver;

	public Clear(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clearEmail() throws InterruptedException {
		WebElement txt_email = driver.findElement(CT_ACCOUNT.TEXTBOX_EMAIL);
		
		if (txt_email.isDisplayed()) {
			txt_email.clear();
		}
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void clearPass() throws InterruptedException {
		WebElement txt_pass = driver.findElement(CT_ACCOUNT.TEXTBOX_PASS);
		
		if (txt_pass.isDisplayed()) {
			txt_pass.clear();
		}
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void clearAll() throws InterruptedException {
		WebElement txt_email = driver.findElement(CT_ACCOUNT.TEXTBOX_EMAIL);
		
		if (txt_email.isDisplayed()) {
			txt_email.clear();
		}
		
		WebElement txt_pass = driver.findElement(CT_ACCOUNT.TEXTBOX_PASS);
		
		if (txt_pass.isDisplayed()) {
			txt_pass.clear();
		}
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
