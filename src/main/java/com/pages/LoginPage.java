package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;
import com.util.JavascriptLibrary;

public class LoginPage extends TestBase{

	// Objects Repository(OR):........................................................................
	@FindBy(id="txtLoginName")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(id="btnLogin")
	WebElement loginBtn;

	//@FindBy(xpath=".//*[@id='lblMainMenuHint']") // Alpha 
	@FindBy(xpath=".//*[@id='btnMainMenuTitle']//preceding::a[20]") // Local
	WebElement menuBtn;

	@FindBy(xpath="//span[text()='New iQapture']")
	WebElement newiQaptureBtn;

	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement dashBoardLink;

	// Initializing the Page Objects:................................................................
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................
	public String validate_LoginPage_Title(){
		return driver.getTitle();
	}

	public DashBoardPage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		JavascriptLibrary.javascriptClickElement(driver, loginBtn);
		JavascriptLibrary.javascriptClickElement(driver, menuBtn);
		JavascriptLibrary.javascriptClickElement(driver, newiQaptureBtn);

		Assert.assertTrue(dashBoardLink.isDisplayed());

		return new DashBoardPage();

	}























}
