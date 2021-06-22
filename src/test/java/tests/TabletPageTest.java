package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import baseTest.BaseTest;
import pages.LaptopsPage;
import pages.TabletsPage;
import utilities.WaitUtils;

import static org.junit.Assert.*;


public class TabletPageTest extends BaseTest{

	private TabletsPage tabletPage = new TabletsPage(driver);
	 public String expectedText = "Availability: In Stock";
	
	@Test
	public void samsungGalaxyTabProductTest () {
	
		tabletPage.clickLinkTablets();
		tabletPage.clickLinkSamsungGalaxyTab();
		WaitUtils.waitForJS(driver);
		
		String actualSamsungText = tabletPage.textSamsungGalaxyTabAvailability.getText();
		assertTrue("The product Samsung Galaxy Tab is not available. The actual availability is " + actualSamsungText, actualSamsungText.contains(expectedText));
}

}

