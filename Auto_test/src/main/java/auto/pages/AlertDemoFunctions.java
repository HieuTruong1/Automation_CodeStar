package auto.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemoFunctions {
	private WebDriver driver;
	
	public AlertDemoFunctions(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void clickTry() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(CT_ACCOUNT.BTN_TRY));
		driver.findElement(CT_ACCOUNT.BTN_TRY).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
}
