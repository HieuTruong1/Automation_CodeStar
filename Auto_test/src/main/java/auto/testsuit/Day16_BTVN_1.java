package auto.testsuit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

import java.time.Duration;

import org.apache.commons.lang.ObjectUtils.Null;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;
import auto.pages.Alada_Functions;
import auto.pages.CT_ACCOUNT;
import auto.pages.Login;

public class Day16_BTVN_1 extends CommonBase{
	private String user = "test212@gmail.com";
	private String pass = "Test123"; //Test123 Test321
	private String newPass = "Test321";
	@BeforeMethod
	public void initChrome() throws InterruptedException {
		initChromeDriver(CT_Common.URLAladaLogin);
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
	@Test //Login
	public void loginALada() throws InterruptedException {
		//login
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Alada_Functions f = new Alada_Functions(driver);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(CT_ACCOUNT.ALADA_TXT_LOGIN));
		f.LoginFunction(user, pass);
		
		//move to chang password page
		f.moveToChange();
		
		//change pass 
		wait.until(ExpectedConditions.visibilityOfElementLocated(CT_ACCOUNT.ALADA_TXT_INFO));
		f.ChangePass(user,pass , newPass);
		
		//click ok on alert
		wait.until(ExpectedConditions.alertIsPresent());
		f.clickAlert();
		
		assertEquals("",driver.getTitle());
		
	}
}
