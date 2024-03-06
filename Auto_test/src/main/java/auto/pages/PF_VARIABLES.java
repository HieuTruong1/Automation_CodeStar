package auto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PF_VARIABLES {
	@FindBy (id = "txtLoginUsername") protected WebElement txtUsername;
	@FindBy (id = "txtLoginPassword") protected WebElement txtPass;
	@FindBy (xpath = "//div[@class = 'field']/button[text() = 'ĐĂNG NHẬP']") protected WebElement btnSubmit;
	
	@FindBy (id = "email") protected WebElement b13Email;
	@FindBy (id = "password") protected WebElement b13Pass;
	@FindBy (xpath = "//button[text()='Sign in']") protected WebElement b13Submit;
	
	@FindBy (xpath = "//div[@class = 'avatar2']/img") protected WebElement webimgUser;
	@FindBy (xpath = "//a[text() = 'Chỉnh sửa thông tin']") protected WebElement btnChangeInfo;
	
	//@FindBy (xpath = "//label[text() = 'Tên đăng nhập']/following-sibling::input") protected WebElement rUserName;
	@FindBy (id = "txtpassword") protected WebElement rPass;
	@FindBy (id = "txtnewpass") protected WebElement rNewPass; 
	@FindBy (id = "txtrenewpass") protected WebElement rReNewPass; 
	@FindBy (xpath = "//button[text() = 'Lưu mật khẩu mới']") protected WebElement btnSave;
	
}
