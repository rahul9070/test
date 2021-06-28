package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import initializer.PageInitializer;

public class LandingPageObjects extends PageInitializer{
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	
	public LandingPageObjects enterTextTouserNameTextField(String userName)
	{
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.visibilityOf(userNameTextField));
		userNameTextField.sendKeys(userName);
		return this;
		
	}
	
	public LandingPageObjects enterTextTopasswordTextField(String password)
	{
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.visibilityOf(passwordTextField));
		passwordTextField.sendKeys(password);
		return this;
		
	}
	
	public LandingPageObjects clickOnLoginButton()
	{
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
		return this;
		
	}

}
