package com.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.base.TestBase;
import com.util.GenericLibrary;
import com.util.JavascriptLibrary;

public class ActionPage extends TestBase {

	// Objects Repository(OR):........................................................................

	//Page Title Verification
	@FindBy(xpath="//a[text()='Actions']")
	WebElement actionText;

	// Activities 
	@FindBy(xpath=".//*[@id='divStatistic']/div[1]/a")
	WebElement lateActionsBtn;

	@FindBy(xpath=".//*[@id='divStatistic']/div[2]/a")
	WebElement upcomingActionsBtn;

	@FindBy(xpath=".//*[@id='divStatistic']/div[3]/a")
	WebElement liveActionsBtn;

	@FindBy(xpath=".//*[@id='divStatistic']/div[4]/a")
	WebElement completedActionsBtn;

	@FindBy(xpath=".//*[@id='txtSearch']")
	WebElement myActionsSearchBox;

	@FindBy(xpath=".//*[@id='taskLate']")
	WebElement lateTasks;

	@FindBy(xpath=".//*[@id='taskUpcoming']")
	WebElement upcomingTasks;

	@FindBy(xpath=".//*[@id='taskLive']")
	WebElement liveTasks;

	@FindBy(xpath=".//*[@id='taskCompleted']")
	WebElement completedTasks;

	@FindBy(xpath=".//*[@id='period']")
	WebElement filterBtn;

	@FindBy(xpath=".//*[@id='btnPageBack']")
	WebElement backBtn;

	@FindBy(xpath=".//*[@id='btnComplete']")
	WebElement completeBtn;

	@FindBy(xpath=".//*[@id='btnReopen']")
	WebElement reOpenBtn; 

	@FindBy(xpath=".//*[@id='btnMore']/a")
	WebElement moreBtn;

	@FindBy(xpath=".//*[@id='btnMore']/ul/li[2]/a")
	WebElement commentBtn;

	@FindBy(xpath=".//*[@id='txtNote']")
	WebElement commentTxtBox;

	@FindBy(xpath=".//*[@id='submitNote']")
	WebElement commentSubmitBtn;

	@FindBy(xpath=".//*[@id='divUpload']/a")
	WebElement uploadBtn;

	@FindBy(xpath=".//*[@id='btnMore']/ul/li[5]/a")
	WebElement deleteBtn;

	@FindBy(xpath=".//*[@id='btnActDate']/span/button")
	WebElement calenderBtn;
	
	@FindBy(xpath=".//*[@id='divA_DESC']")
	WebElement descriptionTxtBox;
	
	@FindBy(xpath=".//*[@id='A_DESC']")
	WebElement descriptionTxtBoxIn;

	@FindBy(xpath="html/body/div[2]/div[1]/table/thead/tr[2]/th[2]")
	WebElement monthSelector;


	// Actions:......................................................................................
	public ActionPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................
	public String verifyPageTitle() {
		return actionText.getText();
	}

