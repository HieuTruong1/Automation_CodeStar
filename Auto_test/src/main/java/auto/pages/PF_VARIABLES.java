package auto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PF_VARIABLES {
	@FindBy (id = "txtLoginUsername") protected WebElement txtUsername;
	@FindBy (id = "txtLoginPassword") protected WebElement txtPass;
	@FindBy (xpath = "//div[@class = 'field']/button[text() = 'ĐĂNG NHẬP']") protected WebElement btnSubmit;
	
	@FindBy (xpath = "//div[@class = 'avatar2']/img") protected WebElement webimgUser;
	@FindBy (xpath = "//a[text() = 'Chỉnh sửa thông tin']") protected WebElement btnChangeInfo;
	
	//@FindBy (xpath = "//label[text() = 'Tên đăng nhập']/following-sibling::input") protected WebElement rUserName;
	@FindBy (id = "txtpassword") protected WebElement rPass;
	@FindBy (id = "txtnewpass") protected WebElement rNewPass; 
	@FindBy (id = "txtrenewpass") protected WebElement rReNewPass; 
	@FindBy (xpath = "//button[text() = 'Lưu mật khẩu mới']") protected WebElement btnSavePass;
	
	
	
	/*******************************************************************************/
	//day15 Rise
	@FindBy (id = "email") protected WebElement riseEmail;
	@FindBy (id = "password") protected WebElement risePass;
	@FindBy (xpath = "//button[text()='Sign in']") protected WebElement riseSubmit;
	
	@FindBy(xpath="//span[text()='Clients']") WebElement clientMenu;	
	@FindBy(xpath = "//a[text()=' Add client']") WebElement btnAddClient;
	@FindBy(id = "type_person") WebElement radioPerson;
	@FindBy(id = "company_name") WebElement txtCompany;
	@FindBy (id = "website") WebElement txtWeb;
	@FindBy(id = "disable_online_payment") WebElement chkPayment;
	@FindBy (xpath = "//a[text()='Clients']") WebElement tabCilents;
	@FindBy(xpath = "//button[normalize-space()='Save']") WebElement btnSave;
	@FindBy (xpath = "//input[@type = 'search']") WebElement txtSearch;
	
	//day15 Trizen
	@FindBy (xpath = "//a[@id='one-way-tab']") WebElement tabOneWay;
	@FindBy (xpath = "//div[@id='one-way']//descendant::label[text() = 'Flying from']/following-sibling::div/input") WebElement txtFightFrom;
	@FindBy (xpath = "//div[@id='one-way']//descendant::label[text() = 'Flying to']/following-sibling::div/input") WebElement txtFightTo;
	@FindBy (xpath = "//div[@id='one-way']//descendant::label[text() = 'Passengers']/following-sibling::div//a") WebElement dropPassenger;
	@FindBy (xpath = "//div[@id='one-way']//descendant::label[text() = 'Coach']/following-sibling::div//button") WebElement dropCoach;
	@FindBy (xpath = "//div[@id='one-way']//descendant::a[text() = 'Search Now']") WebElement btnSearchFight;
}
