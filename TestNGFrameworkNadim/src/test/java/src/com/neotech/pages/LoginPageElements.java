package src.com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class LoginPageElements {

	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(xpath = "//button")
	public WebElement loginBtn;

	@FindBy(id = "txtPassword-error")
	public WebElement passwordError;

	@FindBy(xpath = "//div[@class='toast-message']")
	public WebElement invalidPasswordMsg;

	public LoginPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
