/**
 * 
 */
package genericLib;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Praveen B Ronad
 *
 */
public class StepGroup {
	public WebDriver driver;
	Propertyfile pdata=new Propertyfile(); // create object of PropertyFile class to access its methods
	WebdriverUtilities util= new WebdriverUtilities();
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		// set up chrome driver 
		WebDriverManager.chromedriver().setup();
		// create driver 
		driver= new ChromeDriver();
		//ṁaximize the browser 
		driver.manage().window().maximize();
		// implicit wait
		driver.get(pdata.getPropertyData("logInURL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApp()
	{
		// close the app
		driver.close();
	}
}
