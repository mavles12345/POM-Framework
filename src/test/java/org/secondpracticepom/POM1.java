package org.secondpracticepom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class POM1 extends BaseClass {

	public POM1() {

		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(xpath = "//input[@id='emai']"), @FindBy(xpath = "//input[@name='email']") })
	private List<WebElement> txtUser;

	@FindAll({ @FindBy(xpath = "//input[@name='pass']"), @FindBy(xpath = "//input[@id='pas']") })
	private List<WebElement> txtPass;

	@FindBy(name = "login")
	private WebElement txtLogin;

	public List<WebElement> getTxtUser() {
		return txtUser;
	}

	public List<WebElement> getTxtPass() {
		return txtPass;
	}

	public WebElement getTxtLogin() {
		return txtLogin;
	}

}
