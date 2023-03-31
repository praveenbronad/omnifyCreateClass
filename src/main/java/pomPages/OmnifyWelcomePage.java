/**
 * 
 */
package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Praveen B Ronad
 *
 */
public class OmnifyWelcomePage {
	// Declare web elements 
	@FindBy(xpath ="//a[text()=\"Sign Up, it's Free\"]")
	private WebElement signupButton;
	
	//  Initialize the driver  using constructor 
	
	public OmnifyWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void getSignupButton() {
		signupButton.click();
	}
	
	// Utilize the web elements
	
	
	
}
