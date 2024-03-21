package auto.testsuit;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;

public class Day17_Window extends CommonBase {
	 
	
	@Test
	public void popupWindow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		By clickBTN = By.xpath("//a[text() = 'Click Here']");
		wait.until(ExpectedConditions.elementToBeClickable(clickBTN));
		driver.findElement(clickBTN).click();
		
		//get main window
		String mainWindow = driver.getWindowHandle();
		//get currently opened windows
		Set<String> allWindows = driver.getWindowHandles();
		//check all window
		for(String window:allWindows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				driver.findElement(By.name("emailid")).sendKeys("test@email.com");
				driver.findElement(By.name("btnLogin")).click();
				assertTrue(driver.findElement(By.xpath("//h2[text() = 'Access details to demo site.']")).isDisplayed());
				System.out.println(driver.getCurrentUrl());
				driver.close();	
			}
		}
		driver.switchTo().window(mainWindow);
	}
}
