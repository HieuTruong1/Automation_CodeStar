package auto.testsuit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;

public class Day7_autoSuite extends CommonBase {
	
	@BeforeMethod
	public void openChrome() throws InterruptedException {
		driver = initChromeDriver(CT_Common.URL);
	}
	
	@AfterMethod
	public void closeCrhome() {
		// TODO Auto-generated method stub
		driver.close();
	}
	
	@Test
	public void opeWebBepAnToan() {
		System.out.println("Test1");
	}
}
