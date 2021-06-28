package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import initializer.PageInitializer;

public class TasksPageObjects extends PageInitializer {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement AddNewtaksButton;
	
	public TasksPageObjects clickOnaddNewTaskButton() {
		
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.elementToBeClickable(AddNewtaksButton));
		AddNewtaksButton.click();
		return this;
	}

	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTaskDropdown;
	
public TasksPageObjects clickOnnewTaskDropdown() {
		
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.elementToBeClickable(newTaskDropdown));
		newTaskDropdown.click();
		return this;
	}

//div[contains(text(),'Create New Tasks')]

@FindBy(xpath="//div[contains(text(),'Create New Tasks')]")
private WebElement createNewTaskPopup;

public TasksPageObjects verifycreateNewTaskPopupIsDisplayed() {
	
	new WebDriverWait(getDriver(),20).until(ExpectedConditions.elementToBeClickable(createNewTaskPopup));
	Assert.assertTrue(createNewTaskPopup.isDisplayed(),"FAILURE - popup not seen");
	return this;
}


		
		@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
		private WebElement companyDropdown;

		public TasksPageObjects clickOncompanyDropdown() {
			
			new WebDriverWait(getDriver(),20).until(ExpectedConditions.visibilityOf(companyDropdown));
			companyDropdown.click();
			return this;
			
		}

		@FindBy(xpath="(//div[@class='dropdownButton'])[16]")
		private WebElement projectDropdown;

		public TasksPageObjects clickOnprojectDropdown() {
			
			new WebDriverWait(getDriver(),20).until(ExpectedConditions.visibilityOf(projectDropdown));
			projectDropdown.click();
			return this;
			
		}





}
