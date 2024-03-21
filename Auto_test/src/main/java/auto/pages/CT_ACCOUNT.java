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
	
	//DienMay
	public static By messengerBuble = By.xpath("//iframe[@data-testid = 'dialog_iframe']");
	public static By BTN_MESSENGER_LOGIN = By.xpath("//span[text() = 'Bắt đầu chat']/parent::div");
	public static By TXT_DANGNHAP = By.xpath("//div[text() = 'Đăng nhập']");
	public static By BTN_ZALOCHAT = By.xpath("//div[@id = 'zalo-vr']//descendant::div[@class = 'phone-vr-img-circle']");
	public static By TXT_CHECK_POPUP = By.xpath("//div[text() = 'Chuyên PP điện tử điện lạnh chính hãng : 0988169282']");
	
	//MediaMart
	public static By BTN_ZALO = By.xpath("//div[@id = 'chat-plugins']//iframe");
	public static By BTN_CHAT_NHANH = By.xpath("//div[text() = 'Chat nhanh']");
	public static By TXT_VERIFYED1 = By.xpath("//h3[text() = 'Rất vui khi được hỗ trợ bạn']");
	
	//Bep an toan
	public static By BTNCHATNGAY =	By.xpath("//span[text() = 'Chat với chúng tôi']/ancestor::a");
	public static By TXT_CHECK_CHATNGAY = By.xpath("//h2[text() = 'Giới thiệu bản thân']");
}
