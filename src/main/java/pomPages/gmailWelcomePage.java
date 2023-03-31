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
public class gmailWelcomePage {
	
	@FindBy(name="password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextBtnPassword;
	
	public gmailWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String password)
	{
		passwordTextField.sendKeys(password);
	}
	
	public void clickNextBtn()
	{
		nextBtnPassword.click();
	}
}