	public void verify_Filter_action_Results() throws Exception {
		for (int i = 0; i <= 3; i++) {
			String option = filterBtn.getAttribute("value");
			Reporter.log("Selected Option => "+option,true);
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
			}else {Reporter.log("Filter Option Is Not Functional",true);}
		}
	}

	public void verify_Actions_Late_and_Upcoming_Functionality(String description) throws Exception {
		// Late to Upcoming
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
		List<WebElement> searchResult = driver.findElements(By.cssSelector(".cont-col2"));
		searchResult.get(0).click();
		GenericLibrary.waitForElementVisibility(driver, calenderBtn);
		JavascriptLibrary.javascriptClickElement(driver, calenderBtn);
		Thread.sleep(1000);
		
		List<WebElement> switchToYear = driver.findElements(By.cssSelector(".datepicker-switch"));
		for (WebElement ele : switchToYear) {
			String text = ele.getText();
			if(text.contains("2017")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear2 = driver.findElements(By.cssSelector(".datepicker-switch"));
		for (WebElement ele : switchToYear2) {
			String text = ele.getText();
			if(text.contains("2017")) {
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
		
		Thread.sleep(1000);
		descriptionTxtBox.click();
		descriptionTxtBoxIn.sendKeys(Keys.CONTROL+"a", Keys.DELETE);
		descriptionTxtBoxIn.sendKeys(description);
		descriptionTxtBoxIn.sendKeys(Keys.TAB);
		Thread.sleep(1000);

		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, upcomingTasks);
		
		String lateActions_2 = lateTasks.getText();
		String upcomingActions_2 = upcomingTasks.getText();
		Reporter.log("********* LateAction To UpcomingAction ********",true);
		Reporter.log("========= Before Updating ============",true);
		Reporter.log("Late Actions: "+lateActions +" And "+ "Upcoming Actions: "+upcomingActions,true);
		Reporter.log("========= After Updating ============",true);
		Reporter.log("Late Actions: "+lateActions_2 +" And "+ "Upcoming Actions: "+upcomingActions_2,true);
	}

	public void verify_Actions_Upcoming_To_Late_Functionality(String description) throws Exception {
		// Upcoming to Late
		for (int i = 0; i <= 3; i++) {
			String option = filterBtn.getAttribute("value");
			if(option.equalsIgnoreCase("Week")) {
				break;
			}
			filterBtn.click();
		}
		String lateActions = lateTasks.getText();
		String upcomingActions = upcomingTasks.getText();

		JavascriptLibrary.javascriptClickElement(driver, upcomingActionsBtn);
		Thread.sleep(1000);
		List<WebElement> searchResult = driver.findElements(By.cssSelector(".cont-col2"));
		searchResult.get(0).click();
		GenericLibrary.waitForElementVisibility(driver, calenderBtn);
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
		Thread.sleep(1000);

		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, lateTasks);

		String lateActions_2 = lateTasks.getText();
		String upcomingActions_2 = upcomingTasks.getText();

		Reporter.log("********* UpcomingAction To LateAction ********",true);
		Reporter.log("========= Before Updating ============",true);
		Reporter.log("Late Actions: "+lateActions +" And "+ "Upcoming Actions: "+upcomingActions,true);
		Reporter.log("========= After Updating ============",true);
		Reporter.log("Late Actions: "+lateActions_2 +" And "+ "Upcoming Actions: "+upcomingActions_2,true);
	}

	public void verify_Complte_And_ReOpen_Activities(String description1, String description2) throws Exception {
		// Live to Completed
		for (int i = 0; i <= 3; i++) {
			String option = filterBtn.getAttribute("value");
			if(option.equalsIgnoreCase("Week")) {
				break;
			}
			filterBtn.click();
		}
		String live = liveTasks.getText();
		String completed = completedTasks.getText();

		JavascriptLibrary.javascriptClickElement(driver, liveActionsBtn);
		Thread.sleep(1000);
		List<WebElement> searchResult = driver.findElements(By.cssSelector(".cont-col2"));
		searchResult.get(0).click();
		
		GenericLibrary.waitForElementVisibility(driver, descriptionTxtBox);
		descriptionTxtBox.click();
		descriptionTxtBoxIn.sendKeys(Keys.CONTROL+"a", Keys.DELETE);
		descriptionTxtBoxIn.sendKeys(description1);
		descriptionTxtBoxIn.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		JavascriptLibrary.javascriptClickElement(driver, completeBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, liveTasks);

		String live2 = liveTasks.getText();
		String completed2 = completedTasks.getText();

		Reporter.log("********* LiveAction To CompletedAction ********",true);
		Reporter.log("========= Before Updating ===========",true);
		Reporter.log("Live Actions: "+live +" And "+ "Completed Actions: "+completed,true);
		Reporter.log("========= After Updating ===========",true);
		Reporter.log("Live Actions: "+live2 +" And "+ "Completed Actions: "+completed2,true);

		// Completed to Live (Re-open)
		for (int i = 0; i <= 3; i++) {
			String option = filterBtn.getAttribute("value");
			if(option.equalsIgnoreCase("Week")) {
				break;
			}
			filterBtn.click();
		}
		String live1 = liveTasks.getText();
		String completed1 = completedTasks.getText();

		JavascriptLibrary.javascriptClickElement(driver, completedActionsBtn);
		Thread.sleep(2000);
		List<WebElement> searchResult1 = driver.findElements(By.cssSelector(".cont-col2"));
		searchResult1.get(0).click();
		GenericLibrary.waitForElementVisibility(driver, reOpenBtn);
		
		JavascriptLibrary.javascriptClickElement(driver, reOpenBtn);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		descriptionTxtBox.click();
		descriptionTxtBoxIn.sendKeys(Keys.CONTROL+"a", Keys.DELETE);
		descriptionTxtBoxIn.sendKeys(description2);
		descriptionTxtBoxIn.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, liveTasks);

		String live3 = liveTasks.getText();
		String completed3 = completedTasks.getText();

		Reporter.log("********* CompletedAction To LiveAction ********",true);
		Reporter.log("========= Before Updating ============",true);
		Reporter.log("Live Actions: "+live1 +" And "+ "Completed Actions: "+completed1,true);
		Reporter.log("========= After Updating ============",true);
		Reporter.log("Live Actions: "+live3 +" And "+ "Completed Actions: "+completed3,true);
	}

	public void verify_add_Comment_Upload_Picture_Delete_Action(String comment, String filePath) throws Exception {
		for (int i = 0; i <= 3; i++) {
			String option = filterBtn.getAttribute("value");
			if(option.equalsIgnoreCase("Week")) {
				break;
			}
			filterBtn.click();
		}
		JavascriptLibrary.javascriptClickElement(driver, liveActionsBtn);
		Thread.sleep(1000);
		List<WebElement> searchResult = driver.findElements(By.cssSelector(".cont-col2"));
		searchResult.get(0).click();
		Thread.sleep(3000);
		// Add Comment
		Actions a=new Actions(driver);
		a.moveToElement(moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentBtn);
		JavascriptLibrary.javascriptType(driver, commentTxtBox, comment);
		JavascriptLibrary.javascriptClickElement(driver, commentSubmitBtn);
		Thread.sleep(1000);
		
		// Upload Picture
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, uploadBtn);
		StringSelection sel2 = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel2,null);
		System.out.println("selection" +sel2);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='fieldImgDropzone']")).click();
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
		
		// Delete Activity
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteBtn);
		driver.switchTo().alert().accept();
		Thread.sleep(500);
	}
}
