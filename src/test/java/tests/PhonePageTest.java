package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import baseTest.BaseTest;
import pages.LaptopsPage;
import pages.PhonesPage;
import pages.TabletsPage;
import utilities.WaitUtils;

import static org.junit.Assert.*;


public class PhonePageTest extends BaseTest{

	private PhonesPage phonePage = new PhonesPage(driver);
	 public String expectedText = "Availability: In Stock";
	
	@Test
	public void htcPhoneTest () {
	
		phonePage.clickLinkPhones();
		phonePage.clickLinkHtcProduct();
		WaitUtils.waitForJS(driver);
		
		String actualHtcText = phonePage.textHtcProductAvailability.getText();
		assertTrue("The product HTC Touch HD is not available. The actual availability is: " + actualHtcText, actualHtcText.contains(expectedText));
}

	@Test
	public void iPhoneTest () {
	
		phonePage.clickLinkPhones();
		phonePage.clickLinkiPhoneProduct();
		WaitUtils.waitForJS(driver);
		
		String actualiPhoneText = phonePage.textiPhoneProductAvailability.getText();
		assertTrue("The product iPhone is not available. The actual availability is: " + actualiPhoneText, actualiPhoneText.contains(expectedText));
}
	
	@Test
	public void palmProductTest () {
	
		phonePage.clickLinkPhones();
		phonePage.clickLinkPalmProduct();
		WaitUtils.waitForJS(driver);
		
		String actualPalmText = phonePage.textPalmProductAvailability.getText();
		assertTrue("The product Palm Treo Pro is not available. The actual availability is: " + actualPalmText, actualPalmText.contains(expectedText));
}
}

