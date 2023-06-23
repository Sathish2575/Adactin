package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;

public class BookHotelPage extends Base_Class {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement txtfirstname;
	@FindBy(id = "last_name")
	private WebElement txtlastname;
	@FindBy(id = "address")
	private WebElement txtaddress;
	@FindBy(id = "cc_num")
	private WebElement txtccnumber;
	@FindBy(id = "cc_type")
	private WebElement drpcctype;
	@FindBy(id = "cc_exp_month")
	private WebElement drpmonth;
	@FindBy(id = "cc_exp_year")
	private WebElement drpyear;
	@FindBy(id = "cc_cvv")
	private WebElement txtccvno;
	@FindBy(id="book_now")
	private WebElement Btnbook;
	@FindBy(xpath = "//td[contains(text(),'Book A Hotel ')]")
	private WebElement selectSuccessMsg;
	
	@FindBy(xpath = "//label[contains(text(),'Please Enter your First Name')]")
	private WebElement firstnameErrorMsg;
	@FindBy(xpath = "//label[contains(text(),'Please Enter you Last Name')]")
	private WebElement lastnameErrorMsg;
	@FindBy(xpath = "//label[contains(text(),'Please Enter your Address')]")
	private WebElement addressErrorMsg;
	@FindBy(xpath = "//label[contains(text(),'Please Enter your 16 Digit Credit Card Number')]")
	private WebElement cardnoErrorMsg;
	@FindBy(xpath = "//label[contains(text(),'Please Select your Credit Card Type')]")
	private WebElement cardtypeErrorMsg;
	@FindBy(xpath = "//label[contains(text(),'Please Select your Credit Card Expiry Month')]")
	private WebElement expmonthErrorMsg;
	@FindBy(xpath = "//label[contains(text(),'Please Enter your Credit Card CVV Number')]")
	private WebElement expyearErrorMsg;
	
	
	public WebElement getSelectSuccessMsg() {
		return selectSuccessMsg;
	}

	public WebElement getFirstnameErrorMsg() {
		return firstnameErrorMsg;
	}

	public WebElement getLastnameErrorMsg() {
		return lastnameErrorMsg;
	}

	public WebElement getAddressErrorMsg() {
		return addressErrorMsg;
	}

	public WebElement getCardnoErrorMsg() {
		return cardnoErrorMsg;
	}

	public WebElement getCardtypeErrorMsg() {
		return cardtypeErrorMsg;
	}

	public WebElement getExpmonthErrorMsg() {
		return expmonthErrorMsg;
	}

	public WebElement getExpyearErrorMsg() {
		return expyearErrorMsg;
	}

	
	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtccnumber() {
		return txtccnumber;
	}

	public WebElement getDrpcctype() {
		return drpcctype;
	}

	public WebElement getDrpmonth() {
		return drpmonth;
	}

	public WebElement getDrpyear() {
		return drpyear;
	}

	public WebElement getTxtccvno() {
		return txtccvno;
	}

	public WebElement getBtnbook() {
		return Btnbook;
	}

	public void bookhotel(String firstname, String lastname, String address, String cardno, String Cardtype,
			String expmonth, String expyear, String cvv) {

		elementSendkeys(getTxtfirstname(), firstname);
		elementSendkeys(getTxtlastname(), lastname);
		elementSendkeys(getTxtaddress(), address);
		elementSendkeys(getTxtccnumber(), cardno);
		elementSendkeys(getDrpcctype(), Cardtype);
		elementSendkeys(getDrpmonth(), expmonth);
		elementSendkeys(getDrpyear(), expyear);
		elementSendkeys(getTxtccvno(), cvv);
		elementclick(getBtnbook());

	}

	public void bookhotel() {
		elementclick(getBtnbook());
	}

}
