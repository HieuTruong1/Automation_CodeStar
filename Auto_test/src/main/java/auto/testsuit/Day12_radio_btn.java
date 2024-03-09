package auto.testsuit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.Day12Base;
import auto.constant.Day12URL;

public class Day12_radio_btn extends Day12Base {
	private String gender;
	
	@BeforeMethod
	public void initChrome() throws InterruptedException {
		initDriver(Day12URL.URLradio);
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
	
	@Test
	public void radioTest() throws InterruptedException {
		gender = "Male"; // Male Female
		WebElement btnMale  = driver.findElement(By.xpath("//p[text() = 'Click on button to get the selected value']/following-sibling::label[normalize-space() = '"+gender+"']/input"));
		btnMale.click();
		
		if (btnMale.isSelected()==false && btnMale.isDisplayed()) {
			btnMale.click();
		}
		else {
			Thread.sleep(2000);
			gender = "Female";
			driver.findElement(By.xpath("//p[text() = 'Click on button to get the selected value']/following-sibling::label[normalize-space() = '"+gender+"']/input")).click();
		}
		Thread.sleep(2000);
		
	}
}
