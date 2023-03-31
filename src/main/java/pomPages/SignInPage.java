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
public class SignInPage {
	@FindBy(id="identifierId")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//span[text()=\"Next\"]")
	private WebElement nextButton;
	
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailId(String email) {
		emailTextField.sendKeys(email);
	}
	
	public void nextBtn()
	{
		nextButton.click();
	}
}
