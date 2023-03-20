package testPackage;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;


public class ActitimeTestinvalidLogin extends BaseTest {

	@Test
	public void actiTimeInvalidLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.getrowCount(EXCEL_PATH,"invalidcreds");
	for(int i=1;i<=rc;i++) 
	{
		
		lp.actiTimeInvalidLogin(flib.readExcelData(EXCEL_PATH,"invalidcreds", i,0),flib.readExcelData(EXCEL_PATH,"invalidcreds", i, 1));
	}
	}
}
