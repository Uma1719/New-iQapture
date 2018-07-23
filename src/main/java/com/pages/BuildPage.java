package com.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.base.TestBase;
import com.util.GenericLibrary;
import com.util.JavascriptLibrary;

public class BuildPage extends TestBase {

	// Objects Repository(OR):........................................................................
	@FindBy(xpath=".//*[@id='btnFolderBack']")
	WebElement folderBackBtn;

	@FindBy(xpath=".//*[@id='btnNew']")
	WebElement AddBtn;

	@FindBy(xpath=".//*[@id='DS_NAME']")
	WebElement nameTxtBox;

	@FindBy(xpath=".//*[@id='btnSave']")
	WebElement saveBtn;

	@FindBy(xpath=".//*[@id='divDS_NAME']")
	WebElement savedItem;

	// Create Folder
	@FindBy(xpath=".//*[@id='btnFolder']")
	WebElement folderBtn;

	@FindBy(xpath=".//*[@id='btnNew']")
	WebElement AddFolderBtn;

	@FindBy(xpath=".//*[@id='DC_NAME']")
	WebElement folderName;

	@FindBy(xpath=".//*[@id='DC_DESC']")
	WebElement descTxt;

	@FindBy(css=".l-btn-icon.icon-blue-save32")
	WebElement folderSaveBtn;

	@FindBy(xpath=".//*[@id='divEditFolder']/div/div/div[1]/button")
	WebElement closeFoldereditPage;

	@FindBy(xpath="//*[text()='Demo1']")
	WebElement demo1Folder;

	// Creating Nested folder
	@FindBy(xpath=".//*[@id='row0']/div[2]/div/ul/li[2]/a")
	WebElement RightArrow;

	@FindBy(xpath="//*[text()='Demo2']")
	WebElement nestedFolder;

	// Creating Questionnaires inside the nested folders
	@FindBy(xpath="//h3[text()='Demo1']")
	WebElement mainFolder;

	@FindBy(xpath="//h3[text()='Demo2']")
	WebElement subFolder;

	// Uploading Image to a Questionnaires 
	@FindBy(css="#imgDataset")
	WebElement uploadImg;

	// Delete Questionnaires
	@FindBy(xpath="//h3[text()='Resgister... ']")
	WebElement questionnaries;

	@FindBy(xpath="//h3[text()='HR']")
	WebElement QHR;

	@FindBy(css=".blog-title.blog-video-title.vc-img-title.dot-ellipsis.dot-resize-update")
	WebElement selectMultiQuestionnary;

	@FindBy(xpath=".//*[@id='btnMore']/a")
	WebElement moreBtn;

	@FindBy(xpath=".//*[@id='removedataset']/a")
	WebElement deleteBtn;

	@FindBy(xpath="//div[2]/div[1]/div/div/div[2]/button[2]")
	WebElement confirmDelete;

	// Add Questions with levels to the Questionnaire 
	@FindBy(xpath="//div[@title='New Item']")
	WebElement newItemBtn;

	@FindBy(xpath=".//*[@id='F_DESC']")
	WebElement descriptionTextBox;

	@FindBy(xpath=".//*[@id='divFieldMainType0']/span")
	WebElement textOption;

	@FindBy(xpath="//div[@class='field_desc_txt']/child::span[1]")
	WebElement addedDesciption;

	// Add Items with More Levels
	@FindBy(xpath="//a[text()='1']")
	WebElement level1Result;

	@FindBy(xpath="//span[text()='More']")
	WebElement moreOptionsBtn;

	@FindBy(xpath=".//*[@id='rdLevel2']")
	WebElement level2Btn;

	@FindBy(xpath="//span[text()='ADVANCED']//following::button")
	WebElement closeBtn;

	@FindBy(xpath="//a[text()='1.1']")
	WebElement level2Result;

	@FindBy(xpath=".//*[@id='rdLevel3']")
	WebElement level3Btn;

	@FindBy(xpath="//a[text()='1.1.1']")
	WebElement level3Result;

	@FindBy(xpath=".//*[@id='rdLevel4']")
	WebElement level4Btn;

	@FindBy(xpath="//a[text()='1.1.1.1']")
	WebElement level4Result;

	@FindBy(xpath=".//*[@id='rdLevel5']")
	WebElement level5Btn;

	@FindBy(xpath="//a[text()='1.1.1.1.1']")
	WebElement level5Result;

	// Add Items with Numbers Manually And None
	@FindBy(css="#rdCutmNumberingType1")
	WebElement manualBtn;

	@FindBy(css="#F_CUTMNUMBERING")
	WebElement numberTxtBox;

	@FindBy(xpath="//a[text()='a']")
	WebElement manualAddedNumber;

	@FindBy(css="#rdCutmNumberingType2")
	WebElement noneBtn;

	// Comment Add/Edit/Delete
	@FindBy(css="#F_ISCOMMENT0")
	WebElement commentBtn;

	@FindBy(xpath="//*[text()='Comment']")
	WebElement addedComment;

	@FindBy(xpath="//*[text()='Updated Comment']")
	WebElement updatedComment;

	@FindBy(xpath=".//*[@id='removeField']/span/span[2]")
	WebElement commentDeleteBtn;

	// Add MultiChoice Item To The Questionnaire
	@FindBy(xpath=".//*[@id='divFieldMainType1']/span")
	WebElement multiChoiceBtn;

	// Add MultiChoice Item to Questionnaire with Priority and Score 
	@FindBy(xpath=".//*[@id='DropdownDefault']/a")
	WebElement defaultDropDown;

	@FindBy(xpath=".//*[@id='btnHML']")
	WebElement highMediumLowOption;

	@FindBy(xpath=".//*[@id='btnYNN']")
	WebElement yesNoNAOption;

	@FindBy(xpath="//input[@id='F_ISSCORE1']")
	WebElement scoreYesBtn;

	@FindBy(xpath="//a[text()='High']")
	WebElement highQuestion;

	@FindBy(xpath="//a[text()='Medium']")
	WebElement mediumQuestion;

	@FindBy(xpath="//a[text()='Low']")
	WebElement lowQuestion;

	@FindBy(xpath="//span[contains(.,'HPQ')]")
	WebElement hpqText;

	@FindBy(xpath="//span[contains(.,'MPQ')]")
	WebElement mpqText;

	@FindBy(xpath="//span[contains(.,'LPQ')]")
	WebElement lpqText;

	@FindBy(xpath="//a[text()='Yes']")
	WebElement yesQuestion;

	@FindBy(xpath="//a[text()='No']")
	WebElement noQuestion;

	@FindBy(xpath="//a[text()='N/A']")
	WebElement naQuestion;

	@FindBy(xpath="//span[contains(.,'YQ')]")
	WebElement yqText;

	@FindBy(xpath="//span[contains(.,'NQ')]")
	WebElement nqText;

	@FindBy(xpath="//span[contains(.,'NAQ')]")
	WebElement naqText;

	// Adding Answer, Hint, Color, Score Manually
	@FindBy(css=".l-btn-icon.icon-add")
	WebElement plusSign;

	// MultiChoice Drop Down and CheckBoxes 
	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[2]")
	WebElement dropDownOption;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[3]")
	WebElement checkBoxOption;

	@FindBy(xpath="//span[contains(.,'Drop Down Question')]")
	WebElement dropDownQuestion;

	@FindBy(xpath="//span[contains(.,'Check Box Question')]")
	WebElement checkBoxQuestion;

	// Date
	@FindBy(xpath=".//*[@id='divFieldMainType2']/span")
	WebElement dateBtn;

	@FindBy(xpath="//span[contains(.,'Date Question')]")
	WebElement dateQuestion;

	// Number
	@FindBy(xpath=".//*[@id='divFieldMainType3']/span")
	WebElement numberBtn;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[1]")
	WebElement integerOption;

	@FindBy(xpath="//span[contains(.,'Integer Question')]")
	WebElement integerQuestion;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[2]")
	WebElement floatOption;

	@FindBy(xpath="//span[contains(.,'Float Question')]")
	WebElement floatQuestion;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[3]")
	WebElement percentageOption;

	@FindBy(xpath="//span[contains(.,'Percentage Question')]")
	WebElement percentageQuestion;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[4]")
	WebElement currencyOption;

	@FindBy(xpath="//span[contains(.,'Currency Question')]")
	WebElement currencyQuestion;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[5]")
	WebElement sliderOption;

	@FindBy(xpath=".//*[@id='F_MINVALUE']")
	WebElement sliderMinValue;

	@FindBy(xpath=".//*[@id='F_MAXVALUE']")
	WebElement sliderMaxValue;

	@FindBy(xpath=".//*[@id='F_STEPVALUE']")
	WebElement sliderStepValue;

	// Upload File & Section 
	@FindBy(xpath=".//*[@id='divFieldMainType5']/span")
	WebElement uploadFileBtn;

	@FindBy(xpath="//span[contains(.,'Upload File Question')]")
	WebElement uploadFileQuestion;

	@FindBy(xpath=".//*[@id='divFieldMainType10']/span")
	WebElement sectionBtn;

	@FindBy(xpath="//span[contains(.,'Section Question')]")
	WebElement sectionQuestion;

	// Activity
	@FindBy(xpath=".//*[@id='divFieldMainType11']/span")
	WebElement activityBtn;

	@FindBy(xpath=".//*[@id='btnActDate']/span/span")
	WebElement activityDate;

	@FindBy(xpath=".//*[@id='FAI_DESC']")
	WebElement activityDecriptionTxtBox;

	@FindBy(xpath=".//*[@id='FAI_COMMENT']")
	WebElement activityCommentTxtBox;

	@FindBy(xpath="//span[contains(.,'Activity Question')]")
	WebElement activityQuestion;

	@FindBy(xpath="//div[1]/table/tbody/tr[5]/td[2]")
	WebElement date_26;

	// Advanced - Table
	@FindBy(xpath=".//*[@id='divFieldMainType9']/span")
	WebElement advancedBtn;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[1]")
	WebElement tableOption;

	@FindBy(xpath=".//*[@id='addSubField']/span/span[2]")
	WebElement addSubFieldBtn;

	//@FindBy(xpath="//input[@field='F_DESC']")
	@FindBy(xpath="//span[text()='Type:']//following::input[1]")
	WebElement tableHeaderTxtBox;

	@FindBy(xpath="//span[text()='Type:']//following::textarea[1]")
	WebElement tableDescriptionTxtBox;

	@FindBy(xpath="//span[contains(.,'Advanced Table Question')]")
	WebElement tableQuestion;

	@FindBy(xpath="//span[contains(.,'Value Chain')]")
	WebElement tableHeaderQuestion;

	// Advanced - Property
	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[2]")
	WebElement propertyOption;

	@FindBy(xpath=".//*[@id='ddlPropertiesAnswerType']")
	WebElement propertyDropDown;

	@FindBy(xpath="//span[contains(.,'Advanced Property Question')]")
	WebElement propertyQuestion;

	// Advanced - Wizard
	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[3]")
	WebElement wizardBtn;

	@FindBy(xpath=".//*[@id='F_SUBFIELDSCOUNT']")
	WebElement noOfSubQuestionsTxtBox;

	@FindBy(xpath="//span[contains(.,'Advanced Wizard Question')]")
	WebElement wizardQuestion;

	// Preview Option
	@FindBy(xpath="//span[contains(.,'Preview Test Question')]")
	WebElement previewTestQuestion;

	@FindBy(xpath="//a[@title='Preview Questions']")
	WebElement previewOption;

	@FindBy(xpath="//button[text()='Close']")
	WebElement previewCloseBtn;

	// Deleting All Files in Root Directory 
	@FindBy(xpath="//h3[@style='overflow-wrap: break-word;']")
	WebElement allFilesInRootDirectory;

	// Capture Linked Items
	@FindBy(xpath="//input[@id='rdMandatory1']")
	WebElement mandatoryBtn;

	@FindBy(xpath="//input[@id='F_ISEXTENDANSWER1']")
	WebElement additionalAnswersBtn;

	@FindBy(xpath="//input[@id='F_ISSHOWONCAPTURE1']")
	WebElement scoreShowInIqaptureBtn;

	@FindBy(xpath="//input[@id='F_ISMILESTONE1']")
	WebElement milestoneQuestionBtn;

	@FindBy(xpath="//input[@id='F_SEARCHABLE1']")
	WebElement searchableBtn;

	@FindBy(xpath="//input[@id='FDI_DEFVALTYPE1']")
	WebElement defaultValueBtn;

	// Settings
	@FindBy(xpath=".//*[@id='datasetset']/a")
	WebElement settingsBtn;

	@FindBy(xpath="//h5[text()='Display score total on record']//following::label[1]")
	WebElement displayScoreTotalOnRecord_Yes;

	@FindBy(xpath=".//*[@id='divMultiplyS']/div/label[1]")
	WebElement multiplyScores_Yes;

	@FindBy(xpath="//h5[text()='Change record order']//following::label[1]")
	WebElement changeRecordOrder_Yes;

	@FindBy(xpath="//h5[text()='Copy Records']//following::label[1]")
	WebElement copyRecords_Yes;

	@FindBy(xpath="//h5[text()='Show Log']//following::label[1]")
	WebElement showLogs_Yes;

	@FindBy(xpath="//h5[text()='Trash can action']//following::label[2]")
	WebElement trashCanAction_StrikeOut;

	@FindBy(xpath="//h5[text()='Trash can action']//following::label[3]")
	WebElement trashCanAction_Delete;

	@FindBy(css=".l-btn-icon.icon-blue-upload-round-32")
	WebElement uploadTemplate;

	// Settings - Headers
	@FindBy(css=".select2-search__field")
	WebElement headersSearchField;

