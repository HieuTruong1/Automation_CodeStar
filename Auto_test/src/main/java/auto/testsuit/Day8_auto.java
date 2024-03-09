package auto.testsuit;

import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;

public class Day8_auto extends CommonBase {
	
	@BeforeMethod
	public void openChrome() throws InterruptedException {
		driver = initChromeDriver(CT_Common.URLSelectorHub);
	}
	
	@AfterMethod
	public void closeCrhome() {
		// TODO Auto-generated method stub
		driver.close();
	}
	
	@Test
	public void Teest () throws InterruptedException {
		Thread.sleep(2500);
		driver.findElement(By.xpath("//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img")).click();
		Thread.sleep(2500);
		WebElement Email = driver.findElement(By.name("email"));
		System.out.println("Email = "+Email);
		
		WebElement Pass = driver.findElement(By.id("pass"));
		System.out.println("Password = "+Pass);
		
		WebElement Company = driver.findElement(By.name("company"));
		System.out.println("Company = "+Company);
		
		WebElement Mobile = driver.findElement(By.name("mobile number"));
		System.out.println("mobile number = "+Mobile);
		
//		WebElement Submit = driver.findElement(By.xpath("//button[text()='Submit']"));
//		System.out.println("Submit = "+Submit);
		
		WebElement Inp = driver.findElement(By.id("inp_val"));
		System.out.println("Inp = "+Inp);
		
		driver.findElement(By.className("nameFld"));
	}
}
