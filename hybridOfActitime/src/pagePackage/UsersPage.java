package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	//declaration for all the webElments present on users page
	
	@FindBy(linkText ="Users")private WebElement UsersTab;

	@FindBy(xpath ="//input[@value='Create New User']")private WebElement createNewuserButton;
//Initialization
	
	public void userPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	//utilization
	public WebElement webgetUserTab()
	{
		return UsersTab;
		
	}
	public WebElement getcreateNewuserButton() 
	{
		return createNewuserButton;
		
	}
}
	
	
	
	
	
	
	

