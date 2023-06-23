package com.stepdefinition;

import org.junit.Assert;

import com.base.Base_Class;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author Sathish Kumar
 * @Descrption Used to perform common testcases
 * @Date 22-Sep-2022
 *
 */
public class CommonStep extends Base_Class {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @Descrption Used to verify login success message
	 * @param expLoginSuccessMsg
	 */
	@Then("User should verifying after login message {string}")
	public void user_should_verifying_after_login_message(String expLoginSuccessMsg) {

		Assert.assertEquals("Verifying after Login Success message", expLoginSuccessMsg,
				elementGetAttributeValue(pom.getSearchHotelPage().Getlogintxtmsg()));
	}
}
