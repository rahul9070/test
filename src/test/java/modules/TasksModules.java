package modules;

import org.testng.annotations.Test;

import initializer.PageInitializer;
import pageobjects.LandingPageObjects;


public class TasksModules extends PageInitializer{
	
	@Test
	public void addNewTask() throws InterruptedException {
		
		landingPage()
		.enterTextTouserNameTextField("admin")
		.enterTextTopasswordTextField("manager")
		.clickOnLoginButton();
		
		homePage().verifyUserLoggedIn("John Doe")
		.clickOnTaskButton();
		
		taskPage().clickOnaddNewTaskButton()
		.clickOnnewTaskDropdown()
		.verifycreateNewTaskPopupIsDisplayed()
		.clickOncompanyDropdown();
		
		Thread.sleep(5000);
		
		
	}
}

