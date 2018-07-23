package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.base.TestBase;
import com.util.GenericLibrary;
import com.util.JavascriptLibrary;

public class AnalysePage extends TestBase{
	// Objects Repository(OR):........................................................................
	// Page verification
	@FindBy(xpath=".//*[@id='searchAnalyses']")
	WebElement analysesSearchBox;

	// verify Questionnaire selection 
	@FindBy(xpath=".//*[@id='searchAnalyses']//preceding::span[1]")
	WebElement searchQuestionnaireBtn;

	@FindBy(xpath="//h3[text()='Emp Analyse']")
	WebElement EmpAnalyse;

	@FindBy(xpath=".//*[@id='analysesName']/span")
	WebElement selectedQuestionnaire;

	@FindBy(xpath=".//*[@id='CreateBtn']/a")
	WebElement createReportBtn;

	// Create report 
	@FindBy(xpath=".//*[@id='reportName']")
	WebElement reportNameTextBox;

	@FindBy(xpath=".//*[@id='backbtn']/a")
	WebElement backBtn;

	@FindBy(xpath="//a[@title='Save Report']")
	WebElement saveBtn;

	@FindBy(xpath=".//*[@id='searchReport']")
	WebElement searchReportTextBox;

	@FindBy(xpath=".//*[@id='searchReport']//preceding::span[1]")
	WebElement searchReportBtn;

	@FindBy(xpath="//a[text()='Test Report']")
	WebElement TestReport;

	// Copy Report
	@FindBy(xpath="//a[@title='Edit']")
	WebElement editBtn;

	@FindBy(xpath=".//*[@id='btnMore']/a")
	WebElement moreBtn;

	@FindBy(xpath=".//*[@id='btnMore']/ul/li/a")
	WebElement copyReportBtn;

	@FindBy(xpath="//a[text()='Test Report copy']")
	WebElement copiedReport;

	// Delete report
	@FindBy(xpath=".//*[@id='deleteBtn']/a")
	WebElement deleteBtn;

	// Swapping columns 
	@FindBy(xpath="//button[@type='button'][contains(text(),'Add all')]")
	WebElement addAllBtn;

	@FindBy(xpath="//button[text()='Yes']")
	WebElement yesBtn;

	@FindBy(xpath="//span[text()='Table Design']//following::span[1]")
	WebElement column1;

	@FindBy(xpath="//span[contains(text(),'Table Design')]//following::span[3]")
	WebElement column2;

	// Delete columns
	@FindBy(xpath="//span[text()='Table Design']//following::i[1]")
	WebElement deleteColumnBtn;

	// Add all and Remove all fields
	@FindBy(xpath="//button[text()='Remove all']")
	WebElement removeAllBtn;

	// Add selected fields to report
	@FindBy(xpath=".//*[@id='fieldDrop']")
	WebElement dropField;

	@FindBy(xpath="//span[contains(text(),'EMP No.')]")
	WebElement empNo;

	@FindBy(xpath="//span[contains(text(),'EMP Name')]")
	WebElement empName;

	@FindBy(xpath="//span[contains(text(),'EMP Address')]")
	WebElement empAddress;

	// Sorting fields
	@FindBy(xpath=".//*[@id='sortDrop']")
	WebElement sortDropField;

	@FindBy(xpath="//td[text()='EMP No.']//following::i[1]")
	WebElement descendingOrderBtn;

	@FindBy(xpath="//td[text()='EMP No.']//following::i[2]")
	WebElement closeSortingBtn;

	// Sort By Group
	@FindBy(xpath=".//*[@id='groupDrop']")
	WebElement sortByGroupField;

	@FindBy(xpath="//span[contains(text(),'Analyse')]")
	WebElement AnalyseLink;

	@FindBy(xpath="//a[text()='Table Design/Sort By Group']")
	WebElement sortByGroupReport;

	@FindBy(xpath="//th[text()='EMP Name']")
	WebElement groupByEmpName;

	// Field Total
	@FindBy(xpath="//span[contains(text(),'EMP - Form Fee')]")
	WebElement empFormFee;

	@FindBy(xpath=".//*[@id='totalDrop']")
	WebElement totalDropField;

	@FindBy(xpath="//a[text()='Table Design/Field Total']")
	WebElement fieldTotalReport;

	@FindBy(xpath="//a[text()='Table Design/Field Total']")
	WebElement fieldTotalText;

	@FindBy(xpath="//a[@title='Go to last page']")
	WebElement goToLastPageBtn;

