package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class LaptopsPage extends AbstractPage{
	
	//links
		@FindBy(linkText = "Laptops & Notebooks") 
		private WebElement linkLaptops;
		
		@FindBy(linkText = "Show All Laptops & Notebooks") 
		private WebElement linkAllLaptops;

		@FindBy(css = "#content > div:nth-child(7) > div:nth-child(1) > div > div:nth-child(2) > div.caption > h4 > a")
		private WebElement linkHpProduct;
		
		@FindBy(css = "#content > div:nth-child(7) > div:nth-child(2) > div > div:nth-child(2) > div.caption > h4 > a")
		private WebElement linkMacbook;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[1]/h4/a")
		private WebElement linkMacbookAir;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[1]/h4/a")
		private WebElement linkMacbookPro;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[1]/h4/a")
		private WebElement linkSonyVaio;
		
//text
		@FindBy (xpath = "//*[@id=\"content\"]/div/div[2]/ul[1]/li[4]")
		public WebElement textProductHpAvailability;

		@FindBy (xpath = "//*[@id=\"content\"]/div/div[2]/ul[1]/li[4]")
		public WebElement textMacbookAvailability;
		
		@FindBy (xpath = "//*[@id=\"content\"]/div/div[2]/ul[1]/li[4]")
		public WebElement textMacbookAirAvailability;
		
		@FindBy (xpath = "//*[@id=\"content\"]/div/div[2]/ul[1]/li[4]")
		public WebElement textMacbookProAvailability;
		
		@FindBy (xpath = "//*[@id=\"content\"]/div/div[2]/ul[1]/li[3]")
		public WebElement textSonyVaioAvailability;

	
		
		public LaptopsPage(WebDriver driver) {
		super(driver);
	}
	
	//methods
	public void clickLinkLaptops() {
		linkLaptops.click();
	}
	
	public void clickLinkAllLaptops() {
		linkAllLaptops.click();
	}
	
	public void clickLinkHpProduct() {
		linkHpProduct.click();
	}
	
	public String getTextHpProduct() {
 	return 	textProductHpAvailability.getText();
}
	public void clickMacBook() {
		linkMacbook.click();
	}
	
	public String getTextMacbookProduct() {
	 	return 	textMacbookAvailability.getText();
	}
	
	public void clickMacBookAir() {
		linkMacbookAir.click();
	}
	
	public String getTextMacbookAirProduct() {
	 	return 	textMacbookAirAvailability.getText();
	}
	
	public void clickMacBookPro() {
		linkMacbookPro.click();
	}
	
	public String getTextMacbookProProduct() {
	 	return 	textMacbookProAvailability.getText();
	}
	
	
	public void clickSonyVaioProduct() {
		linkSonyVaio.click();
	}
	
	public String getTextSonyVaioProduct() {
	 	return 	textSonyVaioAvailability.getText();
	}
	
}
