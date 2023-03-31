package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFreeSlot {
	
	@FindBy(xpath = "//a[text()=\"No thanks, take me to my dashboard!\"]")
	private WebElement takeMetoDashboardLink;
	
	public BookAFreeSlot(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
