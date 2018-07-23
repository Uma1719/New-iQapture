package com.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.ActionPage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class ActionPageTest extends TestBase {
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	ActionPage actionPage;

	public ActionPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		actionPage = new ActionPage();
	}

	@Test
	public void ActionPage_Title_Test() {
		dashBoardPage.clickOnActionLink();
		String actual = actionPage.verifyPageTitle();
		String expected = "Actions";
		Assert.assertEquals(actual, expected, "Action Page Not Opened");
		Reporter.log("Action Page Opened Successfully", true);
	}

	@Test(dependsOnMethods="ActionPage_TitleTest")
	public void Filter_Option_Results_Test() throws Exception {
		dashBoardPage.clickOnActionLink();
		actionPage.verify_Filter_action_Results();
		Reporter.log("Filter Option Results Are As Expected",true);
	}

	@Test(dependsOnMethods="ActionPage_TitleTest")
	public void Actions_Late_To_Upcoming_Functionality_Test() throws Exception {
		dashBoardPage.clickOnActionLink();
		actionPage.verify_Actions_Late_and_Upcoming_Functionality("Late To Upcoming");
	}
	
	@Test(dependsOnMethods="ActionPage_TitleTest")
	public void Actions_Upcoming_To_Late_Functionality_Test() throws Exception {
		dashBoardPage.clickOnActionLink();
		actionPage.verify_Actions_Upcoming_To_Late_Functionality("Upcoming To Late");
	}
	
	@Test(dependsOnMethods="ActionPage_TitleTest")
	public void Complete_And_Reopen_ActivityTest() throws Exception {
		dashBoardPage.clickOnActionLink();
		actionPage.verify_Complte_And_ReOpen_Activities("Completed", "Re-open");
	}
	
	@Test(dependsOnMethods="ActionPage_TitleTest")
	public void Add_Comment_Upload_Picture_Delete_Action_Test() throws Exception {
		dashBoardPage.clickOnActionLink();
		actionPage.verify_add_Comment_Upload_Picture_Delete_Action("New Comment Added", "D:\\Value chain\\Images\\Aerospace Engineering.jpg");
		Reporter.log("Add Comment, Upload Picture And Delete Activity are Functional", true);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
