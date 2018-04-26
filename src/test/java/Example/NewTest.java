package Example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {	
	    
	    private WebDriver driver = null;
		
		@BeforeTest
		public void beforeTest() {	
			
		    System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		      
		}	
		
		@Test				
		public void testEasy() {
			
			driver.get("http://demo.guru99.com/selenium/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}