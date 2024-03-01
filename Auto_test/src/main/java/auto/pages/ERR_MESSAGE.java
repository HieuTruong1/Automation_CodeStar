package auto.pages;

import org.openqa.selenium.By;

public class ERR_MESSAGE {
	public static By MSG_ERROR_IVALID_EMAIL = By.xpath("//span[text() = 'Please enter a valid email address.']");
	public static By MSG_AUTHENTICATION_FAILED = By.xpath("//div[normalize-space() = 'Authentication failed!']");
	public static By MSG_ERROR_REQUIRED = By.xpath("//span[text() = 'This field is required.']");
}
