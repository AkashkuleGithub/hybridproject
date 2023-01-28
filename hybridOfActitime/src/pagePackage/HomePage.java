package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	@FindBy(xpath ="//a[.='Logout']")private WebElement logoutlink;

	@FindBy(id="SubmitTTButton")private WebElement saveLeaveTimeButton;
	
	@FindBy(xpath = "//div[.='Users']")private WebElement users;
	
	@FindBy(name ="usersSelector.selectedUser")private WebElement enterTimeTrackDropDropDown;
	
	//intilaization
	

    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    //utilization
    
    public WebElement getLogoutLink()
    {
    	return logoutlink;
    }
    public WebElement getSaveLeaveTimeButton()
    {
    	return saveLeaveTimeButton; 
    }
    public WebElement getUser()
    {
    	return users;
   	}
    
    public WebElement getEnterTimeTrackDRopDown()
    {
    	return enterTimeTrackDropDropDown;
    }
    
    //operational method
    
    public void logOut() 
    {
    	logoutlink.click();
    }
    public void clickOnUser() 
    {
    	users.click();
    }
    public void clickOnSaveLeaveTime() 
    {
    	saveLeaveTimeButton.click();
    }
    public void selectUser(int index)
    {
    	Select sel = new Select(enterTimeTrackDropDropDown);
    	sel.selectByIndex(index);
    	
    }
   }

