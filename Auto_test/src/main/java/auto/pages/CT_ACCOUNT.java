package auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CT_ACCOUNT {
	public static By TEXTBOX_EMAIL = By.id("email");
	public static By TEXTBOX_PASS = By.id("password");
	public static By BTN_SIGNIN = By.xpath("//button[text()='Sign in']") ;
	public static By BTN_USER = By.xpath("//a[@id='user-dropdown']");
	public static By BTN_SIGNOUT = By.xpath("//a[normalize-space() = 'Sign Out']");
}