	@FindBy(xpath="//a[text()='View all']")
	WebElement viewAllLink;

	@FindBy(css=".select2-result-repository__title")
	WebElement headersSearchResults;

	@FindBy(xpath=".//*[@id='btnAddHeader']")
	WebElement headerAddBtn;

	// Settings - Schedules
	// Weekly
	@FindBy(xpath=".//*[@id='btnAdd']")
	WebElement addScheduleBtn;

	@FindBy(xpath=".//*[@id='divDSS_LABEL']")
	WebElement scheduleLabelTxtBox;

	@FindBy(xpath=".//*[@id='DSS_LABEL']")
	WebElement scheduleLabelTxtBox_in;

	@FindBy(xpath=".//*[@id='btnActPeople']")
	WebElement addPeopleBtn;

	// Monthly
	@FindBy(xpath=".//*[@id='periodictiy']/div/label[3]")
	WebElement monthlyBtn;

	@FindBy(xpath=".//*[@id='divSP_DAY']")
	WebElement setDayTxtBox;

	@FindBy(xpath=".//*[@id='SP_DAY']")
	WebElement setDayTxtBox_in;

	// Set Date
	@FindBy(xpath=".//*[@id='periodictiy']/div/label[1]")
	WebElement setDateBtn;

	@FindBy(xpath=".//*[@id='btnActDate']/span/i")
	WebElement setDateCalenderBtn;

	// Questionnaire Move From One Folder To Other Folder
	@FindBy(xpath=".//*[@id='divFolders']/div/div[2]/span[1]/span[1]/span")
	WebElement searchFolderTxtBox;

	@FindBy(css=".select2-search__field")
	WebElement searchFolderTxtBox_in;

	@FindBy(xpath="//div[text()='Demo2']")
	WebElement demo2Folder;

	@FindBy(xpath=".//*[@id='btnAddHeader']")
	WebElement addToFolderBtn;

	// Folder Rename & Deletion 
	@FindBy(xpath="//p[text()='Dummy']")
	WebElement dummyFolder;

	@FindBy(xpath=".//*[@id='btnEdit']")
	WebElement editBtn;

	@FindBy(xpath="//p[text()='Delete me']")
	WebElement deleteMeFolder;

	@FindBy(xpath=".//*[@id='btnDelete']")
	WebElement folderDeleteBtn;

	// Cascade Test
	@FindBy(xpath="//div[text()='CASCADE']//following::span[4]")
	WebElement cascade_CheckBox1;

	@FindBy(xpath=".//*[@id='btnAddFolder']")
	WebElement addFolderBtn;

	@FindBy(xpath="//span[contains(text(),'Build')]")
	WebElement buildLink;

	@FindBy(xpath=".//*[@id='txtSearch']")
	WebElement questionnaireSearchBox;

	@FindBy(xpath="//h3[text()='Cascade Test']")
	WebElement CascadeTest;

	@FindBy(xpath="//*[text()='Demo2']")
	WebElement Demo2Folder;

	// Up Issue
	@FindBy(xpath="//a[@title='Up Issue']")
	WebElement upIssueBtn;

	@FindBy(xpath=".//*[@id='ddlDSVersion']")
	WebElement upIssueVersionDropDown;

	@FindBy(xpath="//button[text()='Up Issue']")
	WebElement acceptUpIssueBtn;

	@FindBy(xpath="//button[@data-bb-handler='cancel']")
	WebElement cancelUpIssue;

	@FindBy(xpath="//span[contains(text(),'Capture')]") // Answering at capture
	WebElement captureLink;

	@FindBy(xpath=".//*[@id='txtSearch']")
	WebElement searchBox;

	@FindBy(css=".fa.fa-search")
	WebElement searchBtn;

	@FindBy(xpath="//h3[@title='Test Up Issue']")
	WebElement TestUpIssue_Q;

	@FindBy(xpath="//a[@title='Add Record']")
	WebElement addBtn;

	@FindBy(xpath="//span[text()='1.']//following::input[1]")
	WebElement Q1TextBox;

	@FindBy(xpath="//span[text()='2.']//following::label[1]")
	WebElement Q2Ans1;

	@FindBy(xpath="//span[text()='3.']//following::input[1]")
	WebElement Q3TextBox;

	@FindBy(xpath=".//*[@id='btnSave']") 
	WebElement captureSaveBtn;

	// Up Issue - Modify questionnaire
	@FindBy(xpath=".//*[@id='txtSearch']")
	WebElement QuestionnaireSearchBox;

	@FindBy(xpath="//h3[@title='Test Up Issue']")
	WebElement TestUpIssue_Questionnaire;

	// Up Issue - On Modifying MultiChoice Questionnaire 
	@FindBy(xpath="//a[@title='2']")
	WebElement Q2_Multichoice;

	@FindBy(xpath="//a[@title='3']")
	WebElement Q3_Table;

	// Up Issue - add/copy/download/upload Questions
	@FindBy(xpath=".//*[@id='_copyItem']/span/span[2]")
	WebElement copyQuestionsBtn;

	@FindBy(xpath=".//*[@id='divItemToolbar']/a[3]/span/span[2]")
	WebElement downloadTemplateBtn;

	@FindBy(xpath=".//*[@id='divItemToolbar']/a[4]/span/span[2]")
	WebElement uploadTemplateBtn;

	@FindBy(xpath=".//*[@id='removeField']/span/span[2]")
	WebElement removeFieldBtn;

	// Modifying the Captured Question
	@FindBy(xpath=".//*[@id='copyQuestionnaire']/a")
	WebElement copyQuestionnaireBtn;

	// Folder Permissions
	// Setup for folder permission
	@FindBy(xpath="//*[text()='Folder1']")
	WebElement folder1;

	@FindBy(xpath="//*[text()='Folder2']")
	WebElement folder2;

	@FindBy(xpath="//*[text()='Folder3']")
	WebElement folder3;
	
	@FindBy(xpath="//*[text()='Folder4']")
	WebElement folder4;
	
	@FindBy(xpath="//*[text()='Folder5']")
	WebElement folder5;

	@FindBy(xpath=".//*[@id='btnBack']")
	WebElement backFromFolders;

	@FindBy(xpath=".//*[@id='btnPageBack']")
	WebElement backFromQuestionnaire;
	
	@FindBy(xpath="//span[text()='CONTACTS']")
	WebElement contactsText;
	
	@FindBy(xpath="//span[text()='Aaron Cope']//following::span[1]")
	WebElement AaronCopeAddBtn;
	
	@FindBy(xpath="//span[text()='Alex Knight']//following::span[1]")
	WebElement AlexKnightAddBtn;
	
	@FindBy(xpath="//span[text()='People Added']")
	WebElement peopleAddedText;

	@FindBy(xpath="//span[text()='Aaron Cope']//following::select[1]")
	WebElement AaronCopeDropDown;
	
	@FindBy(xpath="//span[text()='Aaron Cope']//following::i[1]")
	WebElement AaronCopeDropDownLockSymbol;
	
	@FindBy(xpath="//span[text()='Aaron Cope']//following::i[1]")
	WebElement AaronCopeDropDownDeleteUserSymbol;
	
	@FindBy(xpath="//span[text()='Alex Knight']//following::select[1]")
	WebElement AlexKnightDropDown;
	
	// Set the user to view folders (Aaron Cope)
	@FindBy(xpath="//span[contains(.,'John Smith ')]")
	WebElement JohnSmitAccount;
	
	@FindBy(linkText="myAccount")
	WebElement myAccountLink;
	
	@FindBy(xpath="//span[text()='Log in as']")
	WebElement LoginAsBtn;
	
	@FindBy(xpath="//span[contains(text(),'Login Email')]//following::input[2]")
	WebElement logInEmailTextBox;
	
	@FindBy(xpath="//div[text()='Aaron Cope']")
	WebElement AaronCopeDetails;
	
	@FindBy(xpath="//td[@title='Alex Knight']//following::div[text()='Aerospace Engineering Ltd']")
	WebElement AlexKnightDetails;
	
	@FindBy(xpath="//span[text()='Re Login']")
	WebElement reLogInBtn;
	
	@FindBy(xpath=".//*[@id='Detail']")
	WebElement detailsLink;
	
	@FindBy(xpath="//a[text()='valuechain.com']//following::div[2]")
	WebElement viosMenu;
	
	@FindBy(xpath="//span[text()='New iQapture']")
	WebElement Newiqapture;
	
	@FindBy(xpath="//h3[text()='Test Questionnaire']")
	WebElement TestQuestionnaire;
	
	@FindBy(xpath="//button[text()='Yes']")
	WebElement YesBtn;
	
	// Adding companies/removing/giving permisions
	@FindBy(xpath=".//*[@id='txtSearch']")
	WebElement peopleSearchBox;
	
	@FindBy(xpath=".//*[@id='SearPeopleBtn']")
	WebElement peopleSearchBtn;
	
	@FindBy(xpath="//div[text()='Company']//following::span[contains(text(),'ISRO')]//following::span[1]")
	WebElement ISROAddBtn;
	
	@FindBy(xpath="//span[text()='ISRO']//following::select[1]")
	WebElement ISROpermissiondropDown;
	
	@FindBy(xpath="//span[text()='DRDO']//following::i[1]")
	WebElement ISROdeleteBtn;
	
	
	
	
	


	// Initializing the Page Objects:................................................................
	public BuildPage() {
		PageFactory.initElements(driver, this);
	}


	// Actions:......................................................................................
	public boolean verify_IQuapturePage() {
		return AddBtn.isDisplayed();
	}

	public void verify_Create_IQapture(String QuestionnaireName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, AddBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		nameTxtBox.sendKeys(QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, savedItem);
		String expected = "iQaptureDemo";
		String actual = savedItem.getText();
		Assert.assertEquals(actual, expected, "Item Not Saved");
	}

