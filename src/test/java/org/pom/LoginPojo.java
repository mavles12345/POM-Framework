package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPojo extends BaseClass {
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtUserName;

	@FindBy(id="pass")
		private WebElement txtPass;

	@FindBy(name="login")
		private WebElement txtClick;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getTxtClick() {
		return txtClick;
	}

		
	

}
