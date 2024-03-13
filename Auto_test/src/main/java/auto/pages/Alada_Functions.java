package auto.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Alada_Functions extends PF_VARIABLES{
	private WebDriver driver;
	
	public Alada_Functions(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void LoginFunction(String email, String pass) throws InterruptedException {
		txtUsername.clear();
		txtUsername.sendKeys(email);
		txtPass.clear();
		txtPass.sendKeys(pass);
		
		btnSubmit.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void ChangePass (String email, String pass, String newPass) {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		rPass.sendKeys(pass);
		rNewPass.sendKeys(newPass);
		rReNewPass.sendKeys(newPass);
		btnSavePass.click();
	}
	
	public void clickAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void moveToChange() {
		webimgUser.click();
		btnChangeInfo.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
}
