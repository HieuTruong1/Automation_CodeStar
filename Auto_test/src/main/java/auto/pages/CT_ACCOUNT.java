package auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CT_ACCOUNT {
	public static By TEXTBOX_EMAIL = By.id("email");
	public static By TEXTBOX_PASS = By.id("password");
	public static By BTN_SIGNIN = By.xpath("//button[text()='Sign in']") ;
	public static By BTN_USER = By.xpath("//a[@id='user-dropdown']");
	public static By BTN_SIGNOUT = By.xpath("//a[normalize-space() = 'Sign Out']");
	
	
	//day15Trizen
	
	public static By DATE_DEPARTDING = By.xpath("//div[@id='one-way']//descendant::label[text() = 'Departing']/following-sibling::div/input");
	
	//Alada
	public static By ALADA_TXT_LOGIN = By.xpath("//p[text() = 'Đăng nhập ']");
	public static By ALADA_TXT_INFO = By.xpath("//a[text() = 'Thông tin chung']");
	
	//AlertDemo
	public static By ALERT_DEMO_TITLE = By.xpath("//h1[@class = 'title']/child::a");
	public static By BTN_TRY = By.xpath("//button [text() = 'Try it']");
}
