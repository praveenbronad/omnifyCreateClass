package testScripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.Propertyfile;
import genericLib.StepGroup;
import pomPages.CreateAClassPage;
import pomPages.HomePageAdmin;
import pomPages.OmnifyLoginPage;
import pomPages.Services;
import pomPages.SetupYourServicesPage;
import pomPages.SignInPage;
import pomPages.SignInWithGoogle;
import pomPages.gmailWelcomePage;

public class OmnfiyCreateClass  extends StepGroup{

	@Test
	public void testCaseCreateClass() throws IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		OmnifyLoginPage login= new OmnifyLoginPage(driver);
		// Click on continue with google button
		login.loginViaGmail();
		
		//SignInWithGoogle signInGmail=new SignInWithGoogle(driver);
		//signInGmail.logInViaOtherAccount();// user other gmail account
		
		Propertyfile pdata=new Propertyfile();
		SignInPage signIn=new SignInPage(driver);
		signIn.enterEmailId(pdata.getPropertyData("adminEmail"));
		
		//signIn.nextBtn(); // click on next button
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click(); // handled manually
		
		gmailWelcomePage gmailWelcome=new gmailWelcomePage(driver);
		
		gmailWelcome.enterPassword(pdata.getPropertyData("adminPassword")); // enters the password
		Thread.sleep(5000);
		gmailWelcome.clickNextBtn();// clcik next button
		
		
		
		/* setup services
		SetupYourServicesPage setupservice= new SetupYourServicesPage(driver);
		Thread.sleep(5000);
		// enter full name
		setupservice.getFullNameTextField(pdata.getPropertyData("fullName"));
		
		Thread.sleep(5000);
		// enter business name
		setupservice.getBusinessNameTextField(pdata.getPropertyData("businessName"));
		
		// click on continue button
		
		setupservice.getContinueButton();
		
		*/
		
		// give some wait to load all the webelements
		Thread.sleep(5000);
		
		// click on Services module
		
		HomePageAdmin home=new HomePageAdmin(driver);
		
		home.getServiceModule(); // this is used to click on services module
		
		Services service=new Services(driver);
		// clcik on a create a service button
		service.getcreateServiceButton();
		
		// click on classes
		Thread.sleep(5000);
		service.getClassesButton();
		
		// create class page
		CreateAClassPage createClass=new CreateAClassPage(driver);
		
		createClass.getClassTitleTextField(pdata.getPropertyData("classTitle")); // enters the class title
		
		// enter class description
		
		createClass.getClassDescriptionTextAreaFiled(pdata.getPropertyData("classDescription"));
		// select class color
		
		createClass.getColorRadioButton(); // selects the color
		
		// select Add location , first click on add location dropdown
		
		WebElement addlocDD = driver.findElement(By.xpath("//div[text()=\"In-person\"]"));
		addlocDD.click();
		
		List<WebElement> locOptions = driver.findElements(By.xpath("//div[text()=\"Online URL\"]"));
		
		for(WebElement locOpt:locOptions)
		{
			if(locOpt.getText().equals("Online URL"))
			{
				locOpt.click();
				break;
			}
		}
		
		WebElement onlineUrlTF = driver.findElement(By.id("mat-input-10"));
		onlineUrlTF.sendKeys(pdata.getPropertyData("onlineURL"));
		// add service type
		WebElement serviceType = driver.findElement(By.xpath("//span[text()=\"Paid\"]"));
		serviceType.click();
		
		List<WebElement> serviceOptions = driver.findElements(By.xpath("//div[text()=\"Free\"]"));
		
		for(WebElement soption:serviceOptions)
		{
			if(soption.getText().equals(pdata.getPropertyData("serviceOpt")));
			{
				soption.click();
				break;
			}
		}
		
		// add attendee limit
		createClass.getAttendeeLimitTextField(pdata.getPropertyData("attendeeLimit"));
		
		// select day of the week
		
		WebElement dayOftheWeekOtionsdropDown = driver.findElement(By.id("mat-select-3"));
		
		dayOftheWeekOtionsdropDown.click();
		
		List<WebElement> dayOftheWeekOpt = driver.findElements(By.xpath("//div[text()=\"Daily\"]"));
		
		for(WebElement dayWeek:dayOftheWeekOpt)
		{
			if(dayWeek.getText().equals(pdata.getPropertyData("dayOftheWeek")))
			{
				dayWeek.click();
				break;
			}
		}
		/*
		// select startDate
		driver.findElement(By.id("mat-select-4")).click(); // select start date
		
		List<WebElement> startDateOptions = driver.findElements(By.xpath("//div[text()=\"Select Date\"]"));
		
		for(WebElement startdate:startDateOptions)
		{
			if(startdate.getText().equals(pdata.getPropertyData("startDate")))
			{
				startdate.click();
				break;
			}
		}
		
		// enter the start time
		//createClass.getStartTimeTextField(pdata.getPropertyData("startTime"));
		driver.findElement(By.id("mat-input-4")).click();// strat time 
		
		List<WebElement> startTimings = driver.findElements(By.id("mat-option-17"));
		
		for(WebElement startTime:startTimings)
		{
			if(startTime.getText().equals(pdata.getPropertyData("startTime")))
			{
				startTime.click();
				break;
			}
		}
		
		// select enddate
		Thread.sleep(3000);
		driver.findElement(By.id("mat-select-5")).click(); // select end date
		
		List<WebElement> endDateOptions = driver.findElements(By.xpath("//div[text()=\"Select Date\"]"));
		
		for(WebElement enddate:endDateOptions)
		{
			if(enddate.getText().equals(pdata.getPropertyData("endDate")))
			{
				enddate.click();
				break;
			}
		}
		
		// enter the end time
		createClass.getStartTimeTextField(pdata.getPropertyData("endTime"));
		
		*/
		
		driver.findElement(By.id("day")).click();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
		// click on publish button
		createClass.getPublishDropDown();
		
		// select public radio button
		Thread.sleep(3000);
		createClass.getFinalPublishButton();
		Thread.sleep(3000);
		// validation , check wether class is created or not
		String expectedValue = pdata.getPropertyData("classTitle");
		WebElement actualValue = driver.findElement(By.xpath("//p[contains(text(),\"ClassYoga class with Omnify\")]"));
		
		
		if(actualValue.getText().contains(expectedValue))
		{
			System.out.println("Class is Created");
			
		}
		else
		{
			System.out.println("class is created but not validated");
		}
		
		Reporter.log(expectedValue);
		
		
	}
	
}
