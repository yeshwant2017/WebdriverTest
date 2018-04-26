package Example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import core.TestCore;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchResultPage;
import pages.SignInPage;
import utils.Property;

public class Test003_ProductValidation extends TestCore {
	@Test
	public void verifyProductTitle() throws InterruptedException
	{
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		SignInPage signInPage = homePage.clickSignInButton();
		signInPage.login(Property.getValue("username"), Property.getValue("password"));
		SearchResultPage searchResult = homePage.searchProduct("tshirt");
		ProductDetailsPage productDetails = searchResult.clickOnProduct();
		String actualTitle = productDetails.getProductTitle();
		System.out.println(actualTitle);
		productDetails.clickAddToCart("Medium");
		Assert.assertEquals("", "");
		homePage.signOut();
}
}
