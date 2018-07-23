package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.base.TestBase;
import com.util.JavascriptLibrary;

public class DashBoardPage extends TestBase {
	// Objects Repository(OR):........................................................................
	// Home Page Links
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	@CacheLookup
	WebElement dashBoardLink;

	@FindBy(xpath="//span[contains(text(),'Action')]")
	WebElement ActionLink;

	@FindBy(xpath="//span[contains(text(),'Build')]")
	WebElement buildLink;

	@FindBy(xpath="//span[contains(text(),'Capture')]")
	WebElement captureLink;

	@FindBy(xpath="//span[contains(text(),'Analyse')]")
	WebElement AnalyseLink;

	// DashBoard Tasks
	@FindBy(xpath=".//*[@id='Labactions']/i")
	WebElement actionsBtn;

	@FindBy(xpath=".//*[@id='period']")
	WebElement filterBtn;

	@FindBy(xpath=".//*[@id='btnActDate']/span/button")
	WebElement calenderBtn;

	@FindBy(xpath=".//*[@id='divA_DESC']")
	WebElement descriptionTxtBox;

	@FindBy(xpath=".//*[@id='A_DESC']")
	WebElement descriptionTxtBoxIn;

	@FindBy(xpath=".//*[@id='divAN_DESC']")
	WebElement commentTxtBox;

	@FindBy(xpath=".//*[@id='AN_DESC']")
	WebElement commentTxtBoxIn;

	@FindBy(xpath=".//*[@id='btnActPeople']")
	WebElement addPeopleBtn;

	@FindBy(xpath=".//*[@id='taskLate']")
	WebElement lateTasks;

	@FindBy(xpath=".//*[@id='taskLive']")
	WebElement upcomingTasks;

	@FindBy(xpath=".//*[@id='taskUpcoming']")
	WebElement liveTasks;

	@FindBy(xpath=".//*[@id='taskCompleted']")
	WebElement completedTasks;

	@FindBy(xpath=".//*[@id='divStatistic']/div[1]/a/div[2]/div[2]")
	WebElement lateActionsBtn;

	@FindBy(xpath=".//*[@id='divStatistic']/div[2]/a/div[2]/div[2]")
	WebElement upcomingActionsBtn;

	@FindBy(xpath=".//*[@id='divStatistic']/div[3]/a/div[2]/div[2]")
	WebElement liveActionsBtn;

	@FindBy(xpath=".//*[@id='divStatistic']/div[4]/a/div[2]/div[2]")
	WebElement completedActionsBtn;

	@FindBy(xpath=".//*[@id='btnComplete']/span/span[2]")
	WebElement completedBtn;

	@FindBy(xpath=".//*[@id='todoTitle']//following::input[1]")
	WebElement postponeBtn;


