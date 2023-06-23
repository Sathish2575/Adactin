package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.pagemanager.PageObjectManager;

public class LoginPage extends Base_Class {
	
	PageObjectManager pom = new PageObjectManager();

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement txtusername;
	
	@FindBy(id = "password")
	private WebElement txtpassword;

	@FindBy(id = "login")
	private WebElement btnlogin;
	
	@FindBy(xpath = "//b[contains(text(),'Invalid Login details')]")
	private WebElement txtErrorMsg;

	public WebElement getTxtErrorMsg() {
		return txtErrorMsg;
	}

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public PageObjectManager getPom() {
		return pom;
	}

	public void getlogin(String username, String password) {
		elementSendkeys(getTxtusername(), username);
		elementSendkeys(getTxtpassword(), password);
		elementclick(getBtnlogin());

	}

	public void getloginwithEnter(String username, String password) {
		elementSendkeys(getTxtusername(), username);
		elementSendkeys(getTxtpassword(), password);
		getTxtpassword().sendKeys(Keys.ENTER);

	}
}
