package auto.testsuit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.BTVNBase;
import auto.constant.BTVN_URL;

public class BTVN_Suite extends BTVNBase{
	@BeforeMethod
	public void openChrome() throws InterruptedException {
		driver = initWebDriver(BTVN_URL.URL);
	}
	
	@AfterMethod
	public void closeCrhome() {
		// TODO Auto-generated method stub
		driver.close();
	}
	
	@Test
	public void BTVN_Day8() {
		
		// TODO Auto-generated method stub
		WebElement name = driver.findElement(By.id("name"));
		System.out.println("Name ==> "+name);
		
		WebElement add = driver.findElement(By.xpath("//textarea[contains(@id,'address')]"));
		System.out.println("Address ==> "+add.getAccessibleName());
		
		WebElement mail = driver.findElement(By.cssSelector("[type = 'email']"));
		System.out.println("Email ==> "+mail);
		
		WebElement pass = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		System.out.println("Password ==> "+pass.getTagName());
		
		WebElement submit = driver.findElement(By.xpath("//button[text() = 'Submit']"));
		System.out.println("SubButton ==> "+submit.getText() + submit.getAttribute("value"));
		
		WebElement reset = driver.findElement(By.cssSelector("[value = 'Reset']"));
		System.out.println("Reset Button ==> "+reset.getText());
		
		
		
	}
}
