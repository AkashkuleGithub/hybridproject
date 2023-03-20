package testPackage;

import java.io.IOException;


import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ActitimeTestValidLogin extends BaseTest{

	
	@Test
	public void validTest() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLOgin(flib.readpropertyData(PROP_PATH, "Username"),flib.readpropertyData(PROP_PATH,"Password"));
	}
}