package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import baseTest.BaseTest;
import pages.LaptopsPage;
import utilities.WaitUtils;

import static org.junit.Assert.*;


public class LaptopPageTest extends BaseTest{

	private LaptopsPage laptopPage = new LaptopsPage(driver);
	 public String expectedText = "Availability: In Stock";
	
	@Test
	public void hpProductTest () {
	
		laptopPage.clickLinkLaptops();
		laptopPage.clickLinkAllLaptops();
		laptopPage.clickLinkHpProduct();
		WaitUtils.waitForJS(driver);
		
		String actualHpText = laptopPage.getTextHpProduct();
		assertTrue("The product HP is not available. The actual availability is " + actualHpText, actualHpText.contains(expectedText));
}

	@Test
	public void macbookProductTest (){
	
		laptopPage.clickLinkLaptops();
		laptopPage.clickLinkAllLaptops();
		laptopPage.clickMacBook();
		WaitUtils.waitForJS(driver);
		
		String actualMacbookText = laptopPage.getTextMacbookProduct();
		assertTrue("The product Macbook is not available. The actual availability is " + actualMacbookText, actualMacbookText.contains(expectedText));
}
	@Test
	public void macbookAirProductTest () {
	
		laptopPage.clickLinkLaptops();
		laptopPage.clickLinkAllLaptops();
		laptopPage.clickMacBookAir();
		WaitUtils.waitForJS(driver);
		
		String actualMacbookAirText = laptopPage.getTextMacbookAirProduct();
		assertTrue("The product MacbookAir is not available. The actual availability is " + actualMacbookAirText, actualMacbookAirText.contains(expectedText));
}
	
	@Test
	public void macbookProProductTest (){
	
		laptopPage.clickLinkLaptops();
		laptopPage.clickLinkAllLaptops();
		laptopPage.clickMacBookPro();
		WaitUtils.waitForJS(driver);
		
		String actualMacbookProText = laptopPage.getTextMacbookProProduct();
		assertTrue("The product MacbookPro is not available. The actual availability is " + actualMacbookProText, actualMacbookProText.contains(expectedText));
}
	
	@Test
	public void sonyVaioProductTest (){
	
		laptopPage.clickLinkLaptops();
		laptopPage.clickLinkAllLaptops();
		laptopPage.clickSonyVaioProduct();
		WaitUtils.waitForJS(driver);
		
		String actualSonyVaioText = laptopPage.getTextSonyVaioProduct();
		assertTrue("The product Sony VAIO is not available. The actual availability is " + actualSonyVaioText, actualSonyVaioText.contains(expectedText));
}
}

