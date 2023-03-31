/**
 * 
 */
package genericLib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Praveen B Ronad
 *
 */
public class WebdriverUtilities {
	WebDriver driver;
	public void dropDown(By ele,By eleOption, String text) {
		
		
		WebElement dropdownEle = driver.findElement(ele);
		dropdownEle.click();
		
		List<WebElement> options = driver.findElements(eleOption);
		
		for(WebElement opt:options)
		{
			if(opt.getText().equals(text))
			{
				opt.click();
				break;
			}
		}
		

	}
}
