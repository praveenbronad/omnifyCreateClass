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
public class SignInWithGoogle {
	@FindBy(xpath = "//div[text()=\"Use another account\"]")
	private WebElement useAnotherAccount;
	
	public SignInWithGoogle(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logInViaOtherAccount()
	{
		useAnotherAccount.click();
	}
	
	
}
