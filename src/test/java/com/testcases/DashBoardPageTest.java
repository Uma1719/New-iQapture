package com.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.CapturePage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class DashBoardPageTest extends TestBase {
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	CapturePage capturePage;

	public DashBoardPageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		capturePage = new CapturePage();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test
	public void Verify_HomePage_Title_Test(){
		String dashBoardTitle = dashBoardPage.verifyHomePageTitle();
		Assert.assertEquals(dashBoardTitle, "Valuechain.com","Home page title not matched");
		Reporter.log("Title Verified - Test PASS", true);
	}
	
	@Test
	public void Verify_DashBoardLink_Test(){
		Assert.assertTrue(dashBoardPage.verifyDashboardLink(), "Dashboard Link Not Present - Test FAIL");
		Reporter.log("DashBoardLink Verified - Test PASS", true);
	}
	
	@Test(dependsOnMethods="Verify_DashBoardLink")
	public void Filter_Option_Results_Test() throws Exception {
		dashBoardPage.verifyFilteractionResults();
		Reporter.log("Filter Option Results Are As Expected",true);
	}
	
	@Test(dependsOnMethods="Verify_DashBoardLink")
	public void Actions_Late_To_Upcoming_Functionality_Test() throws Exception {
		dashBoardPage.verifyActions_Late_and_Upcoming_Functionality("Late To Upcoming", "Updated");
	}
	
	@Test//(dependsOnMethods= "Actions_Late_To_Upcoming_FunctionalityTest")
	public void Actions_Upcoming_To_Late_Functionality_Test() throws Exception {
		dashBoardPage.verifyActions_Upcoming_To_Late_Functionality("Upcoming To Late", "Updated");
	}
	
	@Test(dependsOnMethods="Verify_DashBoardLink")
	public void Complete_Activity_Test() throws Exception {
		dashBoardPage.verify_Complte_Activity("completed", "finished");
	}
	
	@Test(dependsOnMethods="Verify_DashBoardLink")
	public void Postpone_Activity_Test() throws Exception {
		dashBoardPage.verify_Postpone_Activity();
		Reporter.log("Postpone Activity is Functional",true);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
