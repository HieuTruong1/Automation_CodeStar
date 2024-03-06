package auto.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//
public class CommonBase {
	public WebDriver driver;
	public int initwaitTime = 40;
	
	@SuppressWarnings("deprecation")
	public WebDriver initChromeDriver( String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(4,TimeUnit.SECONDS);
		return driver;
	}
}
