package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class PhonesPage extends AbstractPage{
	
	//links
		@FindBy(linkText = "Phones & PDAs") 
		private WebElement linkPhones;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a")
		private WebElement linkHtcProduct;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a")
		private WebElement linkiPhoneProduct;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[1]/h4/a")
		private WebElement linkPalmProduct;
		
		
//text
		@FindBy (xpath = "//*[@id=\"content\"]/div/div[2]/ul[1]/li[4]")
		public WebElement textHtcProductAvailability;
		
		@FindBy (xpath = "//*[@id=\"content\"]/div[1]/div[2]/ul[1]/li[3]")
		public WebElement textiPhoneProductAvailability;
		
		@FindBy (xpath = "//*[@id=\"content\"]/div/div[2]/ul[1]/li[3]")
		public WebElement textPalmProductAvailability;
		

		
		public PhonesPage(WebDriver driver) {
		super(driver);
	}
		
	
	//methods
	public void clickLinkPhones() {
		linkPhones.click();
	}
	
	public void clickLinkHtcProduct() {
		linkHtcProduct.click();
	}
	
	public String getTextHtcProduct() {
 	return 	textHtcProductAvailability.getText();
}
	
	public void clickLinkiPhoneProduct() {
		linkiPhoneProduct.click();
	}
	
	public String getTextiPhoneProduct() {
 	return 	textiPhoneProductAvailability.getText();
}
	
	public void clickLinkPalmProduct() {
		linkPalmProduct.click();
	}
	
	public String getTextPalmProduct() {
 	return 	textPalmProductAvailability.getText();
}
}
