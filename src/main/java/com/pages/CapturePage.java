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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.TestBase;
import com.util.GenericLibrary;
import com.util.JavascriptLibrary;

public class CapturePage extends TestBase {

	// Objects Repository(OR):........................................................................

	//Page Title Verification
	@FindBy(xpath="//a[text()='Capture']")
	WebElement captureText;

	// Navigating to Questionnaires
	@FindBy(xpath=".//*[@id='btnFolderBack']")
	WebElement folderBackBtn;

	@FindBy(xpath="//h3[text()='Demo1']")
	WebElement demo1Folder;

	@FindBy(xpath="//h3[text()='Demo2']")
	WebElement demo2Folder;

	@FindBy(xpath="//h3[text()='HR Maintenance']")
	WebElement findQuestionnaire;

	// Activity Question
	@FindBy(xpath=".//*[@id='txtSearch']")
	WebElement searchBox;

	@FindBy(css=".fa.fa-search")
	WebElement searchBtn;

	@FindBy(xpath="//h3[text()='Q/Activity']")
	WebElement activity_Q;

	@FindBy(xpath="//a[@title='Add Record']")
	WebElement addBtn;

	@FindBy(xpath=".//*[@class='f_icon_v2 f_icon-11']")
	WebElement activityIcon;

	@FindBy(xpath=".//*[@id='btnActDate']/span/span")
	WebElement targetDateBtn;

	@FindBy(xpath=".//*[@id='txtActDesc']")
	WebElement descriptionTextBox;

	@FindBy(xpath=".//*[@id='txtActComment']")
	WebElement commenTextBox;

	@FindBy(xpath=".//*[@id='btnSave']")
	WebElement saveBtn;

	//Advanced Questionnaire
	@FindBy(xpath="//h3[text()='Q/Advanced']")
	WebElement advanced_Q;

	@FindBy(xpath=".//*[text()='1.']//following::input[1]")
	WebElement tableQuestionTxtBox;

	@FindBy(xpath=".//*[text()='1.']//following::textarea[1]")
	WebElement tableComment;

	@FindBy(xpath=".//*[text()='1.']//following::textarea[2]")
	WebElement propertyComment;

	@FindBy(xpath=".//*[text()='1.']//following::input[2]")
	WebElement wizardQuestion1;

	@FindBy(xpath=".//*[text()='1.']//following::input[3]")
	WebElement wizardQuestion2;

	@FindBy(xpath="//textarea[@readonly='readonly']")
	WebElement wizardResult;

	//Date Questionnaire
	@FindBy(xpath="//h3[text()='Q/Date']")
	WebElement date_Q;

	@FindBy(css=".fa.fa-calendar")
	WebElement calenderBtn;

	@FindBy(css=".capture-answer-btn.capture-answer-add")
	WebElement addDateBtn;

	@FindBy(xpath=".//*[contains(text(),' Q/Date')]//following::textarea[1]")
	WebElement dateComment;

	// MultiChoice
	@FindBy(xpath="//span[contains(text(),' Q/MultiChoice')]//following::label[1]")
	WebElement multiChoiceRadio_yes;

	@FindBy(xpath="//span[contains(text(),'Q/MultiChoice')]//following::select")
	WebElement multiChoiceDropDown;

	@FindBy(xpath="//span[contains(text(),' Q/MultiChoice')]//following::span[17]")
	WebElement multiChoiceCheckBox;

	// MultiChoice Answer/Hint/Score
	@FindBy(xpath="//h3[@title='Q/MultiChoice/AnswerHintScore_Manually']")
	WebElement multichoiceAnswerHintScore_Q;

	@FindBy(xpath=".//*[@id='divDSName']/div[1]/span//following::label[1]")
	WebElement answer2Btn;

	// MultiChoice - Complete & Reopen
	@FindBy(xpath="//h3[@title='Q/MultiChoice']")
	WebElement multichoice_Q;

	@FindBy(xpath=".//*[@id='btnComplete']")
	WebElement completeBtn;

