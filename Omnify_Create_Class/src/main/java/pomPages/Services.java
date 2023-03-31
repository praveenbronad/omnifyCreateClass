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
public class Services {
@FindBy(xpath = "(//img[@class=\"create-a-service-icon\"])[1]")
private WebElement createServiceButton;

@FindBy(xpath = "(//div[text()=\"Classes\"])[2]")
private WebElement classesButton;

public Services(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public void getcreateServiceButton()
{
	createServiceButton.click();
}

public void getClassesButton()
{
	classesButton.click();

}
}