	// Initializing the Page Objects:................................................................
	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}

	// Navigating DashBoard Link
	public boolean verifyDashboardLink(){
		return dashBoardLink.isDisplayed();
	}

	// Navigating Build Link
	public BuildPage clickOnBuildLink() {
		buildLink.click();
		return new BuildPage();
	}

	// Navigating Capture Link
	public CapturePage clickOnCaptureLink() {
		captureLink.click();
		return new CapturePage();
	}

	// Navigating to Action Page
	public ActionPage clickOnActionLink() {
		ActionLink.click();
		return new ActionPage();
	}
	
	// Navigating to Analyse Link
	public AnalysePage clickOnAnalyseLink() {
		AnalyseLink.click();
		return new AnalysePage();
	}
	

	public void verifyFilteractionResults() throws Exception {
		for (int i = 0; i <= 3; i++) {
			String option = filterBtn.getAttribute("value");
			System.out.println("Selected Option: "+option);
			if (option.equalsIgnoreCase("All")) {
				Reporter.log("Late Actions: "+lateTasks.getText(),true);
				Reporter.log("Upcoming Actions: "+upcomingTasks.getText(),true);
				Reporter.log("Live Actions"+liveTasks.getText(),true);
				Reporter.log("Completed Actions: "+completedTasks.getText(),true);
				filterBtn.click();
				Thread.sleep(1000);
			} else if(option.equalsIgnoreCase("Week")){
				Reporter.log("Late Actions: "+lateTasks.getText(),true);
				Reporter.log("Upcoming Actions: "+upcomingTasks.getText(),true);
				Reporter.log("Live Actions"+liveTasks.getText(),true);
				Reporter.log("Completed Actions: "+completedTasks.getText(),true);
				filterBtn.click();
				Thread.sleep(1000);
			}else if(option.equalsIgnoreCase("Month")) {
				Reporter.log("Late Actions: "+lateTasks.getText(),true);
				Reporter.log("Upcoming Actions: "+upcomingTasks.getText(),true);
				Reporter.log("Live Actions"+liveTasks.getText(),true);
				Reporter.log("Completed Actions: "+completedTasks.getText(),true);
				filterBtn.click();
				Thread.sleep(1000);
			}else if(option.equalsIgnoreCase("Year")) {
				Reporter.log("Late Actions: "+lateTasks.getText(),true);
				Reporter.log("Upcoming Actions: "+upcomingTasks.getText(),true);
				Reporter.log("Live Actions"+liveTasks.getText(),true);
				Reporter.log("Completed Actions: "+completedTasks.getText(),true);
				filterBtn.click();
				Thread.sleep(1000);
			}else {System.out.println("Filter Option Is Not Functional");}
		}
	} 

	public void verifyActions_Late_and_Upcoming_Functionality(String description, String comment) throws Exception {
		// Late to Upcoming
		JavascriptLibrary.javascriptClickElement(driver, actionsBtn);
		Thread.sleep(1000);
		for (int i = 0; i <= 3; i++) {
			String option = filterBtn.getAttribute("value");
			if(option.equalsIgnoreCase("Week")) {
				break;
			}
			filterBtn.click();
		}
		String lateActions = lateTasks.getText();
		String upcomingActions = upcomingTasks.getText();

		JavascriptLibrary.javascriptClickElement(driver, lateActionsBtn);
		Thread.sleep(1000);
		List<WebElement> searchResult = driver.findElements(By.cssSelector(".fa.vc-actions4"));
		searchResult.get(2).click();
		Thread.sleep(1000);

		JavascriptLibrary.javascriptClickElement(driver, calenderBtn);
		
		List<WebElement> switchToYear = driver.findElements(By.cssSelector(".datepicker-switch"));
		for (WebElement ele : switchToYear) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear2 = driver.findElements(By.cssSelector(".datepicker-switch"));
		for (WebElement ele : switchToYear2) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> yearsList = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList) {
			String text = ele.getText();
			if(text.contains("Jul")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.contains("25")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(2000);
		
		descriptionTxtBox.click();
		descriptionTxtBoxIn.sendKeys(Keys.CONTROL+"a", Keys.DELETE);
		descriptionTxtBoxIn.sendKeys(description);
		descriptionTxtBoxIn.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		commentTxtBox.click();
		commentTxtBoxIn.sendKeys(Keys.CONTROL+"a", Keys.DELETE);
		commentTxtBoxIn.sendKeys(comment);
		commentTxtBoxIn.sendKeys(Keys.TAB);
		JavascriptLibrary.javascriptClickElement(driver, actionsBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, actionsBtn);
		Thread.sleep(2000);
		
		String lateActions_2 = lateTasks.getText();
		String upcomingActions_2 = upcomingTasks.getText();
		Reporter.log("********* LateAction To UpcomingAction ********",true);
		Reporter.log("========= Before Updating ===========",true);
		Reporter.log("Late Actions: "+lateActions +" And "+ "Upcoming Actions: "+upcomingActions,true);
		Reporter.log("========= After Updating ===========",true);
		Reporter.log("Late Actions: "+lateActions_2 +" And "+ "Upcoming Actions: "+upcomingActions_2,true);
	}

	public void verifyActions_Upcoming_To_Late_Functionality(String description, String comment) throws Exception {
		// Upcoming to Late
		JavascriptLibrary.javascriptClickElement(driver, actionsBtn);
		for (int i = 0; i <= 3; i++) {
			String option = filterBtn.getAttribute("value");
			if(option.equalsIgnoreCase("Week")) {
				break;
			}
			filterBtn.click();
		}
		Thread.sleep(2000);
		String lateActions = lateTasks.getText();
		String upcomingActions = upcomingTasks.getText();

		JavascriptLibrary.javascriptClickElement(driver, upcomingActionsBtn);
		Thread.sleep(1000);
		List<WebElement> searchResult = driver.findElements(By.cssSelector(".fa.vc-actions4"));
		searchResult.get(2).click();
		Thread.sleep(1000);

		JavascriptLibrary.javascriptClickElement(driver, calenderBtn);
		
		List<WebElement> switchToYear = driver.findElements(By.cssSelector(".datepicker-switch"));
		for (WebElement ele : switchToYear) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear2 = driver.findElements(By.cssSelector(".datepicker-switch"));
		for (WebElement ele : switchToYear2) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> yearsList = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList) {
			String text = ele.getText();
			if(text.contains("Jul")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.contains("22")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(1000);
		
		descriptionTxtBox.click();
		descriptionTxtBoxIn.sendKeys(Keys.CONTROL+"a", Keys.DELETE);
		descriptionTxtBoxIn.sendKeys(description);
		descriptionTxtBoxIn.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		commentTxtBox.click();
		commentTxtBoxIn.sendKeys(Keys.CONTROL+"a", Keys.DELETE);
		commentTxtBoxIn.sendKeys(comment);
		commentTxtBoxIn.sendKeys(Keys.TAB);
		JavascriptLibrary.javascriptClickElement(driver, actionsBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, actionsBtn);
		Thread.sleep(2000);

		String lateActions_2 = lateTasks.getText();
		String upcomingActions_2 = upcomingTasks.getText();

		Reporter.log("********* UpcomingAction To LateAction ********",true);
		Reporter.log("========= Before Updating ============",true);
		Reporter.log("Late Actions: "+lateActions +" And "+ "Upcoming Actions: "+upcomingActions,true);
		Reporter.log("========= After Updating ============",true);
		Reporter.log("Late Actions: "+lateActions_2 +" And "+ "Upcoming Actions: "+upcomingActions_2,true);
	}

	public void verify_Complte_Activity(String description, String comment) throws Exception {
		// Live to Completed
		JavascriptLibrary.javascriptClickElement(driver, actionsBtn);
		for (int i = 0; i <= 3; i++) {
			String option = filterBtn.getAttribute("value");
			if(option.equalsIgnoreCase("Week")) {
				break;
			}
			filterBtn.click();
		}
		Thread.sleep(1000);
		String live = liveTasks.getText();
		String completed = completedTasks.getText();

		JavascriptLibrary.javascriptClickElement(driver, liveActionsBtn);
		Thread.sleep(2000);
		List<WebElement> searchResult = driver.findElements(By.cssSelector(".fa.vc-actions4"));
		searchResult.get(2).click();
		Thread.sleep(1000);

		descriptionTxtBox.click();
		descriptionTxtBoxIn.sendKeys(Keys.CONTROL+"a", Keys.DELETE);
		descriptionTxtBoxIn.sendKeys(description);
		descriptionTxtBoxIn.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		commentTxtBox.click();
		commentTxtBoxIn.sendKeys(Keys.CONTROL+"a", Keys.DELETE);
		commentTxtBoxIn.sendKeys(comment);
		commentTxtBoxIn.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		completedBtn.click();
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, actionsBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptClickElement(driver, actionsBtn);
		Thread.sleep(2000);
		
		String live2 = liveTasks.getText();
		String completed2 = completedTasks.getText();

		Reporter.log("********* LiveAction To CompletedAction ********",true);
		Reporter.log("========= Before Updating ============",true);
		Reporter.log("Live Actions: "+live +" And "+ "Completed Actions: "+completed,true);
		Reporter.log("========= After Updating ============",true);
		Reporter.log("Live Actions: "+live2 +" And "+ "Completed Actions: "+completed2,true);
	}
	
	public void verify_Postpone_Activity() throws Exception {
		// Late to Upcoming by Postpone 
		JavascriptLibrary.javascriptClickElement(driver, actionsBtn);
		for (int i = 0; i <= 3; i++) {
			String option = filterBtn.getAttribute("value");
			if(option.equalsIgnoreCase("Week")) {
				break;
			}
			filterBtn.click();
		}
		Thread.sleep(2000);
		String late = lateTasks.getText();
		String upcoming = upcomingTasks.getText();
		String live = liveTasks.getText();
		String completed = completedTasks.getText();
		
		JavascriptLibrary.javascriptClickElement(driver, lateActionsBtn);
		Thread.sleep(2000);
		
		postponeBtn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[2]/div[1]/table/thead/tr[2]/th[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[2]/div[2]/table/thead/tr[2]/th[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='2018']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Jun']")).click();
		Thread.sleep(1000);
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.equalsIgnoreCase("25")) {
				ele.click();
				break;
			}
		}
		
		//driver.findElement(By.xpath("//tbody/tr[2]/td[6]")).click();
		Thread.sleep(2000);
		
		String late2 = lateTasks.getText();
		String upcoming2 = upcomingTasks.getText();
		String live2 = liveTasks.getText();
		String completed2 = completedTasks.getText();
		Reporter.log("========= Before Updating ============",true);
		Reporter.log("Late Actions: "+late +" And "+ "Upcoming Actions: "+upcoming,true);
		Reporter.log("Live Actions: "+live +" And "+ "Completed Actions: "+completed,true);
		Reporter.log("========= After Updating ============",true);
		Reporter.log("Late Actions: "+late2 +" And "+ "Upcoming Actions: "+upcoming2,true);
		Reporter.log("Live Actions: "+live2 +" And "+ "Completed Actions: "+completed2,true);
	}
}
