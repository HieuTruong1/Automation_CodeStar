package auto.pages;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day15TrizenFunctions extends PF_VARIABLES{
	private WebDriver driver;
	private WebElement inputDate = driver.findElement(CT_ACCOUNT.DATE_DEPARTDING);
	
	public Day15TrizenFunctions (WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void removeReadOnly(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('readonly','readonly')", e);
	}
	
	public void addFlight(String flightFrom, String flightTo, String date) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
		Thread.sleep(3000);
		txtFightFrom.sendKeys(flightFrom);
		txtFightTo.sendKeys(flightTo);
		
		removeReadOnly(inputDate);
		inputDate.sendKeys(date);
	}
}
