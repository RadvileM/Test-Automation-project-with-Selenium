package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class TabletsPage extends AbstractPage{
	
	//links
		@FindBy(linkText = "Tablets") 
		private WebElement linkTablets;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")
		private WebElement linkSamsungGalaxyTab;
		
		
//text
		@FindBy (xpath = "//*[@id=\"content\"]/div/div[2]/ul[1]/li[3]")
		public WebElement textSamsungGalaxyTabAvailability;

	
		
		public TabletsPage(WebDriver driver) {
		super(driver);
	}
	
	//methods
	public void clickLinkTablets() {
		linkTablets.click();
	}
	
	public void clickLinkSamsungGalaxyTab() {
		linkSamsungGalaxyTab.click();
	}
	
	public String getTextSamsungGalaxyTabProduct() {
 	return 	textSamsungGalaxyTabAvailability.getText();
}
}
