package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest implements IAutoConstant{
protected static WebDriver driver;
@BeforeMethod
public void setUp() throws IOException 
{
	Flib flib = new Flib();
	String browservalue = flib.readpropertyData(PROP_PATH,"Browser");
	String url = flib.readpropertyData(PROP_PATH,"Url");
	
	if (browservalue.equalsIgnoreCase("chrome")) 
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
	}
	else if (browservalue.equalsIgnoreCase("firefox")) 
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
	}
	else
	{
		Reporter.log("enter correct browser??",true);
	}
}
	
	public void failed(String methodName)
	{
		try{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(SCREENSHOT_PATH+methodName+".png");
			Files.copy(src, dest);
		
	}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
	



