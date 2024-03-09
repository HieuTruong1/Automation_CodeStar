package auto.testsuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;


public class Day8_Alada extends CommonBase {
	@BeforeMethod
	public void openChrome() throws InterruptedException {
		driver = initChromeDriver(CT_Common.URLAlada);
	}
	
	@AfterMethod
	public void closeCrhome() {
		// TODO Auto-generated method stub
		driver.close();
	}
	
	@Test
	public void opeWebAlada() throws InterruptedException {
		Thread.sleep(2500);
		WebElement ID = driver.findElement(By.id("txtFirstname"));
		System.out.println("ID: "+ID);
		
		WebElement Email = driver.findElement(By.id("txtEmail"));
		System.out.println("Email: "+Email);
		
		WebElement CEmail = driver.findElement(By.id("txtCEmail"));
		System.out.println("ID: "+CEmail);
		
		WebElement Pass = driver.findElement(By.id("txtPassword"));
		System.out.println("Pass: "+Pass);
		
		WebElement CPass = driver.findElement(By.id("txtCPassword"));
		System.out.println("CPass: "+CPass);
		//*[@id="frmLogin"]/div/div[8]/button
		WebElement DangKi = driver.findElement(By.xpath("//button[text()='ĐĂNG KÝ']"));
		System.out.println("DangKi: "+DangKi);
		
	}
}
