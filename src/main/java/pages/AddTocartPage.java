package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTocartPage {

	WebDriver driver;
	public AddTocartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy(xpath="//span[@class='a-list-item']/a/span")
	WebElement addedProduct;
	
	public String getCartProductName()
	{
		return addedProduct.getText();
	}
}