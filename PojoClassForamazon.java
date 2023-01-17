package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAmazonLogin extends BaseClass {
	public PojoAmazonLogin() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "ap_customer_name")
	private WebElement custname;

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(xpath = "//input[@placeholder='At least 6 characters']")
	private WebElement passwd;

	@FindBy(name = "passwordCheck")
	private WebElement passwordCheck;

	@FindBy(className = "a-button-input")
	private WebElement Continuebtn;

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getPasswordCheck() {
		return passwordCheck;
	}

	public WebElement getContinuebtn() {
		return Continuebtn;
	}

}
