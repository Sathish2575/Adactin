package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;

public class SelectHotelPage extends Base_Class {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="radiobutton_0")
	private WebElement selectclick;
	@FindBy(id="continue")
	private WebElement btncontinue;
	@FindBy(xpath = "//label[contains(text(),'Please Select a Hotel')]")
	private WebElement selectErrorMsg;
	@FindBy(xpath = "//td[contains(text(),'Select Hotel')]")
	private WebElement seachSuccessMsg;

	
	public WebElement getSeachSuccessMsg() {
		return seachSuccessMsg;
	}
	
	public WebElement getSelectErrorMsg() {
		return selectErrorMsg;
	}


	public WebElement getSelectclick() {
		return selectclick;
	}
	
	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	public void selecthotel() {
		elementclick(getSelectclick());
		elementclick(getBtncontinue());
		
	}
	public void clickcontine() {
		elementclick(getBtncontinue());
		
	}



	
	
}
