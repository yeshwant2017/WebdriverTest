package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.CommonDrivers;

public class ProductDetailsPage {
	WebDriver driver;
	public ProductDetailsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy(id="productTitle")
	WebElement productTitle;
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCartButton;
	
	@FindBy(name="dropdown_selected_size_name")
	WebElement size;
	
	public String getProductTitle()
	{
		return productTitle.getText();
	}
	public void clickAddToCart(String size)
	{
		selectSize(size);
		addToCartButton.click();
	}
	public void selectSize(String size)
	{
		CommonDrivers.selectElement(this.size, size);
		//function to handle dropdown
	}
}
