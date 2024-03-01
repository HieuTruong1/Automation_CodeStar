package auto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {
	private WebDriver driver;

	public Logout(WebDriver _driver) {
		this.driver = _driver;
	}
	
	public void logoutFunction() {
		WebElement btnUser = driver.findElement(CT_ACCOUNT.BTN_USER);
		btnUser.click();
		WebElement btnLogOut = driver.findElement(CT_ACCOUNT.BTN_SIGNOUT);
		btnLogOut.click();
	}
}