	@FindBy(xpath="//tr[5]/td[5]")
	WebElement empFormFeeTotalField;
	
	// Download report in CSV and Excel formats
	@FindBy(xpath=".//*[@id='dropdownMenu' or @title='More']")
	WebElement moreDropDownBtn;
	
	@FindBy(xpath="//a[text()='Csv']")
	WebElement CSV;
	
	@FindBy(xpath="//a[text()='Excel']")
	WebElement Excel;

	// Filter Option 
	@FindBy(xpath="//a[text()='filter']")
	WebElement filterOption;

	@FindBy(xpath=".//*[@id='filterDrop']")
	WebElement filterDropField;

	@FindBy(xpath="//button[@title='Nothing selected']//following::select[1]")
	WebElement selectEmpAddress;

	@FindBy(xpath="//button[@title='N/A']//following::select[1]")
	WebElement empFormFeeTypeSelect;

	@FindBy(xpath="//*[text()='Start']//following::input[1]")
	WebElement empFormFeeStartTextBox;

	// Share Report
	@FindBy(xpath="//a[text()='share']")
	WebElement shareOption;

	@FindBy(xpath="//input[@id='sharefind']")
	WebElement shareSearchBox;

	@FindBy(xpath="//strong[text()='ISRO']//following::button[1]")
	WebElement ISROaddBtn;

	@FindBy(xpath="//*[text()='User']//following::button[1]")
	WebElement userAddBtn;
	
	// SummaryChart Design
	@FindBy(xpath=".//*[@id='chartType1']")
	WebElement summaryDesign;

	// BarChart Design
	@FindBy(xpath=".//*[@id='chartType2']")
	WebElement barChartDesign;

	@FindBy(xpath="//span[text()='Masters']")
	WebElement masters;

	@FindBy(xpath=".//*[@id='yd']")
	WebElement yAxis;

	@FindBy(xpath=".//*[@id='xd']")
	WebElement xAxis;

	@FindBy(id="xColumn")
	WebElement xColumns;

	@FindBy(xpath=".//*[@id='liX2d']/a")
	WebElement x2;

	@FindBy(xpath=".//*[@id='x2d']")
	WebElement x2Axis;

	@FindBy(xpath=".//*[@id='target']")
	WebElement targetTextBox;

	@FindBy(xpath="//label[text()='Label']//following::span[3]")
	WebElement labelOFF;

	@FindBy(xpath="//label[text()='Report Total']//following::span[3]")
	WebElement reportTotalOFF;

	@FindBy(xpath="//label[text()='Column Total']//following::span[3]")
	WebElement columnTotalOFF;

	@FindBy(id="formattingType")
	WebElement FormatingType;

	@FindBy(id="formattingField")
	WebElement formatingField;

	@FindBy(xpath="//span[text()='Formatting']//following::a[@title='Add Condition'][1]")
	WebElement addCondtionBtn;

	@FindBy(xpath="//span[text()='Formatting']//following::a[@title='Add Condition'][1]//following::input[1]")
	WebElement colorField;

	@FindBy(id="layoutType")
	WebElement layoutType;

	@FindBy(id="layoutField")
	WebElement layoutField;

	@FindBy(xpath="//span[text()='Layout']//following::a[5]")
	WebElement addLayoutCondition;

	@FindBy(xpath="//span[text()='Layout']//following::i[1]")
	WebElement negativeValueGraphBtn;

	@FindBy(xpath="//span[text()='Layout']//following::select[contains(@id,'layoutItem')][1]")
	WebElement layoutSelect;

	// LineChart Design 
	@FindBy(xpath=".//*[@id='chartType3']")
	WebElement lineChartDesign;

	@FindBy(xpath=".//*[@id='newY']/a")
	WebElement y2;

	@FindBy(xpath=".//*[@id='newyd']")
	WebElement y2Axis;

	@FindBy(xpath="//span[text()='Layout']//following::a[4]")
	WebElement addLineLayoutCondition;

	// PieChart Design
	@FindBy(xpath=".//*[@id='chartType4']")
	WebElement pieChartDesign;

	// ScatterChart Design
	@FindBy(xpath=".//*[@id='chartType5']")
	WebElement scatterChartDesign;

	@FindBy(xpath=".//*[@id='newyd']")
	WebElement scatter_yAxis;
	
	@FindBy(xpath=".//*[@id='yd']")
	WebElement scatter_xAxis;

	// WaterFallChart Design
	@FindBy(xpath=".//*[@id='chartType6']")
	WebElement waterFallChartDesign;
	
