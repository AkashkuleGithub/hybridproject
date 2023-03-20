package testPackage;

import java.io.IOException;


import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;

public class TestActiTimeLogout extends BaseTest{
	
  @Test
  public void logout() throws InterruptedException, IOException {
	  
	  LoginPage lp = new LoginPage(driver);
	 Flib flib = new Flib();
	 lp.actiTimeValidLOgin(flib.readpropertyData(PROP_PATH, "Username"),flib.readpropertyData(PROP_PATH,"Password"));
	 
	HomePage hp = new HomePage(driver);
	hp.logOutmethod();
  }
  
}