	@FindBy(xpath="//tr[1]/td[2]/span")
	WebElement latestRecord;

	@FindBy(xpath=".//*[@id='btnReopen']")
	WebElement reOpenBtn;

	// MultiChoice Comment 
	@FindBy(xpath="//h3[@title='Q/MultiChoice/Comment']")
	WebElement multiChoiceComment_Q;

	@FindBy(xpath=".//*[contains(text(),' Q/MultiChoice/Comment')]//following::textarea[1]")
	WebElement multiChoiceCommentTxtBox;

	// MultiChoice DropDown & CheckBox
	@FindBy(xpath="//h3[@title='Q/MultiChoice/DropDown&CheckBox']")
	WebElement multiChoiceDropDown_Q;

	@FindBy(xpath="//span[contains(text(),'Q/MultiChoice/DropDown&CheckBox')]//following::textarea[1]")
	WebElement dropDownCommentTxtBox;

	@FindBy(xpath="//span[contains(text(),'Q/MultiChoice/DropDown&CheckBox')]//following::textarea[2]")
	WebElement checkBoxCommentTxtBox;

	// MultiChoice - HML Score Value
	@FindBy(xpath="//h3[@title='Q/MultiChoice/HML-ScoreValue']")
	WebElement multiChoiceScore_Q;

	@FindBy(xpath="//label[contains(.,'High')]")
	WebElement hmlHighScoreBtn;

	// MultiChoice - Levels
	@FindBy(xpath="//h3[@title='Q/MultiChoice/Levels']")
	WebElement multiChoiceLevels_Q;

	// MultiChoice - YesNoNA
	@FindBy(xpath="//h3[@title='Q/MultiChoice/YesNoNA-Score']")
	WebElement multiChoiceYesNoNa_Q;

	@FindBy(css=".btn.btn-default.rd-label.rd-first.uppercase")
	WebElement yesOption;

	@FindBy(xpath=".//*[@id='fieldDesc186276']/div/div[2]")
	WebElement yesOptionResult;

	// Number Questionnaire
	@FindBy(xpath="//h3[@title='Q/Number']")
	WebElement number_Q;

	@FindBy(xpath="//input[@maxlength='9']")
	WebElement integerTxtBox;

	@FindBy(xpath="//input[@placeholder='Float']")
	WebElement floatTxtBox;

	@FindBy(xpath="//input[@placeholder='Percentage']")
	WebElement percentageTxtBox;

	@FindBy(xpath="//input[@placeholder='Currency']")
	WebElement currencyTxtBox;

	// Preview Questionnaire
	@FindBy(xpath="//h3[@title='Q/Preview']")
	WebElement preview_Q;

	@FindBy(xpath="//span[contains(text(),'Q/Preview')]//following::input[1]")
	WebElement previewAnsTxtBox;

	// Text - Comment
	@FindBy(xpath="//h3[@title='Q/Text/Comment']")
	WebElement textComent_Q;

	@FindBy(xpath="//span[contains(text(),' Q/Text/Comment')]//following::input[1]")
	WebElement txtCommentAnsTxtBox;

	@FindBy(xpath="")
	WebElement txtComment;

	// Text - Levels
	@FindBy(xpath="//h3[@title='Q/Text/Levels']")
	WebElement textLevels_Q;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Levels')]//following::input[1]")
	WebElement level1AnswerTxtBox;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Levels')]//following::input[2]")
	WebElement level2AnswerTxtBox;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Levels')]//following::textarea[1]")
	WebElement level2CommentTxtBox;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Levels')]//following::input[3]")
	WebElement level3AnswerTxBox;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Levels')]//following::textarea[2]")
	WebElement level3CommentTxtBox;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Levels')]//following::input[4]")
	WebElement level4AnswerTxtBox;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Levels')]//following::textarea[3]")
	WebElement level4CommentTxtBox;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Levels')]//following::input[5]")
	WebElement level5AnswerTxtBox;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Levels')]//following::textarea[4]")
	WebElement level5CommentTxtBox;

