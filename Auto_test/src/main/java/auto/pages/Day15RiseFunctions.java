package auto.pages;

import java.sql.Driver;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Day15RiseFunctions extends PF_VARIABLES{
	private WebDriver driver;
	private String regex = "^(.+)@(.+)$";
	
	public Day15RiseFunctions (WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public boolean isPresent(By locator) {
	    try {
	    	 driver.findElement(locator);
	         return true;   
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	    	return false;
	    }
	}
	public boolean check (String mail) {
		Pattern p = Pattern.compile(regex);
		Matcher match = p.matcher(mail);
		return match.matches();
	}
	
	public void LoginFunction(String email, String pass) throws InterruptedException {
		riseEmail.clear();
		riseEmail.sendKeys(email);
		
		risePass.clear();
		risePass.sendKeys(pass);

		riseSubmit.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void addClient(String company, String mail) throws InterruptedException {
		clientMenu.click();
		btnAddClient.click();
		Thread.sleep(3000);
		radioPerson.click();
		
		txtCompany.sendKeys(company);
		
		//check email validation - if check = false -> not type email in txt website
		if (check(mail)==true) {
			txtWeb.sendKeys(mail);
		}
		Thread.sleep(5000);
		if (chkPayment.isDisplayed()&& chkPayment.isSelected() == false) {
			chkPayment.click();
		}
		btnSave.click();
		Thread.sleep(3000);
	}
	
	public void searchClient (String client) {
		clientMenu.click();
		tabCilents.click();
		txtSearch.sendKeys(client);
	}
}
