package auto.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	private WebDriver driver;

	public Login(WebDriver _driver) {
		this.driver = _driver;
	}
	
	public void LoginFunction(String email, String pass) throws InterruptedException {
		WebElement txt_email = driver.findElement(CT_ACCOUNT.TEXTBOX_EMAIL);
		
		if (txt_email.isDisplayed()) {
			txt_email.clear();
			txt_email.sendKeys(email);
		}
		
		WebElement txt_pass = driver.findElement(CT_ACCOUNT.TEXTBOX_PASS);
		
		if (txt_pass.isDisplayed()) {
			txt_pass.clear();
			txt_pass.sendKeys(pass);
		}
		Thread.sleep(2000);
		WebElement btn_sigin = driver.findElement(CT_ACCOUNT.BTN_SIGNIN);
		
		if (btn_sigin.isDisplayed()) {
			btn_sigin.click();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
