package initializer;

import org.openqa.selenium.support.PageFactory;

import mainclass.Mainclass;
import pageobjects.HomePageObjects;
import pageobjects.LandingPageObjects;
import pageobjects.TasksPageObjects;

public class PageInitializer extends Mainclass {
	
	public LandingPageObjects landingPage() {
		LandingPageObjects landingpageob = PageFactory.initElements(getDriver(), LandingPageObjects.class);
		return landingpageob;
	}

	public HomePageObjects homePage() {
		HomePageObjects homepageob = PageFactory.initElements(getDriver(), HomePageObjects.class);
		return homepageob;
	}
	
	public TasksPageObjects taskPage() {
		TasksPageObjects taskpageob = PageFactory.initElements(getDriver(), TasksPageObjects.class);
		return taskpageob;
	}
}

