package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver driver;
	public SignInPage(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signIn;
	@FindBy(className="a-button-input")
	WebElement Continue;
	
	public HomePage login(String email, String password)
	{
		this.email.sendKeys(email);
		Continue.click();
		this.password.sendKeys(password);
		signIn.click();
		return PageFactory.initElements(driver, HomePage.class);
	}
}
// if that element appears > follow this step .. else normal process