	// Text - Number Manual
	@FindBy(xpath="//h3[@title='Q/Text/Number-Manual']")
	WebElement textNumberManual_Q;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Number-Manual')]//following::input[1]")
	WebElement numberAnswerTxtBox;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Number-Manual')]//following::input[2]")
	WebElement numberAnswerTxtBox2;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Number-Manual')]//following::textarea[1]")
	WebElement numberCommentTxtBox;

	// Text - Number None
	@FindBy(xpath="//h3[@title='Q/Text/Number-None']")
	WebElement textNumberNone_Q;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Number-None')]//following::input[1]")
	WebElement textNumberAnswer1TxtBox;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Number-None')]//following::input[2]")
	WebElement textNumberAnswer2TxtBox;

	@FindBy(xpath="//span[contains(text(),'Q/Text/Number-None')]//following::textarea[1]")
	WebElement answer1CommentTxtBox;

	// File Upload Questionnaire
	@FindBy(xpath="//h3[@title='Q/UploadFile & Section']")
	WebElement fileUploadQuestionnaire_Q;

	@FindBy(xpath="//span[contains(text(),'1.')]//following::span[1]")
	WebElement fileUploadBtn;

	@FindBy(xpath=".//*[@id='fieldImgDropzone']")
	WebElement clickToUploadBtn;

	@FindBy(xpath=".//*[@id='a_camera']/span/span[2]")
	WebElement cameraBtn;

	@FindBy(xpath=".//*[@id='btnSnap']")
	WebElement captureBtn;

	// Settings Questionnaire
	@FindBy(xpath="//h3[text()='Q/Settings']")
	WebElement settings_Q;

	@FindBy(xpath="//label[@class='btn btn-default rd-label rd-first uppercase']")
	WebElement multiChoice_Q1_High;

	@FindBy(css="#btnPageBack")
	WebElement backBtn;

	@FindBy(xpath=".//*[@id='btnMore']/a")
	WebElement moreBtn;

	@FindBy(xpath=".//*[@id='deleteRecord']/a")
	WebElement deleteRecoredBtn;

	@FindBy(xpath="//h3[@title='Q/Settings 2']")
	WebElement settings2_Q;

	// Analyse Questionnaire 
	@FindBy(xpath="//h3[text()='Emp Analyse']")
	WebElement EmpAnalyse;

	@FindBy(xpath="//span[text()='2.']//following::input[1]")
	WebElement empNoTextBox;

	@FindBy(xpath="//span[text()='3.']//following::input[1]")
	WebElement empNameTextBox;

	@FindBy(xpath="//span[text()='4.']//following::label[4]")
	WebElement empAddress_Bangalore;

	@FindBy(xpath="//span[text()='6.']//following::input[1]")
	WebElement empFeeTextBox;

	@FindBy(xpath="//span[text()='7.']//following::input[1]")
	WebElement empFormFeeTextBox;

	@FindBy(xpath="//span[text()='8.']//following::input[1]")
	WebElement empRegistrationFeeTextBox;

	@FindBy(xpath="//span[text()='10.']//following::input[1]")
	WebElement sscMarks;

	@FindBy(xpath="//span[text()='11.']//following::input[1]")
	WebElement interMarks;

	@FindBy(xpath="//span[text()='12.']//following::input[1]")
	WebElement graduateMarks;

	@FindBy(xpath="//span[text()='13.']//following::input[1]")
	WebElement mastersMarks;

	@FindBy(xpath="//span[text()='15.']//following::label[2]")
	WebElement completedEducation_Graduate;

	@FindBy(xpath="//span[text()='17.']//following::span[2]")
	WebElement joiningDateBtn;

	@FindBy(xpath="//span[text()='18.']//following::span[2]")
	WebElement exitDateBtn;

	@FindBy(xpath="//span[text()='20.']//following::label[2]")
	WebElement companyEnvironment_VeryGood;

