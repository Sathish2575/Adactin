package com.stepdefinition;

import org.junit.Assert;

import com.base.Base_Class;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
/**
 * 
 * @author Sathish Kumar
 * @Descrption Used to perform cancel the booking order id and exiting order id
 * @Date 22-Sep-2022
 */

public class TC5_CancelBooking extends Base_Class {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @Descrption Used to perform cancel getting order id
	 * @throws InterruptedException
	 */
	@Then("User should cancel order id")
	public void user_should_cancel_order_id() throws InterruptedException {

		String bookingOrderid = pom.getBookingConfirmPage().BookOrderno();
		pom.getCancelBookingPage().cancelOrderid(bookingOrderid);
	}
	/**
	 * @Descrption Used to perform verify cancel booking success message
	 * @param cancelSuccessMsg
	 */

	@Then("User should verify after cancel Booking success message {string}")
	public void user_should_verify_after_cancel_booking_success_message(String cancelSuccessMsg) {
		Assert.assertEquals("Verify after cancel orderid success msg", cancelSuccessMsg,
				elementGetText(pom.getCancelBookingPage().getCancelSuccessMsg()));
	}
	/**
	 * @Descrption Used to perform cancel existing order id
	 * @param exitingorderId
	 * @throws InterruptedException
	 */

	@Then("User should cancel existing {string}")
	public void user_should_cancel_existing(String exitingorderId) throws InterruptedException {
		pom.getCancelBookingPage().cancelOrderid(exitingorderId);
	}
}



