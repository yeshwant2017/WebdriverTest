package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utils.Browsers;
import utils.Property;

public class TestCore {

	public static WebDriver driver;
	@BeforeSuite
	public void init()
	{
		driver = Browsers.get(Property.getValue("browser"));
		navigate();
		driverSettings();
	}
	public void navigate()
	{
		try
		{
			driver.get(Property.getValue("URL"));
		}catch(Exception e)
		{
			System.out.println("Error while navigating to :" +  Property.getValue("URL"));
		}
	}
	public void driverSettings()
	{
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit
				.SECONDS);
		driver.manage().window().maximize();
	}
	/*@AfterSuite
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}*/

}
