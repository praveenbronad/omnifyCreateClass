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
public class CreateAClassPage {

	@FindBy(id="title")
	private WebElement classTitleTextField;
	
	@FindBy(xpath = "//div[@class=\"ql-editor ql-blank\"]")
	private WebElement classDescriptionTextAreaFiled;
	
	@FindBy(id="radio-6")
	private WebElement colorRadioButton;
	
	@FindBy(xpath = "//div[text()=\"In-person\"]")
	private WebElement addLocationDropDown;
	
	@FindBy(id="mat-input-9")
	private WebElement addAddressTextField;
	
	@FindBy(id="mat-select-1")
	private WebElement addTrainerDropDown;
	
	@FindBy(id="mat-select-2")
	private WebElement serviceTypeDropDown;
	
	@FindBy(id="mat-input-1")
	private WebElement addPriceTextField;
	
	@FindBy(id="mat-input-2")
	private WebElement attendeeLimitTextField;
	
	@FindBy(id="mat-select-3")
	private WebElement dayOfTheWeekDropDown;
	
	@FindBy(id="mat-select-4")
	private WebElement startDateDropDown;
	
	@FindBy(id="mat-input-4")
	private WebElement startTimeTextField;
	
	@FindBy(id="mat-select-5")
	private WebElement endDateDropDown;
	
	@FindBy(id="mat-input-6")
	private WebElement endTimeTextField;
	
	@FindBy(id="mat-select-6")
	private WebElement bookingWindowOpensDropDown;
	
	@FindBy(id="mat-select-7")
	private WebElement bookingWindowClosesDropDown;
	
	@FindBy(xpath = "//div[contains(text(),'Publish')]")
	private WebElement publishDropDown;
	
	@FindBy(xpath = "//label[@for='mat-radio-2-input']//div[@class='mat-radio-outer-circle']")
	private WebElement publicRadioButton;
	
	@FindBy(xpath = "//span[normalize-space()='Publish']")
	private WebElement finalPublishButton;
	
	// Intilize the driver using Constructor
	
	public CreateAClassPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void getClassTitleTextField(String classTitle) {
		classTitleTextField.sendKeys(classTitle);;
	}

	
	public void getClassDescriptionTextAreaFiled(String classDesc) {
		classDescriptionTextAreaFiled.sendKeys(classDesc);
	}

	
	public void getColorRadioButton() {
		colorRadioButton.click();;
	}

	/**
	 * @return the addLocationDropDown
	 */
	public WebElement getAddLocationDropDown() {
		return addLocationDropDown;
	}
	

	public void getAddAddressTextField(String address) {
		 addAddressTextField.sendKeys(address);;
	}

	/**
	 * @return the addTrainerDropDown
	 */
	public WebElement getAddTrainerDropDown() {
		return addTrainerDropDown;
	}

	/**
	 * @return the serviceTypeDropDown
	 */
	public WebElement getServiceTypeDropDown() {
		return serviceTypeDropDown;
	}

	
	public void getAddPriceTextField(String price) {
		addPriceTextField.sendKeys(price);;
	}

	
	public void getAttendeeLimitTextField(String attendeeLimit) {
		 attendeeLimitTextField.sendKeys(attendeeLimit);;
	}

	/**
	 * @return the dayOfTheWeekDropDown
	 */
	public WebElement getDayOfTheWeekDropDown() {
		return dayOfTheWeekDropDown;
	}

	/**
	 * @return the startDateDropDown
	 */
	public WebElement getStartDateDropDown() {
		return startDateDropDown;
	}

	
	public void getStartTimeTextField(String startTime ) {
		 startTimeTextField.sendKeys(startTime);
	}

	/**
	 * @return the endDateDropDown
	 */
	public WebElement getEndDateDropDown() {
		return endDateDropDown;
	}

	/**
	 * @return the endTimeTextField
	 */
	public void getEndTimeTextField(String endTime ) {
		 endTimeTextField.sendKeys(endTime);
	}

	/**
	 * @return the bookingWindowOpensDropDown
	 */
	public WebElement getBookingWindowOpensDropDown() {
		return bookingWindowOpensDropDown;
	}

	/**
	 * @return the bookingWindowClosesDropDown
	 */
	public WebElement getBookingWindowClosesDropDown() {
		return bookingWindowClosesDropDown;
	}

	/**
	 * void the publishDropDown
	 */
	public void getPublishDropDown() {
		 publishDropDown.click();
	}

	
	public void getPublicRadioButton() {
		 publicRadioButton.click();
	}


	public void getFinalPublishButton() {
		 finalPublishButton.click();
	}
	
	
}

