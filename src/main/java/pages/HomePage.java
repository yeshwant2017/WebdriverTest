package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonDrivers;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//div[@id='nav-tools']/a")
	WebElement signInButton;
	@FindBy(xpath = "//div[@id='nav-tools']/a[1]")
	WebElement yourAccountElement;
	@FindBy(xpath = "//div[@id='nav-tools']/a[3]")
	WebElement amazonPrimeElement;
	@FindBy(xpath = "//div[@id='nav-tools']/a[4]")
	WebElement wishListElement;
	@FindBy(xpath = "//div[@id='nav-tools']/a[5]")
	WebElement cartElement;
	@FindBy(xpath = "//div[@id='nav-flyout-yourAccount']//div[@class='nav-template nav-flyout-content nav-tpl-itemList']")
	WebElement menuTabElement;
	@FindBy(xpath = "//div[@id='nav-al-container']//div[@id='nav-al-your-account']/a[2]")
	WebElement orderElement;
	@FindBy(xpath = "//div[@id='nav-al-container']//div[@id='nav-al-your-account']/a[13]")
	WebElement signOutElement;

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;
	@FindBy(xpath = "//*[@value='Go']")
	WebElement searchButton;

	public SignInPage clickSignInButton() {
		try {
			signInButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return PageFactory.initElements(driver, SignInPage.class);
	}

	public SearchResultPage searchProduct(String productName) {
		searchBox.sendKeys(productName);
		searchButton.click();
		return PageFactory.initElements(driver, SearchResultPage.class);
	}

	public void account() {
		try {
			yourAccountElement.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void wishList() {
		try {
			wishListElement.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void prime() {
		try {
			amazonPrimeElement.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cart() {
		try {
			cartElement.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void orderMethod() {
		try {

			System.out.println("in Order Method");
			Actions action = new Actions(driver);
			System.out.println("Instance of Actions class created");
			action.moveToElement(signInButton).perform();
			System.out.println("mouse hover to Menu ");
			new WebDriverWait(driver, 30).until(ExpectedConditions
					.visibilityOf(orderElement));
			action.moveToElement(orderElement).click().build().perform();
			System.out.println(" ???? element clicked");
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void signOut() {
		try {

			System.out.println("in Order Method");
			Actions action = new Actions(driver);
			System.out.println("Instance of Actions class created");
			new WebDriverWait(driver, 30).until(ExpectedConditions
					.visibilityOf(signInButton));
			action.moveToElement(signInButton).perform();
			Thread.sleep(3000);
			System.out.println("mouse hover to Menu ");
			new WebDriverWait(driver, 30).until(ExpectedConditions
					.visibilityOf(signOutElement));
			action.moveToElement(signOutElement).click().build().perform();
			System.out.println(" ???? element clicked");
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
