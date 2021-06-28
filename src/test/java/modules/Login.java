package modules;

import org.testng.annotations.Test;

import initializer.PageInitializer;
import pageobjects.LandingPageObjects;
import pageobjects.TasksPageObjects;

public class Login extends PageInitializer {
	
	LandingPageObjects ob = new LandingPageObjects();
	@Test
	public void mylogin() {
		
		test = extent.createTest("mylogin");
		
		
		
	}
	
	@Test
	public void mylogin2() {
		
		test = extent.createTest("mylogin");
		
		landingPage().
		enterTextTouserNameTextField("admin")
		.enterTextTopasswordTextField("manager")
		.clickOnLoginButton()
		;
		
		homePage().verifyUserLoggedIn("John Doe");
		
		homePage().clickOnTaskButton();
		
		taskPage().clickOnaddNewTaskButton();
		
		
	}

}