	@FindBy(xpath="//span[text()='21.']//following::label[1]")
	WebElement salaryIncrement_Satisfied;

	@FindBy(xpath="//span[text()='22.']//following::label[1]")
	WebElement overall_Satisfied;

	@FindBy(xpath="//span[text()='24.']//following::select[1]")
	WebElement dropDown_Q1;

	@FindBy(xpath="//span[text()='25.']//following::label[1]")
	WebElement dropDown_Q2_Yes;

	@FindBy(xpath="//span[text()='27.']//following::span[1]")
	WebElement checkBox_Q1_Good;

	@FindBy(xpath="//span[text()='27.']//following::span[2]")
	WebElement checkBox_Q1_Satisfied;

	@FindBy(xpath="//span[text()='28.']//following::label[2]")
	WebElement checkBox_Q2_Good;









	// Initializing the Page Objects:................................................................
	public CapturePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................
	public String verifyPageTitle() {
		return captureText.getText();
	}

	public void verify_Navigating_To_Questionnaires_Directory() throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, findQuestionnaire);
		String actual=findQuestionnaire.getText();
		String expected = "HR Maintenance";
		Assert.assertEquals(actual, expected, "Questionnaires Not Found");
		Reporter.log("Successfully Navigated To The Questionnaires Directory", true);
	}

	public void verify_Activity_Questionnaire(String Questionnaire, String description, String comment) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, Questionnaire);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, activity_Q);
		JavascriptLibrary.javascriptClickElement(driver, activity_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		GenericLibrary.waitForElementVisibility(driver, activityIcon);
		JavascriptLibrary.javascriptClickElement(driver, activityIcon);
		GenericLibrary.waitForElementVisibility(driver, targetDateBtn);
		JavascriptLibrary.javascriptClickElement(driver, targetDateBtn);
		List<WebElement> allDates = driver.findElements(By.xpath(".//*[@id='btnActDate']/div/ul/li[1]/div/div[1]/table/tbody/tr[2]/td"));
		for(WebElement ele:allDates){
			String date=ele.getText();
			if(date.equalsIgnoreCase("6")){
				ele.click();
				break;
			}
		}
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, description);
		JavascriptLibrary.javascriptType(driver, commenTextBox, comment);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_Advanced_Questionnaire(String Questionnaire, String Q1, String comment1, String comment2, String Q2, String Q3) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, Questionnaire);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, advanced_Q);
		JavascriptLibrary.javascriptClickElement(driver, advanced_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		GenericLibrary.waitForElementVisibility(driver, tableQuestionTxtBox);
		JavascriptLibrary.javascriptType(driver, tableQuestionTxtBox, Q1);
		JavascriptLibrary.javascriptType(driver, tableComment, comment1);
		JavascriptLibrary.javascriptType(driver, propertyComment, comment2);
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		JavascriptLibrary.javascriptType(driver, wizardQuestion1, Q2);
		JavascriptLibrary.javascriptType(driver, wizardQuestion2, Q3);
		wizardQuestion2.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Assert.assertEquals(wizardResult.getAttribute("value"), "Wizard Question 1Wizard Question 2", "Wizard Not Functional");
		((JavascriptExecutor)driver).executeScript("scroll(0, -400)");
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_Date_Questionnaire(String searchItem, String comment) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, date_Q);
		JavascriptLibrary.javascriptClickElement(driver, date_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		GenericLibrary.waitForElementVisibility(driver, saveBtn);

		List<WebElement> calenderBtn1 = driver.findElements(By.cssSelector(".fa.fa-calendar"));
		WebElement cal1 = calenderBtn1.get(0);
		JavascriptLibrary.javascriptClickElement(driver, cal1);
		Thread.sleep(1000);
		List<WebElement> allDates1 = driver.findElements(By.cssSelector(".day"));
		for(WebElement ele:allDates1){
			String date=ele.getText();
			if(date.equalsIgnoreCase("6")){
				ele.click();
				break;
			}
		}
		Thread.sleep(1000);

		JavascriptLibrary.javascriptClickElement(driver, addDateBtn);
		Thread.sleep(1000);
		List<WebElement> calenderBtn2 = driver.findElements(By.cssSelector(".fa.fa-calendar"));
		WebElement cal2 = calenderBtn2.get(2);
		JavascriptLibrary.javascriptClickElement(driver, cal2);
		Thread.sleep(1000);
		List<WebElement> allDates2 = driver.findElements(By.cssSelector(".day"));
		for(WebElement ele:allDates2){
			String date=ele.getText();
			if(date.equalsIgnoreCase("6")){
				ele.click();
				break;
			}
		}
		JavascriptLibrary.javascriptType(driver, dateComment, comment);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_MultiChoice_Questionnaire(String searchItem) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, multichoice_Q);
		JavascriptLibrary.javascriptClickElement(driver, multichoice_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceRadio_yes);
		Thread.sleep(1000);
		Select s = new Select(multiChoiceDropDown);
		s.selectByVisibleText("High");
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceCheckBox);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_MultiChoice_Answer_Hint_Score_Questionnaire(String searchItem) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, multichoiceAnswerHintScore_Q);
		JavascriptLibrary.javascriptClickElement(driver, multichoiceAnswerHintScore_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, answer2Btn);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_MultiChoice_Complete_Reopen_Questionnaire(String searchItem, String comment1, String comment2) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, multiChoiceComment_Q);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceComment_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, multiChoiceCommentTxtBox, comment1);
		JavascriptLibrary.javascriptClickElement(driver, completeBtn);
		Reporter.log("Questionnaire Completed Successfully",true);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, latestRecord);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, multiChoiceCommentTxtBox, comment2);
		JavascriptLibrary.javascriptClickElement(driver, reOpenBtn);
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		Reporter.log("Questionnaire Reopened Successfully",true);
	}


	public void verify_MultiChoice_Comment_Questionnaire(String searchItem, String comment) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, multiChoiceComment_Q);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceComment_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, multiChoiceCommentTxtBox, comment);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_MultiChoice_DropDown_And_CheckBox_Questionnaire(String searchItem, String comment1, String comment2) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, multiChoiceDropDown_Q);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceDropDown_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, dropDownCommentTxtBox, comment1);
		JavascriptLibrary.javascriptType(driver, checkBoxCommentTxtBox, comment2);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_MultiChoice_HML_score_Value_Questionnaire(String searchItem) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, multiChoiceScore_Q);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceScore_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, hmlHighScoreBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_MultiChoice_Levels_Questionnaire(String searchItem) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, multiChoiceLevels_Q);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceLevels_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		List<WebElement> levelsList = driver.findElements(By.cssSelector(".field_desc_txt"));
		for(WebElement ele:levelsList){
			String level=ele.getText();
			System.out.println(level);
		}
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_MultiChoice_YesNoNa_Questionnaire(String searchItem) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, multiChoiceYesNoNa_Q);
		JavascriptLibrary.javascriptClickElement(driver, multiChoiceYesNoNa_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, yesOption);
		Thread.sleep(500);
		Assert.assertEquals(yesOption.getText(), "YES", "YSNoNA is not Fuctional");
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_Number_Questionnaire(String searchItem, String value1, String value2, String value3, String value4) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, number_Q);
		JavascriptLibrary.javascriptClickElement(driver, number_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, integerTxtBox, value1);
		JavascriptLibrary.javascriptType(driver, floatTxtBox, value2);
		JavascriptLibrary.javascriptType(driver, percentageTxtBox, value3);
		JavascriptLibrary.javascriptType(driver, currencyTxtBox, value4);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_preview_Questionnaire(String searchItem, String text) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, preview_Q);
		JavascriptLibrary.javascriptClickElement(driver, preview_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, previewAnsTxtBox, text);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_Text_Comment_Questionnaire(String searchItem, String comment) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, textComent_Q);
		JavascriptLibrary.javascriptClickElement(driver, textComent_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, txtCommentAnsTxtBox, comment);
		//JavascriptLibrary.javascriptType(driver, txtComment, "New Text Comment");
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_Text_Levels_Questionnaire(String searchItem, String L1Answer, String L2Answer, 
			String L2Comment, String L3Answer, String L3Comment, String L4Answer, String L4Comment,
			String L5Answer, String L5Comment) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, textLevels_Q);
		JavascriptLibrary.javascriptClickElement(driver, textLevels_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, level1AnswerTxtBox, L1Answer);
		JavascriptLibrary.javascriptType(driver, level2AnswerTxtBox, L2Answer);
		JavascriptLibrary.javascriptType(driver, level2CommentTxtBox, L2Comment);
		JavascriptLibrary.javascriptType(driver, level3AnswerTxBox, L3Answer);
		JavascriptLibrary.javascriptType(driver, level3CommentTxtBox, L3Comment);
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		JavascriptLibrary.javascriptType(driver, level4AnswerTxtBox, L4Answer);
		JavascriptLibrary.javascriptType(driver, level4CommentTxtBox, L4Comment);
		JavascriptLibrary.javascriptType(driver, level5AnswerTxtBox, L5Answer);
		JavascriptLibrary.javascriptType(driver, level5CommentTxtBox, L5Comment);
		((JavascriptExecutor)driver).executeScript("scroll(0, -400)");
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_Text_Number_Manul_Questionnaire(String searchItem, String answer1, String answer2, String comment) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, textNumberManual_Q);
		JavascriptLibrary.javascriptClickElement(driver, textNumberManual_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, numberAnswerTxtBox, answer1);
		JavascriptLibrary.javascriptClickElement(driver, addDateBtn);
		JavascriptLibrary.javascriptType(driver, numberAnswerTxtBox2, answer2);
		JavascriptLibrary.javascriptType(driver, numberCommentTxtBox, comment);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_Text_Number_None_Questionnaire(String searchItem, String answer1, String answer2, String comment) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, textNumberNone_Q);
		JavascriptLibrary.javascriptClickElement(driver, textNumberNone_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, textNumberAnswer1TxtBox, answer1);
		JavascriptLibrary.javascriptClickElement(driver, addDateBtn);
		JavascriptLibrary.javascriptType(driver, textNumberAnswer2TxtBox, answer2);
		JavascriptLibrary.javascriptType(driver, answer1CommentTxtBox, comment);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_File_Upload_Questionnaire(String searchItem, String filePath) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, fileUploadQuestionnaire_Q);
		JavascriptLibrary.javascriptClickElement(driver, fileUploadQuestionnaire_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, fileUploadBtn);

		//Image 1 
		StringSelection sel = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		System.out.println("selection" +sel);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#fieldImgDropzone")).click();
		System.out.println("Browse button clicked");
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		//Image 2
		JavascriptLibrary.javascriptClickElement(driver, fileUploadBtn);
		StringSelection sel2 = new StringSelection("D:\\Value chain\\Images\\audit.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel2,null);
		System.out.println("selection" +sel2);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#fieldImgDropzone")).click();
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

		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(500);
	}

	public void verify_Settings_Score_Addition_Delete_Copy_Questionnaire(String searchItem) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, settings_Q);
		JavascriptLibrary.javascriptClickElement(driver, settings_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice_Q1_High);
		List<WebElement> mediumOptionsList = driver.findElements(By.cssSelector(".btn.btn-default.rd-label.rd-normal.uppercase"));
		WebElement ele = mediumOptionsList.get(1);
		ele.click();
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		// Copy Record
		List<WebElement> recordList = driver.findElements(By.cssSelector(".l-btn-icon.icon-blue-copy-round-32"));
		int recordsBeforeCopy = recordList.size();
		Reporter.log("Records Bofore Copy => "+recordsBeforeCopy,true);
		System.out.println(recordsBeforeCopy);
		recordList.get(0).click();
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		List<WebElement> recordList2 = driver.findElements(By.cssSelector(".l-btn-icon.icon-blue-copy-round-32"));
		int recordsAfterCopy = recordList2.size();
		Reporter.log("Records After Copy => "+recordsAfterCopy,true);
		if(recordsBeforeCopy!=recordsAfterCopy) {
			Reporter.log("Copy Functionality Is Working", true);
		}else {Reporter.log("Copy Functionality Is Not Working", true);}
		// Delete Record 
		Thread.sleep(1000);
		recordList2.get(0).click();
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, deleteRecoredBtn);
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}

	public void verify_Settings_Score_Multiply_StrikeOut_File_Upload_Questionnaire(String searchItem) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, demo1Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo1Folder);
		GenericLibrary.waitForElementVisibility(driver, demo2Folder);
		JavascriptLibrary.javascriptClickElement(driver, demo2Folder);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, settings2_Q);
		JavascriptLibrary.javascriptClickElement(driver, settings2_Q);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice_Q1_High);
		List<WebElement> mediumOptionsList = driver.findElements(By.cssSelector(".btn.btn-default.rd-label.rd-normal.uppercase"));
		WebElement ele = mediumOptionsList.get(1);
		ele.click();
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		// Multiply Scores
		List<WebElement> multipliedScoreList = driver.findElements(By.xpath("//span[@class='number-rebc-empty']"));
		String scoreResult = multipliedScoreList.get(0).getText();
		Reporter.log("Multiplied Scores for 100 and 75: "+scoreResult,true);
		Assert.assertEquals(scoreResult, "7500", "Scores Multiplication is Not Functional" );
		Reporter.log("Score Multiplications is Functional", true);
		// StrikeOut Record 
		List<WebElement> recordList = driver.findElements(By.xpath(".//*[@id='tbRecords']/tbody/tr/td[2]/span"));
		recordList.get(0).click();
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, deleteRecoredBtn);
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	
	
	public void verify_Questionnaire_for_Analyse(String searchItem, String empNo, String empName, String cityNo,
			String empFee, String empFormFee, String empRegFee, String sscM, String interM, String graduateM, String mastersM, String qualification,
			String joiningYear, String joiningMonth, String joiningDate, String exitYear, String exitMonth, String exitDate, 
			String companyEnvironment, String salaryIncrement, String overAll, String select, String yeNoNa,
			String checkBox1, String checkBox2, String checkBoxQ2) throws Exception {
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, folderBackBtn);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, addBtn);
		JavascriptLibrary.javascriptClickElement(driver, addBtn);
		Thread.sleep(1000);

		GenericLibrary.waitForElementVisibility(driver, empNoTextBox);
		JavascriptLibrary.javascriptType(driver, empNoTextBox, empNo);
		JavascriptLibrary.javascriptType(driver, empNameTextBox, empName);
		WebElement city = driver.findElement(By.xpath("//span[text()='4.']//following::label["+cityNo+"]"));
		GenericLibrary.scrollIntoView(driver, city);
		JavascriptLibrary.javascriptClickElement(driver, city);
		GenericLibrary.scrollIntoView(driver, empFeeTextBox);
		JavascriptLibrary.javascriptType(driver, empFeeTextBox, empFee);
		GenericLibrary.scrollIntoView(driver, empFormFeeTextBox);
		JavascriptLibrary.javascriptType(driver, empFormFeeTextBox, empFormFee);
		GenericLibrary.scrollIntoView(driver, empRegistrationFeeTextBox);
		JavascriptLibrary.javascriptType(driver, empRegistrationFeeTextBox, empRegFee);
		GenericLibrary.scrollIntoView(driver, sscMarks);
		JavascriptLibrary.javascriptType(driver, sscMarks, sscM);
		GenericLibrary.scrollIntoView(driver, interMarks);
		JavascriptLibrary.javascriptType(driver, interMarks, interM);
		GenericLibrary.scrollIntoView(driver, graduateMarks);
		JavascriptLibrary.javascriptType(driver, graduateMarks, graduateM);
		GenericLibrary.scrollIntoView(driver, mastersMarks);
		JavascriptLibrary.javascriptType(driver, mastersMarks, mastersM);
		WebElement education = driver.findElement(By.xpath("//span[text()='15.']//following::label["+qualification+"]"));
		GenericLibrary.scrollIntoView(driver, education);
		JavascriptLibrary.javascriptClickElement(driver, education);
		GenericLibrary.scrollIntoView(driver, joiningDateBtn);
		Thread.sleep(600);
		JavascriptLibrary.javascriptClickElement(driver, joiningDateBtn);
		Thread.sleep(600);
		driver.findElement(By.xpath("//th[@title='Select Month']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//th[@title='Select Year']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[contains(.,'"+joiningYear.substring(0,joiningYear.length()-2)+"')]")).click();   // str.substring(0, str.length() - 2);
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[contains(.,'"+joiningMonth+"')]")).click();
		Thread.sleep(600);
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.equalsIgnoreCase(joiningDate.substring(0,joiningDate.length()-2))) {
				ele.click();
				break;
			}
		}
		GenericLibrary.scrollIntoView(driver, exitDateBtn);
		Thread.sleep(600);
		JavascriptLibrary.javascriptClickElement(driver, exitDateBtn);
		Thread.sleep(600);
		driver.findElement(By.xpath("//th[@title='Select Month']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//th[@title='Select Year']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[contains(.,'"+exitYear.substring(0,exitYear.length()-2)+"')]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[contains(.,'"+exitMonth+"')]")).click();
		Thread.sleep(600);
		List<WebElement> dayList2 = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList2) {
			String text = ele.getText();
			if(text.equalsIgnoreCase(exitDate.substring(0,exitDate.length()-2))) {
				ele.click();
				break;
			}
		}
		WebElement compEnv = driver.findElement(By.xpath("//span[text()='20.']//following::label["+companyEnvironment+"]"));
		GenericLibrary.scrollIntoView(driver, compEnv);
		JavascriptLibrary.javascriptClickElement(driver, compEnv);
		WebElement salInc = driver.findElement(By.xpath("//span[text()='21.']//following::label["+salaryIncrement+"]"));
		GenericLibrary.scrollIntoView(driver, salInc);
		JavascriptLibrary.javascriptClickElement(driver, salInc);
		WebElement overall = driver.findElement(By.xpath("//span[text()='22.']//following::label["+overAll+"]"));
		GenericLibrary.scrollIntoView(driver, overall);
		JavascriptLibrary.javascriptClickElement(driver, overall);
		GenericLibrary.scrollIntoView(driver, dropDown_Q1);
		GenericLibrary.selectElementByVisibleText(dropDown_Q1, select);
		WebElement yna = driver.findElement(By.xpath("//span[text()='25.']//following::label["+yeNoNa+"]"));
		GenericLibrary.scrollIntoView(driver, yna);
		JavascriptLibrary.javascriptClickElement(driver, yna);
		WebElement cb1 = driver.findElement(By.xpath("//span[text()='27.']//following::span["+checkBox1+"]"));
		GenericLibrary.scrollIntoView(driver, cb1);
		JavascriptLibrary.javascriptClickElement(driver, cb1);
		WebElement cb2 = driver.findElement(By.xpath("//span[text()='27.']//following::span["+checkBox2+"]"));
		GenericLibrary.scrollIntoView(driver, cb2);
		JavascriptLibrary.javascriptClickElement(driver, cb2);
		WebElement cbq2 = driver.findElement(By.xpath("//span[text()='28.']//following::label["+checkBoxQ2+"]"));
		GenericLibrary.scrollIntoView(driver, cbq2);
		JavascriptLibrary.javascriptClickElement(driver, cbq2);
		((JavascriptExecutor)driver).executeScript("scroll(0, -1000)");
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Thread.sleep(1000);
	}

	
	
	
}
