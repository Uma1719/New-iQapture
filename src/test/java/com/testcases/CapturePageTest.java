package com.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.CapturePage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.Container;
import com.util.TestUtil;

public class CapturePageTest extends TestBase{
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	CapturePage capturePage;

	String sheetName = "capture";	

	public CapturePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		capturePage = new CapturePage();
	}

	@Test
	public void CapturePage_Title_Test() {
		dashBoardPage.clickOnCaptureLink();
		String actual = capturePage.verifyPageTitle();
		String expected = "Capture";
		Assert.assertEquals(actual, expected, "Capture Page Not Opened");
		Reporter.log("Capture Page Opened Successfully", true);
	}

	@Test(dependsOnMethods="CapturePage_TitleTest")
	public void Navigating_To_Questionnaires_Directory_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Navigating_To_Questionnaires_Directory();
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void Activity_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Activity_Questionnaire("activity", "Activity Description", "Activity Comment");
		Reporter.log("Activity Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void Advanced_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Advanced_Questionnaire("advanced", "Table Question", "Table Comment", 
				"Property Comment", "Wizard Question 1", "Wizard Question 2");
		Reporter.log("Advanced Questionnaire is Fuctional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void Date_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Date_Questionnaire("date", "Date Comment Updated");
		Reporter.log("Date Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void MultiChoice_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_MultiChoice_Questionnaire("multichoice");
		Reporter.log("MultiChoice Questionnaire is Funtional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void MultiChoice_Answer_Hint_Score_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_MultiChoice_Answer_Hint_Score_Questionnaire("answerhintscore");
		Reporter.log("MultiChoice - Answer/Hint/Score is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void Complete_Reopen_MultiChoice_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_MultiChoice_Complete_Reopen_Questionnaire("comment", "Completed", "Re-opened");
		Reporter.log("MultiChoice - Complete & Reopen are Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void MultiChoice_Comment_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_MultiChoice_Comment_Questionnaire("comment", "New Comment Added");
		Reporter.log("MultiChoice - Comment is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void MultiChoice_DropDown_and_CheckBox_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_MultiChoice_DropDown_And_CheckBox_Questionnaire("dropdown", "New DropDown Comment Added", "New CheckBox Comment Added");
		Reporter.log("MultiChoice - DropDown Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void MultiChoice_HML_Score_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_MultiChoice_HML_score_Value_Questionnaire("hml-scorevalue");
		Reporter.log("MultiChoice - HML Score Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void MultiChoice_Levels_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_MultiChoice_Levels_Questionnaire("levels");
		Reporter.log("MultiChoice - Levels Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void MultiChoice_YesNoNA_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_MultiChoice_YesNoNa_Questionnaire("yesnona");
		Reporter.log("MultiChoice - YesNoNA Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void Number_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Number_Questionnaire("number", "1234", "12.34", "69.44", "10000");
		Reporter.log("Number Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void Preview_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_preview_Questionnaire("preview", "Preview is Functional");
		Reporter.log("Preview Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void Text_Comment_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Text_Comment_Questionnaire("comment", "Text Answer");
		Reporter.log("Text Comment Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void Text_LevelsQuestionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Text_Levels_Questionnaire("levels", "Level 1 Answer", "New Text Comment", "Level 2 Comment", "Level 3 answer", 
				"Level 3 Comment", "level 4 Answer", "Level 4 Comment", "Level 5 Comment", "Level 5 Comment");
		Reporter.log("Text Levels Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void Text_Number_Manual_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Text_Number_Manul_Questionnaire("manual", "Text Number Answer 1", "Text Number Answer 2", "Updated Text Number Comment");
		Reporter.log("Text Number Manual Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void Text_Number_None_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Text_Number_None_Questionnaire("none", "Answer 1", "Answer 2", "Updated Text Number Comment");
		Reporter.log("Text Number None Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void FileUpload_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_File_Upload_Questionnaire("upload", "D:\\Value chain\\Images\\Aerospace Engineering.jpg");
		Reporter.log("File Upload Questionnaire is Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void Settings_Score_Addition_Delete_Copy_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Settings_Score_Addition_Delete_Copy_Questionnaire("settings");
		Reporter.log("Settings - Scores Addtion, Delete Option And Copy Questionnaire Are Functional", true);
	}

	@Test(dependsOnMethods="Navigating_To_Questionnaires_DirectoryTest")
	public void Settings_Score_Multiply_StrikeOut_FileUpload_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Settings_Score_Multiply_StrikeOut_File_Upload_Questionnaire("settings");
		Reporter.log("Settings - Scores Multiplication, StrikeOut Option And Copy Questionnaire Are Functional", true);
	}
	
	
	
	
	
	/*
	@DataProvider
	public Object[][] getCaptureTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getCaptureTestData")
	public void Questionnaire_for_Analyse_Test(String searchItem, String empNo, String empName, String cityNo, String empFee, String empFormFee, String empRegFee, 
			String sscPercentage, String interPercentage, String graduationPercentage, String mastersPercentage, String qualification, 
			String joiningYear, String joiningMonth, String joiningDate, String exitYear, String exitMonth, String exitDate, String companyEnvironment, 
			String salaryIncrement, String overAll, String ddSelect, String yesNoNa, String checkBox1, String checkBox2, String checkBoxQ2) throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Questionnaire_for_Analyse(searchItem, empNo, empName, cityNo, empFee, empFormFee, empRegFee,
				sscPercentage, interPercentage, graduationPercentage, mastersPercentage, qualification, 
				joiningYear, joiningMonth, joiningDate, exitYear, exitMonth, exitDate,
				companyEnvironment, salaryIncrement, overAll, ddSelect, yesNoNa, checkBox1, checkBox2, checkBoxQ2);
		Reporter.log("Questionnaire for Analyse is functional", true);
	}
	*/
	
	/*capturePage.verify_Questionnaire_for_Analyse("Emp Analyse", "1", "Vidya", "4", "500000", "100", "2000",
			"70", "90", "80", "70", "2", "2013", "Jul", "10", "2017", "Apr", "4",  "2", "1", "1", "High", "1", "1", "2", "1");*/
	
	/*
	@DataProvider
	public Iterator<Object[]> getEmpAnalyseData() {
		ArrayList<Object[]> testData = Container.getEmpAnalyseDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider="getEmpAnalyseData")
	public void Questionnaire_for_Analyse_Test_New(String searchItem, String empNo, String empName, String cityNo, String empFee, String empFormFee, String empRegFee, 
			String sscPercentage, String interPercentage, String graduationPercentage, String mastersPercentage, String qualification, 
			String joiningYear, String joiningMonth, String joiningDate, String exitYear, String exitMonth, String exitDate,
			String companyEnvironment, 
			String salaryIncrement, String overAll, String ddSelect, String yesNoNa, String checkBox1, String checkBox2, String checkBoxQ2) throws Exception {
		dashBoardPage.clickOnCaptureLink();
		capturePage.verify_Questionnaire_for_Analyse(searchItem, empNo, empName, cityNo, empFee, empFormFee, empRegFee,
				sscPercentage, interPercentage, graduationPercentage, mastersPercentage, qualification, 
				joiningYear, joiningMonth, joiningDate, exitYear, exitMonth, exitDate,
				companyEnvironment, salaryIncrement, overAll, ddSelect, yesNoNa, checkBox1, checkBox2, checkBoxQ2);
		Reporter.log("Questionnaire for Analyse is functional", true);
	}
	*/
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
