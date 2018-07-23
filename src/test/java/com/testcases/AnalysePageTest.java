package com.testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.AnalysePage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class AnalysePageTest extends TestBase {
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	AnalysePage analysePage;

	public AnalysePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		analysePage= new AnalysePage();
	}

	@Test
	public void AnalysePage_Test() {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_AnalysePage();
		Reporter.log("Analyse Page Verified Successfully",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void Questionnaire_selection_Test() {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Questionnaire_selection("Emp Analyse");
		Reporter.log("Questionnaire selected successfully",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void Create_report_Test() {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Create_report("Emp Analyse", "Test Report", "Test Report");
		Reporter.log("Report created successfully",true);
	}
	
	@Test(dependsOnMethods={"AnalysePage_Test", "Create_report_Test"})
	public void Copy_report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Copy_report("Test Report", "Test Report");
		Reporter.log("Report copied successfully",true);
	}
	
	@Test(dependsOnMethods={"Create_report_Test", "Copy_report_Test"})
	public void Delete_report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Delete_report("Test Report");
		Reporter.log("Report deleted successfully",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void Swaping_columns_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Swaping_columns("Emp Analyse", "Table Design/Swaping Columns");
		Reporter.log("Columns swapped successfully",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void Delete_columns_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Delete_columns("Emp Analyse", "Table Design/Delete Columns");
		Reporter.log("Columns deleted successfully",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void Add_all_and_Remove_all_columns_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Add_all_columns_Remove_all_columns("Emp Analyse", "Table Design/Add All & Remove All Columns");
		Reporter.log("All columns adding and removing is functional",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void Adding_selected_fileds_to_report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Adding_selected_fileds_to_report("Emp Analyse", "Table Design/Add selected fields");
		Reporter.log("Selected fields added to the report Successfully",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void Drop_sort_field_Ascending_and_Descending_Order_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Drop_sort_field_Ascending_and_Descending_Order("Emp Analyse", "Table Design/Sort By Order");
		Reporter.log("Dropped field sorted in order successfully",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void Sort_by_Group_report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Sort_by_Group_report("Emp Analyse", "Table Design/Sort By Group", "Sort By Group");
		Reporter.log("Sort By Group option is functional",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void Total_of_the_selected_field_report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Total_of_the_selected_field_report("Emp Analyse", "Table Design/Field Total", "Field Total");
		Reporter.log("Total of the selected field option is Functional",true);
	}
	
	@Test(dependsOnMethods="Total_of_the_selected_field_report_Test")
	public void Download_report_in_CSV_and_Excel_formats_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Download_report_in_CSV_and_Excel_formats("Emp Analyse", "Field Total");
		Reporter.log("Report downloaded in CSV and Excel formats successfully",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void Filter_Option_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Filter_Option("Emp Analyse", "Table Design/Filter", "≥", "200");
		Reporter.log("Filter Option is Functional",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void Share_Report_option_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Share_Report_option("Emp Analyse", "Table Design/Share", "ISRO", "Vidya", "Anupam");
		Reporter.log("Share Option is Functional",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void Summary_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Summary_Design_Report("Emp Analyse", "Summary Design");
		Reporter.log("Summary design report is Functional",true);
	}
	
	@Test//(dependsOnMethods="AnalysePage_Test")
	public void BarChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_BarChart_Design_Report("Emp Analyse", "BarChart Design");
		Reporter.log("BarChart design report is Functional",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void LineChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_LineChart_Design_Report("Emp Analyse", "LineChart Design");
		Reporter.log("LineChart design report is Functional",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void PieChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_PieChart_Design_Report("Emp Analyse", "PieChart Design");
		Reporter.log("PieChart design report is Functional",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void ScatterChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_ScatterChart_Design_Report("Emp Analyse", "ScatterChart Design");
		Reporter.log("ScatterChart design report is Functional",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void WaterFallChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_WaterFallChart_Design_Report("Emp Analyse", "WaterFallChart Design");
		Reporter.log("WaterFallChart design report is Functional",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void BoxPlotChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_BoxPlotChart_Design_Report("Emp Analyse", "BoxPlotChart Design");
		Reporter.log("BoxPlotChart design report is Functional",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void RoseChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_RoseChart_Design_Report("Emp Analyse", "RoseChart Design");
		Reporter.log("RoseChart design report is Functional",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void SpiderChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_SpiderChart_Design_Report("Emp Analyse", "SpiderChart Design");
		Reporter.log("SpiderChart design report is Functional",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void BubbleChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_BubbleChart_Design_Report("Emp Analyse", "BubbleChart Design");
		Reporter.log("BubbleChart design report is Functional",true);
	}
	
	@Test
	public void Create_Publish_Report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Create_Publish_Report("Emp Analyse", "Publish Report", "D:\\Value chain\\Images\\Publish Report.xlsx");
		Reporter.log("Publish report option is Functional",true);
	}
	
	@Test(dependsOnMethods="Create_Publish_Report_Test")
	public void View_and_Download_published_report_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_View_and_Download_published_report("Emp Analyse", "Publish Report");
		Reporter.log("Published report viewed and record is Downloaded successfully",true);
	}
	
	@Test
	public void View_published_report_without_template_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_View_published_report_without_template("Emp Analyse", "Publish Report without template", "Publish Report without template");
		Reporter.log("Publish report option is Functional",true);
	}
	
	@Test
	public void Upload_report_without_tags_and_view_the_publish_report_and_verify_error_msg_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Upload_report_without_tags_and_view_the_publish_report_and_verify_error_msg("Emp Analyse", "Publish Report without tags in temp", "D:\\Value chain\\Images\\Publish Report - without tags.xlsx", "Publish Report without tags in temp");
		Reporter.log("'Field description tag is not found in the template.' message verified successfully",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
