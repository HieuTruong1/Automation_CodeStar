package auto.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12Base {
	public WebDriver driver;
	
	
	public WebDriver initDriver(String URL) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(500);
		Timeouts pageLoadTimeout = driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		return driver;
	}
}
