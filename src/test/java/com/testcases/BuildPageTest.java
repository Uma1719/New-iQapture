package com.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.BuildPage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class BuildPageTest extends TestBase{
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	BuildPage buildPage;

	public BuildPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		buildPage= new BuildPage();
	}

	@Test
	public void Verify_BuidPage_Test(){
		dashBoardPage.clickOnBuildLink();
		Assert.assertTrue(buildPage.verify_IQuapturePage(), "New IQapture Button is Missing on the Page");
		Reporter.log("New IQapture Button Present - Test PASS", true);
	}

	@Test(dependsOnMethods="Verify_BuidPageTest")
	public void Create_IQapture_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Create_IQapture("iQaptureDemo");
		Reporter.log("New iQuapture Created", true);
	}

	@Test(dependsOnMethods="Verify_BuidPageTest")
	public void Create_Folder_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Create_Folder("Demo1", "Demo folder Creation");
		Reporter.log("Folder Created Successfully",true);
	}

	@Test(dependsOnMethods="Create_FolderTest")
	public void Create_Nested_Folder_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Create_Nested_Folder("Demo2", "Demo2 folder Creation");
		Reporter.log("Nested-Folder Created successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Create_Questionary_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Questionary_Creation("Resgister Maintenance");
		Reporter.log("Questionary Created successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Upload_Image_To_Questionary_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Upload_Image_To_Questionary("Resgister Maintenance", "D:\\Value chain\\Images\\hrandpayroll.jpg");
		Reporter.log("Image Added To Questionnaires Successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Delete_Questionnairie_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Delete_Questionary();
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Rename_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Rename_Questionary("Register Enquiry", "HR Maintenance");
		Reporter.log("Questionnairie Renamed Successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_Text_Item_To_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_Text_Item_To_Questionaries("Q1 Text1", "Test Data");
		Reporter.log("Text Item Added To The Questionnaire Successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_Text_Item_With_Levels_To_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_Text_Item_With_Levels_To_Questionaries("Q/Text/Levels", "Question 1 => Level 1", "Question 2 => Level 2", 
				"Question 3 => Level 3", "Question 4 => Level 4", "Question 5 => Level 5");
		Reporter.log("Questions With All Levels (L1, L2, L3, L4 & L5) are Functional", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_Text_Item_With_Numbering_Manually_To_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_Items_With_Numbering_Manually("Q/Text/Number-Manual", "Question 1");
		Reporter.log("Question With Numbering Manually is Functional", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_Text_Item_With_Numbering_None_To_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_Items_With_Numbering_None("Q/Text/Number-None", "Question 1");
		Reporter.log("Question With Numbering None is Functional", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_Text_Item_With_Comment_Ading_Updating_Deleting_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_Item_With_Comment_Updating_Deleting("Q/Text/Comment", "Question 1", "Updated Comment");
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_MultiChoice_Item_To_Quesionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_MultiChoice_Item_To_Questionaries("Q/MultiChoice", "MultiChoice Radio Question",
				"MultiChoice Dropdown Question", "MultiChoice CheckBox Question");
		Reporter.log("MultiChoice Item Created successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_MultiChoice_Item_With_Levels_To_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_MultiChoice_Item_With_Levels_To_Questionaries("Q/MultiChoice/Levels", "Question 1 => Level 1", 
				"Question 2 => Level 2", "Question 3 => Level 3", "Question 4 => Level 4", "Question 5 => Level 5");
		Reporter.log("Questions With All Levels (L1, L2, L3, L4 & L5) are Functional", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_MultiChoice_Item_With_Numbering_Manually_To_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_MultiChoice_Items_With_Numbering_Manually("Q/MultiChoice/Number-Manual", "Question 1", "a");
		Reporter.log("Question With Numbering Manually is Functional", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_MultiChoice_Item_With_Numbering_None_To_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_MultiChoice_Items_With_Numbering_None("Q/MultiChoice/Number-None", "Question 1");
		Reporter.log("Question With Numbering None is Functional", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_MultiChoice_Item_With_Comment_Ading_Updating_And_Deleting_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_MultiChoice_Item_With_Comment_Updating_And_Deleting("Q/MultiChoice/Comment", 
				"Question 1", "Updated Comment");
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_MultiChoice_Item_With_HML_Option_And_Score_To_The_Questionary_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_MultiChoice_Item_With_HML_Option_And_Score("Q/MultiChoice/HML-Score", "Question 1", "HPQ", "MPQ", "LPQ");
		Reporter.log("Priorities-Hight/Medium/Low and Score for the Questionnaires Added Successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_MultiChoice_Item_With_YesNoNA_Option_And_Score_To_The_Questionary_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_MultiChoice_Item_With_YesNoNA_Option_And_Score("Q/MultiChoice/YesNoNA-Score", "Question 1", "YQ", "NQ", "NAQ");
		Reporter.log("Priorities-Yes/NO/NA and Score for the Questionnaires Added Successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_Multichoice_Score_Value_To_MultiChoice_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Adding_Score_Value_To_MultiChoice_Questionnaire("Q/MultiChoice/HML-ScoreValue", "Question 1", "100", "80", "50");
		Reporter.log("Priorities-Yes/NO/NA and Score for the Questionnaires Added Successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_Multichoice_Answer_Hint_Score_Manually_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_Answer_Hint_Score_Manually("Q/MultiChoice/AnswerHintScore_Manually", "Question 1",
				"Ans 1", "Hint 1", "100", "Ans 2", "Hint 2", "50");
		Reporter.log("",true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_MultiChoice_DropDown_And_CheckBox_Quesionnaires_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_MultiChoice_DropDown_And_CheckBox_Quesionnaires("Q/MultiChoice/DropDown&CheckBox", 
				"Drop Down Question", "Check Box Question");
		Reporter.log("DropDown & Check Box Questionnaires Added Successfully",true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_Date_Quesionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_Date_Quesionnaire("Q/Date", "Date Question");
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_Number_Quesionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_Number_Quesionnaire("Q/Number", "Integer Question", "Float Question", "Percentage Question", "Currency Question");
		Reporter.log("Number - Integer, Float, Percentage & Currency Questionnaires Added Successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_UploadFile_And_Section_Quesionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_Upload_File_And_Section_Quesionnaire("Q/UploadFile & Section", "Upload File Question", "Section Question");
		Reporter.log("Upload File & Section Questionnaires Added Successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_Activity_Quesionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_Activity_Quesionnaire("Q/Activity", "First Activity", "New Activity", "Activity Question");
		Reporter.log("Activity Questionnaire Added Successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_Advanced_Table_Quesionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_Advanced_Table_Quesionnaire("Q/Advanced-Table", "Sl.No.", "Description Added", "Advanced Table Question");
		Reporter.log("Advanced - Table Questionnaires Added Successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Add_Advanced_Table_Property_Wizard_Quesionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_Advanced_Table_Property_Wizard_Quesionnaire("Q/Advanced", "Advanced Table Question", 
				"Advanced Property Question", "Advanced Wizard Question");
		Reporter.log("Advanced - Table, Property & Wizard Questionnaires Added Successfully", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Preview_Quesionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Preview_Quesionnaire("Q/Preview", "Preview Test Question");
		Reporter.log("Questionnaire Preview is Functional", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Settings_Score_Addition_Delete_Copy_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Settings_Score_Addition_Delete_Copy_Questionnaire("Q/Settings", "MultiChoice Item 1", "100", "75", "60", 
				"Text Item", "MultiChoice Item 2", "100", "75", "60", "Date Item", "1", "5", "3", "Number Item");
		Reporter.log("All Settings Are Enabled And Functional", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Settings_Score_Multiply_StrikeOut_FileUpload_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Settings_ScoreMultiply_StrikeOut_FileUpload_Questionnaire("Q/Settings 2", "MultiChoice Item 1", "100", "75", "60",
				"Text Item", "MultiChoice Item 2", "100", "75", "60", "Date Item", "Number Item", "1", "5", "3", "D:\\Value chain\\Images\\Questions Template.xlsx");
		Reporter.log("All Settings Are Enabled And Functional", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Settings_Schedules_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Settings_Scedule_Questionnaire("Q/Settings 3", "MultiChoice Item 1", "100", "75", "60",
				"Text Item", "MultiChoice Item 2", "100", "75", "60", "Date Item", "Number Item", "1", "5", "3");
		Reporter.log("Schedule Settings Are Enabled And Functional", true);
	}

	@Test(dependsOnMethods={"Create_FolderTest", "Create_Nested_FolderTest"})
	public void Move_Questionnaire_From_One_Folder_To_Other_Folder_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Move_Questionnaire_From_One_Folder_To_Other_Folders("Test Questionnaire", "Demo2");
		Reporter.log("Questionnaire is moved Successfully from One folder to other folder", true);
	}

	@Test
	public void Folder_Rename_And_Deletion_Test() throws Exception{
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Folder_Rename_And_Deletion("Dummy", "Dummy folder Creation", "Delete me", "Ready to Delete");
		Reporter.log("Folder Rename and Deletion are Functional", true);
	}
	
	@Test(dependsOnMethods="Create_Nested_FolderTest")
	public void Cascading_Questionnaire_option_Test() throws Exception{
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Cascading_Questionnaire_option("Cascade Test", "Demo1", "Cascade Test", "Demo1", "Demo2");
		Reporter.log("Cascading Questionnaire Option is Functional", true);
	}
	
	@Test
	public void Create_Up_Issue_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Up_Issue_functionality("Test Up Issue", "Q1", "Q2", "Ans 1", "Hint 1", "100", "Ans 2", "Hint 2", "50", "Q3", "Sl No.", "Desc", 
				"Test Up Issue", "Text", "10");
		Reporter.log("Up Issue functionalities are verified successfully", true);
	}
	
	@Test(dependsOnMethods="Create_Up_Issue_Test")
	public void Up_Issue_on_modifying_questionnaire_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Up_Issue_on_modifying_questionnaire("Test Up Issue", "Answer", "Hint1", "New Q");
	}
	
	@Test(dependsOnMethods="Create_Up_Issue_Test")
	public void modify_the_Captured_Question_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_modify_the_Captured_Question("Test Up Issue");
	}
	
	@Test
	public void Create_setup_for_folder_permissions_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.Create_setup_for_folder_permissions("Folder1", "Folder 1 added", "Folder2", "Folder 2 added", "Folder3", "Folder 3 added", "Test Questionnaire", "Q1", "View");
		Reporter.log("Setup folder permission is created successfully", true);
	}
	
	@Test(dependsOnMethods="Create_setup_for_folder_permissions_Test")
	public void Set_the_folder_permission_to_VIEW_folders_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_set_the_folder_permission_to_VIEW_folders("View", "Aaron Cope");
		Reporter.log("Folder permission for 'View' user is functional", true);
	}
	
	@Test(dependsOnMethods="Create_setup_for_folder_permissions_Test")
	public void Set_the_folder_permission_to_DO_folders_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_set_the_folder_permission_to_DO_folders("Do", "Aaron Cope");
		Reporter.log("Folder permission for 'Do' user is functional", true);
	}
	
	@Test(dependsOnMethods="Create_setup_for_folder_permissions_Test")
	public void Set_the_folder_permission_to_MODERATOR_folders_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_set_the_folder_permission_to_MODERATOR_folders("Moderator", "Aaron Cope");
		Reporter.log("Folder permission for 'Moderator' user is functional", true);
	}
	
	@Test(dependsOnMethods="Create_setup_for_folder_permissions_Test")
	public void set_DO_permission_to_subfolder_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_set_DO_permission_to_subfolder("Do", "Alex Knight");
		Reporter.log("'Do' prermission for subfolder is functional", true);
	}
	
	@Test(dependsOnMethods="Create_setup_for_folder_permissions_Test")
	public void set_main_folder_permission_to_VIEW_and_verify_the_same_applied_to_subfolders_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.set_main_folder_permission_to_VIEW_and_verify_the_same_applied_to_subfolders("View");
		Reporter.log("'VIEW' permission to main folder is applied to sub-folders successfully", true);
	}
	
	@Test(dependsOnMethods="Create_setup_for_folder_permissions_Test")
	public void set_main_folder_permission_to_VIEW_and_verify_the_same_applied_to_newly_added_subfolders_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.set_main_folder_permission_to_VIEW_and_verify_the_same_applied_to_newly_added_subfolders("View", "Folder4", "Folder 4 added");
		Reporter.log("'VIEW' permission to main folder is applied to newly added sub-folders successfully", true);
	}
	
	@Test(dependsOnMethods="set_main_folder_permission_to_VIEW_and_verify_the_same_applied_to_newly_added_subfolders_Test")
	public void Set_different_permission_to_locked_folder_and_reset_the_permissions_to_older_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Set_different_permission_to_locked_folder_and_reset_the_permissions_to_older("Moderator");
		Reporter.log("Delete user button is visible on changing the permissions to locked folder and setteings got reset on deleting the user", true);
	}
	
	@Test(dependsOnMethods="Create_setup_for_folder_permissions_Test")
	public void verify_Set_mail_folder_permission_to_VIEW_and_Set_sub_folder_permission_to_DO_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Set_mail_folder_permission_to_VIEW_and_Set_sub_folder_permission_to_DO("View", "Do", "Aaron Cope");
		Reporter.log("'Do' permissions to subfolders is functional", true);
	}
	
	@Test(dependsOnMethods="Create_setup_for_folder_permissions_Test")
	public void Set_DENY_permission_to_folder_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Set_DENY_permission_to_folder("Folder5", "Folder 5 added", "Deny", "Aaron Cope");
		Reporter.log("'Deny' permission on folders is functional", true);
	}
	
	@Test(dependsOnMethods="Create_setup_for_folder_permissions_Test")
	public void Add_all_users_from_the_company_change_permissions_and_removing_users_from_company_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Add_all_users_from_the_company_change_permissions_and_removing_users_from_company("ISRO", "View");
		Reporter.log("All users added from the company, changed the permissions and removed the users from company successfully", true);
	}
	
	
	
	
	
	
	
	/*	
	@Test
	public void Create_Questionnaire_for_Analyse_Test() throws Exception{
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Create_Questionnaire_for_Analyse("Emp Analyse", "EMP Personal Details", "EMP No.", "EMP Name",
				"EMP Address", "Delhi", "kolkata", "Mumbai", "Hyderabad", "Bangalore", "Chennai", "Calicut", "Goa", 
				"EMP - Fee", "EMP - Fee", "EMP - Form Fee", "EMP - Registration Fee", "EMP Percentage", "SSC", "Intermediate", "Graduate", "Masters", "Eduaction",
				"Completed Education", "SSC", "Intermediate", "Graduate", "Masters", "Emp - Joining & Exit Date", "Joining Date", "Exit Date", "Reason to Exit",
				"Company Environment", "Bad", "Good", "Very Good", "Excellent", "Salary Increment", "Bad", "Better", "Dissatisfied", "Satisfied", 
				"Overall", "Bad", "Better", "Dissatisfied", "Satisfied", "Drop Down", "Q1", "Q2", "CheckBox",  "Q1", "Bad", "Disagree", "Dissatisfied", "Agree", "Satisfied", "Good",
				"Q2", "Bad", "Disagree", "Dissatisfied", "Agree", "Satisfied", "Good");
		Reporter.log("Emp Analyse Questionnaire Created Successfully", true);
	}
	*/

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