	public void verify_Create_Folder(String FolderName, String description) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddFolderBtn);
		JavascriptLibrary.javascriptType(driver, folderName, FolderName);
		JavascriptLibrary.javascriptType(driver, descTxt, description);
		JavascriptLibrary.javascriptClickElement(driver, folderSaveBtn);
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		Assert.assertTrue(demo1Folder.isDisplayed(),"Folder not Created");
	}

	public void verify_Create_Nested_Folder(String FolderName, String description) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, AddFolderBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddFolderBtn);
		GenericLibrary.waitForElementVisibility(driver, folderName);
		JavascriptLibrary.javascriptType(driver, folderName, FolderName);
		JavascriptLibrary.javascriptType(driver, descTxt, description);
		JavascriptLibrary.javascriptClickElement(driver, folderSaveBtn);
		GenericLibrary.waitForElementVisibility(driver, nestedFolder);
		Assert.assertTrue(nestedFolder.isDisplayed(),"Nested Folder not Created");
	}

	public void verify_Questionary_Creation(String questionnaireName) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, savedItem);
		String expected = "Resgister Maintenance";
		String actual = savedItem.getText();
		Assert.assertEquals(actual, expected, "Questionary Not Created");
	}

	public void verify_Upload_Image_To_Questionary(String questionnaireName, String imgPath) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, savedItem);
		String expected = "Resgister Maintenance";
		String actual = savedItem.getText();
		Assert.assertEquals(actual, expected, "Questionary Not Created");
		// Specify the file location with extension
		StringSelection sel = new StringSelection(imgPath);
		// Copy to ClipBoard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		System.out.println("selection" +sel);
		Thread.sleep(2000);
		// This will click on Browse button
		driver.findElement(By.cssSelector("#imgDataset")).click();
		System.out.println("Browse button clicked");
		Robot robot = new Robot();
		Thread.sleep(1000);
		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		//Press Enter 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	public void verify_Delete_Questionary() throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		//JavascriptLibrary.javascriptClickElement(driver, QHR);
		List<WebElement> list = driver.findElements(By.cssSelector(".blog-title.blog-video-title.vc-img-title.dot-ellipsis.dot-resize-update.is-truncated"));
		int count = list.size();
		if (count==0) {
			Reporter.log("No Records Found", true);
		} else {
			WebElement option1 = list.get(0);
			option1.click();
			Thread.sleep(1000);
			Actions a=new Actions(driver);
			a.moveToElement(moreBtn).perform();
			GenericLibrary.waitForElementVisibility(driver, deleteBtn);
			JavascriptLibrary.javascriptClickElement(driver, deleteBtn);
			GenericLibrary.waitForElementVisibility(driver, confirmDelete);
			JavascriptLibrary.javascriptClickElement(driver, confirmDelete);
			Reporter.log("Questionary Deleted Successfully", true);
		}
	}

	public void verify_Rename_Questionary(String QuestionnaireName, String NewQuestionnaireName) throws InterruptedException {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, savedItem);
		Reporter.log("Before Rename => "+savedItem.getText(),true);
		JavascriptLibrary.javascriptClickElement(driver, savedItem);
		WebElement ele1 = driver.findElement(By.xpath(".//*[@id='DS_NAME']"));
		GenericLibrary.waitForElementVisibility(driver, ele1);
		String val = ele1.getAttribute("value");
		int count = val.length();
		for(int i=0; i<count; i++) {
			ele1.sendKeys(Keys.BACK_SPACE);
		}
		JavascriptLibrary.javascriptType(driver, ele1, NewQuestionnaireName);
		Thread.sleep(1000);
		ele1.sendKeys(Keys.TAB);
		GenericLibrary.waitForElementVisibility(driver, savedItem);
		Reporter.log("After Rename => "+savedItem.getText(),true);
	}

	public void verify_Add_Text_Item_To_Questionaries(String QuestionnaireName, String description) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		GenericLibrary.waitForElementVisibility(driver, descriptionTextBox);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, description);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		String expected = "Test Data";
		String actual = addedDesciption.getText();
		Assert.assertEquals(actual, expected, "Text Description Not Added");
	}

	public void verify_Add_Text_Item_With_Levels_To_Questionaries(String QuestionnaireName, 
			String Q1, String Q2, String Q3, String Q4, String Q5) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		//Level 1
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		String expectedLevel1 = "1";
		String actualLevel1 = level1Result.getText();
		Assert.assertEquals(actualLevel1, expectedLevel1, "Level 1 Not Funtional");
		Reporter.log("Question With Level 1 Added To The Questionnaire Successfully", true);
		//Level 2 
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		GenericLibrary.waitForElementVisibility(driver, level2Result);
		String expectedLevel2 = "1.1";
		String actualLevel2 = level2Result.getText();
		Assert.assertEquals(actualLevel2, expectedLevel2, "Level 2 Not Funtional");
		Reporter.log("Question With Level 2 Added To The Questionnaire Successfully", true);
		//Level 3
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		GenericLibrary.waitForElementVisibility(driver, level3Result);
		String expectedLevel3 = "1.1.1";
		String actualLevel3 = level3Result.getText();
		Assert.assertEquals(actualLevel3, expectedLevel3, "Level 3 Not Funtional");
		Reporter.log("Question With Level 3 Added To The Questionnaire Successfully", true);
		//Level 4
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		GenericLibrary.waitForElementVisibility(driver, level4Result);
		String expectedLevel4 = "1.1.1.1";
		String actualLevel4 = level4Result.getText();
		Assert.assertEquals(actualLevel4, expectedLevel4, "Level 4 Not Funtional");
		Reporter.log("Question With Level 4 Added To The Questionnaire Successfully", true);
		//Level 5
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, level5Btn);
		JavascriptLibrary.javascriptClickElement(driver, level5Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		GenericLibrary.waitForElementVisibility(driver, level5Result);
		String expectedLevel5 = "1.1.1.1.1";
		String actualLevel5 = level5Result.getText();
		Assert.assertEquals(actualLevel5, expectedLevel5, "Level 5 Not Funtional");
		Reporter.log("Question With Level 5 Added To The Questionnaire Successfully", true);
	}

	public void verify_Add_Items_With_Numbering_Manually(String QuestionnaireName, String Q1) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		GenericLibrary.waitForElementVisibility(driver, descriptionTextBox);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, manualBtn);
		JavascriptLibrary.javascriptClickElement(driver, manualBtn);
		JavascriptLibrary.javascriptType(driver, numberTxtBox, "a");
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		GenericLibrary.waitForElementVisibility(driver, manualAddedNumber);
		String expected = "a";
		String actual = manualAddedNumber.getText();
		Assert.assertEquals(actual, expected, "Numbering Manually is Not Funtional");
	}

	public void verify_Add_Items_With_Numbering_None(String QuestionnaireName, String Q1) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		GenericLibrary.waitForElementVisibility(driver, descriptionTextBox);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, noneBtn);
		JavascriptLibrary.javascriptClickElement(driver, noneBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
	}

	public void verify_Add_Item_With_Comment_Updating_Deleting(String QuestionnaireName, String Q1, String newComment) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		GenericLibrary.waitForElementVisibility(driver, descriptionTextBox);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		GenericLibrary.waitForElementVisibility(driver, addedComment);
		Assert.assertTrue(addedComment.isDisplayed(), "Comment Not Added");
		Reporter.log("Comment Added successfully", true);
		//Updating Comment
		JavascriptLibrary.javascriptClickElement(driver, addedComment);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, newComment);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Assert.assertEquals(updatedComment.getText(), "Updated Comment", "Comment Not Updated");
		Reporter.log("Comment Updated successfully", true);
		//Deleting Comment
		JavascriptLibrary.javascriptClickElement(driver, addedComment);
		JavascriptLibrary.javascriptClickElement(driver, commentDeleteBtn);
		GenericLibrary.waitForAlertPresent(driver);
		driver.switchTo().alert().accept();
		Reporter.log("Comment Deleted successfully", true);
	}

	public void verify_Add_MultiChoice_Item_To_Questionaries(String QuestionnaireName, String Q1, String Q2, String Q3) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNAOption);
		Thread.sleep(1000);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDownOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowOption);
		Thread.sleep(1000);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNAOption);
		Thread.sleep(1000);
	}

	public void verify_Add_MultiChoice_Item_With_Levels_To_Questionaries(String QuestionnaireName, 
			String Q1, String Q2, String Q3, String Q4, String Q5) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, "Q/MultiChoice/Levels");
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		//Level 1
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, "Question 1 => Level 1");
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		String expectedLevel1 = "1";
		String actualLevel1 = level1Result.getText();
		Assert.assertEquals(actualLevel1, expectedLevel1, "Level 1 Not Funtional");
		Reporter.log("Question With Level 1 Added To The Questionnaire Successfully", true);
		//Level 2 
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, "Question 2 => Level 2");
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		GenericLibrary.waitForElementVisibility(driver, level2Result);
		String expectedLevel2 = "1.1";
		String actualLevel2 = level2Result.getText();
		Assert.assertEquals(actualLevel2, expectedLevel2, "Level 2 Not Funtional");
		Reporter.log("Question With Level 2 Added To The Questionnaire Successfully", true);
		//Level 3
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, "Question 3 => Level 3");
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		GenericLibrary.waitForElementVisibility(driver, level3Result);
		String expectedLevel3 = "1.1.1";
		String actualLevel3 = level3Result.getText();
		Assert.assertEquals(actualLevel3, expectedLevel3, "Level 3 Not Funtional");
		Reporter.log("Question With Level 3 Added To The Questionnaire Successfully", true);
		//Level 4
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, "Question 4 => Level 4");
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		GenericLibrary.waitForElementVisibility(driver, level4Result);
		String expectedLevel4 = "1.1.1.1";
		String actualLevel4 = level4Result.getText();
		Assert.assertEquals(actualLevel4, expectedLevel4, "Level 4 Not Funtional");
		Reporter.log("Question With Level 4 Added To The Questionnaire Successfully", true);
		//Level 5
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, "Question 5 => Level 5");
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, level5Btn);
		JavascriptLibrary.javascriptClickElement(driver, level5Btn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		GenericLibrary.waitForElementVisibility(driver, level5Result);
		String expectedLevel5 = "1.1.1.1.1";
		String actualLevel5 = level5Result.getText();
		Assert.assertEquals(actualLevel5, expectedLevel5, "Level 5 Not Funtional");
		Reporter.log("Question With Level 5 Added To The Questionnaire Successfully", true);
	}

	public void verify_Add_MultiChoice_Items_With_Numbering_Manually(String QuestionnaireName, String Q1, String number) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, manualBtn);
		JavascriptLibrary.javascriptClickElement(driver, manualBtn);
		JavascriptLibrary.javascriptType(driver, numberTxtBox, number);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Thread.sleep(1000);
		String expected = "a";
		String actual = manualAddedNumber.getText();
		Assert.assertEquals(actual, expected, "Numbering Manually is Not Funtional");
	}

	public void verify_Add_MultiChoice_Items_With_Numbering_None(String QuestionnaireName, String Q1) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, noneBtn);
		JavascriptLibrary.javascriptClickElement(driver, noneBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
	}

	public void verify_Add_MultiChoice_Item_With_Comment_Updating_And_Deleting(String QuestionnaireName, 
			String Q1, String newComment) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Thread.sleep(1000);
		GenericLibrary.waitForElementVisibility(driver, addedComment);
		Assert.assertTrue(addedComment.isDisplayed(), "Comment Not Added");
		Reporter.log("Comment Added successfully", true);
		//Updating Comment
		JavascriptLibrary.javascriptClickElement(driver, addedComment);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, newComment);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Assert.assertEquals(updatedComment.getText(), "Updated Comment", "Comment Not Updated");
		Reporter.log("Comment Updated successfully", true);
		//Deleting Comment
		JavascriptLibrary.javascriptClickElement(driver, addedComment);
		JavascriptLibrary.javascriptClickElement(driver, commentDeleteBtn);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Reporter.log("Comment Deleted successfully", true);
	}

	public void verify_Add_MultiChoice_Item_With_HML_Option_And_Score(String QuestionnaireName, 
			String Q1, String subQ1, String subQ2, String subQ3) throws Exception{
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowOption);
		Thread.sleep(1000);
		//Adding High Priority Question
		JavascriptLibrary.javascriptClickElement(driver, highQuestion);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, subQ1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		Assert.assertEquals(hpqText.getText(), "HPQ", "High Priority Question Not Added");
		Reporter.log("High Priority Question Added Successfully", true);
		//Adding Medium Priority Question
		JavascriptLibrary.javascriptClickElement(driver, mediumQuestion);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, subQ2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		Assert.assertEquals(mpqText.getText(), "MPQ", "Medium Priority Question Not Added");
		Reporter.log("Medium Priority Question Added Successfully", true);
		//Adding Low Priority Question
		JavascriptLibrary.javascriptClickElement(driver, lowQuestion);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, subQ3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		Assert.assertEquals(lpqText.getText(), "LPQ", "Low Priority Question Not Added");
		Reporter.log("Low Priority Question Added Successfully", true);
		//Selecting score
		driver.findElement(By.xpath("//span[text()='Question 1']")).click();
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowInIqaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Reporter.log("Score To The Questionnaire Added Suucessfully", true);
	}

	public void verify_Add_MultiChoice_Item_With_YesNoNA_Option_And_Score(String QuestionnaireName,
			String Q1, String option1, String option2, String option3) throws Exception{
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNAOption);
		Thread.sleep(1000);
		//Adding YES Priority Question
		JavascriptLibrary.javascriptClickElement(driver, yesQuestion);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, option1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		Assert.assertEquals(yqText.getText(), "YQ", "YES Priority Question Not Added");
		Reporter.log("YES Priority Question Added Successfully", true);
		//Adding NO Priority Question
		JavascriptLibrary.javascriptClickElement(driver, noQuestion);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, option2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		Assert.assertEquals(nqText.getText(), "NQ", "NO Priority Question Not Added");
		Reporter.log("NO Priority Question Added Successfully", true);
		//Adding N/A Priority Question
		JavascriptLibrary.javascriptClickElement(driver, naQuestion);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, option3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		Assert.assertEquals(naqText.getText(), "NAQ", "N/A Priority Question Not Added");
		Reporter.log("N/A Priority Question Added Successfully", true);
		//Selecting score
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Reporter.log("Score To The Questionnaire Added Suucessfully", true);
	}

	public void verify_Adding_Score_Value_To_MultiChoice_Questionnaire(String QuestionnaireName,
			String Q1, String scoreValue1, String scoreValue2, String scoreValue3) throws Exception{
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowOption);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Thread.sleep(1000);
		List<WebElement> textBoxList = driver.findElements(By.xpath("//input[@field='FI_SCORE' and @type='text']"));
		System.out.println(textBoxList.size());
		//Page Scroll (Scroll into view)
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement textBox1 = textBoxList.get(0);
		js.executeScript("arguments[0].scrollIntoView(true);", textBox1);
		textBox1.sendKeys(scoreValue1);
		WebElement textBox2 = textBoxList.get(1);
		js.executeScript("arguments[0].scrollIntoView(true);", textBox2);
		textBox2.sendKeys(scoreValue2);
		WebElement textBox3 = textBoxList.get(2);
		js.executeScript("arguments[0].scrollIntoView(true);", textBox3);
		textBox3.sendKeys(scoreValue3);
		Reporter.log("Score To The Questionnaire Added Suucessfully", true);
	}

	public void verify_Add_Answer_Hint_Score_Manually(String QuestionnaireName,
			String Q1, String answer1, String hint1, String score1, 
			String answer2, String hint2, String score2) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		GenericLibrary.waitForElementVisibility(driver, plusSign);
		JavascriptLibrary.javascriptClickElement(driver, plusSign);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, plusSign);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowInIqaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);

		List<WebElement> ansTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Answer']"));
		List<WebElement> hintTextBoxes = driver.findElements(By.xpath("//textarea[@placeholder='Enter hint for answer…']"));
		List<WebElement> scoreTextBox = driver.findElements(By.xpath("//input[@field='FI_SCORE' and @type='text']"));
		List<WebElement> eyelist = driver.findElements(By.xpath("//span[@class='desc hide-desc']"));

		ansTextBoxes.get(0).sendKeys(answer1);
		Thread.sleep(1000);
		hintTextBoxes.get(0).sendKeys(hint1);
		Thread.sleep(1000);
		eyelist.get(0).click();
		Thread.sleep(1000);
		scoreTextBox.get(0).sendKeys(score1);
		Thread.sleep(1000);

		JavascriptExecutor js=(JavascriptExecutor) driver;

		ansTextBoxes.get(1).sendKeys(answer2);
		Thread.sleep(1000);
		WebElement h2 = hintTextBoxes.get(1);
		js.executeScript("arguments[0].scrollIntoView(true);", h2);
		h2.sendKeys(hint2);
		Thread.sleep(1000);
		eyelist.get(1).click();
		Thread.sleep(1000);
		scoreTextBox.get(1).sendKeys(score2);
		Thread.sleep(1000);
	}

	public void verify_Add_MultiChoice_DropDown_And_CheckBox_Quesionnaires(String QuestionnaireName,
			String Q1, String Q2) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		//DropDown
		JavascriptLibrary.javascriptClickElement(driver, dropDownOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowInIqaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchableBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Assert.assertEquals(dropDownQuestion.getText(), "Drop Down Question", "Drop Down Question Not Added");
		Reporter.log("DropDown Question Added Successfully", true);
		//ChechBox
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowInIqaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchableBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Assert.assertEquals(checkBoxQuestion.getText(), "Check Box Question", "Check Box Question Not Added");
		Reporter.log("Check Box Question Added Successfully", true);
	}

	public void verify_Add_Date_Quesionnaire(String QuestionnaireName, String Q1) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, dateBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, defaultValueBtn);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		GenericLibrary.waitForElementVisibility(driver, dateQuestion);
		Assert.assertEquals(dateQuestion.getText(), "Date Question", "Date Question Not Added");
		Reporter.log("Date Question Added Successfully", true);
	}

	public void verify_Add_Number_Quesionnaire(String QuestionnaireName,
			String Q1, String Q2, String Q3, String Q4) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		//Number - Integer
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, integerOption);
		Thread.sleep(1000);
		Assert.assertEquals(integerQuestion.getText(), "Integer Question", "Integer Question Not Added");
		Reporter.log("Integer Question Added Successfully", true);
		//NUmber - Float
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, floatOption);
		Thread.sleep(1000);
		Assert.assertEquals(floatQuestion.getText(), "Float Question", "Float Question Not Added");
		Reporter.log("Float Question Added Successfully", true);
		//Number - Percentage
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, percentageOption);
		Thread.sleep(1000);
		Assert.assertEquals(percentageQuestion.getText(), "Percentage Question", "Percentage Question Not Added");
		Reporter.log("Percentage Question Added Successfully", true);
		//Number - Currency
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, currencyOption);
		Thread.sleep(1000);
		Assert.assertEquals(currencyQuestion.getText(), "Currency Question", "Currency Question Not Added");
		Reporter.log("Currency Question Added Successfully", true);
	}

	public void verify_Add_Upload_File_And_Section_Quesionnaire(String QuestionnaireName,
			String Q1, String Q2) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		//Upload File
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, uploadFileBtn);
		Thread.sleep(1000);
		Assert.assertEquals(uploadFileQuestion.getText(), "Upload File Question", "Upload File Question Not Added");
		Reporter.log("Upload File Question Added Successfully", true);
		Thread.sleep(500);
		//Section
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, sectionBtn);
		Thread.sleep(1000);
		Assert.assertEquals(sectionQuestion.getText(), "Section Question", "Section Question Not Added");
		Reporter.log("Section Question Added Successfully", true);
	}

	public void verify_Add_Activity_Quesionnaire(String QuestionnaireName, String Q1, String comment, String Q2) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, activityBtn);
		Thread.sleep(500);
		driver.findElement(By.cssSelector("#btnActPeople")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".bs-checkbox>input")).click();
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activityDate);
		Thread.sleep(1000);
		List<WebElement> allDates = driver.findElements(By.cssSelector(".day"));
		for(WebElement ele:allDates){
			String date=ele.getText();
			if(date.equalsIgnoreCase("20")){
				ele.click();
				break;
			}
		}
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, activityDecriptionTxtBox, Q1);
		JavascriptLibrary.javascriptType(driver, activityCommentTxtBox, comment);
		Thread.sleep(1000);
		Assert.assertEquals(activityQuestion.getText(), "Activity Question", "Activity Question Not Added");
		Reporter.log("Activity Question Added Successfully", true);
	}

	public void verify_Add_Advanced_Table_Quesionnaire(String QuestionnaireName, String header, String description, String Q1) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		//Table
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, advancedBtn);
		GenericLibrary.waitForElementVisibility(driver, tableOption);
		JavascriptLibrary.javascriptClickElement(driver, tableOption);
		GenericLibrary.waitForElementVisibility(driver, addSubFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addSubFieldBtn);
		tableHeaderTxtBox.click();
		JavascriptLibrary.javascriptType(driver, tableHeaderTxtBox, header);
		tableDescriptionTxtBox.click();
		JavascriptLibrary.javascriptType(driver, tableDescriptionTxtBox, description);
		tableDescriptionTxtBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void verify_Add_Advanced_Table_Property_Wizard_Quesionnaire(String QuestionnaireName, 
			String Q1, String Q2, String Q3) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		//Table
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, advancedBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, tableOption);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, addSubFieldBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Thread.sleep(1000);
		Assert.assertEquals(tableQuestion.getText(), "Advanced Table Question", "Advanced Table Question Not Added");
		Reporter.log("Advanced Table Question Added Successfully", true);
		//Property
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, advancedBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, propertyOption);
		Thread.sleep(500);
		Select s=new Select(propertyDropDown);
		s.selectByVisibleText("Last Modified By");
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Thread.sleep(1000);
		Assert.assertEquals(propertyQuestion.getText(), "Advanced Property Question", "Advanced Property Question Not Added");
		Reporter.log("Advanced Property Question Added Successfully", true);
		//Wizard
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, advancedBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, wizardBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptType(driver, noOfSubQuestionsTxtBox, "5");
		noOfSubQuestionsTxtBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		List<WebElement> listOfsubQuestions = driver.findElements(By.xpath("//div[@class='field_desc_txt']"));
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(listOfsubQuestions));
		int count = listOfsubQuestions.size()-4;
		Reporter.log("No of Sub-Questions added: "+count, true);
		Reporter.log("Wizard Sub-Questions Created Successfully", true);
		Assert.assertEquals(wizardQuestion.getText(), "Advanced Wizard Question", "Wizard Question Not Created");
		Reporter.log("Advanced Wizard Question created Successfully", true);
	}

	public void verify_Preview_Quesionnaire(String QuestionnaireName, String Q1) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		Assert.assertEquals(previewTestQuestion.getText(), "Preview Test Question", "Advanced Property Question Not Added");
		Reporter.log("Previw Test Question Created Successfully", true);
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.moveToElement(moreBtn).perform();
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, previewOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, previewCloseBtn);
	}

	public void verify_Settings_Score_Addition_Delete_Copy_Questionnaire(String QuestionnaireName, String Q1, 
			String Q1value1, String Q1value2, String Q1value3, String Q2, String Q3, String Q3value1, String Q3value2, String Q3value3,
			String Q4, String minValue, String maxValue, String stepValue, String Q5) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// MultiChoice Item - score
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowInIqaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Thread.sleep(1000);
		List<WebElement> textBoxList = driver.findElements(By.xpath("//input[@field='FI_SCORE' and @type='text']"));
		System.out.println(textBoxList.size());
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement textBox1 = textBoxList.get(0);
		js.executeScript("arguments[0].scrollIntoView(true);", textBox1);
		textBox1.sendKeys(Q1value1);
		WebElement textBox2 = textBoxList.get(1);
		js.executeScript("arguments[0].scrollIntoView(true);", textBox2);
		textBox2.sendKeys(Q1value2);
		WebElement textBox3 = textBoxList.get(2);
		js.executeScript("arguments[0].scrollIntoView(true);", textBox3);
		textBox3.sendKeys(Q1value3);
		// Text Item
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice Item - score
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowInIqaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Thread.sleep(1000);
		List<WebElement> scList = driver.findElements(By.xpath("//input[@field='FI_SCORE' and @type='text']"));
		System.out.println(scList.size());
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		WebElement scBox1 = scList.get(0);
		js2.executeScript("arguments[0].scrollIntoView(true);", scBox1);
		scBox1.sendKeys(Q3value1);
		WebElement scBox2 = scList.get(1);
		js2.executeScript("arguments[0].scrollIntoView(true);", scBox2);
		scBox2.sendKeys(Q3value2);
		WebElement scBox3 = scList.get(2);
		js2.executeScript("arguments[0].scrollIntoView(true);", scBox3);
		scBox3.sendKeys(Q3value3);
		// Date Item
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q4);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, dateBtn);
		Thread.sleep(1000);
		// Number Item
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		JavascriptLibrary.javascriptClickElement(driver, sliderOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, sliderMinValue, minValue);
		Thread.sleep(500);
		JavascriptLibrary.javascriptType(driver, sliderMaxValue, maxValue);
		Thread.sleep(500);
		JavascriptLibrary.javascriptType(driver, sliderStepValue, stepValue);
		Thread.sleep(500);
		// Settings
		JavascriptLibrary.javascriptClickElement(driver, settingsBtn);
		GenericLibrary.waitForElementVisibility(driver,displayScoreTotalOnRecord_Yes);
		JavascriptLibrary.javascriptClickElement(driver, displayScoreTotalOnRecord_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, changeRecordOrder_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, copyRecords_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, showLogs_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, trashCanAction_Delete);
		Thread.sleep(500);
		// Settings - Header
		((JavascriptExecutor)driver).executeScript("scroll(0, 800)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Headers']//following::span[1]")).click();
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, viewAllLink);
		Thread.sleep(1000);
		List<WebElement> searchRusults = driver.findElements(By.cssSelector(".select2-result-repository__title"));
		for(int i=0; i<searchRusults.size(); i++) {
			String question = searchRusults.get(i).getText();
			if(question.equalsIgnoreCase("Text Item")) {
				searchRusults.get(i).click();
				break;
			}
		}
		JavascriptLibrary.javascriptClickElement(driver, headerAddBtn);
		Thread.sleep(1000);
	}

	public void verify_Settings_ScoreMultiply_StrikeOut_FileUpload_Questionnaire(String QuestionnaireName, String Q1, 
			String Q1value1, String Q1value2, String Q1value3, String Q2, String Q3, String Q3value1, String Q3value2, String Q3value3,
			String Q4, String Q5, String minValue, String maxValue, String stepValue, String imgPath) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(1000);
		// MultiChoice Item - score
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowInIqaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Thread.sleep(1000);
		List<WebElement> textBoxList = driver.findElements(By.xpath("//input[@field='FI_SCORE' and @type='text']"));
		System.out.println(textBoxList.size());
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement textBox1 = textBoxList.get(0);
		js.executeScript("arguments[0].scrollIntoView(true);", textBox1);
		textBox1.sendKeys(Q1value1);
		WebElement textBox2 = textBoxList.get(1);
		js.executeScript("arguments[0].scrollIntoView(true);", textBox2);
		textBox2.sendKeys(Q1value2);
		WebElement textBox3 = textBoxList.get(2);
		js.executeScript("arguments[0].scrollIntoView(true);", textBox3);
		textBox3.sendKeys(Q1value3);
		// Text Item
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice Item - score
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowInIqaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Thread.sleep(1000);
		List<WebElement> scList = driver.findElements(By.xpath("//input[@field='FI_SCORE' and @type='text']"));
		System.out.println(scList.size());
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		WebElement scBox1 = scList.get(0);
		js2.executeScript("arguments[0].scrollIntoView(true);", scBox1);
		scBox1.sendKeys(Q3value1);
		WebElement scBox2 = scList.get(1);
		js2.executeScript("arguments[0].scrollIntoView(true);", scBox2);
		scBox2.sendKeys(Q3value2);
		WebElement scBox3 = scList.get(2);
		js2.executeScript("arguments[0].scrollIntoView(true);", scBox3);
		scBox3.sendKeys(Q3value3);
		// Date Item
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q4);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, dateBtn);
		Thread.sleep(1000);
		// Number Item
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		JavascriptLibrary.javascriptClickElement(driver, sliderOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, sliderMinValue, minValue);
		Thread.sleep(500);
		JavascriptLibrary.javascriptType(driver, sliderMaxValue, maxValue);
		Thread.sleep(500);
		JavascriptLibrary.javascriptType(driver, sliderStepValue, stepValue);
		Thread.sleep(500);
		// Settings
		JavascriptLibrary.javascriptClickElement(driver, settingsBtn);
		GenericLibrary.waitForElementVisibility(driver, displayScoreTotalOnRecord_Yes);
		JavascriptLibrary.javascriptClickElement(driver, displayScoreTotalOnRecord_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, multiplyScores_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, changeRecordOrder_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, copyRecords_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, showLogs_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, trashCanAction_StrikeOut);
		Thread.sleep(500);
		// Upload Template
		StringSelection sel2 = new StringSelection(imgPath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel2,null);
		System.out.println("selection" +sel2);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, uploadTemplate);
		System.out.println("Browse button clicked");
		Robot robot2 = new Robot();
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		// Settings - Header
		((JavascriptExecutor)driver).executeScript("scroll(0, 800)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Headers']//following::span[1]")).click();
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, viewAllLink);
		Thread.sleep(1000);
		List<WebElement> searchRusults = driver.findElements(By.cssSelector(".select2-result-repository__title"));
		for(int i=0; i<searchRusults.size(); i++) {
			String question = searchRusults.get(i).getText();
			if(question.equalsIgnoreCase("Text Item")) {
				searchRusults.get(i).click();
				break;
			}
		}
		JavascriptLibrary.javascriptClickElement(driver, headerAddBtn);
		Thread.sleep(1000);
	}

	public void verify_Settings_Scedule_Questionnaire(String QuestionnaireName, String Q1, 
			String Q1value1, String Q1value2, String Q1value3, String Q2, String Q3, String Q3value1, String Q3value2, String Q3value3,
			String Q4, String Q5, String minValue, String maxValue, String stepValue) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, mainFolder);
		JavascriptLibrary.javascriptClickElement(driver, mainFolder);
		GenericLibrary.waitForElementVisibility(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, subFolder);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);

		// MultiChoice Item - score
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowInIqaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Thread.sleep(1000);
		List<WebElement> textBoxList = driver.findElements(By.xpath("//input[@field='FI_SCORE' and @type='text']"));
		System.out.println(textBoxList.size());
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement textBox1 = textBoxList.get(0);
		js.executeScript("arguments[0].scrollIntoView(true);", textBox1);
		textBox1.sendKeys(Q1value1);
		WebElement textBox2 = textBoxList.get(1);
		js.executeScript("arguments[0].scrollIntoView(true);", textBox2);
		textBox2.sendKeys(Q1value2);
		WebElement textBox3 = textBoxList.get(2);
		js.executeScript("arguments[0].scrollIntoView(true);", textBox3);
		textBox3.sendKeys(Q1value3);
		Thread.sleep(1000);	
		// Text Item
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice Item - score
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowInIqaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		Thread.sleep(1000);
		List<WebElement> scList = driver.findElements(By.xpath("//input[@field='FI_SCORE' and @type='text']"));
		System.out.println(scList.size());
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		WebElement scBox1 = scList.get(0);
		js2.executeScript("arguments[0].scrollIntoView(true);", scBox1);
		scBox1.sendKeys(Q3value1);
		WebElement scBox2 = scList.get(1);
		js2.executeScript("arguments[0].scrollIntoView(true);", scBox2);
		scBox2.sendKeys(Q3value2);
		WebElement scBox3 = scList.get(2);
		js2.executeScript("arguments[0].scrollIntoView(true);", scBox3);
		scBox3.sendKeys(Q3value3);
		Thread.sleep(1000);
		// Date Item
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, dateBtn);
		Thread.sleep(1000);
		// Number Item
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		JavascriptLibrary.javascriptClickElement(driver, sliderOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, sliderMinValue, minValue);
		Thread.sleep(500);
		JavascriptLibrary.javascriptType(driver, sliderMaxValue, maxValue);
		Thread.sleep(500);
		JavascriptLibrary.javascriptType(driver, sliderStepValue, stepValue);
		Thread.sleep(500);
		// Settings - Schedules
		// Settings
		JavascriptLibrary.javascriptClickElement(driver, settingsBtn);
		GenericLibrary.waitForElementVisibility(driver, displayScoreTotalOnRecord_Yes);
		JavascriptLibrary.javascriptClickElement(driver, displayScoreTotalOnRecord_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, changeRecordOrder_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, copyRecords_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, showLogs_Yes);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, trashCanAction_Delete);
		Thread.sleep(500);
		// Settings - Weekly Schedule
		((JavascriptExecutor)driver).executeScript("scroll(0, 800)");
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addScheduleBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, scheduleLabelTxtBox);
		scheduleLabelTxtBox_in.clear();
		JavascriptLibrary.javascriptType(driver, scheduleLabelTxtBox_in, "Weekly Schedule");
		List<WebElement> weeksList = driver.findElements(By.xpath(".//*[@id='divWeekly']/div/div/div[1]/div/label/span"));
		weeksList.get(0).click();
		weeksList.get(2).click();
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addPeopleBtn);
		Thread.sleep(1000);
		List<WebElement> users = driver.findElements(By.xpath(".//*[@id='user_tbRight']/tbody/tr/td[1]/input"));
		users.get(2).click();
		Thread.sleep(1000);
		users.get(7).click();
		Thread.sleep(1000);
		// Settings - Monthly Schedule
		JavascriptLibrary.javascriptClickElement(driver, addScheduleBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, scheduleLabelTxtBox);
		scheduleLabelTxtBox_in.clear();
		JavascriptLibrary.javascriptType(driver, scheduleLabelTxtBox_in, "Monthly Schedule");
		JavascriptLibrary.javascriptClickElement(driver, setDayTxtBox);
		JavascriptLibrary.javascriptType(driver, setDayTxtBox_in, "10");
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, monthlyBtn);
		Thread.sleep(1000);
		List<WebElement> monthsList = driver.findElements(By.xpath(".//*[@id='divMyActions']/div/label/span"));
		JavascriptExecutor js3=(JavascriptExecutor) driver;
		WebElement jan = monthsList.get(1);
		js3.executeScript("arguments[0].scrollIntoView(true);", jan);
		jan.click();
		WebElement aug = monthsList.get(9);
		js3.executeScript("arguments[0].scrollIntoView(true);", aug);
		aug.click();
		WebElement dec = monthsList.get(12);
		js3.executeScript("arguments[0].scrollIntoView(true);", dec);
		dec.click();
		Thread.sleep(1000);
		// Settings - Set Date
		// Current Month Date
		JavascriptLibrary.javascriptClickElement(driver, addScheduleBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, setDateBtn);
		JavascriptLibrary.javascriptClickElement(driver, scheduleLabelTxtBox);
		scheduleLabelTxtBox_in.clear();
		JavascriptLibrary.javascriptType(driver, scheduleLabelTxtBox_in, "Current Month Schedule");
		JavascriptLibrary.javascriptClickElement(driver, setDateCalenderBtn);
		List<WebElement> currentMonthDays = driver.findElements(By.cssSelector(".day"));
		for (int i = 0; i < currentMonthDays.size(); i++) {
			String day = currentMonthDays.get(i).getText();
			if(day.equalsIgnoreCase("10")) {
				currentMonthDays.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
		// Last Month Date
		JavascriptLibrary.javascriptClickElement(driver, addScheduleBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, setDateBtn);
		JavascriptLibrary.javascriptClickElement(driver, scheduleLabelTxtBox);
		scheduleLabelTxtBox_in.clear();
		JavascriptLibrary.javascriptType(driver, scheduleLabelTxtBox_in, "Last Month Schedule");
		JavascriptLibrary.javascriptClickElement(driver, setDateCalenderBtn);
		List<WebElement> leftBtns = driver.findElements(By.cssSelector(".fa.fa-angle-left"));
		leftBtns.get(0).click();
		Thread.sleep(500);
		List<WebElement> lastMonthDays = driver.findElements(By.cssSelector(".day"));
		for (int i = 0; i < lastMonthDays.size(); i++) {
			String day = lastMonthDays.get(i).getText();
			if(day.equalsIgnoreCase("10")) {
				lastMonthDays.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
		// Next Month Date
		JavascriptLibrary.javascriptClickElement(driver, addScheduleBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, setDateBtn);
		JavascriptLibrary.javascriptClickElement(driver, scheduleLabelTxtBox);
		scheduleLabelTxtBox_in.clear();
		JavascriptLibrary.javascriptType(driver, scheduleLabelTxtBox_in, "Next Month Scedule");
		JavascriptLibrary.javascriptClickElement(driver, setDateCalenderBtn);
		List<WebElement> rightBtns = driver.findElements(By.cssSelector(".fa.fa-angle-right"));
		rightBtns.get(0).click();
		Thread.sleep(500);
		List<WebElement> nextMonthDays = driver.findElements(By.cssSelector(".day"));
		for (int i = 0; i < nextMonthDays.size(); i++) {
			String day = nextMonthDays.get(i).getText();
			if(day.equalsIgnoreCase("10")) {
				nextMonthDays.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}

	public void verify_Move_Questionnaire_From_One_Folder_To_Other_Folders(String QuestionnaireName, String folderName) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, AddBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		nameTxtBox.sendKeys(QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, settingsBtn);
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		Thread.sleep(1000);
		searchFolderTxtBox.click();
		searchFolderTxtBox_in.sendKeys(folderName);
		demo2Folder.click();
		addToFolderBtn.click();
		Thread.sleep(1000);
	}

	public void verify_Folder_Rename_And_Deletion(String folder1, String folder1Description, String folder2, String folder2Description) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddFolderBtn);
		GenericLibrary.waitForElementVisibility(driver, folderName);
		JavascriptLibrary.javascriptType(driver, folderName, folder1);
		GenericLibrary.waitForElementVisibility(driver, descTxt);
		JavascriptLibrary.javascriptType(driver, descTxt, folder1Description);
		JavascriptLibrary.javascriptClickElement(driver, folderSaveBtn);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		Thread.sleep(3000);
		dummyFolder.click();
		Thread.sleep(3000);
		editBtn.click();
		Thread.sleep(3000);
		folderName.clear();
		folderName.sendKeys(folder2);
		descTxt.clear();
		descTxt.sendKeys(folder2Description);
		folderSaveBtn.click();
		closeFoldereditPage.click();
		Thread.sleep(2000);
		GenericLibrary.waitForElementVisibility(driver, deleteMeFolder);
		deleteMeFolder.click();
		GenericLibrary.waitForElementVisibility(driver, folderDeleteBtn);
		folderDeleteBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}

	public void verify_Cascading_Questionnaire_option(String QuestionnaireName, String folderName, String questionnaire,
			String mainFolder, String subFolder) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, AddBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		nameTxtBox.sendKeys(QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, savedItem);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, settingsBtn);
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		Thread.sleep(1000);
		searchFolderTxtBox.click();
		searchFolderTxtBox_in.sendKeys(folderName);
		demo1Folder.click();
		addFolderBtn.click();
		GenericLibrary.waitForElementVisibility(driver, cascade_CheckBox1);
		cascade_CheckBox1.click();
		((JavascriptExecutor)driver).executeScript("scroll(0, -1000)");
		JavascriptLibrary.javascriptClickElement(driver, buildLink);
		GenericLibrary.waitForElementVisibility(driver, questionnaireSearchBox);
		JavascriptLibrary.javascriptType(driver, questionnaireSearchBox, questionnaire);
		questionnaireSearchBox.sendKeys(Keys.ENTER);
		GenericLibrary.waitForElementVisibility(driver, CascadeTest);
		Assert.assertTrue(CascadeTest.isDisplayed(), "Questionnaire Not Found");
		Reporter.log("Questionnaire created at root folder",true);
		JavascriptLibrary.javascriptClickElement(driver, buildLink);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, CascadeTest);
		Assert.assertTrue(CascadeTest.isDisplayed(), "Questionnaire Not Found");
		Reporter.log("Questionnaire copied to Parent folder",true);
		GenericLibrary.waitForElementVisibility(driver, Demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, Demo2Folder);
		JavascriptLibrary.javascriptType(driver, questionnaireSearchBox, questionnaire);
		questionnaireSearchBox.sendKeys(Keys.ENTER);
		GenericLibrary.waitForElementVisibility(driver, CascadeTest);
		Assert.assertTrue(CascadeTest.isDisplayed(), "Questionnaire Not Found");
		Reporter.log("Questionnaire copied to Child folder",true);
	}

	public void verify_Up_Issue_functionality(String QuestionnaireName, String Q1, String Q2, String answer1, String hint1, String score1,
			String answer2, String hint2, String score2, String Q3, String header, String description, String searchItem,
			String Q1Ans, String Q3Ans) throws Exception {
		// Creating Questionnaire for Up Issue
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, AddBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		nameTxtBox.sendKeys(QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		Assert.assertTrue(newItemBtn.isDisplayed(), "Questionnaire for Up Issue is not created");
		Reporter.log("Questionnaire for Up Issue created successfully and Create New field button is Displayed", true);
		// Creating up issue for the Questionnaire
		GenericLibrary.hoverWebelement(driver, moreBtn);
		GenericLibrary.waitForElementVisibility(driver, upIssueBtn);
		JavascriptLibrary.javascriptClickElement(driver, upIssueBtn);
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		JavascriptLibrary.javascriptClickElement(driver, acceptUpIssueBtn);
		driver.navigate().refresh();
		GenericLibrary.waitForElementVisibility(driver, upIssueVersionDropDown);
		GenericLibrary.selectElementByVisibleText(upIssueVersionDropDown, "Version 2");
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		Assert.assertTrue(newItemBtn.isDisplayed(), "Version 2 or up issue not created");
		Reporter.log("Up Issue created successfully and New Item button is displayed for Version 2", true);
		// Text Item
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice Item - score
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		GenericLibrary.waitForElementVisibility(driver, plusSign);
		JavascriptLibrary.javascriptClickElement(driver, plusSign);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, plusSign);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreOptionsBtn);
		GenericLibrary.waitForElementVisibility(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowInIqaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeBtn);
		List<WebElement> ansTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Answer']"));
		List<WebElement> hintTextBoxes = driver.findElements(By.xpath("//textarea[@placeholder='Enter hint for answer…']"));
		List<WebElement> scoreTextBox = driver.findElements(By.xpath("//input[@field='FI_SCORE' and @type='text']"));
		List<WebElement> eyelist = driver.findElements(By.xpath("//span[@class='desc hide-desc']"));
		ansTextBoxes.get(0).sendKeys(answer1);
		Thread.sleep(1000);
		hintTextBoxes.get(0).sendKeys(hint1);
		Thread.sleep(1000);
		eyelist.get(0).click();
		Thread.sleep(1000);
		scoreTextBox.get(0).sendKeys(score1);
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		ansTextBoxes.get(1).sendKeys(answer2);
		Thread.sleep(1000);
		WebElement h2 = hintTextBoxes.get(1);
		js.executeScript("arguments[0].scrollIntoView(true);", h2);
		h2.sendKeys(hint2);
		Thread.sleep(1000);
		eyelist.get(1).click();
		Thread.sleep(1000);
		scoreTextBox.get(1).sendKeys(score2);
		scoreTextBox.get(1).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		//Table
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, advancedBtn);
		GenericLibrary.waitForElementVisibility(driver, tableOption);
		JavascriptLibrary.javascriptClickElement(driver, tableOption);
		GenericLibrary.waitForElementVisibility(driver, addSubFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addSubFieldBtn);
		tableHeaderTxtBox.click();
		JavascriptLibrary.javascriptType(driver, tableHeaderTxtBox, header);
		tableDescriptionTxtBox.click();
		JavascriptLibrary.javascriptType(driver, tableDescriptionTxtBox, description);
		tableDescriptionTxtBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);

		// Answering in Capture section
		JavascriptLibrary.javascriptClickElement(driver, captureLink);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, TestUpIssue_Q);
		JavascriptLibrary.javascriptClickElement(driver, TestUpIssue_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		GenericLibrary.waitForElementVisibility(driver, Q1TextBox);
		Q1TextBox.sendKeys(Q1Ans);
		JavascriptLibrary.javascriptClickElement(driver, Q2Ans1);
		Q3TextBox.sendKeys(Q3Ans);
		JavascriptLibrary.javascriptClickElement(driver, captureSaveBtn);
		Thread.sleep(1000);
	}

	public void verify_Up_Issue_on_modifying_questionnaire(String QuestionnaireName, String answer, String hint, String newDesc) throws Exception {
		SoftAssert a = new SoftAssert();
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, QuestionnaireSearchBox);
		questionnaireSearchBox.sendKeys(QuestionnaireName);
		questionnaireSearchBox.sendKeys(Keys.ENTER);
		GenericLibrary.waitForElementVisibility(driver, TestUpIssue_Questionnaire);
		JavascriptLibrary.javascriptClickElement(driver, TestUpIssue_Questionnaire);
		// Up Issue On adding new Item / Modify existing Question
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on adding new Question",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// Up Issue On modifying MultiChoice question Ans/Hint/Score
		JavascriptLibrary.javascriptClickElement(driver, Q2_Multichoice);
		List<WebElement> ansTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Answer']"));
		WebElement ansTextBox1 = ansTextBoxes.get(0);
		GenericLibrary.waitForElementVisibility(driver, ansTextBox1);
		ansTextBox1.sendKeys(answer);
		ansTextBox1.sendKeys(Keys.TAB);
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on modifying answer field for MultiCoice Question",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// Up Issue On Adding new field, Copy, Download answers and Upload answers
		// Add new Field
		JavascriptLibrary.javascriptClickElement(driver, Q2_Multichoice);
		GenericLibrary.waitForElementVisibility(driver, plusSign);
		JavascriptLibrary.javascriptClickElement(driver, plusSign);
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on adding new field for MultiCoice Question",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// Copy Questions
		JavascriptLibrary.javascriptClickElement(driver, Q2_Multichoice);
		GenericLibrary.waitForElementVisibility(driver, copyQuestionsBtn);
		JavascriptLibrary.javascriptClickElement(driver, copyQuestionsBtn);
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on copying Questions for MultiCoice Question",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// Download Template
		JavascriptLibrary.javascriptClickElement(driver, Q2_Multichoice);
		GenericLibrary.waitForElementVisibility(driver, downloadTemplateBtn);
		JavascriptLibrary.javascriptClickElement(driver, downloadTemplateBtn);
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on downloading template for MultiCoice Question",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// Upload Template
		JavascriptLibrary.javascriptClickElement(driver, Q2_Multichoice);
		GenericLibrary.waitForElementVisibility(driver, uploadTemplateBtn);
		JavascriptLibrary.javascriptClickElement(driver, uploadTemplateBtn);
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on uploading template for MultiCoice Question",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// Up Issue on on modifying Hint of the Answer
		JavascriptLibrary.javascriptClickElement(driver, Q2_Multichoice);
		List<WebElement> hintTextBoxes = driver.findElements(By.xpath("//textarea[@placeholder='Enter hint for answer…']"));
		WebElement hintTextBox1 = hintTextBoxes.get(0);
		GenericLibrary.waitForElementVisibility(driver, hintTextBox1);
		hintTextBox1.sendKeys(hint);
		hintTextBox1.sendKeys(Keys.TAB);
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on modifying hint field for MultiCoice Question",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// No - Up Issue on on modifying Hint of the Answer
		JavascriptLibrary.javascriptClickElement(driver, Q2_Multichoice);
		Thread.sleep(2000);
		List<WebElement> eyeList = driver.findElements(By.xpath("//i[@title='Remove Item']//following::span[2]"));
		WebElement eyeList1 = eyeList.get(0);
		GenericLibrary.waitForElementVisibility(driver, eyeList1);
		eyeList1.click();
		Reporter.log("No Up issue raised on show hint button for MultiCoice Question",true);
		// Up Issue On Deleting Answer for MultiChoice Question
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, Q2_Multichoice);
		List<WebElement> removeAnsBtns = driver.findElements(By.xpath("//i[@title='Remove Item']"));
		WebElement removeAnsBtn1 = removeAnsBtns.get(0);
		GenericLibrary.waitForElementVisibility(driver, removeAnsBtn1);
		Thread.sleep(3000);
		removeAnsBtn1.click();
		driver.switchTo().alert().accept();
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on deleting answer for MultiCoice Question",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// Up Issue on changing the design type
		JavascriptLibrary.javascriptClickElement(driver, Q2_Multichoice);
		GenericLibrary.waitForElementVisibility(driver, advancedBtn);
		JavascriptLibrary.javascriptClickElement(driver, advancedBtn);
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on changing design type for MultiCoice Question",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// Up Issue on Changing the description
		JavascriptLibrary.javascriptClickElement(driver, Q2_Multichoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, newDesc);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on changing descrption",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// Up issue on changing the sub field of table Questions
		JavascriptLibrary.javascriptClickElement(driver, Q3_Table);
		GenericLibrary.waitForElementVisibility(driver, propertyOption);
		JavascriptLibrary.javascriptClickElement(driver, propertyOption);
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on changing sub field of table Question",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// Up issue on deleting the answered Question
		JavascriptLibrary.javascriptClickElement(driver, Q3_Table);
		GenericLibrary.waitForElementVisibility(driver, removeFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, removeFieldBtn);
		driver.switchTo().alert().accept();
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on deleting Question",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// Up issue on changing Table header and description
		JavascriptLibrary.javascriptClickElement(driver, Q3_Table);
		GenericLibrary.waitForElementVisibility(driver, tableDescriptionTxtBox);
		Thread.sleep(2000);
		tableDescriptionTxtBox.click();
		tableDescriptionTxtBox.clear();
		tableDescriptionTxtBox.sendKeys(Keys.TAB);
		GenericLibrary.waitForElementVisibility(driver, acceptUpIssueBtn);
		a.assertTrue(acceptUpIssueBtn.isDisplayed(), "Up Issue Not Created");
		Reporter.log("Up issue raised on changing table header and description of Table Question",true);
		JavascriptLibrary.javascriptClickElement(driver, cancelUpIssue);
		// Up issue on adding the sub field of Table Question


		a.assertAll();
	}

	public void verify_modify_the_Captured_Question(String QuestionnaireName) throws Exception {
		SoftAssert a = new SoftAssert();
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, QuestionnaireSearchBox);
		questionnaireSearchBox.sendKeys(QuestionnaireName);
		questionnaireSearchBox.sendKeys(Keys.ENTER);
		GenericLibrary.waitForElementVisibility(driver, TestUpIssue_Questionnaire);
		JavascriptLibrary.javascriptClickElement(driver, TestUpIssue_Questionnaire);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		// Preview for the captured Questionnaire
		GenericLibrary.hoverWebelement(driver, moreBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, previewOption);
		Thread.sleep(1000);
		a.assertTrue(previewCloseBtn.isDisplayed(), "Preview is not functional");
		Reporter.log("Preview for the captured Questionnnaire is functional",true);
		JavascriptLibrary.javascriptClickElement(driver, previewCloseBtn);
		Thread.sleep(1000);
		// Copy the captured Questionnaire
		GenericLibrary.waitForElementVisibility(driver, moreBtn);
		GenericLibrary.hoverWebelement(driver, moreBtn);
		GenericLibrary.waitForElementVisibility(driver, copyQuestionnaireBtn);
		JavascriptLibrary.javascriptClickElement(driver, copyQuestionnaireBtn);
		Thread.sleep(2000);
		String copiedQuestionnaire = driver.findElement(By.xpath(".//*[@id='divDS_NAME']")).getText();
		a.assertEquals("Test Up Issue Copy", copiedQuestionnaire, "Copy is not functional");
		Reporter.log("Copy Questionnaire for the captured Questionnnaire is functional",true);

		a.assertAll();
	}

	public void Create_setup_for_folder_permissions(String F1Name, String F1Desc, String F2Name, String F2Desc, String F3Name, String F3Desc,
			String QName, String QDesc, String option) throws Exception {
		// Creating folder, nested folders and a Questionnaire
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddFolderBtn);
		JavascriptLibrary.javascriptType(driver, folderName, F1Name);
		JavascriptLibrary.javascriptType(driver, descTxt, F1Desc);
		JavascriptLibrary.javascriptClickElement(driver, folderSaveBtn);
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		JavascriptLibrary.javascriptClickElement(driver, folder1);
		GenericLibrary.waitForElementVisibility(driver, AddFolderBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddFolderBtn);
		GenericLibrary.waitForElementVisibility(driver, folderName);
		JavascriptLibrary.javascriptType(driver, folderName, F2Name);
		JavascriptLibrary.javascriptType(driver, descTxt, F2Desc);
		JavascriptLibrary.javascriptClickElement(driver, folderSaveBtn);
		GenericLibrary.waitForElementVisibility(driver, folder2);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		JavascriptLibrary.javascriptClickElement(driver, folder1);
		GenericLibrary.waitForElementVisibility(driver, AddFolderBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddFolderBtn);
		GenericLibrary.waitForElementVisibility(driver, folderName);
		JavascriptLibrary.javascriptType(driver, folderName, F3Name);
		JavascriptLibrary.javascriptType(driver, descTxt, F3Desc);
		JavascriptLibrary.javascriptClickElement(driver, folderSaveBtn);
		GenericLibrary.waitForElementVisibility(driver, folder3);
		JavascriptLibrary.javascriptClickElement(driver, backFromFolders);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		JavascriptLibrary.javascriptClickElement(driver, folder1);
		GenericLibrary.waitForElementVisibility(driver, AddBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		GenericLibrary.waitForElementVisibility(driver, descriptionTextBox);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, QDesc);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, backFromQuestionnaire);
		GenericLibrary.waitForElementVisibility(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		// Adding user to Folders
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		JavascriptLibrary.javascriptClickElement(driver, folder1);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, contactsText);
		JavascriptLibrary.javascriptClickElement(driver, contactsText);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeAddBtn);
		JavascriptLibrary.javascriptClickElement(driver, AaronCopeAddBtn);
		GenericLibrary.waitForElementVisibility(driver, peopleAddedText);
		JavascriptLibrary.javascriptClickElement(driver, peopleAddedText);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDown);
		GenericLibrary.selectElementByVisibleText(AaronCopeDropDown, option);
		JavascriptLibrary.javascriptClickElement(driver, closeFoldereditPage);
	}

	public void verify_set_the_folder_permission_to_VIEW_folders(String option, String user) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		// Adding user to Folders
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		JavascriptLibrary.javascriptClickElement(driver, folder1);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDown);
		GenericLibrary.selectElementByVisibleText(AaronCopeDropDown, option);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, closeFoldereditPage);
		GenericLibrary.hoverWebelement(driver, JohnSmitAccount);
		JavascriptLibrary.javascriptClickElement(driver, myAccountLink);
		GenericLibrary.waitForElementVisibility(driver, LoginAsBtn);
		JavascriptLibrary.javascriptClickElement(driver, LoginAsBtn);
		driver.switchTo().frame(0);
		logInEmailTextBox.sendKeys(user);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDetails);
		JavascriptLibrary.javascriptClickElement(driver, AaronCopeDetails);
		GenericLibrary.waitForElementVisibility(driver, reLogInBtn);
		JavascriptLibrary.javascriptClickElement(driver, reLogInBtn);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frmVMIMain");
		GenericLibrary.waitForElementToBeClickable(driver, detailsLink);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		viosMenu.click();
		GenericLibrary.waitForElementVisibility(driver, Newiqapture);
		JavascriptLibrary.javascriptClickElement(driver, Newiqapture);
		GenericLibrary.waitForElementVisibility(driver, buildLink);
		JavascriptLibrary.javascriptClickElement(driver, buildLink);
		GenericLibrary.waitForElementVisibility(driver, folderBackBtn);
		boolean status = AddBtn.isDisplayed();
		if (status == true) {
			Reporter.log("Add Button Found & User can add datasets and Questionnaires inside the folder: TEST FAIL",true);
		} else {
			Reporter.log("Add Button Not Found & User cann't create datasets and cann't create new Questionnaires inside the folder: TEST PASS",true);
		}
	}
	
	public void verify_set_the_folder_permission_to_DO_folders(String option, String user) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		// Adding user to Folders
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		JavascriptLibrary.javascriptClickElement(driver, folder1);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDown);
		GenericLibrary.selectElementByVisibleText(AaronCopeDropDown, option);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, closeFoldereditPage);
		GenericLibrary.hoverWebelement(driver, JohnSmitAccount);
		JavascriptLibrary.javascriptClickElement(driver, myAccountLink);
		GenericLibrary.waitForElementVisibility(driver, LoginAsBtn);
		JavascriptLibrary.javascriptClickElement(driver, LoginAsBtn);
		driver.switchTo().frame(0);
		logInEmailTextBox.sendKeys(user);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDetails);
		JavascriptLibrary.javascriptClickElement(driver, AaronCopeDetails);
		GenericLibrary.waitForElementVisibility(driver, reLogInBtn);
		JavascriptLibrary.javascriptClickElement(driver, reLogInBtn);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frmVMIMain");
		GenericLibrary.waitForElementToBeClickable(driver, detailsLink);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		viosMenu.click();
		GenericLibrary.waitForElementVisibility(driver, Newiqapture);
		JavascriptLibrary.javascriptClickElement(driver, Newiqapture);
		GenericLibrary.waitForElementVisibility(driver, buildLink);
		JavascriptLibrary.javascriptClickElement(driver, buildLink);
		try {
			GenericLibrary.waitForElementVisibility(driver, AddBtn);
			Assert.assertTrue(AddBtn.isDisplayed());
			Reporter.log("Add Button Found & User can add datasets, Questionnaires inside the folder & can give permission to other user: TEST PASS",true);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			Reporter.log("Add Button Not Found & User cann't create datasets and cann't create new Questionnaires inside the folder: TEST FAIL",true);
		}
		
		try {
			Assert.assertTrue(TestQuestionnaire.isDisplayed());
			Reporter.log("DO level user can see Questionnaires inside the folder: TEST FAIL",true);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			Reporter.log("DO level user can't see Questionnaires inside the folder: TEST PASS",true);
		}
	}
	
	public void verify_set_the_folder_permission_to_MODERATOR_folders(String option, String user) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		// Adding user to Folders
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		JavascriptLibrary.javascriptClickElement(driver, folder1);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDown);
		GenericLibrary.selectElementByVisibleText(AaronCopeDropDown, option);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, closeFoldereditPage);
		GenericLibrary.hoverWebelement(driver, JohnSmitAccount);
		JavascriptLibrary.javascriptClickElement(driver, myAccountLink);
		GenericLibrary.waitForElementVisibility(driver, LoginAsBtn);
		JavascriptLibrary.javascriptClickElement(driver, LoginAsBtn);
		driver.switchTo().frame(0);
		logInEmailTextBox.sendKeys(user);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDetails);
		JavascriptLibrary.javascriptClickElement(driver, AaronCopeDetails);
		GenericLibrary.waitForElementVisibility(driver, reLogInBtn);
		JavascriptLibrary.javascriptClickElement(driver, reLogInBtn);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frmVMIMain");
		GenericLibrary.waitForElementToBeClickable(driver, detailsLink);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		viosMenu.click();
		GenericLibrary.waitForElementVisibility(driver, Newiqapture);
		JavascriptLibrary.javascriptClickElement(driver, Newiqapture);
		GenericLibrary.waitForElementVisibility(driver, buildLink);
		JavascriptLibrary.javascriptClickElement(driver, buildLink);
		try {
			GenericLibrary.waitForElementVisibility(driver, AddBtn);
			Assert.assertTrue(AddBtn.isDisplayed());
			Reporter.log("Add Button Found & User can add datasets, Questionnaires inside the folder & can give permission to other user: TEST PASS",true);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			Reporter.log("Add Button Not Found & User cann't create datasets and cann't create new Questionnaires inside the folder: TEST FAIL",true);
		}
		
		try {
			Assert.assertTrue(TestQuestionnaire.isDisplayed());
			Reporter.log("Moderator can see Questionnaires inside the folder: TEST FAIL",true);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			Reporter.log("Moderator can't see Questionnaires inside the folder: TEST PASS",true);
		}
	}
		
	public void verify_set_DO_permission_to_subfolder(String option, String user) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		// Adding user to Folders
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		GenericLibrary.doubleClickWebelement(driver, folder1);
		GenericLibrary.waitForElementVisibility(driver, folder2);
		JavascriptLibrary.javascriptClickElement(driver, folder2);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, contactsText);
		JavascriptLibrary.javascriptClickElement(driver, contactsText);
		GenericLibrary.waitForElementVisibility(driver, AlexKnightAddBtn);
		JavascriptLibrary.javascriptClickElement(driver, AlexKnightAddBtn);
		GenericLibrary.waitForElementVisibility(driver, peopleAddedText);
		JavascriptLibrary.javascriptClickElement(driver, peopleAddedText);
		GenericLibrary.waitForElementVisibility(driver, AlexKnightDropDown);
		GenericLibrary.selectElementByVisibleText(AlexKnightDropDown, option);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, closeFoldereditPage);
		GenericLibrary.hoverWebelement(driver, JohnSmitAccount);
		JavascriptLibrary.javascriptClickElement(driver, myAccountLink);
		GenericLibrary.waitForElementVisibility(driver, LoginAsBtn);
		JavascriptLibrary.javascriptClickElement(driver, LoginAsBtn);
		driver.switchTo().frame(0);
		logInEmailTextBox.sendKeys(user);
		GenericLibrary.waitForElementVisibility(driver, AlexKnightDetails);
		JavascriptLibrary.javascriptClickElement(driver, AlexKnightDetails);
		GenericLibrary.waitForElementVisibility(driver, reLogInBtn);
		JavascriptLibrary.javascriptClickElement(driver, reLogInBtn);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		viosMenu.click();
		GenericLibrary.waitForElementVisibility(driver, Newiqapture);
		JavascriptLibrary.javascriptClickElement(driver, Newiqapture);
		GenericLibrary.waitForElementVisibility(driver, buildLink);
		JavascriptLibrary.javascriptClickElement(driver, buildLink);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		JavascriptLibrary.javascriptClickElement(driver, folder1);
		try {
			Assert.assertTrue(folder3.isDisplayed());
			Reporter.log("Co-folder at sub-folder is displaying with sub-folder permission as 'DO' : TEST FAIL",true);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			Reporter.log("Co-folder at sub-folder level is hidden: TEST PASS",true);
		}
		GenericLibrary.waitForElementVisibility(driver, folder2);
		JavascriptLibrary.javascriptClickElement(driver, folder2);
		try {
			GenericLibrary.waitForElementVisibility(driver, AddBtn);
			Assert.assertTrue(AddBtn.isDisplayed());
			Reporter.log("Add Button Found & User can add datasets, Questionnaires inside the folder & can give permission to other user: TEST PASS",true);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			Reporter.log("Add Button Not Found & User cann't create datasets and cann't create new Questionnaires inside the folder: TEST FAIL",true);
		}
		try {
			Assert.assertTrue(TestQuestionnaire.isDisplayed());
			Reporter.log("Moderator can see Questionnaires inside the folder: TEST FAIL",true);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			Reporter.log("Moderator can't see Questionnaires inside the folder: TEST PASS",true);
		}
	}
	
	public void set_main_folder_permission_to_VIEW_and_verify_the_same_applied_to_subfolders(String option) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		GenericLibrary.doubleClickWebelement(driver, folder1);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDown);
		GenericLibrary.selectElementByVisibleText(AaronCopeDropDown, option);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, closeFoldereditPage);
		GenericLibrary.waitForElementVisibility(driver, folder2);
		JavascriptLibrary.javascriptClickElement(driver, folder2);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDownLockSymbol);
		Assert.assertTrue(AaronCopeDropDownLockSymbol.isDisplayed(), "Mail folder settings not applied to sub-folders");
	}
	
	public void set_main_folder_permission_to_VIEW_and_verify_the_same_applied_to_newly_added_subfolders(String option, String F4Name, String F4Desc) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		GenericLibrary.doubleClickWebelement(driver, folder1);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDown);
		GenericLibrary.selectElementByVisibleText(AaronCopeDropDown, option);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, closeFoldereditPage);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		JavascriptLibrary.javascriptClickElement(driver, folder1);
		GenericLibrary.waitForElementVisibility(driver, AddFolderBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddFolderBtn);
		GenericLibrary.waitForElementVisibility(driver, folderName);
		JavascriptLibrary.javascriptType(driver, folderName, F4Name);
		JavascriptLibrary.javascriptType(driver, descTxt, F4Desc);
		JavascriptLibrary.javascriptClickElement(driver, folderSaveBtn);
		GenericLibrary.waitForElementVisibility(driver, folder4);
		JavascriptLibrary.javascriptClickElement(driver, folder4);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDownLockSymbol);
		Assert.assertTrue(AaronCopeDropDownLockSymbol.isDisplayed(), "Mail folder settings not applied to sub-folders");
	}
	
	public void verify_Set_different_permission_to_locked_folder_and_reset_the_permissions_to_older(String option) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		GenericLibrary.doubleClickWebelement(driver, folder1);
		GenericLibrary.waitForElementVisibility(driver, folder4);
		JavascriptLibrary.javascriptClickElement(driver, folder4);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDown);
		GenericLibrary.selectElementByVisibleText(AaronCopeDropDown, option);
		Thread.sleep(1000);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDownDeleteUserSymbol);
		Assert.assertTrue(AaronCopeDropDownDeleteUserSymbol.isDisplayed(), "New permissions not applied");
		Reporter.log("Delete user button is visible on changing the permissions to locked folder", true);
		JavascriptLibrary.javascriptClickElement(driver, AaronCopeDropDownDeleteUserSymbol);
		GenericLibrary.waitForElementVisibility(driver, YesBtn);
		JavascriptLibrary.javascriptClickElement(driver, YesBtn);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDownLockSymbol);
		Assert.assertTrue(AaronCopeDropDownLockSymbol.isDisplayed(), "Resetting perminsions Not Done");
	}
	
	public void verify_Set_mail_folder_permission_to_VIEW_and_Set_sub_folder_permission_to_DO(String option1, String option2, String user) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		GenericLibrary.doubleClickWebelement(driver, folder1);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDown);
		GenericLibrary.selectElementByVisibleText(AaronCopeDropDown, option1);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, closeFoldereditPage);
		GenericLibrary.waitForElementVisibility(driver, folder2);
		JavascriptLibrary.javascriptClickElement(driver, folder2);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDown);
		GenericLibrary.selectElementByVisibleText(AaronCopeDropDown, option2);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, closeFoldereditPage);
		GenericLibrary.hoverWebelement(driver, JohnSmitAccount);
		JavascriptLibrary.javascriptClickElement(driver, myAccountLink);
		GenericLibrary.waitForElementVisibility(driver, LoginAsBtn);
		JavascriptLibrary.javascriptClickElement(driver, LoginAsBtn);
		driver.switchTo().frame(0);
		logInEmailTextBox.sendKeys(user);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDetails);
		JavascriptLibrary.javascriptClickElement(driver, AaronCopeDetails);
		GenericLibrary.waitForElementVisibility(driver, reLogInBtn);
		JavascriptLibrary.javascriptClickElement(driver, reLogInBtn);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frmVMIMain");
		GenericLibrary.waitForElementToBeClickable(driver, detailsLink);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		viosMenu.click();
		GenericLibrary.waitForElementVisibility(driver, Newiqapture);
		JavascriptLibrary.javascriptClickElement(driver, Newiqapture);
		GenericLibrary.waitForElementVisibility(driver, buildLink);
		JavascriptLibrary.javascriptClickElement(driver, buildLink);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		JavascriptLibrary.javascriptClickElement(driver, folder1);
		try {
			Assert.assertTrue(folder2.isDisplayed());
			Reporter.log("Sub-folders are visible on settings Main folder to 'VIEW' and sub-folder to 'DO': TEST PASS",true);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			Reporter.log("Settings not reflceted and Sub-folders are not visible: TEST FAIL",true);
		}
		try {
			Assert.assertTrue(AddBtn.isDisplayed());
			Reporter.log("Add Button Found & User can add datasets inside the Main folder: TEST FAIL",true);
		} catch (java.lang.AssertionError e) {
			Reporter.log("User not allowed to craete datasets inside the main folder: TEST PASS",true);
		}
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folder2);
		Thread.sleep(1000);
		try {
			Assert.assertTrue(AddBtn.isDisplayed());
			Reporter.log("Add Button found & User can create datasets inside the sub-folder: TEST PASS",true);
		} catch (java.lang.AssertionError e) {
			Reporter.log("Add Button Not Found & User cann't create datasets inside the sub-folder: TEST FAIL",true);
		}
	}
	
	public void verify_Set_DENY_permission_to_folder(String F5Name, String F5Desc, String option, String user) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		GenericLibrary.doubleClickWebelement(driver, folder1);
		GenericLibrary.waitForElementVisibility(driver, AddFolderBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddFolderBtn);
		GenericLibrary.waitForElementVisibility(driver, folderName);
		JavascriptLibrary.javascriptType(driver, folderName, F5Name);
		JavascriptLibrary.javascriptType(driver, descTxt, F5Desc);
		JavascriptLibrary.javascriptClickElement(driver, folderSaveBtn);
		GenericLibrary.waitForElementVisibility(driver, folder5);
		JavascriptLibrary.javascriptClickElement(driver, folder5);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDropDown);
		GenericLibrary.selectElementByVisibleText(AaronCopeDropDown, option);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, closeFoldereditPage);
		GenericLibrary.hoverWebelement(driver, JohnSmitAccount);
		JavascriptLibrary.javascriptClickElement(driver, myAccountLink);
		GenericLibrary.waitForElementVisibility(driver, LoginAsBtn);
		JavascriptLibrary.javascriptClickElement(driver, LoginAsBtn);
		driver.switchTo().frame(0);
		logInEmailTextBox.sendKeys(user);
		GenericLibrary.waitForElementVisibility(driver, AaronCopeDetails);
		JavascriptLibrary.javascriptClickElement(driver, AaronCopeDetails);
		GenericLibrary.waitForElementVisibility(driver, reLogInBtn);
		JavascriptLibrary.javascriptClickElement(driver, reLogInBtn);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frmVMIMain");
		GenericLibrary.waitForElementToBeClickable(driver, detailsLink);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		viosMenu.click();
		GenericLibrary.waitForElementVisibility(driver, Newiqapture);
		JavascriptLibrary.javascriptClickElement(driver, Newiqapture);
		GenericLibrary.waitForElementVisibility(driver, buildLink);
		JavascriptLibrary.javascriptClickElement(driver, buildLink);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		JavascriptLibrary.javascriptClickElement(driver, folder1);
		try {
			Assert.assertTrue(folder5.isDisplayed());
			Reporter.log("Denyed folder found & Settings not reflected: TEST FAIL",true);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			Reporter.log("Denyed folder is Not found: TEST PASS",true);
		}
	}
	
	public void verify_Add_all_users_from_the_company_change_permissions_and_removing_users_from_company(String user, String option) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, folderBtn);
		JavascriptLibrary.javascriptClickElement(driver, folderBtn);
		GenericLibrary.waitForElementVisibility(driver, RightArrow);
		JavascriptLibrary.javascriptClickElement(driver, RightArrow);
		GenericLibrary.waitForElementVisibility(driver, folder1);
		GenericLibrary.doubleClickWebelement(driver, folder1);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, peopleSearchBox);
		peopleSearchBox.sendKeys(user);
		JavascriptLibrary.javascriptClickElement(driver, peopleSearchBtn);
		GenericLibrary.waitForElementVisibility(driver, ISROAddBtn);
		JavascriptLibrary.javascriptClickElement(driver, ISROAddBtn);
		GenericLibrary.waitForElementVisibility(driver, ISROpermissiondropDown);
		Assert.assertTrue(ISROpermissiondropDown.isDisplayed(), "Company Not Added");
		Reporter.log("Company with all users Added successfully", true);
		GenericLibrary.selectElementByVisibleText(ISROpermissiondropDown, option);
		Reporter.log("Permissions changed to all users in the company successfully", true);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, ISROdeleteBtn);
		GenericLibrary.waitForElementVisibility(driver, YesBtn);
		JavascriptLibrary.javascriptClickElement(driver, YesBtn);
		Reporter.log("Company deleted successfully", true);
	}
	
	
	
	
	
	
	
	










	public void verify_Create_Questionnaire_for_Analyse(String QuestionnaireName, String empPersonnelDetails,
			String empNo, String empName, String empAddress, String city1, String city2, String city3, String city4, String city5, String city6, String city7, String city8, 
			String empFee, String empfFee, String empFormFee, String empRegFee, String empPercentage, String ssc, String inter, String graduate, String masters, String education,
			String completedEducation, String ssc2, String inter2, String graduate2, String masters2, String empJoiningAndExitDate, String joiningDate, String exitDate, String reasonToExit,
			String companyEnvironment, String bad, String good, String veryGood, String excellent, String salaryIncrement, String siBad, String siBetter, String siDissatisfied, String siSatisfied,
			String overall, String ovBad, String ovBetter, String ovDissatisfied, String ovSatisfied, String dropDown, String q1, String q2, String checkBox, 
			String cbQ1, String cbq1Bad, String cbq1Disagree, String cbq1Dissatisfied, String cbq1Agree, String cbq1Satisfied, String cbq1Good, 
			String cbQ2, String cbq2Bad, String cbq2Disagree, String cbq2Dissatisfied, String cbq2Agree, String cbq2Satisfied, String cbq2Good) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		JavascriptLibrary.javascriptClickElement(driver, AddBtn);
		GenericLibrary.waitForElementVisibility(driver, nameTxtBox);
		JavascriptLibrary.javascriptType(driver, nameTxtBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Emp personnel details 
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, empPersonnelDetails);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, sectionBtn);
		Thread.sleep(1000);
		// Emp no.
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, empNo);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, integerOption);
		Thread.sleep(1000);
		// Emp name
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		GenericLibrary.waitForElementVisibility(driver, descriptionTextBox);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, empName);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, textOption);
		Thread.sleep(1000);
		// Emp address
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, empAddress);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		GenericLibrary.waitForElementVisibility(driver, plusSign);
		for(int i = 0 ; i < 8 ; i++) {
			JavascriptLibrary.javascriptClickElement(driver, plusSign);
			Thread.sleep(1000);
		}
		List<WebElement> ansTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Answer']"));
		ansTextBoxes.get(0).sendKeys(city1);
		Thread.sleep(1000);
		WebElement a1 = ansTextBoxes.get(1);
		GenericLibrary.scrollIntoView(driver, a1);
		a1.sendKeys(city2);
		Thread.sleep(1000);
		WebElement a2 = ansTextBoxes.get(2);
		GenericLibrary.scrollIntoView(driver, a2);
		a2.sendKeys(city3);
		Thread.sleep(1000);
		WebElement a3 = ansTextBoxes.get(3);
		GenericLibrary.scrollIntoView(driver, a3);
		a3.sendKeys(city4);
		Thread.sleep(1000);
		WebElement a4 = ansTextBoxes.get(4);
		GenericLibrary.scrollIntoView(driver, a4);
		a4.sendKeys(city5);
		Thread.sleep(1000);
		WebElement a5 = ansTextBoxes.get(5);
		GenericLibrary.scrollIntoView(driver, a5);
		a5.sendKeys(city6);
		Thread.sleep(1000);
		WebElement a6 = ansTextBoxes.get(6);
		GenericLibrary.scrollIntoView(driver, a6);
		a6.sendKeys(city7);
		Thread.sleep(1500);
		WebElement a7 = ansTextBoxes.get(7);
		GenericLibrary.scrollIntoView(driver, a7);
		a7.sendKeys(city8);
		a7.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		// Emp fee
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, empFee);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, sectionBtn);
		Thread.sleep(1000);
		// Emp fee
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, empfFee);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, floatOption);
		Thread.sleep(1000);
		// Emp form fee
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, empFormFee);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, currencyOption);
		Thread.sleep(1000);
		// Emp Registration fee
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, empRegFee);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, floatOption);
		Thread.sleep(1000);
		// Emp Percentage
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, empPercentage);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, sectionBtn);
		Thread.sleep(1000);
		// SSC
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, ssc);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, percentageOption);
		Thread.sleep(1000);
		// Intermediate
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, inter);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, percentageOption);
		Thread.sleep(1000);
		// Graduate
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, graduate);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, percentageOption);
		Thread.sleep(1000);
		// Masters
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, masters);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, numberBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, percentageOption);
		Thread.sleep(1000);
		// Education
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, education);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, sectionBtn);
		Thread.sleep(1000);
		// Completed Education
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, completedEducation);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		GenericLibrary.waitForElementVisibility(driver, plusSign);
		for(int i = 0 ; i < 4 ; i++) {
			JavascriptLibrary.javascriptClickElement(driver, plusSign);
			Thread.sleep(1000);
		}
		List<WebElement> eduAnsTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Answer']"));
		eduAnsTextBoxes.get(0).sendKeys(ssc2);
		Thread.sleep(1000);
		WebElement e1 = eduAnsTextBoxes.get(1);
		GenericLibrary.scrollIntoView(driver, e1);
		e1.sendKeys(inter2);
		Thread.sleep(1000);
		WebElement e2 = eduAnsTextBoxes.get(2);
		GenericLibrary.scrollIntoView(driver, e2);
		e2.sendKeys(graduate2);
		Thread.sleep(1000);
		WebElement e3 = eduAnsTextBoxes.get(3);
		GenericLibrary.scrollIntoView(driver, e3);
		e3.sendKeys(masters2);
		e3.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		// Emp Joining & Exit Date
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, empJoiningAndExitDate);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, sectionBtn);
		Thread.sleep(1000);
		// Joining Date
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, joiningDate);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, dateBtn);
		Thread.sleep(1000);
		// Exit Date
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, exitDate);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, dateBtn);
		Thread.sleep(1000);
		// Reason to Exit
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, reasonToExit);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, sectionBtn);
		Thread.sleep(1000);
		// Company Environment
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, companyEnvironment);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		GenericLibrary.waitForElementVisibility(driver, plusSign);
		for(int i = 0 ; i < 4 ; i++) {
			JavascriptLibrary.javascriptClickElement(driver, plusSign);
			Thread.sleep(1000);
		}
		List<WebElement> envAnsTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Answer']"));
		envAnsTextBoxes.get(0).sendKeys(bad);
		Thread.sleep(1000);
		WebElement env1 = envAnsTextBoxes.get(1);
		GenericLibrary.scrollIntoView(driver, env1);
		env1.sendKeys(good);
		Thread.sleep(1500);
		WebElement env2 = envAnsTextBoxes.get(2);
		GenericLibrary.scrollIntoView(driver, env2);
		env2.sendKeys(veryGood);
		Thread.sleep(1500);
		WebElement env3 = envAnsTextBoxes.get(3);
		GenericLibrary.scrollIntoView(driver, env3);
		env3.sendKeys(excellent);
		Thread.sleep(1000);
		// Salary Increment
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, salaryIncrement);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		GenericLibrary.waitForElementVisibility(driver, plusSign);
		for(int i = 0 ; i < 4 ; i++) {
			JavascriptLibrary.javascriptClickElement(driver, plusSign);
			Thread.sleep(1000);
		}
		List<WebElement> incAnsTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Answer']"));
		incAnsTextBoxes.get(0).sendKeys(siBad);
		Thread.sleep(1000);
		WebElement inc1 = incAnsTextBoxes.get(1);
		GenericLibrary.scrollIntoView(driver, inc1);
		inc1.sendKeys(siBetter);
		Thread.sleep(1000);
		WebElement inc2 = incAnsTextBoxes.get(2);
		GenericLibrary.scrollIntoView(driver, inc2);
		inc2.sendKeys(siDissatisfied);
		Thread.sleep(1000);
		WebElement inc3 = incAnsTextBoxes.get(3);
		GenericLibrary.scrollIntoView(driver, inc3);
		inc3.sendKeys(siSatisfied);
		Thread.sleep(1000);
		// Overall
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, overall);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		GenericLibrary.waitForElementVisibility(driver, plusSign);
		for(int i = 0 ; i < 4 ; i++) {
			JavascriptLibrary.javascriptClickElement(driver, plusSign);
			Thread.sleep(1000);
		}
		List<WebElement> ovlAnsTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Answer']"));
		ovlAnsTextBoxes.get(0).sendKeys(ovBad);
		Thread.sleep(1000);
		WebElement ovl1 = ovlAnsTextBoxes.get(1);
		GenericLibrary.scrollIntoView(driver, ovl1);
		ovl1.sendKeys(ovBetter);
		Thread.sleep(1000);
		WebElement ovl2 = ovlAnsTextBoxes.get(2);
		GenericLibrary.scrollIntoView(driver, ovl2);
		ovl2.sendKeys(ovDissatisfied);
		Thread.sleep(1000);
		WebElement ovl3 = ovlAnsTextBoxes.get(3);
		GenericLibrary.scrollIntoView(driver, ovl3);
		ovl3.sendKeys(ovSatisfied);
		Thread.sleep(1000);
		// Drop Down 
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, dropDown);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, sectionBtn);
		Thread.sleep(1000);
		// Q1
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDownOption);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowOption);
		Thread.sleep(1000);
		// Q2
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDown);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNAOption);
		Thread.sleep(1000);
		// CheckBox
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, checkBox);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, sectionBtn);
		Thread.sleep(1000);
		// Q1
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, cbQ1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxOption);
		GenericLibrary.waitForElementVisibility(driver, plusSign);
		for(int i = 0 ; i < 6 ; i++) {
			JavascriptLibrary.javascriptClickElement(driver, plusSign);
			Thread.sleep(1000);
		}
		List<WebElement> ckAnsTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Answer']"));
		ckAnsTextBoxes.get(0).sendKeys(cbq1Bad);
		Thread.sleep(1000);
		WebElement ck1 = ckAnsTextBoxes.get(1);
		GenericLibrary.scrollIntoView(driver, ck1);
		ck1.sendKeys(cbq1Disagree);
		Thread.sleep(1000);
		WebElement ck2 = ckAnsTextBoxes.get(2);
		GenericLibrary.scrollIntoView(driver, ck2);
		ck2.sendKeys(cbq1Dissatisfied);
		Thread.sleep(1000);
		WebElement ck3 = ckAnsTextBoxes.get(3);
		GenericLibrary.scrollIntoView(driver, ck3);
		ck3.sendKeys(cbq1Agree);
		Thread.sleep(1000);
		WebElement ck4 = ckAnsTextBoxes.get(4);
		GenericLibrary.scrollIntoView(driver, ck4);
		ck4.sendKeys(cbq1Satisfied);
		Thread.sleep(1000);
		WebElement ck5 = ckAnsTextBoxes.get(5);
		GenericLibrary.scrollIntoView(driver, ck5);
		ck5.sendKeys(cbq1Good);
		Thread.sleep(1000);
		// Q2
		GenericLibrary.waitForElementVisibility(driver, newItemBtn);
		JavascriptLibrary.javascriptClickElement(driver, newItemBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, cbQ2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceBtn);
		GenericLibrary.waitForElementVisibility(driver, plusSign);
		for(int i = 0 ; i < 6 ; i++) {
			JavascriptLibrary.javascriptClickElement(driver, plusSign);
			Thread.sleep(1000);
		}
		List<WebElement> qrAnsTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Answer']"));
		qrAnsTextBoxes.get(0).sendKeys(cbq2Bad);
		Thread.sleep(1000);
		WebElement qr1 = qrAnsTextBoxes.get(1);
		GenericLibrary.scrollIntoView(driver, qr1);
		qr1.sendKeys(cbq2Disagree);
		Thread.sleep(1000);
		WebElement qr2 = qrAnsTextBoxes.get(2);
		GenericLibrary.scrollIntoView(driver, qr2);
		qr2.sendKeys(cbq2Dissatisfied);
		Thread.sleep(1000);
		WebElement qr3 = qrAnsTextBoxes.get(3);
		GenericLibrary.scrollIntoView(driver, qr3);
		qr3.sendKeys(cbq2Agree);
		Thread.sleep(1000);
		WebElement qr4 = qrAnsTextBoxes.get(4);
		GenericLibrary.scrollIntoView(driver, qr4);
		qr4.sendKeys(cbq2Satisfied);
		Thread.sleep(1000);
		WebElement qr5 = qrAnsTextBoxes.get(5);
		GenericLibrary.scrollIntoView(driver, qr5);
		qr5.sendKeys(cbq2Good);
		Thread.sleep(1000);
	}




}















