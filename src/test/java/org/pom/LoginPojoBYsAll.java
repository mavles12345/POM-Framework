package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPojoBYsAll extends BaseClass {

	public LoginPojoBYsAll() {

		PageFactory.initElements(driver, this);

	}

	@CacheLookup
	@FindBys({ @FindBy(xpath = "//input[@name='email']"), @FindBy(xpath = "//input[@id='email']") })

	private List<WebElement> txtUserName;
	@CacheLookup
	@FindAll({ @FindBy(xpath = "//input[@name='pass']"), @FindBy(xpath = "//input[@id='pas']") })
	private List<WebElement> txtPass;

	@FindBy(name = "login")
	private WebElement txtLogin;

	public List<WebElement> getTxtUserName() {
		return txtUserName;
	}

	public List<WebElement> getTxtPass() {
		return txtPass;
	}

	public WebElement getTxtLogin() {
		return txtLogin;
	}

}
