package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;

public class CancelBookingPage extends Base_Class {

	public CancelBookingPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement selectbookiterneray;

	@FindBy(id = "order_id_text")
	private WebElement searchorderid;

	@FindBy(id = "search_hotel_id")
	private WebElement searchbtn;

	@FindBy(name = "ids[]")
	private WebElement checkbox;

	@FindBy(xpath = "//input[contains(@value,'Cancel ')]")
	private WebElement Idcancelbtn;
	
	@FindBy(name = "cancelall")
	private WebElement cancelall;
	
	@FindBy(xpath = "//label[contains(@id,'search_result_error')]")
	private WebElement cancelSuccessMsg;

	
	public WebElement getSelectbookiterneray() {
		return selectbookiterneray;
	}


	public WebElement getSearchorderid() {
		return searchorderid;
	}


	public WebElement getSearchbtn() {
		return searchbtn;
	}


	public WebElement getCheckbox() {
		return checkbox;
	}


	public WebElement getIdcancelbtn() {
		return Idcancelbtn;
	}


	public WebElement getCancelall() {
		return cancelall;
	}


	public WebElement getCancelSuccessMsg() {
		return cancelSuccessMsg;
	}


	public void cancelOrderid(String orderId) throws InterruptedException {

		elementclick(getSelectbookiterneray());
		elementSendkeys(getSearchorderid(), orderId);
		Thread.sleep(3000);
		elementclick(getSearchbtn());
		Thread.sleep(3000);
		elementclick(getCheckbox());
		Thread.sleep(3000);
		elementclick(getIdcancelbtn());
		Thread.sleep(3000);
		acceptAlert();

	}

}
