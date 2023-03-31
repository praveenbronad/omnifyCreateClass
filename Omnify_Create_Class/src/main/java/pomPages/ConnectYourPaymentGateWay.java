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
public class ConnectYourPaymentGateWay {
    @FindBy(xpath="(//img[@class=\"hpf-button-payment__logo\"])[1]")
    private WebElement payPalGateWayButton;
    
    @FindBy(xpath = "(//img[@class=\\\"hpf-button-payment__logo\\\"])[2]")
    private WebElement stripeGateWayButton;
	
	
	@FindBy(xpath = "//a[text()=\"Connect payment gateway later.\"]")
    private WebElement connectPaymentGateWayLaterButton;
    
    
	public ConnectYourPaymentGateWay(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void getConnectPaymentGateWayLaterButton() {
		connectPaymentGateWayLaterButton.click();
	}
	

}
