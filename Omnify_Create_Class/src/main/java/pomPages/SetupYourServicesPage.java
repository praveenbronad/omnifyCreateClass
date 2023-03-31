/**
 * 
 */
package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


/**
 * @author Praveen B Ronad
 *
 */
public class SetupYourServicesPage {

	@FindBys({@FindBy(id="full-name"),@FindBy(name="name")})
	
	private WebElement fullNameTextField;
	
	@FindBy(id="business-name")
	private WebElement businessNameTextField;
	
	@FindBy(id="store-url")
	private WebElement storeURL;
	
	@FindBy(xpath = "//button[text()=\"Continue\"]")
	private WebElement continueButton;
	
	public SetupYourServicesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void getFullNameTextField(String fullName) {
		fullNameTextField.sendKeys(fullName);
	}

	
	public void getBusinessNameTextField(String businessName) {
		businessNameTextField.sendKeys(businessName);
	}

	
	public void getStoreURL(String storeName) {
		 storeURL.sendKeys(storeName);
	}

	
	public void getContinueButton() {
		continueButton.click();
	}
	
	
	
}