	// BoxPlotChart Design
	@FindBy(xpath=".//*[@id='chartType8']")
	WebElement boxPlotChartDesign;
	
	// RoseChart Design
	@FindBy(xpath=".//*[@id='chartType9']")
	WebElement roseChartDesign;
	
	// SpiderChart Design
	@FindBy(xpath=".//*[@id='chartType10']")
	WebElement spiderChartDesign;
	
	// BubbleChart Design
	@FindBy(xpath=".//*[@id='chartType11']")
	WebElement bubbleChartDesign;
	
	// Publish Report
	@FindBy(xpath="//button[@title='Publish']")
	WebElement publishReportOption;
	
	@FindBy(xpath="//div[contains(text(),'EMP No.')]")
	WebElement copiedEmpNoField;
	
	@FindBy(xpath="//div[contains(text(),'EMP Name')]")
	WebElement copiedEmpNameField;
	
	@FindBy(xpath="//div[contains(text(),'EMP Address')]")
	WebElement copiedEmpAddressField;
	
	@FindBy(xpath=".//*[@id='dropz']")
	WebElement reportDropZone;
	
	@FindBy(xpath="//a[text()='Publish Report.xlsx']")
	WebElement uploadedPublishReport;
	
	// View and Download published report
	@FindBy(xpath="//a[text()='Publish Report']")
	WebElement PublishReport;
	
	@FindBy(xpath="//div[text()='Record']//following::span[2]")
	WebElement publishReport_record_1;
	
	@FindBy(xpath="//div[text()='Please Upload Template File']")
	WebElement pleaseUploadTemplateErrorMsg;
	
	@FindBy(xpath="//a[text()='Publish Report without template']")
	WebElement PublishReportWithoutTemplate;
	
	@FindBy(xpath="//a[text()='Publish Report without tags in temp']")
	WebElement PublishReportWithoutTagsInTemp;
	
	@FindBy(xpath="//body[text()='Field description tag is not found in the template.']")
	WebElement fieldDescriptionTagsMissingErrorMsg;
	
	
	
	
	


	// Initializing the Page Objects:................................................................
	public AnalysePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................

	public void verify_AnalysePage() {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		Assert.assertTrue(analysesSearchBox.isDisplayed(), "Unable to Navigate Analyse Page");
	}

