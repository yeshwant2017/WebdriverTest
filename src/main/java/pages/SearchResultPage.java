package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonDrivers;

public class SearchResultPage {
	WebDriver driver;
	public SearchResultPage(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy(xpath="//li[@id='result_5']")
	WebElement productLink;
	
	public ProductDetailsPage clickOnProduct() throws InterruptedException
	{
		String parentWindow = driver.getWindowHandle();
		productLink.click();
		CommonDrivers.switchToNewWindow(driver, parentWindow);
		return PageFactory.initElements(driver, ProductDetailsPage.class);
	}
}
