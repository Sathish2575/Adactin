package com.stepdefinition;

import org.junit.Assert;

import com.base.Base_Class;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author Sathish Kumar
 * @Descrption User to perform Search page with different testcases
 * @Date 22-Sep-2022
 *
 */
public class TC2_SearchHotel extends Base_Class {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @Descrption Used to perform select the hotel details
	 * @param location
	 * @param hotel
	 * @param roomtype
	 * @param roomno
	 * @param datein
	 * @param dateout
	 * @param adultroom
	 * @param childroom
	 * @throws Exception
	 */

	@Then("User should select {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_select_and(String location, String hotel, String roomtype, String roomno, String datein,
			String dateout, String adultroom, String childroom) throws Exception {
		pom.getSearchHotelPage().searchhotel(location, hotel, roomtype, roomno, datein, dateout, adultroom, childroom);
	}

	/**
	 * @Descrption Used to perform verifying success message after search
	 * @param seachSuccessMsg
	 */

	@Then("User should verifying after search {string}")
	public void user_should_verifying_after_search(String seachSuccessMsg) {
		Assert.assertEquals("Verify after search hotel success msg", seachSuccessMsg,
				elementGetText(pom.getSelectHotelPage().getSeachSuccessMsg()));
	}

	/**
	 * @Descrption Used to perform select only mandatory field
	 * @param location
	 * @param hotel
	 * @param datein
	 * @param dateout
	 * @param adultroom
	 * @throws Exception
	 */

	@Then("User should select only madatory field {string},{string},{string},{string} and {string}")
	public void user_should_select_only_madatory_field_and(String location, String hotel, String datein, String dateout,
			String adultroom) throws Exception {
		pom.getSearchHotelPage().searchhotel(location, hotel, datein, dateout, adultroom);
	}

	/**
	 * @Descrption Used to perform verifying date error message after search
	 * @param datainErrorMsg
	 * @param dataoutErrorMsg
	 */
	@Then("User should verifying after search date error {string} and {string}")
	public void user_should_verifying_after_search_date_error_and(String datainErrorMsg, String dataoutErrorMsg) {
		
		Assert.assertEquals("Verify after search hotel Checkin date error msg", datainErrorMsg,
				elementGetText(pom.getSearchHotelPage().getDatainErrorMsg()));
		Assert.assertEquals("Verify after search hotel Checkout date error msg", dataoutErrorMsg,
				elementGetText(pom.getSearchHotelPage().getDataoutErrorMsg()));
	}

	/**
	 * @Descrption Used to perform verifying error message after search
	 * @param locationErrorMsg
	 */
	@Then("User should verifying after search error  {string}")
	public void user_should_verifying_after_search_error(String locationErrorMsg) {
		Assert.assertEquals("Verify after search hotel location error msg", locationErrorMsg,
				elementGetText(pom.getSearchHotelPage().getLocationErrorMsg()));
	}

	/**
	 * @Descrption Used to perform continue without select any fields
	 */

	@Then("User should select without entering fields")
	public void user_should_select_without_entering_fields() {
		pom.getSearchHotelPage().searchhotel();

	}

}
