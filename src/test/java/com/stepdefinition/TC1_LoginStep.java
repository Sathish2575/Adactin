package com.stepdefinition;

import java.io.FileNotFoundException;


import java.io.IOException;

import org.junit.Assert;

import com.base.Base_Class;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/**
 * 
 * @author Sathish Kumar
 * @Descrption User to perform login with different testcase
 * @Date 22-Sep-2022
 *
 */
public class TC1_LoginStep extends Base_Class {
	PageObjectManager pom = new PageObjectManager();
	/**
	 * @Descrption Used to perform go adactin hotel page website
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@Given("User is on the adactin hotel page")
	public void user_is_on_the_adactin_hotel_page() throws FileNotFoundException, IOException {

		
	}
	/**
	 * @Descrption Used to perform login
	 * @param username
	 * @param password
	 */
	@When("User should perform login {string}, {string}")
	public void user_should_perform_login(String username, String password) {
		pom.getLoginpage().getlogin(username, password);
	}
	/**
	 * @Descrption Used to perform login with Enter key
	 * @param username
	 * @param password
	 */
	@When("User should perform login {string}, {string} with Enter key")
	public void user_should_perform_login_with_enter_key(String username, String password) {
		pom.getLoginpage().getloginwithEnter(username, password);
	}
	/**
	 * @Descrption Used to perform verifying invalid message after login
	 * @param experrormessage
	 */
	@Then("User should verifying after login with invalid message {string}")
	public void user_should_verifying_after_login_with_invalid_message(String experrormessage) {
		Assert.assertTrue("verify login error message", elementGetText(pom.getLoginpage().getTxtErrorMsg()).contains(experrormessage));
	}

}
