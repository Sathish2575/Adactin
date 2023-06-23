package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;

public class BookingConfirmPage extends Base_Class {
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "order_no")
	private WebElement orderno;
	@FindBy(xpath = "//td[contains(text(),'Booking Confirmation ')]")
	private WebElement bookSucessMsg;
	
	public WebElement getBookSucessMsg() {
		return bookSucessMsg;
	}


	public WebElement getOrderno() {
		return orderno;
	}


	public String BookOrderno() {
		String orderId = elementGetAttributeValue(getOrderno());
		return orderId;

	}

}
