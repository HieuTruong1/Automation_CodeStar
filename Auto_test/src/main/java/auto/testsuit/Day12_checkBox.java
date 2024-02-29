package auto.testsuit;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.Day12Base;
import auto.constant.Day12URL;

public class Day12_checkBox extends Day12Base{
	
	@BeforeMethod
	public void initChrome() throws InterruptedException {
		initDriver(Day12URL.URLchkbox);
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
	
	@Test //single checkbox
	public void day12Checkbox() throws InterruptedException {
		WebElement chk1 = driver.findElement(By.xpath("//label[normalize-space() = 'Click on this check box' ]//child::input"));
		if (chk1.isSelected()) {
			System.out.println("Button checked");
		}
		else {
			chk1.click();
		}
		Thread.sleep(2000);
	}
	
	@Test // cach1
	public void multiCheckbox(){
		List<WebElement> chkBoxList = driver.findElements(By.xpath("//p[text()='Check the below points before automating']/following-sibling::div[@class='checkbox']//descendant::input"));
		for (int i = 0; i< chkBoxList.size(); i++) {
			WebElement chkBox = chkBoxList.get(i);
			if (chkBox.isSelected()) {
				System.out.println("Button checked");
			}
			else {
				chkBox.click();
			}
		}
	}
	
	@Test // cach 3
	public void multiCheckbox2() {
		List<WebElement> chkBoxList = driver.findElements(By.xpath("//p[text()='Check the below points before automating']/following-sibling::div[@class='checkbox']//descendant::input"));
		for (int i = 0; i< chkBoxList.size(); i++) {
			WebElement chkBox2 = driver.findElement(By.xpath("//p[text()='Check the below points before automating']/following-sibling::div[@class='checkbox']["+(i+1)+"]//descendant::input"));
			if (chkBox2.isSelected()==false) {
				chkBox2.click();
			}
		}
	}
}
