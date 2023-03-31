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
public class HomePageAdmin {
@FindBy(xpath = "(//div[contains(text( ),\"Services\")])[2]")
private WebElement servicesModule;

public HomePageAdmin(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public void getServiceModule()
{
	servicesModule.click();
}
}
