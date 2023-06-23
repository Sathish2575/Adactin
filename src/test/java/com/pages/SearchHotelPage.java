package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.pagemanager.PageObjectManager;

public class SearchHotelPage extends Base_Class {
	PageObjectManager pom = new PageObjectManager();

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "location")
	private WebElement drplocation;

	@FindBy(id = "hotels")
	private WebElement drphotels;

	@FindBy(id = "room_type")
	private WebElement drproomtype;

	@FindBy(id = "room_nos")
	private WebElement drproomno;

	@FindBy(id = "datepick_in")
	private WebElement txtdatein;

	@FindBy(id = "datepick_out")
	private WebElement txtdateout;

	@FindBy(id = "adult_room")
	private WebElement drpadultroom;

	@FindBy(id = "child_room")
	private WebElement drpchildroom;

	@FindBy(id = "Submit")
	private WebElement btnsearch;

	@FindBy(id = "username_show")
	private WebElement logintxtmsg;

	@FindBy(xpath = "//span[contains(text(),'Check-In Date shall be before than Check-Out Date')]")
	private WebElement datainErrorMsg;

	@FindBy(xpath = "//span[contains(text(),'Check-Out Date shall be after than Check-In Date')]")
	private WebElement dataoutErrorMsg;

	
	@FindBy(xpath = "//span[contains(text(),'Please Select a Location')]")
	private WebElement locationErrorMsg;

	

	public WebElement getLogintxtmsg() {
		return logintxtmsg;
	}

	public WebElement getDatainErrorMsg() {
		return datainErrorMsg;
	}

	public WebElement getDataoutErrorMsg() {
		return dataoutErrorMsg;
	}

	public WebElement getLocationErrorMsg() {
		return locationErrorMsg;
	}

	public WebElement Getlogintxtmsg() {
		return logintxtmsg;
	}

	public WebElement getDrplocation() {
		return drplocation;
	}

	public WebElement getDrphotels() {
		return drphotels;
	}

	public WebElement getDrproomtype() {
		return drproomtype;
	}

	public WebElement getDrproomno() {
		return drproomno;
	}

	public WebElement getTxtdatein() {
		return txtdatein;
	}

	public WebElement getTxtdateout() {
		return txtdateout;
	}

	public WebElement getDrpadultroom() {
		return drpadultroom;
	}

	public WebElement getDrpchildroom() {
		return drpchildroom;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}

	public void searchhotel(String location, String hotel, String roomtype, String roomno, String datein,
			String dateout, String adultroom, String childroom) throws Exception {
		
		elementSendkeys(getDrplocation(), location);
		elementSendkeys(getDrphotels(), hotel);
		elementSendkeys(getDrproomtype(), roomtype);
		elementSendkeys(getDrproomno(), roomno);
		elementclear(txtdatein);
		elementSendkeys(getTxtdatein(), datein);
		elementclear(txtdateout);
		elementSendkeys(getTxtdateout(), dateout);
		SelectoptionbyText(getDrpadultroom(), adultroom);
		SelectoptionbyText(getDrpchildroom(), childroom);
		elementclick(getBtnsearch());
	}

	public void searchhotel(String location, String hotel, String datein, String dateout, String adultroom)
			throws Exception {
		elementSendkeys(getDrplocation(), location);
		elementSendkeys(getDrphotels(), hotel);
		elementSendkeys(getTxtdatein(), datein);
		elementSendkeys(getTxtdateout(), dateout);
		SelectoptionbyText(getDrpadultroom(), adultroom);
		elementclick(getBtnsearch());
	}

	public void searchhotel() {
		elementclick(getBtnsearch());
	}

}
