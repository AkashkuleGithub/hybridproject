package genericPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant{
static WebDriver driver;
@BeforeMethod
public void setUp() throws IOException 
{
	Flib flib = new Flib();
	String browservalue = flib.readpropertyData(PROP_PATH,"Browser");
	String url = flib.readpropertyData(PROP_PATH,"Url");
	
	if (browservalue.equals("chrome")) 
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	else if (browservalue.equals("firefox")) 
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	else
	{
		Reporter.log("enter correct browser??",true);
	}
}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}


