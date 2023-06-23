package com.stepdefinition;

import org.junit.Assert;

import com.base.Base_Class;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author Sathish Kumar
 * @Descrption User to perform Select page with different testcases
 * @Date 22-Sep-2022
 *
 */

public class TC3_SelectHotel extends Base_Class{
	/**
	 * @Descrption Used to perform select hotel name
	 */
	PageObjectManager pom = new PageObjectManager();

	@Then("User should select hotel name")
	public void user_should_select_hotel_name() {
		pom.getSelectHotelPage().selecthotel();
	}

	/**
	 * @Descrption Used to perform verifying success message after select
	 * @param selectsuccessMsg
	 */

	@Then("User should verify after select hotel name success message {string}")
	public void user_should_verify_after_select_hotel_name_success_message(String selectsuccessMsg) {
		Assert.assertEquals("verify after select hotel success msg",selectsuccessMsg,elementGetText(pom.getBookHotelPage().getSelectSuccessMsg()));
	}

	/**
	 * @Descrption Used to perform click perform continue without select a hotel
	 */

	@Then("User should click continue without select any hotel")
	public void user_should_click_continue_without_select_any_hotel() {
		pom.getSelectHotelPage().clickcontine();
	}

	/**
	 * @Descrption Used to perform verifying error message without select hotel
	 * @param selectErrorMsg
	 */

	@Then("User should verify without select any hotel error message {string}")
	public void user_should_verify_without_select_any_hotel_error_message(String selectErrorMsg) {
		Assert.assertEquals("Verify without select any hotel error message", selectErrorMsg,
				elementGetText(pom.getSelectHotelPage().getSelectErrorMsg()));
	}
}
