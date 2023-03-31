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
public class OmnifyLoginPage {
	// Declare Web Elements 
	@FindBy(xpath = "//p[text()=\"Continue with Google\"]")
	private WebElement continueWithGoogleButton;
	
	@FindBy(xpath = "//p[text()=\"Continue with Email\"]")
	private WebElement continueWithEmailButton;
	
	// Initilize driver using constructors 
	public OmnifyLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilise the webelements
	public void loginViaGmail()
	{
		continueWithGoogleButton.click();
	}
	
	public void loginViaEmail()
	{
		continueWithEmailButton.click();
	}
	
}