	public void verify_Questionnaire_selection(String QuestionnaireName) {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, selectedQuestionnaire);
		Assert.assertTrue(selectedQuestionnaire.isDisplayed(),"Questionnaire Selected Successfully");
		Reporter.log("Questionnaire selected successfully",true);
		Assert.assertTrue(createReportBtn.isDisplayed(), "Create report button is not displaying");
		Reporter.log("Create report button is displayed",true);
	}

	public void verify_Create_report(String QuestionnaireName, String reportName, String createdReportName) {
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, selectedQuestionnaire);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, searchReportTextBox);
		JavascriptLibrary.javascriptType(driver, searchReportTextBox, createdReportName);
		JavascriptLibrary.javascriptClickElement(driver, searchReportBtn);
		GenericLibrary.waitForElementVisibility(driver, TestReport);
		Assert.assertTrue(TestReport.isDisplayed(), "Report Not Created");
	}

	public void verify_Copy_report(String createdReportName, String copiedReportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		GenericLibrary.waitForElementVisibility(driver, searchReportTextBox);
		JavascriptLibrary.javascriptType(driver, searchReportTextBox, createdReportName);
		searchReportTextBox.sendKeys(Keys.ENTER);
		JavascriptLibrary.javascriptClickElement(driver, searchReportBtn);
		GenericLibrary.waitForElementVisibility(driver, TestReport);
		JavascriptLibrary.javascriptClickElement(driver, TestReport);
		GenericLibrary.waitForElementVisibility(driver, editBtn);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		GenericLibrary.waitForElementVisibility(driver, copyReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, copyReportBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		searchReportTextBox.sendKeys(copiedReportName);
		searchReportTextBox.sendKeys(Keys.ENTER);
		GenericLibrary.waitForElementVisibility(driver, copiedReport);
		Assert.assertTrue(copiedReport.isDisplayed(), "Report Not copied");
	}

	public void verify_Delete_report(String createdReportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchReportTextBox);
		JavascriptLibrary.javascriptType(driver, searchReportTextBox, createdReportName);
		JavascriptLibrary.javascriptClickElement(driver, searchReportBtn);
		GenericLibrary.waitForElementVisibility(driver, TestReport);
		JavascriptLibrary.javascriptClickElement(driver, TestReport);
		GenericLibrary.waitForElementVisibility(driver, editBtn);
		JavascriptLibrary.javascriptClickElement(driver, editBtn);
		GenericLibrary.waitForElementVisibility(driver, deleteBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteBtn);
		GenericLibrary.waitForAlertPresent(driver);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}

	public void verify_Swaping_columns(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addAllBtn);
		GenericLibrary.waitForElementVisibility(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Thread.sleep(3000);
		Reporter.log("Before swaping column 1 is: "+column1.getText(),true);
		Reporter.log("Before swaping column 2 is: "+column2.getText(),true);
		GenericLibrary.dragAndDrop(driver, column1, column2);
		Thread.sleep(3000);
		Reporter.log("After swaping column 1 is: "+column1.getText(),true);
		Reporter.log("After swaping column 2 is: "+column2.getText(),true);
	}

	public void verify_Delete_columns(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addAllBtn);
		GenericLibrary.waitForElementVisibility(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Thread.sleep(3000);
		GenericLibrary.waitForElementToBeClickable(driver, column1);
		JavascriptLibrary.javascriptClickElement(driver, column1);
		GenericLibrary.waitForElementToBeClickable(driver, deleteColumnBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteColumnBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
	}

	public void verify_Add_all_columns_Remove_all_columns(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addAllBtn);
		GenericLibrary.waitForElementVisibility(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Thread.sleep(3000);
		Assert.assertTrue(column1.isDisplayed(), "Columns not added");
		Reporter.log("All columns added successfully",true);
		GenericLibrary.waitForElementToBeClickable(driver, removeAllBtn);
		JavascriptLibrary.javascriptClickElement(driver, removeAllBtn);
		GenericLibrary.waitForElementVisibility(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Reporter.log("All columns removed successfully",true);
	}

	public void verify_Adding_selected_fileds_to_report(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(1000);
		GenericLibrary.dragAndDrop(driver, empNo, dropField);
		Thread.sleep(2000);
		GenericLibrary.dragAndDrop(driver, empName, dropField);
		Thread.sleep(2000);
		GenericLibrary.dragAndDrop(driver, empAddress, dropField);
		Thread.sleep(2000);
		Assert.assertTrue(column1.isDisplayed(), "Columns Not Added");
	}

	public void verify_Drop_sort_field_Ascending_and_Descending_Order(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addAllBtn);
		GenericLibrary.waitForElementVisibility(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String num = list.get(i).getText();
			Reporter.log("Emp Number Before Sorting "+i+":" +num ,true);
		}
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		GenericLibrary.dragAndDrop(driver, empNo, sortDropField);
		Thread.sleep(3000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[1]"));
		int count2 = list2.size();
		for (int i = 0; i < count2; i++) {
			String num = list2.get(i).getText();
			Reporter.log("Ascending Order - Emp Number "+i+":" +num ,true);
		}
		JavascriptLibrary.javascriptClickElement(driver, descendingOrderBtn);
		Thread.sleep(3000);
		List<WebElement> list3 = driver.findElements(By.xpath("//tr/td[1]"));
		int count3 = list3.size();
		for (int i = 0; i < count3; i++) {
			String num = list3.get(i).getText();
			Reporter.log("Descending Order - Emp Number "+i+":" +num ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, closeSortingBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeSortingBtn);
	}

	public void verify_Sort_by_Group_report(String QuestionnaireName, String reportName, String createdReportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addAllBtn);
		GenericLibrary.waitForElementVisibility(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		GenericLibrary.dragAndDrop(driver, empName, sortByGroupField);
		Thread.sleep(3000);
		JavascriptLibrary.javascriptClickElement(driver, AnalyseLink);
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		searchReportTextBox.sendKeys(createdReportName);
		searchReportTextBox.sendKeys(Keys.ENTER);
		GenericLibrary.waitForElementVisibility(driver, sortByGroupReport);
		JavascriptLibrary.javascriptClickElement(driver, sortByGroupReport);
		GenericLibrary.waitForElementVisibility(driver, groupByEmpName);
		Assert.assertTrue(groupByEmpName.isDisplayed(), "Sort By Group is Not Functional");
	}

	public void verify_Total_of_the_selected_field_report(String QuestionnaireName, String reportName, String createdReportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addAllBtn);
		GenericLibrary.waitForElementVisibility(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		GenericLibrary.dragAndDrop(driver, empFormFee, totalDropField);
		Thread.sleep(3000);
		JavascriptLibrary.javascriptClickElement(driver, AnalyseLink);
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		searchReportTextBox.sendKeys(createdReportName);
		searchReportTextBox.sendKeys(Keys.ENTER);
		GenericLibrary.waitForElementVisibility(driver, fieldTotalReport);
		JavascriptLibrary.javascriptClickElement(driver, fieldTotalReport);
		GenericLibrary.waitForElementVisibility(driver, fieldTotalText);
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, goToLastPageBtn);
		Thread.sleep(1000);
		Reporter.log("Total of 'Emp - Form Fee'field is: "+empFormFeeTotalField.getText(),true);
	}
	
	public void verify_Download_report_in_CSV_and_Excel_formats(String QuestionnaireName, String createdReportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		searchReportTextBox.sendKeys(createdReportName);
		searchReportTextBox.sendKeys(Keys.ENTER);
		GenericLibrary.waitForElementVisibility(driver, fieldTotalReport);
		JavascriptLibrary.javascriptClickElement(driver, fieldTotalReport);
		GenericLibrary.waitForElementVisibility(driver, moreDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, moreDropDownBtn);
		GenericLibrary.waitForElementVisibility(driver, CSV);
		GenericLibrary.downoadFile(CSV);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreDropDownBtn);
		GenericLibrary.waitForElementVisibility(driver, Excel);
		GenericLibrary.downoadFile(Excel);
		Thread.sleep(2000);
	}

	public void verify_Filter_Option(String QuestionnaireName, String reportName,String type, String startRange) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addAllBtn);
		GenericLibrary.waitForElementVisibility(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Thread.sleep(3000);
		// EMP Address - Before
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[3]"));
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String address = list.get(i).getText();
			Reporter.log("Emp address Before Filter Action "+i+":" +address ,true);
		}
		// EMP Form Fee - Before
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[5]"));
		int count2 = list.size();
		for (int i = 0; i < count2; i++) {
			String ff = list2.get(i).getText();
			Reporter.log("Emp form fee Before Filter Action "+i+":" +ff ,true);
		}
		// EMP Address - After
		GenericLibrary.waitForElementToBeClickable(driver, filterOption);
		JavascriptLibrary.javascriptClickElement(driver, filterOption);
		GenericLibrary.waitForElementVisibility(driver, filterDropField);
		GenericLibrary.dragAndDrop(driver, empAddress, filterDropField);
		GenericLibrary.selectElementByVisibleText(selectEmpAddress, "Goa");
		Thread.sleep(2000);
		List<WebElement> list3 = driver.findElements(By.xpath("//tr/td[3]"));
		int count3 = list3.size();
		for (int i = 20; i < count3; i++) {
			String address = list3.get(i).getText();
			Reporter.log("Emp address After Filter Action(GOA) "+i+":" +address ,true);
		}
		// EMP Form Fee - After
		GenericLibrary.dragAndDrop(driver, empFormFee, filterDropField);
		GenericLibrary.selectElementByVisibleText(empFormFeeTypeSelect, type);
		empFormFeeStartTextBox.sendKeys(startRange);
		empFormFeeStartTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		List<WebElement> list4 = driver.findElements(By.xpath("//tr/td[5]"));
		int count4 = list4.size();
		for (int i = 0; i < count4; i++) {
			String ff = list4.get(i).getText();
			Reporter.log("Emp form fee After Filter Action(>=200) "+i+":" +ff ,true);
		}
	}

	public void verify_Share_Report_option(String QuestionnaireName, String reportName,
			String companyName, String user1, String user2) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addAllBtn);
		GenericLibrary.waitForElementVisibility(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Thread.sleep(3000);
		GenericLibrary.waitForElementToBeClickable(driver, shareOption);
		JavascriptLibrary.javascriptClickElement(driver, shareOption);
		shareSearchBox.sendKeys(companyName);
		GenericLibrary.waitForElementVisibility(driver, ISROaddBtn);
		JavascriptLibrary.javascriptClickElement(driver, ISROaddBtn);
		Thread.sleep(1000);
		shareSearchBox.clear();
		shareSearchBox.sendKeys(user1);
		GenericLibrary.waitForElementVisibility(driver, userAddBtn);
		JavascriptLibrary.javascriptClickElement(driver, userAddBtn);
		Thread.sleep(1000);
		shareSearchBox.clear();
		shareSearchBox.sendKeys(user2);
		GenericLibrary.waitForElementVisibility(driver, userAddBtn);
		JavascriptLibrary.javascriptClickElement(driver, userAddBtn);
	}

	public void verify_Summary_Design_Report(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, summaryDesign);
		JavascriptLibrary.javascriptClickElement(driver, summaryDesign);
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		GenericLibrary.dragAndDrop(driver, empFormFee, xAxis);
		GenericLibrary.waitForElementVisibility(driver, yAxis);
		GenericLibrary.dragAndDrop(driver, empAddress, yAxis);
		GenericLibrary.waitForElementVisibility(driver, x2Axis);
		GenericLibrary.dragAndDrop(driver, masters, x2Axis);
		Thread.sleep(2000);
	}

	public void verify_BarChart_Design_Report(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, barChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, barChartDesign);
		GenericLibrary.waitForElementVisibility(driver, yAxis);
		GenericLibrary.dragAndDrop(driver, empFormFee, yAxis);
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		GenericLibrary.dragAndDrop(driver, empAddress, xAxis);
		Thread.sleep(3000);
		GenericLibrary.selectElementByVisibleText(xColumns, "12");
		Thread.sleep(3000);
		x2.click();
		GenericLibrary.waitForElementVisibility(driver, x2Axis);
		GenericLibrary.dragAndDrop(driver, masters, x2Axis);
		Thread.sleep(2000);
		targetTextBox.sendKeys("1000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, columnTotalOFF);
		driver.navigate().refresh();
		GenericLibrary.selectElementByVisibleText(FormatingType, "Conditional");
		driver.navigate().refresh();
		GenericLibrary.selectElementByVisibleText(formatingField, "EMP Address");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
		GenericLibrary.selectElementByVisibleText(layoutType, "Custom");
		driver.navigate().refresh();
		GenericLibrary.selectElementByVisibleText(layoutField, "EMP Address");
		GenericLibrary.waitForElementToBeClickable(driver, addLayoutCondition);
		JavascriptLibrary.javascriptClickElement(driver, addLayoutCondition);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, negativeValueGraphBtn);
		Thread.sleep(3000);
		GenericLibrary.selectElementByVisibleText(layoutSelect, "Bangalore");
		Thread.sleep(2000);
	}

	public void verify_LineChart_Design_Report(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, lineChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, lineChartDesign);
		GenericLibrary.waitForElementVisibility(driver, yAxis);
		GenericLibrary.dragAndDrop(driver, empFormFee, yAxis);
		Thread.sleep(2000);
		y2.click();
		GenericLibrary.dragAndDrop(driver, masters, y2Axis);
		GenericLibrary.dragAndDrop(driver, empAddress, xAxis);
		Thread.sleep(2000);
		GenericLibrary.selectElementByVisibleText(xColumns, "12");
		Thread.sleep(2000);
		targetTextBox.sendKeys("1000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, columnTotalOFF);
		driver.navigate().refresh();
		GenericLibrary.selectElementByVisibleText(FormatingType, "Conditional");
		driver.navigate().refresh();
		GenericLibrary.selectElementByVisibleText(formatingField, "EMP Address");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
		GenericLibrary.selectElementByVisibleText(layoutType, "Custom");
		driver.navigate().refresh();
		GenericLibrary.selectElementByVisibleText(layoutField, "EMP Address");
		GenericLibrary.waitForElementToBeClickable(driver, addLayoutCondition);
		JavascriptLibrary.javascriptClickElement(driver, addLayoutCondition);
		driver.navigate().refresh();
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, negativeValueGraphBtn);
		Thread.sleep(3000);
		GenericLibrary.selectElementByVisibleText(layoutSelect, "Bangalore");
		Thread.sleep(2000);
	}

	public void verify_PieChart_Design_Report(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, pieChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, pieChartDesign);
		GenericLibrary.waitForElementVisibility(driver, yAxis);
		GenericLibrary.dragAndDrop(driver, empFormFee, yAxis);
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		GenericLibrary.dragAndDrop(driver, empAddress, xAxis);
		Thread.sleep(3000);
		GenericLibrary.selectElementByVisibleText(xColumns, "12");
		Thread.sleep(2000);
		x2.click();
		GenericLibrary.waitForElementVisibility(driver, x2Axis);
		GenericLibrary.dragAndDrop(driver, masters, x2Axis);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		GenericLibrary.selectElementByVisibleText(FormatingType, "Conditional");
		driver.navigate().refresh();
		GenericLibrary.selectElementByVisibleText(formatingField, "EMP Address");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
		Thread.sleep(2000);
	}

	public void verify_ScatterChart_Design_Report(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, scatterChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, scatterChartDesign);
		GenericLibrary.waitForElementVisibility(driver, scatter_yAxis);
		GenericLibrary.dragAndDrop(driver, empFormFee, scatter_yAxis);
		GenericLibrary.waitForElementVisibility(driver, scatter_xAxis);
		GenericLibrary.dragAndDrop(driver, empNo, scatter_xAxis);
		Thread.sleep(2000);
	}

	public void verify_WaterFallChart_Design_Report(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, waterFallChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, waterFallChartDesign);
		GenericLibrary.waitForElementVisibility(driver, yAxis);
		GenericLibrary.dragAndDrop(driver, empName, yAxis);
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		GenericLibrary.dragAndDrop(driver, empAddress, xAxis);
		Thread.sleep(3000);
		GenericLibrary.selectElementByVisibleText(xColumns, "12");
		GenericLibrary.waitForElementVisibility(driver, targetTextBox);
		targetTextBox.sendKeys("20");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		GenericLibrary.selectElementByVisibleText(FormatingType, "Conditional");
		driver.navigate().refresh();
		GenericLibrary.selectElementByVisibleText(formatingField, "EMP Address");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		WebElement ele = driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]"));
		GenericLibrary.waitForElementToBeClickable(driver, ele);
		ele.click();
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Bangalore']"));
		GenericLibrary.waitForElementToBeClickable(driver, ele1);
		ele1.click();
		Thread.sleep(2000);
	}

	public void verify_BoxPlotChart_Design_Report(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, boxPlotChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, boxPlotChartDesign);
		GenericLibrary.waitForElementVisibility(driver, yAxis);
		GenericLibrary.dragAndDrop(driver, empName, yAxis);
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		GenericLibrary.dragAndDrop(driver, empAddress, xAxis);
		Thread.sleep(3000);
		GenericLibrary.selectElementByVisibleText(xColumns, "12");
		GenericLibrary.waitForElementVisibility(driver, targetTextBox);
		targetTextBox.sendKeys("20");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		Thread.sleep(2000);
	}

	public void verify_RoseChart_Design_Report(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, roseChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, roseChartDesign);
		GenericLibrary.waitForElementVisibility(driver, yAxis);
		GenericLibrary.dragAndDrop(driver, empFormFee, yAxis);
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		GenericLibrary.dragAndDrop(driver, empAddress, xAxis);
		Thread.sleep(2000);
		x2.click();
		GenericLibrary.waitForElementVisibility(driver, x2Axis);
		GenericLibrary.dragAndDrop(driver, masters, x2Axis);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		Thread.sleep(2000);
	}

	public void verify_SpiderChart_Design_Report(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, spiderChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, spiderChartDesign);
		GenericLibrary.waitForElementVisibility(driver, yAxis);
		GenericLibrary.dragAndDrop(driver, empFormFee, yAxis);
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		GenericLibrary.dragAndDrop(driver, empAddress, xAxis);
		Thread.sleep(3000);
		GenericLibrary.selectElementByVisibleText(xColumns, "12");
		Thread.sleep(2000);
		x2.click();
		GenericLibrary.waitForElementVisibility(driver, x2Axis);
		GenericLibrary.dragAndDrop(driver, masters, x2Axis);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		Thread.sleep(2000);
	}
	
	public void verify_BubbleChart_Design_Report(String QuestionnaireName, String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, bubbleChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, bubbleChartDesign);
		GenericLibrary.waitForElementVisibility(driver, yAxis);
		GenericLibrary.dragAndDrop(driver, empFormFee, yAxis);
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		GenericLibrary.dragAndDrop(driver, empAddress, xAxis);
		GenericLibrary.waitForElementVisibility(driver, y2Axis);
		GenericLibrary.dragAndDrop(driver, masters, y2Axis);
		Thread.sleep(2000);
	}
	
	public void verify_Create_Publish_Report(String QuestionnaireName, String reportName, String filePath) throws Exception {
		SoftAssert a=new SoftAssert();
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, publishReportOption);
		JavascriptLibrary.javascriptClickElement(driver, publishReportOption);
		Thread.sleep(2000);
		GenericLibrary.waitForElementVisibility(driver, empNo);
		JavascriptLibrary.javascriptClickElement(driver, empNo);
		GenericLibrary.waitForElementVisibility(driver, copiedEmpNoField);
		a.assertTrue(copiedEmpNoField.isDisplayed(), "Field Not Copied to ClipBoard");
		Reporter.log("Emp No. Filed copied to ClipBoard successfully", true);
		JavascriptLibrary.javascriptClickElement(driver, empName);
		GenericLibrary.waitForElementVisibility(driver, copiedEmpNameField);
		a.assertTrue(copiedEmpNameField.isDisplayed(), "Field Not Copied to ClipBoard");
		Reporter.log("Emp Name Filed copied to ClipBoard successfully", true);
		JavascriptLibrary.javascriptClickElement(driver, empAddress);
		GenericLibrary.waitForElementVisibility(driver, copiedEmpAddressField);
		a.assertTrue(copiedEmpAddressField.isDisplayed(), "Field Not Copied to ClipBoard");
		Reporter.log("Emp Address Filed copied to ClipBoard successfully", true);
		GenericLibrary.uploadFile(reportDropZone, filePath);
		GenericLibrary.waitForElementVisibility(driver, uploadedPublishReport);
		a.assertTrue(uploadedPublishReport.isDisplayed(), "Uploaded file Not Found");
		Reporter.log("Report uploaded successfully", true);
		a.assertAll();
	}
	
	public void verify_View_and_Download_published_report(String QuestionnaireName, String createdReportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, searchReportTextBox);
		searchReportTextBox.sendKeys(createdReportName);
		searchReportTextBox.sendKeys(Keys.ENTER);
		GenericLibrary.waitForElementVisibility(driver, PublishReport);
		JavascriptLibrary.javascriptClickElement(driver, PublishReport);
		GenericLibrary.waitForElementVisibility(driver, publishReport_record_1);
		Reporter.log("All records are visible", true);
		JavascriptLibrary.javascriptClickElement(driver, publishReport_record_1);
		Reporter.log("Record downloaded successfully", true);
		Thread.sleep(2000);
	}
	
	public void verify_View_published_report_without_template(String QuestionnaireName, String reportName, String createdReportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, publishReportOption);
		JavascriptLibrary.javascriptClickElement(driver, publishReportOption);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, searchReportTextBox);
		searchReportTextBox.sendKeys(createdReportName);
		searchReportTextBox.sendKeys(Keys.ENTER);
		GenericLibrary.waitForElementVisibility(driver, PublishReportWithoutTemplate);
		JavascriptLibrary.javascriptClickElement(driver, PublishReportWithoutTemplate);
		GenericLibrary.waitForElementVisibility(driver, publishReport_record_1);
		JavascriptLibrary.javascriptClickElement(driver, publishReport_record_1);
		Assert.assertTrue(pleaseUploadTemplateErrorMsg.isDisplayed(), "Error message not displayed");
		Reporter.log("Please upload template error message is displayed successfully", true);
	}
	
	
	public void verify_Upload_report_without_tags_and_view_the_publish_report_and_verify_error_msg
	(String QuestionnaireName, String reportName, String filePath, String createdReportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, reportNameTextBox);
		JavascriptLibrary.javascriptType(driver, reportNameTextBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver,  saveBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, publishReportOption);
		JavascriptLibrary.javascriptClickElement(driver, publishReportOption);
		Thread.sleep(2000);
		GenericLibrary.uploadFile(reportDropZone, filePath);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, analysesSearchBox);
		JavascriptLibrary.javascriptType(driver, analysesSearchBox, QuestionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, searchQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, EmpAnalyse);
		JavascriptLibrary.javascriptClickElement(driver, EmpAnalyse);
		GenericLibrary.waitForElementVisibility(driver, createReportBtn);
		GenericLibrary.waitForElementVisibility(driver, searchReportTextBox);
		searchReportTextBox.sendKeys(createdReportName);
		searchReportTextBox.sendKeys(Keys.ENTER);
		GenericLibrary.waitForElementVisibility(driver, PublishReportWithoutTagsInTemp);
		JavascriptLibrary.javascriptClickElement(driver, PublishReportWithoutTagsInTemp);
		GenericLibrary.waitForElementVisibility(driver, publishReport_record_1);
		JavascriptLibrary.javascriptClickElement(driver, publishReport_record_1);
		
		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(browserTabs .get(1));
		
		GenericLibrary.waitForElementVisibility(driver, fieldDescriptionTagsMissingErrorMsg);
		Assert.assertTrue(fieldDescriptionTagsMissingErrorMsg.isDisplayed(), "Error message not displayed");
		Reporter.log("'Field description tag is not found in the template.' error message is displayed successfully", true);
	}
	
	
	
	
	

}
