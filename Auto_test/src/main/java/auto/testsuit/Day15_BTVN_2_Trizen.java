package auto.testsuit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.common.CommonBase;
import auto.constant.CT_Common;
import auto.pages.Day15TrizenFunctions;

public class Day15_BTVN_2_Trizen extends CommonBase {
	@BeforeMethod
	public void initChrome() throws InterruptedException {
		initChromeDriver(CT_Common.URLTrizen);
	}
	
//	@AfterMethod
//	public void closeChrome() {
//		driver.close();
//	}
	
	@Test
	public void addFlightSuccessfully() throws InterruptedException {
		// TODO Auto-generated method stub
		Day15TrizenFunctions f = new Day15TrizenFunctions(driver);
		f.addFlight("Ha Noi", "Ho Chi Minh", "10042024");
	}
}
