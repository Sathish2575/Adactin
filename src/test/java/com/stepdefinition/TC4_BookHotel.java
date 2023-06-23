package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.base.Base_Class;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author Sathish Kumar
 * @Descrption User to perform booking page with different testcases
 * @Date 22-Sep-2022
 *
 */

public class TC4_BookHotel extends Base_Class {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @Descrption Used to perform booking a hotel with entering details
	 * @param firstname
	 * @param lastname
	 * @param address
	 * @param dataTable
	 */
	@Then("User should book hotel {string},{string} and {string}")
	public void user_should_book_hotel_and(String firstname, String lastname, String address,
			io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> maps = dataTable.asMaps();
		Map<String, String> map = maps.get(1);
		String cardno = map.get("cardno");
		String Cardtype = map.get("Cardtype");
		String expmonth = map.get("expmonth");
		String expyear = map.get("expyear");
		String cvv = map.get("cvv");
		pom.getBookHotelPage().bookhotel(firstname, lastname, address, cardno, Cardtype, expmonth, expyear, cvv);

	}
	/**
	 * @Descrption Used to perform verify success mesage after booking
	 * @param bookSucessMsg
	 * @throws InterruptedException
	 */

	@Then("User should verify after booking success message {string}")
	public void user_should_verify_after_booking_success_message(String bookSucessMsg) throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertEquals("verify after book hotel success msg", bookSucessMsg,
				elementGetText(pom.getBookingConfirmPage().getBookSucessMsg()));

	}
	/**
	 * @Descrption Used to perform click button without any entering data
	 */

	@Then("User should click book now button without entry any data")
	public void user_should_click_book_now_button_without_entry_any_data() {
		pom.getBookHotelPage().bookhotel();

	}
	/**
	 * @Descrption Used to perform verify error messages without select any data
	 * @param firstnameErrorMsg
	 * @param lastnameErrorMsg
	 * @param addressErrorMsg
	 * @param cardnoErrorMsg
	 * @param cardtypeErrorMsg
	 * @param expmonthErrorMsg
	 * @param expyearErrorMsg
	 */

	@Then("User should verify after booking without entry error message {string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_after_booking_without_entry_error_message_and(String firstnameErrorMsg,
			String lastnameErrorMsg, String addressErrorMsg, String cardnoErrorMsg, String cardtypeErrorMsg,
			String expmonthErrorMsg, String expyearErrorMsg) {
		Assert.assertEquals("verify after book hotel error msg", firstnameErrorMsg,
				elementGetText(pom.getBookHotelPage().getFirstnameErrorMsg()));
		Assert.assertEquals("verify after book hotel error msg", lastnameErrorMsg,
				elementGetText(pom.getBookHotelPage().getLastnameErrorMsg()));
		Assert.assertEquals("verify after book hotel error msg", addressErrorMsg,
				elementGetText(pom.getBookHotelPage().getAddressErrorMsg()));
		Assert.assertEquals("verify after book hotel error msg", cardnoErrorMsg,
				elementGetText(pom.getBookHotelPage().getCardnoErrorMsg()));
		Assert.assertEquals("verify after book hotel error msg", cardtypeErrorMsg,
				elementGetText(pom.getBookHotelPage().getCardtypeErrorMsg()));
		Assert.assertEquals("verify after book hotel error msg", expmonthErrorMsg,
				elementGetText(pom.getBookHotelPage().getExpmonthErrorMsg()));
		Assert.assertEquals("verify after book hotel error msg", expyearErrorMsg,
				elementGetText(pom.getBookHotelPage().getExpyearErrorMsg()));

	}

}
